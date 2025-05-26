package ads_mobile_sdk;

import a.h5;
import a.o4;
import a.qg;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class j13 {

    /* renamed from: a, reason: collision with root package name */
    public static final nv1 f6603a;

    /* renamed from: b, reason: collision with root package name */
    public static final kv1 f6604b;

    /* renamed from: c, reason: collision with root package name */
    public static final u41 f6605c;

    /* renamed from: d, reason: collision with root package name */
    public static final r41 f6606d;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f6603a = new nv1(new h5(1), g13.class);
        f6604b = new kv1(new h5(2), b13);
        f6605c = new u41(new h5(3), b13.class);
        f6606d = new r41(new h5(4), b13);
    }

    public static b13 a(i22 i22Var, me2 me2Var) {
        f13 f13Var;
        if (!i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            a13 a13 = a13.a(i22Var.f6186c, jc0.a());
            if (a13.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (a13.r().size() != 32) {
                throw new GeneralSecurityException("Only 32 byte key size is accepted");
            }
            ju1 ju1Var = i22Var.f6188e;
            int ordinal = ju1Var.ordinal();
            if (ordinal == 1) {
                f13Var = f13.f5009b;
            } else {
                if (ordinal != 3) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ju1Var.a());
                }
                f13Var = f13.f5010c;
            }
            g13 a14 = g13.a(f13Var, a13.s().s());
            byte[] e13 = a13.r().e();
            me2.a(me2Var);
            return b13.a(a14, new le2(jl.a(e13)), i22Var.f6189f);
        } catch (e21 unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static g13 a(j22 j22Var) {
        f13 f13Var;
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                d13 a13 = d13.a(j22Var.f6610b.u(), jc0.a());
                if (a13.s() == 0) {
                    ju1 s13 = j22Var.f6610b.s();
                    int ordinal = s13.ordinal();
                    if (ordinal == 1) {
                        f13Var = f13.f5009b;
                    } else if (ordinal == 3) {
                        f13Var = f13.f5010c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s13.a());
                    }
                    return g13.a(f13Var, a13.r().s());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(b13 b13Var, me2 me2Var) {
        int i13;
        ju1 ju1Var;
        qg u13 = a13.u();
        le2 le2Var = b13Var.f2632b;
        me2.a(me2Var);
        gl a13 = il.a(le2Var.f7789a.a());
        u13.b();
        a13 a13Var = (a13) u13.f10110b;
        a13Var.getClass();
        a13Var.keyValue_ = a13;
        o4 t13 = i13.t();
        int i14 = b13Var.f2631a.f5354b;
        t13.b();
        ((i13) t13.f10110b).saltSize_ = i14;
        i13 i13Var = (i13) t13.a();
        u13.b();
        a13 a13Var2 = (a13) u13.f10110b;
        a13Var2.getClass();
        a13Var2.params_ = i13Var;
        i13 = a13Var2.bitField0_;
        a13Var2.bitField0_ = i13 | 1;
        gl b13 = ((a13) u13.a()).b();
        n41 n41Var = n41.SYMMETRIC;
        f13 f13Var = b13Var.f2631a.f5353a;
        if (Objects.equals(f13Var, f13.f5009b)) {
            ju1Var = ju1.TINK;
        } else if (Objects.equals(f13Var, f13.f5010c)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + f13Var);
        }
        return i22.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", b13, n41Var, ju1Var, b13Var.f2634d);
    }

    public static j22 a(g13 g13Var) {
        int i13;
        ju1 ju1Var;
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        a.t0 t13 = d13.t();
        o4 t14 = i13.t();
        int i14 = g13Var.f5354b;
        t14.b();
        ((i13) t14.f10110b).saltSize_ = i14;
        i13 i13Var = (i13) t14.a();
        t13.b();
        d13 d13Var = (d13) t13.f10110b;
        d13Var.getClass();
        d13Var.params_ = i13Var;
        i13 = d13Var.bitField0_;
        d13Var.bitField0_ = i13 | 1;
        v13.h(((d13) t13.a()).b());
        f13 f13Var = g13Var.f5353a;
        if (Objects.equals(f13Var, f13.f5009b)) {
            ju1Var = ju1.TINK;
        } else if (Objects.equals(f13Var, f13.f5010c)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + f13Var);
        }
        v13.g(ju1Var);
        a51 a51Var = (a51) v13.a();
        return new j22(a51Var, sx2.b(a51Var.t()));
    }
}
