package com.lanshu.user.utils;

import com.lanshu.user.api.module.Menu;
import com.lanshu.user.excel.model.MenuExcelModel;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单工具类
 *
 * @author Uncle Lan
 * @date 2018/10/28 15:57
 */
public class MenuUtil {

	private MenuUtil() {
	}

	/**
	 * 转换对象
	 * @param menus menus
	 * @return List
	 */
	public static List<MenuExcelModel> convertToExcelModel(List<Menu> menus) {
		List<MenuExcelModel> menuExcelModels = new ArrayList<>(menus.size());
		menus.forEach(menu -> {
			MenuExcelModel menuExcelModel = new MenuExcelModel();
			BeanUtils.copyProperties(menu, menuExcelModel);
			menuExcelModels.add(menuExcelModel);
		});
		return menuExcelModels;
	}
}
