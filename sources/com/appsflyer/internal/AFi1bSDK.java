package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1bSDK implements AFi1gSDK {

    @NotNull
    private PluginInfo AFAdRevenueData = new PluginInfo(Plugin.NATIVE, "6.16.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1gSDK
    @NotNull
    public final Map<String, Object> AFAdRevenueData() {
        LinkedHashMap h10 = z0.h(new Pair("platform", this.AFAdRevenueData.getPlugin().getPluginName()), new Pair("version", this.AFAdRevenueData.getVersion()));
        if (!this.AFAdRevenueData.getAdditionalParams().isEmpty()) {
            h10.put("extras", this.AFAdRevenueData.getAdditionalParams());
        }
        return h10;
    }

    @Override // com.appsflyer.internal.AFi1gSDK
    public final void getRevenue(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFAdRevenueData = pluginInfo;
    }
}
