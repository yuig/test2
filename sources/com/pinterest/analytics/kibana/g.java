package com.pinterest.analytics.kibana;

import com.pinterest.analytics.kibana.KibanaMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/pinterest/analytics/kibana/g;", "Lcom/pinterest/analytics/kibana/KibanaMetrics$Log$Metadata;", "", "", "a", "Ljava/lang/String;", "getNetworkType", "()Ljava/lang/String;", "networkType", "analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class g extends KibanaMetrics.Log.Metadata {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("network_type")
    @NotNull
    private final String networkType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String networkType, String userId) {
        super(userId, null, 2, null);
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.networkType = networkType;
    }
}
