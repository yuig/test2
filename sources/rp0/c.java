package rp0;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import java.util.Date;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public final az0 f109054a;

    /* renamed from: b, reason: collision with root package name */
    public final List f109055b;

    public c(az0 userDidItData) {
        Intrinsics.checkNotNullParameter(userDidItData, "userDidItData");
        this.f109054a = userDidItData;
        List S = userDidItData.S();
        this.f109055b = S == null ? q0.f80391a : S;
    }

    @Override // rp0.d
    public final f30 a() {
        return null;
    }

    @Override // rp0.d
    public final eb0.c b() {
        return null;
    }

    @Override // rp0.d
    public final boolean c() {
        return false;
    }

    @Override // rp0.d
    public final int d() {
        Integer J2 = this.f109054a.J();
        Intrinsics.checkNotNullExpressionValue(J2, "getHelpfulCount(...)");
        return J2.intValue();
    }

    @Override // rp0.d
    public final boolean e() {
        Boolean K = this.f109054a.K();
        Intrinsics.checkNotNullExpressionValue(K, "getHighlightedByPinOwner(...)");
        return K.booleanValue();
    }

    @Override // rp0.d
    public final String f() {
        List list = n10.c.f88919a;
        az0 az0Var = this.f109054a;
        Intrinsics.checkNotNullParameter(az0Var, "<this>");
        String str = (String) n10.c.f88920b.get(az0Var.getId());
        return str == null ? "" : str;
    }

    @Override // rp0.d
    public final String g() {
        return n10.c.c(this.f109054a, "1080x");
    }

    @Override // rp0.d
    public final int h() {
        List list = n10.c.f88919a;
        az0 az0Var = this.f109054a;
        Intrinsics.checkNotNullParameter(az0Var, "<this>");
        return n10.c.d(az0Var, v32.c.LIKE.getValue());
    }

    @Override // rp0.d
    public final boolean i() {
        List list = n10.c.f88919a;
        az0 az0Var = this.f109054a;
        Intrinsics.checkNotNullParameter(az0Var, "<this>");
        return az0Var.P().intValue() == v32.c.LIKE.getValue();
    }

    @Override // rp0.d
    public final boolean j() {
        Boolean N = this.f109054a.N();
        Intrinsics.checkNotNullExpressionValue(N, "getMarkedHelpfulByMe(...)");
        return N.booleanValue();
    }

    @Override // rp0.d
    public final String k() {
        return "userdiditdata";
    }

    @Override // rp0.d
    public final String l() {
        return null;
    }

    @Override // rp0.d
    public final String m() {
        return null;
    }

    @Override // rp0.d
    public final boolean n() {
        return false;
    }

    @Override // rp0.d
    public final int o() {
        Integer G = this.f109054a.G();
        Intrinsics.checkNotNullExpressionValue(G, "getCommentCount(...)");
        return G.intValue();
    }

    @Override // rp0.d
    public final f30 p() {
        return null;
    }

    @Override // rp0.d
    public final List q() {
        return this.f109055b;
    }

    @Override // rp0.d
    public final String r() {
        String H = this.f109054a.H();
        return H == null ? "" : H;
    }

    @Override // rp0.d
    public final Date s() {
        return this.f109054a.I();
    }

    @Override // rp0.d
    public final String v() {
        String id3 = this.f109054a.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }

    @Override // rp0.d
    public final wy0 w() {
        return this.f109054a.U();
    }

    @Override // rp0.d
    public final boolean x() {
        return false;
    }

    @Override // rp0.d
    public final Boolean y() {
        return null;
    }

    public final az0 z() {
        return this.f109054a;
    }
}
