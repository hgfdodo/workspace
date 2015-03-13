package utils;

import org.dom4j.io.SAXReader;

import bean.UserTaskInfo;
import bean.UserGetResult;


/**
 *@Project: CyberSpeedTest_ivce
 *@Author: Guangfu He
 *@Date: 2015-3-11
 *@Copyright: 2015 cyber Inc. All rights reserved.
 */

public interface XMLUtils {
	

	/**
	 * 通过结果xml获取结果信息
	 * @param content 结果xml内容
	 * @return 将结果信息保存在UserTaskResult对象的实例中「一个用户的一次任务结果」
	 */
	public abstract UserGetResult getresult(String content);
	
	public abstract boolean WriteParameter(UserTaskInfo info);
	
}

