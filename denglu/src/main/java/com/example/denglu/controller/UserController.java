package com.example.denglu.controller;
import com.example.denglu.execptions.ParamsException;
import com.example.denglu.model.RespBean;
import com.example.denglu.pojo.*;
import com.example.denglu.service.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private HttpSession sessions;
    @Resource
    private IUserService userService;
    @Resource
    private ICourseService courseService;
    @Resource
    private IDetailService detailService;
    @Resource
    private ISearchresultService searchresultService;
    @Resource
    private IResultService resultService;
    @Resource
    private ILibrarymyborrowService librarymyborrowService;
    @Resource
    private ILibrarymycollectService librarymycollectService;
    @Resource
    private ILibrarymydetailService librarymydetailService;
    @Resource
    private ILibrarymypreService librarymypreService;
    @RequestMapping(value = "login")
    @ResponseBody
    //存session里方便后续操作
    public RespBean login(String username, String password, HttpSession session){
        try {
            User user=userService.login(username,password);
            session.setAttribute("user",user);
            sessions=session;
            return RespBean.success("用户登陆成功!");
        } catch (ParamsException e) {
            e.printStackTrace();
            return RespBean.error(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            return RespBean.error("用户登陆失败");
        }
    }
    @RequestMapping(value = "courses")
    @ResponseBody
    public List<Course> kecheng(){
        User user =(User)sessions.getAttribute("user");
        return courseService.getCourse(user.getId());
    }
    @RequestMapping(value = "detail")
    @ResponseBody
    public Detail detail(){
        User user =(User)sessions.getAttribute("user");
        return detailService.getDetail(user.getId());
    }
    @RequestMapping(value = "searchyear")
    @ResponseBody
    public List<Integer> searchyear(){
        User user =(User)sessions.getAttribute("user");
        return searchresultService.searchyear(user.getId());
    }
    @RequestMapping(value = "searchterm")
    @ResponseBody
    public List<String> searchterm(){
        User user =(User)sessions.getAttribute("user");
        return searchresultService.searchterm(user.getId());
    }
    @RequestMapping(value = "searchrid")
    @ResponseBody
    public int searchrid(int schoolyear,String schoolterm){
        User user =(User)sessions.getAttribute("user");
        return searchresultService.getrid(schoolyear,schoolterm,user.getId());
    }
    @RequestMapping(value = "result")
    @ResponseBody
    public List<Result> searchresult(int rid){
        return resultService.searchresult(rid);
    }
    @RequestMapping(value = "mydetail")
    @ResponseBody
    public Librarymydetail mydetail(){
        User user =(User)sessions.getAttribute("user");
        return librarymydetailService.getall(user.getId());
    }
    @RequestMapping(value = "myborrow")
    @ResponseBody
    public List<Librarymyborrow> myborrow(){
        User user =(User)sessions.getAttribute("user");
        return librarymyborrowService.getall(user.getId());
    }
    @RequestMapping(value = "mypre")
    @ResponseBody
    public List<Librarymypre> mypre(){
        User user =(User)sessions.getAttribute("user");
        return librarymypreService.getall(user.getId());
    }
    @RequestMapping(value = "mycollect")
    @ResponseBody
    public List<Librarymycollect> mycollect(){
        User user =(User)sessions.getAttribute("user");
        return librarymycollectService.getall(user.getId());
    }
    @RequestMapping(value = "xiugai")
    @ResponseBody
    public RespBean xiugaimima(String oldpassword,String newpassword,String confirmpassword){
        try {
            User user= (User) sessions.getAttribute("user");
            userService.updatePassword(user.getUsername(),oldpassword,newpassword,confirmpassword);
            return RespBean.success("密码更新成功");
        } catch (ParamsException e) {
            e.printStackTrace();
            return RespBean.error(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            return RespBean.error("密码更新失败");
        }

    }
}
