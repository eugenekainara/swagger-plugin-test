package swagger.plugin.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Default", tags = "Default")
@RestController
public class SampleController {

    @ApiOperation(value = "Get test string", tags = "Default")
    @GetMapping
    public String test(){
        return "test";
    }
}
