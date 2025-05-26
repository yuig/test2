package bl;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import el.c1;
import el.j0;
import el.l0;
import il.d4;
import il.e4;
import il.o3;
import il.o5;
import il.q3;
import il.s3;
import il.x3;
import il.y3;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import pd.d0;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f23455a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f23456b;

    /* renamed from: c, reason: collision with root package name */
    public static final el.n f23457c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.l f23458d;

    /* renamed from: e, reason: collision with root package name */
    public static final el.n f23459e;

    /* renamed from: f, reason: collision with root package name */
    public static final el.l f23460f;

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f23461g;

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f23462h;

    /* renamed from: i, reason: collision with root package name */
    public static final d0 f23463i;

    /* renamed from: j, reason: collision with root package name */
    public static final d0 f23464j;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        ml.a c14 = c1.c("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        f23455a = new l0(new mj.m(15), m.class);
        f23456b = new j0(new mj.m(16), c13);
        f23457c = new el.n(new mj.m(17), p.class);
        f23458d = new el.l(new mj.m(18), c14);
        f23459e = new el.n(new mj.m(19), n.class);
        f23460f = new el.l(new mj.m(20), c13);
        qq2.c a13 = d0.a();
        a13.a(o5.RAW, l.f23447d);
        a13.a(o5.TINK, l.f23445b);
        o5 o5Var = o5.LEGACY;
        l lVar = l.f23446c;
        a13.a(o5Var, lVar);
        a13.a(o5.CRUNCHY, lVar);
        f23461g = a13.b();
        qq2.c a14 = d0.a();
        a14.a(s3.DHKEM_P256_HKDF_SHA256, k.f23441d);
        a14.a(s3.DHKEM_P384_HKDF_SHA384, k.f23442e);
        a14.a(s3.DHKEM_P521_HKDF_SHA512, k.f23443f);
        a14.a(s3.DHKEM_X25519_HKDF_SHA256, k.f23444g);
        f23462h = a14.b();
        qq2.c a15 = d0.a();
        a15.a(q3.HKDF_SHA256, j.f23438d);
        a15.a(q3.HKDF_SHA384, j.f23439e);
        a15.a(q3.HKDF_SHA512, j.f23440f);
        f23463i = a15.b();
        qq2.c a16 = d0.a();
        a16.a(o3.AES_128_GCM, i.f23435d);
        a16.a(o3.AES_256_GCM, i.f23436e);
        a16.a(o3.CHACHA20_POLY1305, i.f23437f);
        f23464j = a16.b();
    }

    public static ml.a a(k kVar, byte[] bArr) {
        int i13;
        BigInteger Q = c0.d.Q(bArr);
        byte[] bArr2 = cl.k.f27956a;
        if (kVar == k.f23444g) {
            i13 = 32;
        } else if (kVar == k.f23441d) {
            i13 = 65;
        } else if (kVar == k.f23442e) {
            i13 = 97;
        } else {
            if (kVar != k.f23443f) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i13 = RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL;
        }
        return ml.a.a(c0.d.Q2(i13, Q));
    }

    public static m b(o5 o5Var, y3 y3Var) {
        m.h b13 = m.b();
        b13.f85200e = (l) f23461g.b(o5Var);
        b13.f85197b = (k) f23462h.b(y3Var.G());
        b13.f85198c = (j) f23463i.b(y3Var.F());
        b13.f85199d = (i) f23464j.b(y3Var.D());
        return b13.r();
    }

    public static y3 c(m mVar) {
        x3 H = y3.H();
        s3 s3Var = (s3) f23462h.c(mVar.f23449a);
        H.g();
        y3.A((y3) H.f33596b, s3Var);
        q3 q3Var = (q3) f23463i.c(mVar.f23450b);
        H.g();
        y3.B((y3) H.f33596b, q3Var);
        o3 o3Var = (o3) f23464j.c(mVar.f23451c);
        H.g();
        y3.C((y3) H.f33596b, o3Var);
        return (y3) H.a();
    }

    public static e4 d(p pVar) {
        d4 H = e4.H();
        H.g();
        e4.A((e4) H.f33596b);
        y3 c13 = c(pVar.f23465c);
        H.g();
        e4.B((e4) H.f33596b, c13);
        byte[] b13 = pVar.f23466d.b();
        com.google.crypto.tink.shaded.protobuf.j d2 = com.google.crypto.tink.shaded.protobuf.k.d(b13, 0, b13.length);
        H.g();
        e4.C((e4) H.f33596b, d2);
        return (e4) H.a();
    }
}
