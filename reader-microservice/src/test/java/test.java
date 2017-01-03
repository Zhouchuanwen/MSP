import org.junit.Test;

/**
 * Created by alan on 16/12/26.
 */
public class test {

    @Test
    public void test(){
        TemplateConfig templateConfig =new TemplateConfig();
        try {
            templateConfig.firstMongoTemplate();
            templateConfig.secondMongoTemplate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
