package ue1;

import com.pinterest.api.model.q30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class q implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final q30 f122049a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122050b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122051c;

    public q(@NotNull q30 pinCluster, String str) {
        Intrinsics.checkNotNullParameter(pinCluster, "pinCluster");
        this.f122049a = pinCluster;
        this.f122050b = str;
        this.f122051c = RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String id3 = this.f122049a.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }

    @Override // ue1.a0
    public final String d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f122049a, qVar.f122049a) && Intrinsics.d(this.f122050b, qVar.f122050b);
    }

    @Override // ue1.a0
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f122049a.hashCode() * 31;
        String str = this.f122050b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // ue1.a0
    public final p i() {
        return null;
    }

    @Override // ue1.a0
    public final int m() {
        return this.f122051c;
    }

    @Override // ue1.a0
    public final m p() {
        return null;
    }

    @Override // ue1.a0
    public final int t() {
        return xe1.v.f134804s;
    }

    public final String toString() {
        return "PinClusterRepItemViewModel(pinCluster=" + this.f122049a + ", requestParams=" + this.f122050b + ")";
    }

    public /* synthetic */ q(q30 q30Var, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(q30Var, (i13 & 2) != 0 ? null : str);
    }
}
