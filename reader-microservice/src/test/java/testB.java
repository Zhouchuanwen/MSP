import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;

/**
 * Created by alan on 17/3/10.
 */
public class testB {


    @Test
    public void test() {
        try {
            JSONObject jsonObject = new JSONObject();
            String[] keyNotes_config = {"恭喜你购买成功", "巧克力", "39.8元", "2014年9月22日"};
            JSONObject data = new JSONObject();
            for (int i = 0; i < keyNotes_config.length; i++) {
                JSONObject keynote = new JSONObject();
                String key = "keynote" + (i + 1);
                keynote.put("value", keyNotes_config[i]);
                keynote.put("color", "#173177");
                data.put(key, keynote);
            }
            jsonObject.put("data", data);
            System.out.println(jsonObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
