package com.anulis.tenganmall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anulis.tenganmall.order.entity.OrderItemEntity;
import com.anulis.tenganmall.order.service.OrderItemService;
import com.anulis.tenganmall.common.utils.PageUtils;
import com.anulis.tenganmall.common.utils.R;



/**
 * 訂單商品明細
 *
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 21:11:14
 */
@RestController
@RequestMapping("order/orderitem")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    /**
     * 清單
     */
    @RequestMapping("/list")
    // @RequiresPermissions("order:orderitem:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderItemService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 資訊
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("order:orderitem:info")
    public R info(@PathVariable("id") Long id){
		OrderItemEntity orderItem = orderItemService.getById(id);

        return R.ok().put("orderItem", orderItem);
    }

    /**
     * 儲存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("order:orderitem:save")
    public R save(@RequestBody OrderItemEntity orderItem){
		orderItemService.save(orderItem);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("order:orderitem:update")
    public R update(@RequestBody OrderItemEntity orderItem){
		orderItemService.updateById(orderItem);

        return R.ok();
    }

    /**
     * 刪除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("order:orderitem:delete")
    public R delete(@RequestBody Long[] ids){
		orderItemService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
