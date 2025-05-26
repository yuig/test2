package ads_mobile_sdk;

import a.h5;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class p61 {

    /* renamed from: a, reason: collision with root package name */
    public static final nv1 f9568a;

    /* renamed from: b, reason: collision with root package name */
    public static final kv1 f9569b;

    /* renamed from: c, reason: collision with root package name */
    public static final u41 f9570c;

    /* renamed from: d, reason: collision with root package name */
    public static final r41 f9571d;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f9568a = new nv1(new h5(10), o61.class);
        f9569b = new kv1(new h5(11), b13);
        f9570c = new u41(new h5(12), m61.class);
        f9571d = new r41(new h5(13), b13);
    }

    public static m61 a(i22 i22Var, me2 me2Var) {
        n61 n61Var;
        if (!i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            x51 a13 = x51.a(i22Var.f6186c, jc0.a());
            if (a13.s() != 0) {
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + a13);
            }
            String s13 = a13.r().s();
            ju1 ju1Var = i22Var.f6188e;
            int ordinal = ju1Var.ordinal();
            if (ordinal == 1) {
                n61Var = n61.f8687b;
            } else {
                if (ordinal != 3) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ju1Var.a());
                }
                n61Var = n61.f8688c;
            }
            return m61.a(new o61(s13, n61Var), i22Var.f6189f);
        } catch (e21 e13) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e13);
        }
    }

    public static o61 a(j22 j22Var) {
        n61 n61Var;
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                String s13 = z51.a(j22Var.f6610b.u(), jc0.a()).s();
                ju1 s14 = j22Var.f6610b.s();
                int ordinal = s14.ordinal();
                if (ordinal == 1) {
                    n61Var = n61.f8687b;
                } else if (ordinal == 3) {
                    n61Var = n61.f8688c;
                } else {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s14.a());
                }
                return new o61(s13, n61Var);
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(m61 m61Var, me2 me2Var) {
        int i13;
        ju1 ju1Var;
        a.ue t13 = x51.t();
        a.vf t14 = z51.t();
        String str = m61Var.f8108a.f9154a;
        t14.b();
        z51 z51Var = (z51) t14.f10110b;
        z51Var.getClass();
        str.getClass();
        z51Var.keyUri_ = str;
        z51 z51Var2 = (z51) t14.a();
        t13.b();
        x51 x51Var = (x51) t13.f10110b;
        x51Var.getClass();
        x51Var.params_ = z51Var2;
        i13 = x51Var.bitField0_;
        x51Var.bitField0_ = i13 | 1;
        gl b13 = ((x51) t13.a()).b();
        n41 n41Var = n41.REMOTE;
        n61 n61Var = m61Var.f8108a.f9155b;
        if (n61.f8687b.equals(n61Var)) {
            ju1Var = ju1.TINK;
        } else if (n61.f8688c.equals(n61Var)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + n61Var);
        }
        return i22.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", b13, n41Var, ju1Var, m61Var.f8110c);
    }

    public static j22 a(o61 o61Var) {
        ju1 ju1Var;
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        a.vf t13 = z51.t();
        String str = o61Var.f9154a;
        t13.b();
        z51 z51Var = (z51) t13.f10110b;
        z51Var.getClass();
        str.getClass();
        z51Var.keyUri_ = str;
        v13.h(((z51) t13.a()).b());
        n61 n61Var = o61Var.f9155b;
        if (n61.f8687b.equals(n61Var)) {
            ju1Var = ju1.TINK;
        } else if (n61.f8688c.equals(n61Var)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + n61Var);
        }
        v13.g(ju1Var);
        a51 a51Var = (a51) v13.a();
        return new j22(a51Var, sx2.b(a51Var.t()));
    }
}
