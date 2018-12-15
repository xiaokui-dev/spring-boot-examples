package example.mybatis.web;

import com.github.pagehelper.PageInfo;
import example.mybatis.domain.Country;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import example.mybatis.service.CountryService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-03 18:05
 */
@RestController
@RequestMapping(value = "/countries")
@Api(value = "/countries",description = "国家管理")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @ApiOperation(value = "获取国家列表",notes = "查询国家列表")
    @ApiImplicitParam(name = "country",value = "国家实体",required = false,dataType = "country")
    @RequestMapping(value = "/list",method = RequestMethod.POST,produces = "application/json")
    public Map<String,Object> getAll(@RequestBody Country country){
        Map<String,Object> map = new HashMap<>();
        List<Country> list = countryService.getAll(country);
        map.put("code","0");
        map.put("data",new PageInfo<Country>(list));
        map.put("message","成功");
        return map;
    }
}
