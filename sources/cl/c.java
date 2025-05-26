package cl;

import androidx.appcompat.widget.c2;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.u;
import el.c1;
import el.j0;
import el.l0;
import il.d3;
import il.e2;
import il.f2;
import il.i1;
import il.k2;
import il.l2;
import il.n2;
import il.n4;
import il.o2;
import il.o4;
import il.o5;
import il.y1;
import il.y2;
import il.z1;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Set;
import kh2.r;
import pd.d0;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f27929a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f27930b;

    /* renamed from: c, reason: collision with root package name */
    public static final el.n f27931c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.l f27932d;

    /* renamed from: e, reason: collision with root package name */
    public static final el.n f27933e;

    /* renamed from: f, reason: collision with root package name */
    public static final el.l f27934f;

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f27935g;

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f27936h;

    /* renamed from: i, reason: collision with root package name */
    public static final d0 f27937i;

    /* renamed from: j, reason: collision with root package name */
    public static final d0 f27938j;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        ml.a c14 = c1.c("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        f27929a = new l0(new mj.m(23), bl.f.class);
        f27930b = new j0(new mj.m(24), c13);
        f27931c = new el.n(new mj.m(25), bl.h.class);
        f27932d = new el.l(new mj.m(26), c14);
        f27933e = new el.n(new mj.m(27), bl.g.class);
        f27934f = new el.l(new mj.m(28), c13);
        qq2.c a13 = d0.a();
        a13.a(o5.RAW, bl.e.f23418d);
        a13.a(o5.TINK, bl.e.f23416b);
        o5 o5Var = o5.LEGACY;
        bl.e eVar = bl.e.f23417c;
        a13.a(o5Var, eVar);
        a13.a(o5.CRUNCHY, eVar);
        f27935g = a13.b();
        qq2.c a14 = d0.a();
        a14.a(d3.SHA1, bl.c.f23406b);
        a14.a(d3.SHA224, bl.c.f23407c);
        a14.a(d3.SHA256, bl.c.f23408d);
        a14.a(d3.SHA384, bl.c.f23409e);
        a14.a(d3.SHA512, bl.c.f23410f);
        f27936h = a14.b();
        qq2.c a15 = d0.a();
        a15.a(y2.NIST_P256, bl.b.f23401b);
        a15.a(y2.NIST_P384, bl.b.f23402c);
        a15.a(y2.NIST_P521, bl.b.f23403d);
        a15.a(y2.CURVE25519, bl.b.f23404e);
        f27937i = a15.b();
        qq2.c a16 = d0.a();
        a16.a(i1.UNCOMPRESSED, bl.d.f23413c);
        a16.a(i1.COMPRESSED, bl.d.f23412b);
        a16.a(i1.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, bl.d.f23414d);
        f27938j = a16.b();
    }

    public static bl.f a(o5 o5Var, f2 f2Var) {
        n4 H = o4.H();
        H.j(f2Var.E().B().F());
        H.i(o5.RAW);
        H.k(f2Var.E().B().G());
        o4 o4Var = (o4) H.a();
        Set set = bl.f.f23420g;
        c2 c2Var = new c2();
        c2Var.f16535f = (bl.e) f27935g.b(o5Var);
        c2Var.f16531b = (bl.b) f27937i.b(f2Var.G().D());
        c2Var.f16532c = (bl.c) f27936h.b(f2Var.G().F());
        c2Var.x(r.f1(o4Var.d()));
        ml.a a13 = ml.a.a(f2Var.G().G().i());
        if (a13.f87434a.length == 0) {
            c2Var.f16536g = null;
        } else {
            c2Var.f16536g = a13;
        }
        if (!f2Var.G().D().equals(y2.CURVE25519)) {
            c2Var.f16533d = (bl.d) f27938j.b(f2Var.F());
        } else if (!f2Var.F().equals(i1.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return c2Var.c();
    }

    public static int b(bl.b bVar) {
        if (bl.b.f23401b.equals(bVar)) {
            return 33;
        }
        if (bl.b.f23402c.equals(bVar)) {
            return 49;
        }
        if (bl.b.f23403d.equals(bVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + bVar);
    }

    public static f2 c(bl.f fVar) {
        n2 H = o2.H();
        y2 y2Var = (y2) f27937i.c(fVar.f23421a);
        H.g();
        o2.A((o2) H.f33596b, y2Var);
        d3 d3Var = (d3) f27936h.c(fVar.f23422b);
        H.g();
        o2.B((o2) H.f33596b, d3Var);
        ml.a aVar = fVar.f23426f;
        if (aVar != null && aVar.f87434a.length > 0) {
            byte[] b13 = aVar.b();
            com.google.crypto.tink.shaded.protobuf.j d2 = com.google.crypto.tink.shaded.protobuf.k.d(b13, 0, b13.length);
            H.g();
            o2.C((o2) H.f33596b, d2);
        }
        o2 o2Var = (o2) H.a();
        try {
            o4 I = o4.I(r.k1(fVar.f23425e), u.a());
            y1 D = z1.D();
            n4 H2 = o4.H();
            H2.j(I.F());
            H2.i(o5.TINK);
            H2.k(I.G());
            o4 o4Var = (o4) H2.a();
            D.g();
            z1.A((z1) D.f33596b, o4Var);
            z1 z1Var = (z1) D.a();
            bl.d dVar = fVar.f23423c;
            if (dVar == null) {
                dVar = bl.d.f23412b;
            }
            e2 H3 = f2.H();
            H3.g();
            f2.A((f2) H3.f33596b, o2Var);
            H3.g();
            f2.B((f2) H3.f33596b, z1Var);
            i1 i1Var = (i1) f27938j.c(dVar);
            H3.g();
            f2.C((f2) H3.f33596b, i1Var);
            return (f2) H3.a();
        } catch (InvalidProtocolBufferException e13) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e13);
        }
    }

    public static l2 d(bl.h hVar) {
        boolean equals = hVar.f23430c.f23421a.equals(bl.b.f23404e);
        bl.f fVar = hVar.f23430c;
        if (equals) {
            k2 J2 = l2.J();
            J2.g();
            l2.A((l2) J2.f33596b);
            f2 c13 = c(fVar);
            J2.g();
            l2.B((l2) J2.f33596b, c13);
            byte[] b13 = hVar.f23432e.b();
            com.google.crypto.tink.shaded.protobuf.j d2 = com.google.crypto.tink.shaded.protobuf.k.d(b13, 0, b13.length);
            J2.g();
            l2.C((l2) J2.f33596b, d2);
            com.google.crypto.tink.shaded.protobuf.j jVar = com.google.crypto.tink.shaded.protobuf.k.f33636b;
            J2.g();
            l2.D((l2) J2.f33596b, jVar);
            return (l2) J2.a();
        }
        int b14 = b(fVar.f23421a);
        ECPoint eCPoint = hVar.f23431d;
        if (eCPoint == null) {
            throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
        }
        k2 J3 = l2.J();
        J3.g();
        l2.A((l2) J3.f33596b);
        f2 c14 = c(fVar);
        J3.g();
        l2.B((l2) J3.f33596b, c14);
        byte[] Q2 = c0.d.Q2(b14, eCPoint.getAffineX());
        com.google.crypto.tink.shaded.protobuf.j d13 = com.google.crypto.tink.shaded.protobuf.k.d(Q2, 0, Q2.length);
        J3.g();
        l2.C((l2) J3.f33596b, d13);
        byte[] Q22 = c0.d.Q2(b14, eCPoint.getAffineY());
        com.google.crypto.tink.shaded.protobuf.j d14 = com.google.crypto.tink.shaded.protobuf.k.d(Q22, 0, Q22.length);
        J3.g();
        l2.D((l2) J3.f33596b, d14);
        return (l2) J3.a();
    }
}
