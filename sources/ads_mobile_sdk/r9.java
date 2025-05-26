package ads_mobile_sdk;

import a.h5;
import a.y2;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class r9 {

    /* renamed from: a, reason: collision with root package name */
    public static final nv1 f10549a;

    /* renamed from: b, reason: collision with root package name */
    public static final kv1 f10550b;

    /* renamed from: c, reason: collision with root package name */
    public static final u41 f10551c;

    /* renamed from: d, reason: collision with root package name */
    public static final r41 f10552d;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f10549a = new nv1(new h5(17), o9.class);
        f10550b = new kv1(new h5(18), b13);
        f10551c = new u41(new h5(19), i9.class);
        f10552d = new r41(new h5(20), b13);
    }

    public static i9 a(i22 i22Var, me2 me2Var) {
        n9 n9Var;
        if (!i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            h9 a13 = h9.a(i22Var.f6186c, jc0.a());
            if (a13.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            m9 a14 = new m9().b(a13.r().size()).a(a13.s().s());
            a14.f8136c = 16;
            ju1 ju1Var = i22Var.f6188e;
            int ordinal = ju1Var.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        n9Var = n9.f8723d;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ju1Var.a());
                    }
                }
                n9Var = n9.f8722c;
            } else {
                n9Var = n9.f8721b;
            }
            a14.f8137d = n9Var;
            o9 a15 = a14.a();
            g9 g9Var = new g9();
            g9Var.f5475a = a15;
            byte[] e13 = a13.r().e();
            me2.a(me2Var);
            g9Var.f5476b = new le2(jl.a(e13));
            g9Var.f5477c = i22Var.f6189f;
            return g9Var.a();
        } catch (e21 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static o9 a(j22 j22Var) {
        n9 n9Var;
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                k9 a13 = k9.a(j22Var.f6610b.u(), jc0.a());
                m9 a14 = new m9().b(a13.r()).a(a13.s().s());
                a14.f8136c = 16;
                ju1 s13 = j22Var.f6610b.s();
                int ordinal = s13.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            n9Var = n9.f8723d;
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s13.a());
                        }
                    }
                    n9Var = n9.f8722c;
                } else {
                    n9Var = n9.f8721b;
                }
                a14.f8137d = n9Var;
                return a14.a();
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(i9 i9Var, me2 me2Var) {
        int i13;
        ju1 ju1Var;
        y2 u13 = h9.u();
        o9 o9Var = i9Var.f6280a;
        if (o9Var.f9185c == 16) {
            a.aa t13 = q9.t();
            int i14 = o9Var.f9184b;
            t13.b();
            ((q9) t13.f10110b).ivSize_ = i14;
            q9 q9Var = (q9) t13.a();
            u13.b();
            h9 h9Var = (h9) u13.f10110b;
            h9Var.getClass();
            h9Var.params_ = q9Var;
            i13 = h9Var.bitField0_;
            h9Var.bitField0_ = i13 | 1;
            le2 le2Var = i9Var.f6281b;
            me2.a(me2Var);
            gl a13 = il.a(le2Var.f7789a.a());
            u13.b();
            h9 h9Var2 = (h9) u13.f10110b;
            h9Var2.getClass();
            h9Var2.keyValue_ = a13;
            gl b13 = ((h9) u13.a()).b();
            n41 n41Var = n41.SYMMETRIC;
            n9 n9Var = i9Var.f6280a.f9186d;
            if (n9.f8721b.equals(n9Var)) {
                ju1Var = ju1.TINK;
            } else if (n9.f8722c.equals(n9Var)) {
                ju1Var = ju1.CRUNCHY;
            } else if (n9.f8723d.equals(n9Var)) {
                ju1Var = ju1.RAW;
            } else {
                throw new GeneralSecurityException("Unable to serialize variant: " + n9Var);
            }
            return i22.a("type.googleapis.com/google.crypto.tink.AesEaxKey", b13, n41Var, ju1Var, i9Var.f6283d);
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(o9Var.f9185c)));
    }

    public static j22 a(o9 o9Var) {
        int i13;
        ju1 ju1Var;
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a.e6 t13 = k9.t();
        if (o9Var.f9185c == 16) {
            a.aa t14 = q9.t();
            int i14 = o9Var.f9184b;
            t14.b();
            ((q9) t14.f10110b).ivSize_ = i14;
            q9 q9Var = (q9) t14.a();
            t13.b();
            k9 k9Var = (k9) t13.f10110b;
            k9Var.getClass();
            k9Var.params_ = q9Var;
            i13 = k9Var.bitField0_;
            k9Var.bitField0_ = i13 | 1;
            int i15 = o9Var.f9183a;
            t13.b();
            ((k9) t13.f10110b).keySize_ = i15;
            v13.h(((k9) t13.a()).b());
            n9 n9Var = o9Var.f9186d;
            if (n9.f8721b.equals(n9Var)) {
                ju1Var = ju1.TINK;
            } else if (n9.f8722c.equals(n9Var)) {
                ju1Var = ju1.CRUNCHY;
            } else if (n9.f8723d.equals(n9Var)) {
                ju1Var = ju1.RAW;
            } else {
                throw new GeneralSecurityException("Unable to serialize variant: " + n9Var);
            }
            v13.g(ju1Var);
            a51 a51Var = (a51) v13.a();
            return new j22(a51Var, sx2.b(a51Var.t()));
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(o9Var.f9185c)));
    }
}
