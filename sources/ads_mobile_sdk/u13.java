package ads_mobile_sdk;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class u13 {

    /* renamed from: a, reason: collision with root package name */
    public static final nv1 f11795a;

    /* renamed from: b, reason: collision with root package name */
    public static final kv1 f11796b;

    /* renamed from: c, reason: collision with root package name */
    public static final u41 f11797c;

    /* renamed from: d, reason: collision with root package name */
    public static final r41 f11798d;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f11795a = new nv1(new a.sc(4), t13.class);
        f11796b = new kv1(new a.sc(5), b13);
        f11797c = new u41(new a.sc(6), o13.class);
        f11798d = new r41(new a.sc(7), b13);
    }

    public static o13 a(i22 i22Var, me2 me2Var) {
        s13 s13Var;
        if (!i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            n13 a13 = n13.a(i22Var.f6186c, jc0.a());
            if (a13.s() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ju1 ju1Var = i22Var.f6188e;
            int ordinal = ju1Var.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        s13Var = s13.f10905d;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ju1Var.a());
                    }
                }
                s13Var = s13.f10904c;
            } else {
                s13Var = s13.f10903b;
            }
            byte[] e13 = a13.r().e();
            me2.a(me2Var);
            return o13.a(s13Var, new le2(jl.a(e13)), i22Var.f6189f);
        } catch (e21 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static t13 a(j22 j22Var) {
        s13 s13Var;
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (q13.a(j22Var.f6610b.u(), jc0.a()).s() == 0) {
                    ju1 s13 = j22Var.f6610b.s();
                    int ordinal = s13.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                s13Var = s13.f10905d;
                            } else if (ordinal != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s13.a());
                            }
                        }
                        s13Var = s13.f10904c;
                    } else {
                        s13Var = s13.f10903b;
                    }
                    return new t13(s13Var);
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(o13 o13Var, me2 me2Var) {
        ju1 ju1Var;
        a.u7 t13 = n13.t();
        le2 le2Var = o13Var.f9107b;
        me2.a(me2Var);
        gl a13 = il.a(le2Var.f7789a.a());
        t13.b();
        n13 n13Var = (n13) t13.f10110b;
        n13Var.getClass();
        n13Var.keyValue_ = a13;
        gl b13 = ((n13) t13.a()).b();
        n41 n41Var = n41.SYMMETRIC;
        s13 s13Var = o13Var.f9106a.f11320a;
        if (s13.f10903b.equals(s13Var)) {
            ju1Var = ju1.TINK;
        } else if (s13.f10904c.equals(s13Var)) {
            ju1Var = ju1.CRUNCHY;
        } else if (s13.f10905d.equals(s13Var)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + s13Var);
        }
        return i22.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", b13, n41Var, ju1Var, o13Var.f9109d);
    }

    public static j22 a(t13 t13Var) {
        ju1 ju1Var;
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        v13.h(q13.r().b());
        s13 s13Var = t13Var.f11320a;
        if (s13.f10903b.equals(s13Var)) {
            ju1Var = ju1.TINK;
        } else if (s13.f10904c.equals(s13Var)) {
            ju1Var = ju1.CRUNCHY;
        } else if (s13.f10905d.equals(s13Var)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + s13Var);
        }
        v13.g(ju1Var);
        a51 a51Var = (a51) v13.a();
        return new j22(a51Var, sx2.b(a51Var.t()));
    }
}
