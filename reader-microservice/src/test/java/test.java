import com.reader.repo.UserRepo;
import org.junit.Test;
import org.springframework.stereotype.Repository;

/**
 * Created by alan on 16/12/26.
 */
@Repository
public class test {

    @Test
    public void test() throws Exception {

    }


    @Test
    public void testRepo(){
        UserRepo userRepo=new UserRepo();
        userRepo.getUserByStuId("1305110090");
    }

}
