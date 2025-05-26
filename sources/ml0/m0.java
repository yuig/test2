package ml0;

import com.pinterest.api.model.e8;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f87473a;

    /* renamed from: b, reason: collision with root package name */
    public final o82.j0 f87474b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.l0 f87475c;

    /* renamed from: d, reason: collision with root package name */
    public final f30 f87476d;

    /* renamed from: e, reason: collision with root package name */
    public final int f87477e;

    /* renamed from: f, reason: collision with root package name */
    public final e8 f87478f;

    public m0(String boardId, o82.j0 listVMState, zy.l0 pinalyticsState, f30 f30Var, int i13, e8 e8Var) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f87473a = boardId;
        this.f87474b = listVMState;
        this.f87475c = pinalyticsState;
        this.f87476d = f30Var;
        this.f87477e = i13;
        this.f87478f = e8Var;
    }

    public static m0 b(m0 m0Var, o82.j0 j0Var, zy.l0 l0Var, f30 f30Var, e8 e8Var, int i13) {
        String boardId = m0Var.f87473a;
        if ((i13 & 2) != 0) {
            j0Var = m0Var.f87474b;
        }
        o82.j0 listVMState = j0Var;
        if ((i13 & 4) != 0) {
            l0Var = m0Var.f87475c;
        }
        zy.l0 pinalyticsState = l0Var;
        if ((i13 & 8) != 0) {
            f30Var = m0Var.f87476d;
        }
        f30 f30Var2 = f30Var;
        int i14 = m0Var.f87477e;
        if ((i13 & 32) != 0) {
            e8Var = m0Var.f87478f;
        }
        m0Var.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new m0(boardId, listVMState, pinalyticsState, f30Var2, i14, e8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f87473a, m0Var.f87473a) && Intrinsics.d(this.f87474b, m0Var.f87474b) && Intrinsics.d(this.f87475c, m0Var.f87475c) && Intrinsics.d(this.f87476d, m0Var.f87476d) && this.f87477e == m0Var.f87477e && Intrinsics.d(this.f87478f, m0Var.f87478f);
    }

    public final int hashCode() {
        int a13 = jq.b.a(this.f87475c, ep.b.c(this.f87474b.f93634a, this.f87473a.hashCode() * 31, 31), 31);
        f30 f30Var = this.f87476d;
        int b13 = ep.b.b(this.f87477e, (a13 + (f30Var == null ? 0 : f30Var.hashCode())) * 31, 31);
        e8 e8Var = this.f87478f;
        return b13 + (e8Var != null ? e8Var.hashCode() : 0);
    }

    public final String toString() {
        return "BoardHeaderImageSelectorVMState(boardId=" + this.f87473a + ", listVMState=" + this.f87474b + ", pinalyticsState=" + this.f87475c + ", selectedPin=" + this.f87476d + ", maxPinCount=" + this.f87477e + ", loadedHeaderImage=" + this.f87478f + ")";
    }
}
