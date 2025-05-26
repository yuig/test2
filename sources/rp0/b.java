package rp0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.sd;
import com.pinterest.api.model.wd;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import kh2.j1;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final z2 f109053a;

    public b(z2 aggregatedComment) {
        Intrinsics.checkNotNullParameter(aggregatedComment, "aggregatedComment");
        this.f109053a = aggregatedComment;
    }

    @Override // rp0.d
    public final f30 a() {
        return this.f109053a.I();
    }

    @Override // rp0.d
    public final eb0.c b() {
        eb0.a aVar = eb0.c.Companion;
        Integer L = this.f109053a.L();
        Intrinsics.checkNotNullExpressionValue(L, "getCommentTag(...)");
        int intValue = L.intValue();
        aVar.getClass();
        if (intValue == 1) {
            return eb0.c.QUESTION;
        }
        return null;
    }

    @Override // rp0.d
    public final boolean c() {
        sd R = this.f109053a.R();
        return (R != null ? R.c() : null) != null;
    }

    @Override // rp0.d
    public final int d() {
        Integer N = this.f109053a.N();
        Intrinsics.checkNotNullExpressionValue(N, "getHelpfulCount(...)");
        return N.intValue();
    }

    @Override // rp0.d
    public final boolean e() {
        Boolean O = this.f109053a.O();
        Intrinsics.checkNotNullExpressionValue(O, "getHighlightedByPinOwner(...)");
        return O.booleanValue();
    }

    @Override // rp0.d
    public final String f() {
        return "";
    }

    @Override // rp0.d
    public final String g() {
        wd c13;
        sd R = this.f109053a.R();
        String u13 = (R == null || (c13 = R.c()) == null) ? null : c13.u();
        return u13 == null ? "" : u13;
    }

    @Override // rp0.d
    public final int h() {
        return n10.a.c(this.f109053a);
    }

    @Override // rp0.d
    public final boolean i() {
        return n10.a.d(this.f109053a);
    }

    @Override // rp0.d
    public final boolean j() {
        Boolean Q = this.f109053a.Q();
        Intrinsics.checkNotNullExpressionValue(Q, "getMarkedHelpfulByMe(...)");
        return Q.booleanValue();
    }

    @Override // rp0.d
    public final String k() {
        return "aggregatedcomment";
    }

    @Override // rp0.d
    public final String l() {
        LinkedHashMap linkedHashMap = n10.a.f88916a;
        z2 z2Var = this.f109053a;
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        return (String) n10.a.f88917b.get(z2Var.getId());
    }

    @Override // rp0.d
    public final String m() {
        return n10.a.e(this.f109053a);
    }

    @Override // rp0.d
    public final boolean n() {
        Boolean U = this.f109053a.U();
        Intrinsics.checkNotNullExpressionValue(U, "getReactedByCreator(...)");
        return U.booleanValue();
    }

    @Override // rp0.d
    public final int o() {
        Integer J2 = this.f109053a.J();
        Intrinsics.checkNotNullExpressionValue(J2, "getCommentCount(...)");
        return J2.intValue();
    }

    @Override // rp0.d
    public final f30 p() {
        return this.f109053a.K();
    }

    @Override // rp0.d
    public final List q() {
        List Y = this.f109053a.Y();
        return Y == null ? q0.f80391a : Y;
    }

    @Override // rp0.d
    public final String r() {
        LinkedHashMap linkedHashMap = n10.a.f88916a;
        z2 z2Var = this.f109053a;
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        String Z = z2Var.Z();
        return Z == null ? "" : Z;
    }

    @Override // rp0.d
    public final Date s() {
        return this.f109053a.M();
    }

    @Override // rp0.d
    public final String v() {
        z2 z2Var = this.f109053a;
        if (!j1.m0(z2Var)) {
            return "";
        }
        String id3 = z2Var.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }

    @Override // rp0.d
    public final wy0 w() {
        return this.f109053a.b0();
    }

    @Override // rp0.d
    public final boolean x() {
        LinkedHashMap linkedHashMap = n10.a.f88916a;
        z2 z2Var = this.f109053a;
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        return n10.a.e(z2Var) != null;
    }

    @Override // rp0.d
    public final Boolean y() {
        return this.f109053a.P();
    }
}
