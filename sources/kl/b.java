package kl;

import a.h5;
import a.sc;
import el.c1;
import el.j0;
import el.l;
import el.l0;
import el.n;
import il.d3;
import il.n1;
import il.o1;
import il.o5;
import il.t1;
import il.u1;
import il.w1;
import il.y2;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f80004a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f80005b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f80006c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f80007d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f80008e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f80009f;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        ml.a c14 = c1.c("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f80004a = new l0(new h5(25), jl.e.class);
        f80005b = new j0(new h5(26), c13);
        f80006c = new n(new h5(27), jl.g.class);
        f80007d = new l(new h5(28), c14);
        f80008e = new n(new h5(29), jl.f.class);
        f80009f = new l(new sc(0), c13);
    }

    public static int a(jl.a aVar) {
        if (jl.a.f76788c.equals(aVar)) {
            return 33;
        }
        if (jl.a.f76789d.equals(aVar)) {
            return 49;
        }
        if (jl.a.f76790e.equals(aVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + aVar);
    }

    public static o1 b(jl.e eVar) {
        d3 d3Var;
        y2 y2Var;
        w1 w1Var;
        n1 H = o1.H();
        jl.b bVar = eVar.f76830c;
        if (jl.b.f76797b.equals(bVar)) {
            d3Var = d3.SHA256;
        } else if (jl.b.f76798c.equals(bVar)) {
            d3Var = d3.SHA384;
        } else {
            if (!jl.b.f76799d.equals(bVar)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + bVar);
            }
            d3Var = d3.SHA512;
        }
        H.g();
        o1.A((o1) H.f33596b, d3Var);
        jl.a aVar = jl.a.f76788c;
        jl.a aVar2 = eVar.f76829b;
        if (aVar.equals(aVar2)) {
            y2Var = y2.NIST_P256;
        } else if (jl.a.f76789d.equals(aVar2)) {
            y2Var = y2.NIST_P384;
        } else {
            if (!jl.a.f76790e.equals(aVar2)) {
                throw new GeneralSecurityException("Unable to serialize CurveType " + aVar2);
            }
            y2Var = y2.NIST_P521;
        }
        H.g();
        o1.B((o1) H.f33596b, y2Var);
        jl.c cVar = jl.c.f76806b;
        jl.c cVar2 = eVar.f76828a;
        if (cVar.equals(cVar2)) {
            w1Var = w1.IEEE_P1363;
        } else {
            if (!jl.c.f76807c.equals(cVar2)) {
                throw new GeneralSecurityException("Unable to serialize SignatureEncoding " + cVar2);
            }
            w1Var = w1.DER;
        }
        H.g();
        o1.C((o1) H.f33596b, w1Var);
        return (o1) H.a();
    }

    public static u1 c(jl.g gVar) {
        int a13 = a(gVar.f76844c.f76829b);
        t1 I = u1.I();
        o1 b13 = b(gVar.f76844c);
        I.g();
        u1.A((u1) I.f33596b, b13);
        ECPoint eCPoint = gVar.f76845d;
        byte[] Q2 = c0.d.Q2(a13, eCPoint.getAffineX());
        com.google.crypto.tink.shaded.protobuf.j d2 = com.google.crypto.tink.shaded.protobuf.k.d(Q2, 0, Q2.length);
        I.g();
        u1.B((u1) I.f33596b, d2);
        byte[] Q22 = c0.d.Q2(a13, eCPoint.getAffineY());
        com.google.crypto.tink.shaded.protobuf.j d13 = com.google.crypto.tink.shaded.protobuf.k.d(Q22, 0, Q22.length);
        I.g();
        u1.C((u1) I.f33596b, d13);
        return (u1) I.a();
    }

    public static jl.a d(y2 y2Var) {
        int i13 = a.f80002c[y2Var.ordinal()];
        if (i13 == 1) {
            return jl.a.f76788c;
        }
        if (i13 == 2) {
            return jl.a.f76789d;
        }
        if (i13 == 3) {
            return jl.a.f76790e;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + y2Var.getNumber());
    }

    public static jl.b e(d3 d3Var) {
        int i13 = a.f80000a[d3Var.ordinal()];
        if (i13 == 1) {
            return jl.b.f76797b;
        }
        if (i13 == 2) {
            return jl.b.f76798c;
        }
        if (i13 == 3) {
            return jl.b.f76799d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + d3Var.getNumber());
    }

    public static o5 f(jl.d dVar) {
        if (jl.d.f76816b.equals(dVar)) {
            return o5.TINK;
        }
        if (jl.d.f76817c.equals(dVar)) {
            return o5.CRUNCHY;
        }
        if (jl.d.f76819e.equals(dVar)) {
            return o5.RAW;
        }
        if (jl.d.f76818d.equals(dVar)) {
            return o5.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static jl.c g(w1 w1Var) {
        int i13 = a.f80003d[w1Var.ordinal()];
        if (i13 == 1) {
            return jl.c.f76806b;
        }
        if (i13 == 2) {
            return jl.c.f76807c;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + w1Var.getNumber());
    }

    public static jl.d h(o5 o5Var) {
        int i13 = a.f80001b[o5Var.ordinal()];
        if (i13 == 1) {
            return jl.d.f76816b;
        }
        if (i13 == 2) {
            return jl.d.f76817c;
        }
        if (i13 == 3) {
            return jl.d.f76818d;
        }
        if (i13 == 4) {
            return jl.d.f76819e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
    }
}
