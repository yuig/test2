package ads_mobile_sdk;

import a.u2;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import kh2.n;

/* loaded from: classes2.dex */
public abstract class h8 {

    /* renamed from: a, reason: collision with root package name */
    public static final nv1 f5874a;

    /* renamed from: b, reason: collision with root package name */
    public static final kv1 f5875b;

    /* renamed from: c, reason: collision with root package name */
    public static final u41 f5876c;

    /* renamed from: d, reason: collision with root package name */
    public static final r41 f5877d;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f5874a = new nv1(new a.e(21), e8.class);
        f5875b = new kv1(new a.e(22), b13);
        f5876c = new u41(new a.e(23), z7.class);
        f5877d = new r41(new a.e(24), b13);
    }

    public static z7 a(i22 i22Var, me2 me2Var) {
        d8 d8Var;
        if (!i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            y7 a13 = y7.a(i22Var.f6186c, jc0.a());
            if (a13.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            int size = a13.r().size();
            if (size != 16 && size != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(size * 8)));
            }
            int s13 = a13.s().s();
            if (s13 < 10 || 16 < s13) {
                throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + s13);
            }
            ju1 ju1Var = i22Var.f6188e;
            int ordinal = ju1Var.ordinal();
            if (ordinal == 1) {
                d8Var = d8.f4191b;
            } else if (ordinal == 2) {
                d8Var = d8.f4193d;
            } else if (ordinal == 3) {
                d8Var = d8.f4194e;
            } else {
                if (ordinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ju1Var.a());
                }
                d8Var = d8.f4192c;
            }
            e8 e8Var = new e8(size, s13, d8Var);
            x7 x7Var = new x7();
            x7Var.f13513a = e8Var;
            byte[] e13 = a13.r().e();
            me2.a(me2Var);
            x7Var.f13514b = new le2(jl.a(e13));
            x7Var.f13515c = i22Var.f6189f;
            return x7Var.a();
        } catch (e21 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static e8 a(j22 j22Var) {
        d8 d8Var;
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                b8 a13 = b8.a(j22Var.f6610b.u(), jc0.a());
                int r13 = a13.r();
                if (r13 != 16 && r13 != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(r13 * 8)));
                }
                int s13 = a13.s().s();
                if (s13 >= 10 && 16 >= s13) {
                    ju1 s14 = j22Var.f6610b.s();
                    int ordinal = s14.ordinal();
                    if (ordinal == 1) {
                        d8Var = d8.f4191b;
                    } else if (ordinal == 2) {
                        d8Var = d8.f4193d;
                    } else if (ordinal == 3) {
                        d8Var = d8.f4194e;
                    } else if (ordinal == 4) {
                        d8Var = d8.f4192c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s14.a());
                    }
                    return new e8(r13, s13, d8Var);
                }
                throw new GeneralSecurityException(n.j(s13, "Invalid tag size for AesCmacParameters: "));
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(z7 z7Var, me2 me2Var) {
        int i13;
        ju1 ju1Var;
        a.ve u13 = y7.u();
        e8 e8Var = z7Var.f14669a;
        u2 t13 = g8.t();
        int i14 = e8Var.f4750b;
        t13.b();
        ((g8) t13.f10110b).tagSize_ = i14;
        g8 g8Var = (g8) t13.a();
        u13.b();
        y7 y7Var = (y7) u13.f10110b;
        y7Var.getClass();
        y7Var.params_ = g8Var;
        i13 = y7Var.bitField0_;
        y7Var.bitField0_ = i13 | 1;
        le2 le2Var = z7Var.f14670b;
        me2.a(me2Var);
        gl a13 = il.a(le2Var.f7789a.a());
        u13.b();
        y7 y7Var2 = (y7) u13.f10110b;
        y7Var2.getClass();
        y7Var2.keyValue_ = a13;
        gl b13 = ((y7) u13.a()).b();
        n41 n41Var = n41.SYMMETRIC;
        d8 d8Var = z7Var.f14669a.f4751c;
        if (d8.f4191b.equals(d8Var)) {
            ju1Var = ju1.TINK;
        } else if (d8.f4192c.equals(d8Var)) {
            ju1Var = ju1.CRUNCHY;
        } else if (d8.f4194e.equals(d8Var)) {
            ju1Var = ju1.RAW;
        } else if (d8.f4193d.equals(d8Var)) {
            ju1Var = ju1.LEGACY;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + d8Var);
        }
        return i22.a("type.googleapis.com/google.crypto.tink.AesCmacKey", b13, n41Var, ju1Var, z7Var.f14672d);
    }

    public static j22 a(e8 e8Var) {
        int i13;
        ju1 ju1Var;
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a.j t13 = b8.t();
        u2 t14 = g8.t();
        int i14 = e8Var.f4750b;
        t14.b();
        ((g8) t14.f10110b).tagSize_ = i14;
        g8 g8Var = (g8) t14.a();
        t13.b();
        b8 b8Var = (b8) t13.f10110b;
        b8Var.getClass();
        b8Var.params_ = g8Var;
        i13 = b8Var.bitField0_;
        b8Var.bitField0_ = i13 | 1;
        int i15 = e8Var.f4749a;
        t13.b();
        ((b8) t13.f10110b).keySize_ = i15;
        v13.h(((b8) t13.a()).b());
        d8 d8Var = e8Var.f4751c;
        if (d8.f4191b.equals(d8Var)) {
            ju1Var = ju1.TINK;
        } else if (d8.f4192c.equals(d8Var)) {
            ju1Var = ju1.CRUNCHY;
        } else if (d8.f4194e.equals(d8Var)) {
            ju1Var = ju1.RAW;
        } else if (d8.f4193d.equals(d8Var)) {
            ju1Var = ju1.LEGACY;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + d8Var);
        }
        v13.g(ju1Var);
        a51 a51Var = (a51) v13.a();
        return new j22(a51Var, sx2.b(a51Var.t()));
    }
}
