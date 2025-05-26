package kl;

import a.sc;
import el.c1;
import el.j0;
import el.l;
import el.l0;
import el.n;
import il.b6;
import il.c6;
import il.d3;
import il.o5;
import il.v5;
import il.w5;
import java.math.BigInteger;
import jl.t;
import jl.u;
import jl.v;
import jl.w;
import jl.x;
import pd.d0;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f80021a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f80022b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f80023c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f80024d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f80025e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f80026f;

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f80027g;

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f80028h;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        ml.a c14 = c1.c("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f80021a = new l0(new sc(7), v.class);
        f80022b = new j0(new sc(8), c13);
        f80023c = new n(new sc(9), x.class);
        f80024d = new l(new sc(10), c14);
        f80025e = new n(new sc(11), w.class);
        f80026f = new l(new sc(12), c13);
        qq2.c a13 = d0.a();
        a13.a(o5.RAW, u.f76903e);
        a13.a(o5.TINK, u.f76900b);
        a13.a(o5.CRUNCHY, u.f76901c);
        a13.a(o5.LEGACY, u.f76902d);
        f80027g = a13.b();
        qq2.c a14 = d0.a();
        a14.a(d3.SHA256, t.f76896b);
        a14.a(d3.SHA384, t.f76897c);
        a14.a(d3.SHA512, t.f76898d);
        f80028h = a14.b();
    }

    public static ll.j a(com.google.crypto.tink.shaded.protobuf.k kVar) {
        return ll.j.j(c0.d.Q(kVar.i()));
    }

    public static com.google.crypto.tink.shaded.protobuf.j b(BigInteger bigInteger) {
        byte[] P2 = c0.d.P2(bigInteger);
        com.google.crypto.tink.shaded.protobuf.j jVar = com.google.crypto.tink.shaded.protobuf.k.f33636b;
        return com.google.crypto.tink.shaded.protobuf.k.d(P2, 0, P2.length);
    }

    public static c6 c(x xVar) {
        b6 I = c6.I();
        v vVar = xVar.f76917c;
        v5 D = w5.D();
        d3 d3Var = (d3) f80028h.c(vVar.f76909d);
        D.g();
        w5.A((w5) D.f33596b, d3Var);
        w5 w5Var = (w5) D.a();
        I.g();
        c6.A((c6) I.f33596b, w5Var);
        com.google.crypto.tink.shaded.protobuf.j b13 = b(xVar.f76918d);
        I.g();
        c6.B((c6) I.f33596b, b13);
        com.google.crypto.tink.shaded.protobuf.j b14 = b(xVar.f76917c.f76907b);
        I.g();
        c6.C((c6) I.f33596b, b14);
        return (c6) I.a();
    }
}
