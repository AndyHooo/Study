/*   
 * Copyright (c) 2016-2026 Founder Bdong. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */
package org.app.management.web.aspect;

import org.apache.log4j.Logger;

public class AspectBiz {
    private static Logger logger = Logger.getLogger("AspectBiz");

    public void biz() {
        logger.info("AspectBiz biz()");
    }
}
  