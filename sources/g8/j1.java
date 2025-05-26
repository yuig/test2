package g8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import pk.v2;

/* loaded from: classes3.dex */
public final class j1 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final g7.i f64305h;

    /* renamed from: i, reason: collision with root package name */
    public final g7.e f64306i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.b f64307j;

    /* renamed from: k, reason: collision with root package name */
    public final long f64308k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public final a10.e f64309l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f64310m;

    /* renamed from: n, reason: collision with root package name */
    public final f1 f64311n;

    /* renamed from: o, reason: collision with root package name */
    public final a7.i0 f64312o;

    /* renamed from: p, reason: collision with root package name */
    public final ok.g0 f64313p;

    /* renamed from: q, reason: collision with root package name */
    public g7.a0 f64314q;

    public j1(a7.h0 h0Var, g7.e eVar, a10.e eVar2, boolean z13, Executor executor) {
        a7.b0 b0Var;
        a7.d0 d0Var;
        this.f64306i = eVar;
        this.f64309l = eVar2;
        this.f64310m = z13;
        a7.w wVar = new a7.w();
        a7.z zVar = new a7.z();
        List emptyList = Collections.emptyList();
        v2 v2Var = v2.f100502e;
        a7.b0 b0Var2 = new a7.b0();
        a7.e0 e0Var = a7.e0.f982d;
        Uri uri = Uri.EMPTY;
        String uri2 = h0Var.f1054a.toString();
        uri2.getClass();
        pk.c1 r13 = pk.c1.r(pk.c1.v(h0Var));
        bf.b.t(zVar.f1244b == null || zVar.f1243a != null);
        if (uri != null) {
            a7.a0 a0Var = zVar.f1243a != null ? new a7.a0(zVar) : null;
            b0Var = b0Var2;
            d0Var = new a7.d0(uri, null, a0Var, emptyList, null, r13, executor, -9223372036854775807L);
        } else {
            b0Var = b0Var2;
            d0Var = null;
        }
        a7.i0 i0Var = new a7.i0(uri2, new a7.y(wVar), d0Var, new a7.c0(b0Var), a7.l0.I, e0Var);
        this.f64312o = i0Var;
        a7.q qVar = new a7.q();
        qVar.f1181n = a7.o0.r((String) kh2.b0.h0(h0Var.f1055b, "text/x-unknown"));
        qVar.f1171d = h0Var.f1056c;
        qVar.f1172e = h0Var.f1057d;
        qVar.f1173f = h0Var.f1058e;
        qVar.f1169b = h0Var.f1059f;
        String str = h0Var.f1060g;
        qVar.f1168a = str == null ? null : str;
        this.f64307j = new androidx.media3.common.b(qVar);
        Map emptyMap = Collections.emptyMap();
        Uri uri3 = h0Var.f1054a;
        bf.b.x(uri3, "The uri must be set.");
        this.f64305h = new g7.i(uri3, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.f64311n = new f1(-9223372036854775807L, true, false, i0Var);
        this.f64313p = null;
    }

    @Override // g8.a
    public final c0 b(e0 e0Var, l8.m mVar, long j13) {
        g7.a0 a0Var = this.f64314q;
        h0 a13 = a(e0Var);
        ok.g0 g0Var = this.f64313p;
        return new i1(this.f64305h, this.f64306i, a0Var, this.f64307j, this.f64308k, this.f64309l, a13, this.f64310m, g0Var != null ? (m8.a) g0Var.get() : null);
    }

    @Override // g8.a
    public final a7.i0 j() {
        return this.f64312o;
    }

    @Override // g8.a
    public final void l() {
    }

    @Override // g8.a
    public final void n(g7.a0 a0Var) {
        this.f64314q = a0Var;
        o(this.f64311n);
    }

    @Override // g8.a
    public final void q(c0 c0Var) {
        ((i1) c0Var).f64294i.f(null);
    }

    @Override // g8.a
    public final void t() {
    }
}
