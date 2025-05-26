package kl;

import a.sc;
import el.c1;
import el.j0;
import el.l;
import el.l0;
import el.n;
import il.o5;
import il.v2;
import il.w2;
import jl.m;
import pd.d0;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f80010a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f80011b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f80012c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f80013d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f80014e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f80015f;

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f80016g;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        ml.a c14 = c1.c("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f80010a = new l0(new sc(1), jl.j.class);
        f80011b = new j0(new sc(2), c13);
        f80012c = new n(new sc(3), m.class);
        f80013d = new l(new sc(4), c14);
        f80014e = new n(new sc(5), jl.k.class);
        f80015f = new l(new sc(6), c13);
        qq2.c a13 = d0.a();
        a13.a(o5.RAW, jl.i.f76857e);
        a13.a(o5.TINK, jl.i.f76854b);
        a13.a(o5.CRUNCHY, jl.i.f76855c);
        a13.a(o5.LEGACY, jl.i.f76856d);
        f80016g = a13.b();
    }

    public static w2 a(m mVar) {
        v2 E = w2.E();
        byte[] b13 = mVar.f76869d.b();
        com.google.crypto.tink.shaded.protobuf.j d2 = com.google.crypto.tink.shaded.protobuf.k.d(b13, 0, b13.length);
        E.g();
        w2.A((w2) E.f33596b, d2);
        return (w2) E.a();
    }
}
