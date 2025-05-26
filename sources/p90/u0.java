package p90;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.s f99230a;

    /* renamed from: b, reason: collision with root package name */
    public final o82.j0 f99231b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.l0 f99232c;

    /* renamed from: d, reason: collision with root package name */
    public final CutoutPickerOrigin f99233d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f99234e;

    public u0(sa0.s cutoutEditorVMState, o82.j0 listVMState, zy.l0 pinalyticsState, CutoutPickerOrigin origin, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(cutoutEditorVMState, "cutoutEditorVMState");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f99230a = cutoutEditorVMState;
        this.f99231b = listVMState;
        this.f99232c = pinalyticsState;
        this.f99233d = origin;
        this.f99234e = experimentsGroupInfo;
    }

    public static u0 b(u0 u0Var, sa0.s sVar, o82.j0 j0Var, zy.l0 l0Var, int i13) {
        if ((i13 & 1) != 0) {
            sVar = u0Var.f99230a;
        }
        sa0.s cutoutEditorVMState = sVar;
        if ((i13 & 2) != 0) {
            j0Var = u0Var.f99231b;
        }
        o82.j0 listVMState = j0Var;
        if ((i13 & 4) != 0) {
            l0Var = u0Var.f99232c;
        }
        zy.l0 pinalyticsState = l0Var;
        CutoutPickerOrigin origin = u0Var.f99233d;
        Map experimentsGroupInfo = u0Var.f99234e;
        u0Var.getClass();
        Intrinsics.checkNotNullParameter(cutoutEditorVMState, "cutoutEditorVMState");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        return new u0(cutoutEditorVMState, listVMState, pinalyticsState, origin, experimentsGroupInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f99230a, u0Var.f99230a) && Intrinsics.d(this.f99231b, u0Var.f99231b) && Intrinsics.d(this.f99232c, u0Var.f99232c) && this.f99233d == u0Var.f99233d && Intrinsics.d(this.f99234e, u0Var.f99234e);
    }

    public final int hashCode() {
        return this.f99234e.hashCode() + ((this.f99233d.hashCode() + jq.b.a(this.f99232c, ep.b.c(this.f99231b.f93634a, this.f99230a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "CollageContentCloseupVMState(cutoutEditorVMState=" + this.f99230a + ", listVMState=" + this.f99231b + ", pinalyticsState=" + this.f99232c + ", origin=" + this.f99233d + ", experimentsGroupInfo=" + this.f99234e + ")";
    }
}
