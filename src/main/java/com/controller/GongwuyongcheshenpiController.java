package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GongwuyongcheshenpiEntity;
import com.entity.view.GongwuyongcheshenpiView;

import com.service.GongwuyongcheshenpiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 公务用车审批
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-24 09:43:50
 */
@RestController
@RequestMapping("/gongwuyongcheshenpi")
public class GongwuyongcheshenpiController {
    @Autowired
    private GongwuyongcheshenpiService gongwuyongcheshenpiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongwuyongcheshenpiEntity gongwuyongcheshenpi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shenheriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shenheriqiend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fushenriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fushenriqiend,
		HttpServletRequest request){

        EntityWrapper<GongwuyongcheshenpiEntity> ew = new EntityWrapper<GongwuyongcheshenpiEntity>();
                if(shenheriqistart!=null) ew.ge("shenheriqi", shenheriqistart);
                if(shenheriqiend!=null) ew.le("shenheriqi", shenheriqiend);
                if(fushenriqistart!=null) ew.ge("fushenriqi", fushenriqistart);
                if(fushenriqiend!=null) ew.le("fushenriqi", fushenriqiend);
		PageUtils page = gongwuyongcheshenpiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongwuyongcheshenpi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongwuyongcheshenpiEntity gongwuyongcheshenpi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shenheriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shenheriqiend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fushenriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fushenriqiend,
		HttpServletRequest request){
        EntityWrapper<GongwuyongcheshenpiEntity> ew = new EntityWrapper<GongwuyongcheshenpiEntity>();
                if(shenheriqistart!=null) ew.ge("shenheriqi", shenheriqistart);
                if(shenheriqiend!=null) ew.le("shenheriqi", shenheriqiend);
                if(fushenriqistart!=null) ew.ge("fushenriqi", fushenriqistart);
                if(fushenriqiend!=null) ew.le("fushenriqi", fushenriqiend);
		PageUtils page = gongwuyongcheshenpiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongwuyongcheshenpi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongwuyongcheshenpiEntity gongwuyongcheshenpi){
       	EntityWrapper<GongwuyongcheshenpiEntity> ew = new EntityWrapper<GongwuyongcheshenpiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongwuyongcheshenpi, "gongwuyongcheshenpi")); 
        return R.ok().put("data", gongwuyongcheshenpiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongwuyongcheshenpiEntity gongwuyongcheshenpi){
        EntityWrapper< GongwuyongcheshenpiEntity> ew = new EntityWrapper< GongwuyongcheshenpiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongwuyongcheshenpi, "gongwuyongcheshenpi")); 
		GongwuyongcheshenpiView gongwuyongcheshenpiView =  gongwuyongcheshenpiService.selectView(ew);
		return R.ok("查询公务用车审批成功").put("data", gongwuyongcheshenpiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongwuyongcheshenpiEntity gongwuyongcheshenpi = gongwuyongcheshenpiService.selectById(id);
        return R.ok().put("data", gongwuyongcheshenpi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongwuyongcheshenpiEntity gongwuyongcheshenpi = gongwuyongcheshenpiService.selectById(id);
        return R.ok().put("data", gongwuyongcheshenpi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongwuyongcheshenpiEntity gongwuyongcheshenpi, HttpServletRequest request){
    	gongwuyongcheshenpi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongwuyongcheshenpi);

        gongwuyongcheshenpiService.insert(gongwuyongcheshenpi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody GongwuyongcheshenpiEntity gongwuyongcheshenpi, HttpServletRequest request){
    	gongwuyongcheshenpi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongwuyongcheshenpi);

        gongwuyongcheshenpiService.insert(gongwuyongcheshenpi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GongwuyongcheshenpiEntity gongwuyongcheshenpi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongwuyongcheshenpi);
        gongwuyongcheshenpiService.updateById(gongwuyongcheshenpi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongwuyongcheshenpiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GongwuyongcheshenpiEntity> wrapper = new EntityWrapper<GongwuyongcheshenpiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = gongwuyongcheshenpiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
