package com.xuecheng.framework.domain.cms.request;

/**
 * Created by 张少强 on 2021/1/24.
 **/

import lombok.Data;

/**
 * 页面查询请求模型
 */
@Data
public class QueryPageRequest {
    //站点id
    private String siteId;

    //页面ID
    private String pageId;

    //页面名称
    private String pageName;

    //别名
    private String pageAliase;

    //模板id
    private String templateId;

    //......
}
