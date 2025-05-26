package ads_mobile_sdk;

import a.ga;
import a.j2;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class t8 {

    /* renamed from: a, reason: collision with root package name */
    public static final nv1 f11446a;

    /* renamed from: b, reason: collision with root package name */
    public static final kv1 f11447b;

    /* renamed from: c, reason: collision with root package name */
    public static final u41 f11448c;

    /* renamed from: d, reason: collision with root package name */
    public static final r41 f11449d;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f11446a = new nv1(new a.sc(0), s8.class);
        f11447b = new kv1(new a.sc(1), b13);
        f11448c = new u41(new a.sc(2), l8.class);
        f11449d = new r41(new a.sc(3), b13);
    }

    public static qp0 a(s8 s8Var) {
        wo0 wo0Var;
        ga u13 = qp0.u();
        int i13 = s8Var.f10997d;
        u13.b();
        ((qp0) u13.f10110b).tagSize_ = i13;
        q8 q8Var = s8Var.f10999f;
        if (q8.f9983b.equals(q8Var)) {
            wo0Var = wo0.SHA1;
        } else if (q8.f9984c.equals(q8Var)) {
            wo0Var = wo0.SHA224;
        } else if (q8.f9985d.equals(q8Var)) {
            wo0Var = wo0.SHA256;
        } else if (q8.f9986e.equals(q8Var)) {
            wo0Var = wo0.SHA384;
        } else {
            if (!q8.f9987f.equals(q8Var)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + q8Var);
            }
            wo0Var = wo0.SHA512;
        }
        u13.g(wo0Var);
        return (qp0) u13.a();
    }

    public static j22 b(s8 s8Var) {
        int i13;
        int i14;
        int i15;
        int i16;
        ju1 ju1Var;
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a.b8 t13 = n8.t();
        a.yf u13 = z8.u();
        a.l t14 = b9.t();
        int i17 = s8Var.f10996c;
        t14.b();
        ((b9) t14.f10110b).ivSize_ = i17;
        b9 b9Var = (b9) t14.a();
        u13.b();
        z8 z8Var = (z8) u13.f10110b;
        z8Var.getClass();
        z8Var.params_ = b9Var;
        i13 = z8Var.bitField0_;
        z8Var.bitField0_ = i13 | 1;
        int i18 = s8Var.f10994a;
        u13.b();
        ((z8) u13.f10110b).keySize_ = i18;
        z8 z8Var2 = (z8) u13.a();
        t13.b();
        n8 n8Var = (n8) t13.f10110b;
        n8Var.getClass();
        n8Var.aesCtrKeyFormat_ = z8Var2;
        i14 = n8Var.bitField0_;
        n8Var.bitField0_ = i14 | 1;
        a.u5 v14 = jp0.v();
        qp0 a13 = a(s8Var);
        v14.b();
        jp0 jp0Var = (jp0) v14.f10110b;
        jp0Var.getClass();
        jp0Var.params_ = a13;
        i15 = jp0Var.bitField0_;
        jp0Var.bitField0_ = i15 | 1;
        int i19 = s8Var.f10995b;
        v14.b();
        ((jp0) v14.f10110b).keySize_ = i19;
        jp0 jp0Var2 = (jp0) v14.a();
        t13.b();
        n8 n8Var2 = (n8) t13.f10110b;
        n8Var2.getClass();
        n8Var2.hmacKeyFormat_ = jp0Var2;
        i16 = n8Var2.bitField0_;
        n8Var2.bitField0_ = i16 | 2;
        v13.h(((n8) t13.a()).b());
        r8 r8Var = s8Var.f10998e;
        if (r8.f10542b.equals(r8Var)) {
            ju1Var = ju1.TINK;
        } else if (r8.f10543c.equals(r8Var)) {
            ju1Var = ju1.CRUNCHY;
        } else {
            if (!r8.f10544d.equals(r8Var)) {
                throw new GeneralSecurityException("Unable to serialize variant: " + r8Var);
            }
            ju1Var = ju1.RAW;
        }
        v13.g(ju1Var);
        a51 a51Var = (a51) v13.a();
        return new j22(a51Var, sx2.b(a51Var.t()));
    }

    public static l8 a(i22 i22Var, me2 me2Var) {
        q8 q8Var;
        r8 r8Var;
        if (i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                k8 a13 = k8.a(i22Var.f6186c, jc0.a());
                if (a13.t() == 0) {
                    if (a13.r().u() == 0) {
                        if (a13.s().u() == 0) {
                            p8 d2 = new p8().a(a13.r().s().size()).b(a13.s().s().size()).c(a13.r().t().s()).d(a13.s().t().t());
                            wo0 s13 = a13.s().t().s();
                            int ordinal = s13.ordinal();
                            if (ordinal == 1) {
                                q8Var = q8.f9983b;
                            } else if (ordinal == 2) {
                                q8Var = q8.f9986e;
                            } else if (ordinal == 3) {
                                q8Var = q8.f9985d;
                            } else if (ordinal == 4) {
                                q8Var = q8.f9987f;
                            } else if (ordinal == 5) {
                                q8Var = q8.f9984c;
                            } else {
                                throw new GeneralSecurityException("Unable to parse HashType: " + s13.a());
                            }
                            d2.f9589e = q8Var;
                            ju1 ju1Var = i22Var.f6188e;
                            int ordinal2 = ju1Var.ordinal();
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 == 3) {
                                        r8Var = r8.f10544d;
                                    } else if (ordinal2 != 4) {
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ju1Var.a());
                                    }
                                }
                                r8Var = r8.f10543c;
                            } else {
                                r8Var = r8.f10542b;
                            }
                            d2.f9590f = r8Var;
                            s8 a14 = d2.a();
                            j8 j8Var = new j8();
                            j8Var.f6723a = a14;
                            byte[] e13 = a13.r().s().e();
                            me2.a(me2Var);
                            j8Var.f6724b = new le2(jl.a(e13));
                            j8Var.f6725c = new le2(jl.a(a13.s().s().e()));
                            j8Var.f6726d = i22Var.f6189f;
                            return j8Var.a();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (e21 unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    public static s8 a(j22 j22Var) {
        q8 q8Var;
        r8 r8Var;
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                n8 a13 = n8.a(j22Var.f6610b.u(), jc0.a());
                if (a13.s().u() == 0) {
                    p8 d2 = new p8().a(a13.r().s()).b(a13.s().s()).c(a13.r().t().s()).d(a13.s().t().t());
                    wo0 s13 = a13.s().t().s();
                    int ordinal = s13.ordinal();
                    if (ordinal == 1) {
                        q8Var = q8.f9983b;
                    } else if (ordinal == 2) {
                        q8Var = q8.f9986e;
                    } else if (ordinal == 3) {
                        q8Var = q8.f9985d;
                    } else if (ordinal == 4) {
                        q8Var = q8.f9987f;
                    } else if (ordinal == 5) {
                        q8Var = q8.f9984c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse HashType: " + s13.a());
                    }
                    d2.f9589e = q8Var;
                    ju1 s14 = j22Var.f6610b.s();
                    int ordinal2 = s14.ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 == 3) {
                                r8Var = r8.f10544d;
                            } else if (ordinal2 != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s14.a());
                            }
                        }
                        r8Var = r8.f10543c;
                    } else {
                        r8Var = r8.f10542b;
                    }
                    d2.f9590f = r8Var;
                    return d2.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(l8 l8Var, me2 me2Var) {
        int i13;
        int i14;
        int i15;
        int i16;
        ju1 ju1Var;
        a.p5 u13 = k8.u();
        a.we v13 = x8.v();
        a.l t13 = b9.t();
        int i17 = l8Var.f7709a.f10996c;
        t13.b();
        ((b9) t13.f10110b).ivSize_ = i17;
        b9 b9Var = (b9) t13.a();
        v13.b();
        x8 x8Var = (x8) v13.f10110b;
        x8Var.getClass();
        x8Var.params_ = b9Var;
        i13 = x8Var.bitField0_;
        x8Var.bitField0_ = i13 | 1;
        le2 le2Var = l8Var.f7710b;
        me2.a(me2Var);
        gl a13 = il.a(le2Var.f7789a.a());
        v13.b();
        x8 x8Var2 = (x8) v13.f10110b;
        x8Var2.getClass();
        x8Var2.keyValue_ = a13;
        x8 x8Var3 = (x8) v13.a();
        u13.b();
        k8 k8Var = (k8) u13.f10110b;
        k8Var.getClass();
        k8Var.aesCtrKey_ = x8Var3;
        i14 = k8Var.bitField0_;
        k8Var.bitField0_ = i14 | 1;
        j2 v14 = gp0.v();
        qp0 a14 = a(l8Var.f7709a);
        v14.b();
        gp0 gp0Var = (gp0) v14.f10110b;
        gp0Var.getClass();
        gp0Var.params_ = a14;
        i15 = gp0Var.bitField0_;
        gp0Var.bitField0_ = i15 | 1;
        gl a15 = il.a(l8Var.f7711c.f7789a.a());
        v14.b();
        gp0 gp0Var2 = (gp0) v14.f10110b;
        gp0Var2.getClass();
        gp0Var2.keyValue_ = a15;
        gp0 gp0Var3 = (gp0) v14.a();
        u13.b();
        k8 k8Var2 = (k8) u13.f10110b;
        k8Var2.getClass();
        k8Var2.hmacKey_ = gp0Var3;
        i16 = k8Var2.bitField0_;
        k8Var2.bitField0_ = i16 | 2;
        gl b13 = ((k8) u13.a()).b();
        n41 n41Var = n41.SYMMETRIC;
        r8 r8Var = l8Var.f7709a.f10998e;
        if (r8.f10542b.equals(r8Var)) {
            ju1Var = ju1.TINK;
        } else if (r8.f10543c.equals(r8Var)) {
            ju1Var = ju1.CRUNCHY;
        } else if (r8.f10544d.equals(r8Var)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + r8Var);
        }
        return i22.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", b13, n41Var, ju1Var, l8Var.f7713e);
    }
}
