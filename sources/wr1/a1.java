package wr1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final mr1.c f130938a;

    /* renamed from: b, reason: collision with root package name */
    public final wy0 f130939b;

    /* renamed from: c, reason: collision with root package name */
    public final o82.j0 f130940c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.l0 f130941d;

    public a1(mr1.c activityProvider, wy0 userSelected, o82.j0 multiSectionVMState, zy.l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(userSelected, "userSelected");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f130938a = activityProvider;
        this.f130939b = userSelected;
        this.f130940c = multiSectionVMState;
        this.f130941d = pinalyticsVMState;
    }

    public static a1 b(a1 a1Var, wy0 userSelected, o82.j0 multiSectionVMState, int i13) {
        mr1.c activityProvider = a1Var.f130938a;
        if ((i13 & 2) != 0) {
            userSelected = a1Var.f130939b;
        }
        if ((i13 & 4) != 0) {
            multiSectionVMState = a1Var.f130940c;
        }
        zy.l0 pinalyticsVMState = a1Var.f130941d;
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(userSelected, "userSelected");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new a1(activityProvider, userSelected, multiSectionVMState, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f130938a, a1Var.f130938a) && Intrinsics.d(this.f130939b, a1Var.f130939b) && Intrinsics.d(this.f130940c, a1Var.f130940c) && Intrinsics.d(this.f130941d, a1Var.f130941d);
    }

    public final int hashCode() {
        return this.f130941d.hashCode() + ep.b.c(this.f130940c.f93634a, (this.f130939b.hashCode() + (this.f130938a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "RecoverAccountVMState(activityProvider=" + this.f130938a + ", userSelected=" + this.f130939b + ", multiSectionVMState=" + this.f130940c + ", pinalyticsVMState=" + this.f130941d + ")";
    }
}
