package util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

/**
 * Created by alan on 17/1/5.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Wrapper {

    public static final Wrapper SUCCESS=Wrapper.builder().code(0).msg("SUCCESS").build();

    public static final Wrapper ERROR=Wrapper.builder().code(-1).msg("ERROR").build();

    private int code;

    private String msg;

    private String description;

    private Object data;

    public Wrapper(int code, String msg) {
        this(code, msg, null);
    }

    public Wrapper(int code, String msg, String description) {
        this(code, msg, description, null);
    }

    public String json() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.putOnce("code", code);
        jsonObject.putOnce("msg", msg);
        return jsonObject.toString();
    }

}
