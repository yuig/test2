package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFi1gSDK {
    @NotNull
    Map<String, Object> AFAdRevenueData();

    void getRevenue(@NotNull PluginInfo pluginInfo);
}
