package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/pinterest/api/model/uv;", "", "", "a", "Ljava/lang/String;", "getSourceType", "()Ljava/lang/String;", "sourceType", "", "Lcom/pinterest/api/model/tv;", "b", "Ljava/util/List;", "()Ljava/util/List;", "setMetrics", "(Ljava/util/List;)V", "metrics", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class uv {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("source_type")
    @NotNull
    private final String sourceType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("metrics")
    @NotNull
    private List<tv> metrics;

    public uv() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: a, reason: from getter */
    public final List getMetrics() {
        return this.metrics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv)) {
            return false;
        }
        uv uvVar = (uv) obj;
        return Intrinsics.d(this.sourceType, uvVar.sourceType) && Intrinsics.d(this.metrics, uvVar.metrics);
    }

    public final int hashCode() {
        return this.metrics.hashCode() + (this.sourceType.hashCode() * 31);
    }

    public final String toString() {
        return "MetricsCollection(sourceType=" + this.sourceType + ", metrics=" + this.metrics + ")";
    }

    public uv(@NotNull String sourceType, @NotNull List<tv> metrics) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.sourceType = sourceType;
        this.metrics = metrics;
    }

    public /* synthetic */ uv(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "android" : str, (i13 & 2) != 0 ? new ArrayList() : list);
    }
}
