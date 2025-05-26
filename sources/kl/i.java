package kl;

import a.sc;
import el.c1;
import el.j0;
import el.l;
import el.l0;
import el.n;
import il.d3;
import il.h6;
import il.i6;
import il.n6;
import il.o5;
import il.o6;
import java.math.BigInteger;
import jl.a0;
import jl.b0;
import jl.c0;
import jl.e0;
import pd.d0;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f80037a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f80038b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f80039c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f80040d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f80041e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f80042f;

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f80043g;

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f80044h;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        ml.a c14 = c1.c("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f80037a = new l0(new sc(13), c0.class);
        f80038b = new j0(new sc(14), c13);
        f80039c = new n(new sc(15), e0.class);
        f80040d = new l(new sc(16), c14);
        f80041e = new n(new sc(17), jl.d0.class);
        f80042f = new l(new sc(18), c13);
        qq2.c a13 = d0.a();
        a13.a(o5.RAW, b0.f76804e);
        a13.a(o5.TINK, b0.f76801b);
        a13.a(o5.CRUNCHY, b0.f76802c);
        a13.a(o5.LEGACY, b0.f76803d);
        f80043g = a13.b();
        qq2.c a14 = d0.a();
        a14.a(d3.SHA256, a0.f76793b);
        a14.a(d3.SHA384, a0.f76794c);
        a14.a(d3.SHA512, a0.f76795d);
        f80044h = a14.b();
    }

    public static ll.j a(com.google.crypto.tink.shaded.protobuf.k kVar) {
        return ll.j.j(c0.d.Q(kVar.i()));
    }

    public static com.google.crypto.tink.shaded.protobuf.j b(BigInteger bigInteger) {
        byte[] P2 = c0.d.P2(bigInteger);
        com.google.crypto.tink.shaded.protobuf.j jVar = com.google.crypto.tink.shaded.protobuf.k.f33636b;
        return com.google.crypto.tink.shaded.protobuf.k.d(P2, 0, P2.length);
    }

    public static i6 c(c0 c0Var) {
        h6 H = i6.H();
        a0 a0Var = c0Var.f76813d;
        d0 d0Var = f80044h;
        d3 d3Var = (d3) d0Var.c(a0Var);
        H.g();
        i6.A((i6) H.f33596b, d3Var);
        d3 d3Var2 = (d3) d0Var.c(c0Var.f76814e);
        H.g();
        i6.B((i6) H.f33596b, d3Var2);
        H.g();
        i6.C((i6) H.f33596b, c0Var.f76815f);
        return (i6) H.a();
    }

    public static o6 d(e0 e0Var) {
        n6 J2 = o6.J();
        i6 c13 = c(e0Var.f76832c);
        J2.g();
        o6.B((o6) J2.f33596b, c13);
        com.google.crypto.tink.shaded.protobuf.j b13 = b(e0Var.f76833d);
        J2.g();
        o6.C((o6) J2.f33596b, b13);
        com.google.crypto.tink.shaded.protobuf.j b14 = b(e0Var.f76832c.f76811b);
        J2.g();
        o6.D((o6) J2.f33596b, b14);
        J2.g();
        o6.A((o6) J2.f33596b);
        return (o6) J2.a();
    }
}
