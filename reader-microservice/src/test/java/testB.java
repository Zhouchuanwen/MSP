import com.alan.reader.bean.User;
import com.alan.reader.repo.UserRepo;
import com.alan.reader.service.UserService;
import org.junit.Test;

import java.util.Date;

/**
 * Created by alan on 17/3/10.
 */
public class testB {


    @Test
    public void test() {
        User user = User.builder().stuName("zcw").stuId("1305110090").email("chuanwen.zhou@baifendian.com").gender(1).password("123456").salt("alan").phone("15623912097")
                .idCard("42092311111111").major("网络工程").joinSchool(new Date()).rank(4).sdept("数学与计算机").stuType("本科").build();

        System.out.println(user.getStuName());
        UserRepo userRepo = new UserRepo();
        userRepo.create(user);
    }
}
