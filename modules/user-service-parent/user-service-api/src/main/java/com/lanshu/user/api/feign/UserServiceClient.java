package com.lanshu.user.api.feign;

import com.lanshu.common.basic.model.Log;
import com.lanshu.common.basic.vo.AttachmentVo;
import com.lanshu.common.basic.vo.DeptVo;
import com.lanshu.common.basic.vo.UserVo;
import com.lanshu.common.core.constant.ServiceConstant;
import com.lanshu.common.core.model.ResponseBean;
import com.lanshu.common.feign.config.CustomFeignConfig;
import com.lanshu.user.api.dto.UserDto;
import com.lanshu.user.api.dto.UserInfoDto;
import com.lanshu.user.api.feign.factory.UserServiceClientFallbackFactory;
import com.lanshu.user.api.module.Menu;
import com.lanshu.user.api.module.Tenant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户服务
 *
 * @author Uncle Lan
 * @date 2018-12-30 23:21
 */
@FeignClient(value = ServiceConstant.USER_SERVICE, configuration = CustomFeignConfig.class, fallbackFactory = UserServiceClientFallbackFactory.class)
public interface UserServiceClient {

    /**
     * 根据用户名获取用户详细信息
     *
     * @param identifier identifier
     * @param tenantCode 租户标识
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/03/17 12:14
     */
    @GetMapping("/v1/user/anonymousUser/findUserByIdentifier/{identifier}")
    ResponseBean<UserVo> findUserByIdentifier(@PathVariable("identifier") String identifier, @RequestParam("tenantCode") String tenantCode);

    /**
     * 根据用户名获取用户详细信息
     *
     * @param identifier   identifier
     * @param identityType identityType
     * @param tenantCode   租户标识
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/07/06 14:14:11
     */
    @GetMapping("/v1/user/anonymousUser/findUserByIdentifier/{identifier}")
	ResponseBean<UserVo> findUserByIdentifier(@PathVariable("identifier") String identifier, @RequestParam(value = "identityType", required = false) Integer identityType, @RequestParam("tenantCode") String tenantCode);


    /**
     * 获取当前用户的信息
     *
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/03/23 23:44
     */
    @GetMapping("/v1/user/info")
    ResponseBean<UserInfoDto> info();

    /**
     * 根据用户id获取用户
     *
     * @param ids ids
     * @return UserVo
     */
    @RequestMapping(value = "/v1/user/findById", method = RequestMethod.POST)
    ResponseBean<List<UserVo>> findUserById(@RequestBody Long[] ids);

    /**
     * 查询用户数量
     *
     * @param userVo userVo
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/05/09 22:04
     */
    @RequestMapping(value = "/v1/user/userCount", method = RequestMethod.POST)
    ResponseBean<Integer> findUserCount(@RequestBody UserVo userVo);

    /**
     * 根据部门id获取部门
     *
     * @param ids ids
     * @return ResponseBean
     */
    @RequestMapping(value = "/v1/dept/findById", method = RequestMethod.POST)
    ResponseBean<List<DeptVo>> findDeptById(@RequestBody Long[] ids);

    /**
     * 根据ID删除附件
     *
     * @param id id
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/01/01 20:44
     */
    @DeleteMapping("/v1/attachment/{id}")
    ResponseBean<Boolean> deleteAttachment(@PathVariable(value = "id") Long id);

    /**
     * 根据附件id获取附件
     *
     * @param ids ids
     * @return ResponseBean
     */
    @RequestMapping(value = "/v1/attachment/findById", method = RequestMethod.POST)
    ResponseBean<List<AttachmentVo>> findAttachmentById(@RequestBody Long[] ids);

    /**
     * 保存日志
     *
     * @param log log
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/03/23 23:26
     */
    @PostMapping("/v1/log")
    ResponseBean<Boolean> saveLog(@RequestBody Log log);

    /**
     * 根据角色查找菜单
     *
     * @param role       角色
     * @param tenantCode 租户标识
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/04/08 20:42
     */
    @GetMapping("/v1/menu/anonymousUser/findMenuByRole/{role}")
    ResponseBean<List<Menu>> findMenuByRole(@PathVariable("role") String role, @RequestParam("tenantCode") String tenantCode);

    /**
     * 查询所有菜单
     *
     * @param tenantCode 租户标识
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/04/26 11:48
     */
    @GetMapping("/v1/menu/anonymousUser/findAllMenu")
	ResponseBean<List<Menu>> findAllMenu(@RequestParam("tenantCode") String tenantCode);

    /**
     * 根据租户code获取租户的详细信息
     *
     * @param tenantCode 租户标识
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/05/26 10:21
     */
    @GetMapping("/v1/tenant/anonymousUser/findTenantByTenantCode/{tenantCode}")
    ResponseBean<Tenant> findTenantByTenantCode(@PathVariable("tenantCode") String tenantCode);

    /**
     * 根据社交账号获取用户详细信息
     *
     * @param social     social
     * @param tenantCode 租户标识
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/06/22 21:10
     */
    @GetMapping("/v1/user/findUserBySocial/{social}")
    ResponseBean<UserVo> findUserBySocial(@PathVariable("social") String social, @RequestParam("tenantCode") String tenantCode);

    /**
     * 注册用户
     *
     * @param userDto userDto
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/07/05 20:57:31
     */
    @PostMapping("/v1/user/anonymousUser/register")
    ResponseBean<Boolean> registerUser(@RequestBody UserDto userDto);

    /**
     * 更新用户登录信息
     *
     * @param userDto userDto
     * @return ResponseBean
     * @author Uncle Lan
     * @date 2019/07/05 20:59:06
     */
    @PutMapping("/v1/user/anonymousUser/updateLoginInfo")
    ResponseBean<Boolean> updateLoginInfo(UserDto userDto);
}
