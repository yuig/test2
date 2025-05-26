package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final se0.f f130992a;

    /* renamed from: b, reason: collision with root package name */
    public final p f130993b;

    /* renamed from: c, reason: collision with root package name */
    public final c f130994c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.a0 f130995d;

    /* renamed from: e, reason: collision with root package name */
    public final i f130996e;

    public q(se0.f loadingState, p pVar, c cVar, o82.a0 listUsersDisplayState, i iVar) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(listUsersDisplayState, "listUsersDisplayState");
        this.f130992a = loadingState;
        this.f130993b = pVar;
        this.f130994c = cVar;
        this.f130995d = listUsersDisplayState;
        this.f130996e = iVar;
    }

    public static q e(q qVar, se0.f fVar, p pVar, c cVar, o82.a0 a0Var, i iVar, int i13) {
        if ((i13 & 1) != 0) {
            fVar = qVar.f130992a;
        }
        se0.f loadingState = fVar;
        if ((i13 & 2) != 0) {
            pVar = qVar.f130993b;
        }
        p pVar2 = pVar;
        if ((i13 & 4) != 0) {
            cVar = qVar.f130994c;
        }
        c cVar2 = cVar;
        if ((i13 & 8) != 0) {
            a0Var = qVar.f130995d;
        }
        o82.a0 listUsersDisplayState = a0Var;
        if ((i13 & 16) != 0) {
            iVar = qVar.f130996e;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(listUsersDisplayState, "listUsersDisplayState");
        return new q(loadingState, pVar2, cVar2, listUsersDisplayState, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f130992a == qVar.f130992a && Intrinsics.d(this.f130993b, qVar.f130993b) && Intrinsics.d(this.f130994c, qVar.f130994c) && Intrinsics.d(this.f130995d, qVar.f130995d) && Intrinsics.d(this.f130996e, qVar.f130996e);
    }

    public final int hashCode() {
        int hashCode = this.f130992a.hashCode() * 31;
        p pVar = this.f130993b;
        int hashCode2 = (hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        c cVar = this.f130994c;
        int c13 = ep.b.c(this.f130995d.f93524a, (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
        i iVar = this.f130996e;
        return c13 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "RecoverAccountDisplayState(loadingState=" + this.f130992a + ", recoverAccountModeState=" + this.f130993b + ", authenticationState=" + this.f130994c + ", listUsersDisplayState=" + this.f130995d + ", error=" + this.f130996e + ")";
    }
}
