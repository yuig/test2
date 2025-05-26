package com.pinterest.feature.core.view;

import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001a"}, d2 = {"com/pinterest/feature/core/view/ViewTypeKibanaMetric$ViewTypePayload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "viewTypeInt", "viewTypeName", "Lcom/pinterest/feature/core/view/ViewTypeKibanaMetric$ViewTypePayload;", "copy", "(ILjava/lang/String;)Lcom/pinterest/feature/core/view/ViewTypeKibanaMetric$ViewTypePayload;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getViewTypeInt", "Ljava/lang/String;", "getViewTypeName", "<init>", "(ILjava/lang/String;)V", "recyclerViewTypes_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class ViewTypeKibanaMetric$ViewTypePayload implements e {
    private final int viewTypeInt;

    @NotNull
    private final String viewTypeName;

    public ViewTypeKibanaMetric$ViewTypePayload(int i13, @NotNull String viewTypeName) {
        Intrinsics.checkNotNullParameter(viewTypeName, "viewTypeName");
        this.viewTypeInt = i13;
        this.viewTypeName = viewTypeName;
    }

    public static /* synthetic */ ViewTypeKibanaMetric$ViewTypePayload copy$default(ViewTypeKibanaMetric$ViewTypePayload viewTypeKibanaMetric$ViewTypePayload, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = viewTypeKibanaMetric$ViewTypePayload.viewTypeInt;
        }
        if ((i14 & 2) != 0) {
            str = viewTypeKibanaMetric$ViewTypePayload.viewTypeName;
        }
        return viewTypeKibanaMetric$ViewTypePayload.copy(i13, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getViewTypeInt() {
        return this.viewTypeInt;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getViewTypeName() {
        return this.viewTypeName;
    }

    @NotNull
    public final ViewTypeKibanaMetric$ViewTypePayload copy(int viewTypeInt, @NotNull String viewTypeName) {
        Intrinsics.checkNotNullParameter(viewTypeName, "viewTypeName");
        return new ViewTypeKibanaMetric$ViewTypePayload(viewTypeInt, viewTypeName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewTypeKibanaMetric$ViewTypePayload)) {
            return false;
        }
        ViewTypeKibanaMetric$ViewTypePayload viewTypeKibanaMetric$ViewTypePayload = (ViewTypeKibanaMetric$ViewTypePayload) other;
        return this.viewTypeInt == viewTypeKibanaMetric$ViewTypePayload.viewTypeInt && Intrinsics.d(this.viewTypeName, viewTypeKibanaMetric$ViewTypePayload.viewTypeName);
    }

    public final int getViewTypeInt() {
        return this.viewTypeInt;
    }

    @NotNull
    public final String getViewTypeName() {
        return this.viewTypeName;
    }

    public int hashCode() {
        return this.viewTypeName.hashCode() + (Integer.hashCode(this.viewTypeInt) * 31);
    }

    @NotNull
    public String toString() {
        return "ViewTypePayload(viewTypeInt=" + this.viewTypeInt + ", viewTypeName=" + this.viewTypeName + ")";
    }
}
