package io.rancher;

import java.net.URL;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import io.rancher.service.ProjectService;
import io.rancher.service.ProjectStacksService;
import io.rancher.type.Project;
import io.rancher.type.Stack;

/**
 * Rancher Client测试类
 * 测试前注意修改accessKey, secretKey
 * Created by xausky on 11/30/16.
 */
@Ignore
public class RancherTest {

    private Rancher rancher = null;
    private Project testProject = null;
    private ProjectService projectService = null;
    private Stack testStack = null;
    private ProjectStacksService projectStacksService = null;

    /**
     * 测试前添加一个Environment也就是UI中的Stack
     * @throws Exception 发生异常
     */
    @Before
    public void before() throws Exception {
        Rancher.Config config = new Rancher.Config(new URL("http://172.17.0.2:8080/v2-beta/"),
                                                   "CFC4C18BEF5D2D6DEEA3",
                                                   "Do1y93u8jMZ6s6LwjR4t7LF4Rvxi1AhtjJeVHsSn");

        rancher = new Rancher(config);

        projectService = rancher.type(ProjectService.class);
        testProject = new Project();
        testProject.setName("TestProject-" + System.currentTimeMillis());
        testProject = projectService.create(testProject).execute().body();

        projectStacksService = rancher.type(ProjectStacksService.class);
        testStack = new Stack();
        testStack.setName("TestStack-" + System.currentTimeMillis());
        testStack = projectStacksService.create(testProject.getId(), testStack).execute().body();
    }

    /**
     * 测试完成后删除Environment
     * @throws Exception 发生异常
     */
    @After
    public void after() throws Exception {
        Assert.assertTrue(projectStacksService.remove(testProject.getId(), testStack.getId()).execute().isSuccessful());
        Assert.assertTrue(projectService.deactivate(testProject.getId()).execute().isSuccessful());
        Assert.assertTrue(projectService.remove(testProject.getId()).execute().isSuccessful());
    }

    /**
     * 测试Environment是否正常
     * @throws Exception 发生异常
     */
    @Test
    public void environmentTest() throws Exception {
        Assert.assertTrue(testProject.getId() != null);
        Assert.assertTrue(testStack.getId() != null);
    }

}
