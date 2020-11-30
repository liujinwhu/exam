package com.lanshu.user.service;

import cn.hutool.core.collection.CollUtil;
import com.lanshu.common.core.constant.CommonConstant;
import com.lanshu.common.core.service.CrudService;
import com.lanshu.common.core.utils.TreeUtil;
import com.lanshu.common.security.utils.SysUtil;
import com.lanshu.user.api.dto.DeptDto;
import com.lanshu.user.api.module.Dept;
import com.lanshu.user.api.module.User;
import com.lanshu.user.mapper.DeptMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 部门service
 *
 * @author Uncle Lan
 * @date 2018/8/26 22:46
 */
@Service
public class DeptService extends CrudService<DeptMapper, Dept> {

    /**
     * 删除部门
     *
     * @param dept dept
     * @return int
     */
    @Transactional
    @Override
    public int delete(Dept dept) {
        // 删除部门
        return super.delete(dept);
    }

    /**
     * 根据用户批量查询
     *
     * @param userList userList
     * @return List
     * @author Uncle Lan
     * @date 2019/07/03 22:06:50
     */
    public List<Dept> getListByUsers(List<User> userList) {
        return this.findListById(userList.stream().filter(tempUser -> tempUser.getDeptId() != null).map(User::getDeptId).distinct().toArray(Long[]::new));
    }

	/**
	 * 查询树形部门集合
	 *
	 * @return List
	 * @author Uncle Lan
	 * @date 2018/10/25 12:57
	 */
	public List<DeptDto> depts() {
		Dept dept = new Dept();
		dept.setApplicationCode(SysUtil.getSysCode());
		dept.setTenantCode(SysUtil.getTenantCode());
		// 查询部门集合
		Stream<Dept> deptStream = findList(dept).stream();
		if (Optional.ofNullable(deptStream).isPresent()) {
			List<DeptDto> deptTreeList = deptStream.map(DeptDto::new).collect(Collectors.toList());
			// 排序、构建树形结构
			return TreeUtil
					.buildTree(CollUtil.sort(deptTreeList, Comparator.comparingInt(DeptDto::getSort)), CommonConstant.ROOT);
		}
		return new ArrayList<>();
	}
}
