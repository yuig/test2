package y31;

import a.cb;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final r41.e f136826a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136827b;

    /* renamed from: c, reason: collision with root package name */
    public final wy0 f136828c;

    /* renamed from: d, reason: collision with root package name */
    public final wy0 f136829d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f136830e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.l0 f136831f;

    public o0(r41.e profileDisplay, String userId, wy0 wy0Var, wy0 wy0Var2, boolean z13, zy.l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(profileDisplay, "profileDisplay");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f136826a = profileDisplay;
        this.f136827b = userId;
        this.f136828c = wy0Var;
        this.f136829d = wy0Var2;
        this.f136830e = z13;
        this.f136831f = pinalyticsVMState;
    }

    public static o0 b(o0 o0Var, wy0 wy0Var, zy.l0 l0Var, int i13) {
        r41.e profileDisplay = o0Var.f136826a;
        String userId = o0Var.f136827b;
        if ((i13 & 4) != 0) {
            wy0Var = o0Var.f136828c;
        }
        wy0 wy0Var2 = wy0Var;
        wy0 wy0Var3 = o0Var.f136829d;
        boolean z13 = o0Var.f136830e;
        if ((i13 & 32) != 0) {
            l0Var = o0Var.f136831f;
        }
        zy.l0 pinalyticsVMState = l0Var;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(profileDisplay, "profileDisplay");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new o0(profileDisplay, userId, wy0Var2, wy0Var3, z13, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f136826a == o0Var.f136826a && Intrinsics.d(this.f136827b, o0Var.f136827b) && Intrinsics.d(this.f136828c, o0Var.f136828c) && Intrinsics.d(this.f136829d, o0Var.f136829d) && this.f136830e == o0Var.f136830e && Intrinsics.d(this.f136831f, o0Var.f136831f);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f136827b, this.f136826a.hashCode() * 31, 31);
        wy0 wy0Var = this.f136828c;
        int hashCode = (d2 + (wy0Var == null ? 0 : wy0Var.hashCode())) * 31;
        wy0 wy0Var2 = this.f136829d;
        return this.f136831f.hashCode() + ep.b.e(this.f136830e, (hashCode + (wy0Var2 != null ? wy0Var2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "UserProfileHeaderVMState(profileDisplay=" + this.f136826a + ", userId=" + this.f136827b + ", user=" + this.f136828c + ", me=" + this.f136829d + ", isMe=" + this.f136830e + ", pinalyticsVMState=" + this.f136831f + ")";
    }
}
