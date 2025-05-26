package o82;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final l82.i0 f93721a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f93723c;

    /* renamed from: d, reason: collision with root package name */
    public final j f93724d;

    public u0(l82.i0 vmState, int i13, String itemId, j gridSpacing) {
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(gridSpacing, "gridSpacing");
        this.f93721a = vmState;
        this.f93722b = i13;
        this.f93723c = itemId;
        this.f93724d = gridSpacing;
    }

    public static u0 a(u0 u0Var, l82.i0 vmState) {
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        String itemId = u0Var.f93723c;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        j gridSpacing = u0Var.f93724d;
        Intrinsics.checkNotNullParameter(gridSpacing, "gridSpacing");
        return new u0(vmState, u0Var.f93722b, itemId, gridSpacing);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f93721a, u0Var.f93721a) && this.f93722b == u0Var.f93722b && Intrinsics.d(this.f93723c, u0Var.f93723c) && Intrinsics.d(this.f93724d, u0Var.f93724d);
    }

    public final int hashCode() {
        return this.f93724d.hashCode() + cb.d(this.f93723c, ep.b.b(this.f93722b, this.f93721a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "RecyclerItem(vmState=" + this.f93721a + ", viewType=" + this.f93722b + ", itemId=" + this.f93723c + ", gridSpacing=" + this.f93724d + ")";
    }

    public /* synthetic */ u0(l82.i0 i0Var, int i13, String str) {
        this(i0Var, i13, str, new j(false, false, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK));
    }
}
