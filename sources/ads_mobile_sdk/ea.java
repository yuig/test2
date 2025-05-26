package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public abstract class ea {

    /* renamed from: a, reason: collision with root package name */
    public static final nv1 f4765a;

    /* renamed from: b, reason: collision with root package name */
    public static final kv1 f4766b;

    /* renamed from: c, reason: collision with root package name */
    public static final u41 f4767c;

    /* renamed from: d, reason: collision with root package name */
    public static final r41 f4768d;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f4765a = new nv1(new a.e(7), da.class);
        f4766b = new kv1(new a.e(8), b13);
        f4767c = new u41(new a.e(9), y9.class);
        f4768d = new r41(new a.e(10), b13);
    }

    public static y9 a(i22 i22Var, me2 me2Var) {
        ca caVar;
        if (!i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            x9 a13 = x9.a(i22Var.f6186c, jc0.a());
            if (a13.s() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            int size = a13.r().size();
            if (size != 16 && size != 24 && size != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
            }
            ju1 ju1Var = i22Var.f6188e;
            int ordinal = ju1Var.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        caVar = ca.f3833d;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ju1Var.a());
                    }
                }
                caVar = ca.f3832c;
            } else {
                caVar = ca.f3831b;
            }
            da daVar = new da(size, 12, 16, caVar);
            w9 w9Var = new w9();
            w9Var.f12899a = daVar;
            byte[] e13 = a13.r().e();
            me2.a(me2Var);
            w9Var.f12900b = new le2(jl.a(e13));
            w9Var.f12901c = i22Var.f6189f;
            return w9Var.a();
        } catch (e21 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static void b(da daVar) {
        if (daVar.f4214c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(daVar.f4214c)));
        }
        if (daVar.f4213b != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(daVar.f4213b)));
        }
    }

    public static da a(j22 j22Var) {
        ca caVar;
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                aa a13 = aa.a(j22Var.f6610b.u(), jc0.a());
                if (a13.s() == 0) {
                    int r13 = a13.r();
                    if (r13 != 16 && r13 != 24 && r13 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(r13)));
                    }
                    ju1 s13 = j22Var.f6610b.s();
                    int ordinal = s13.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                caVar = ca.f3833d;
                            } else if (ordinal != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s13.a());
                            }
                        }
                        caVar = ca.f3832c;
                    } else {
                        caVar = ca.f3831b;
                    }
                    return new da(r13, 12, 16, caVar);
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(y9 y9Var, me2 me2Var) {
        ju1 ju1Var;
        b(y9Var.f14150a);
        a.ge t13 = x9.t();
        le2 le2Var = y9Var.f14151b;
        me2.a(me2Var);
        gl a13 = il.a(le2Var.f7789a.a());
        t13.b();
        x9 x9Var = (x9) t13.f10110b;
        x9Var.getClass();
        x9Var.keyValue_ = a13;
        gl b13 = ((x9) t13.a()).b();
        n41 n41Var = n41.SYMMETRIC;
        ca caVar = y9Var.f14150a.f4215d;
        if (ca.f3831b.equals(caVar)) {
            ju1Var = ju1.TINK;
        } else if (ca.f3832c.equals(caVar)) {
            ju1Var = ju1.CRUNCHY;
        } else if (ca.f3833d.equals(caVar)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + caVar);
        }
        return i22.a("type.googleapis.com/google.crypto.tink.AesGcmKey", b13, n41Var, ju1Var, y9Var.f14153d);
    }

    public static j22 a(da daVar) {
        ju1 ju1Var;
        b(daVar);
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a.xg t13 = aa.t();
        int i13 = daVar.f4212a;
        t13.b();
        ((aa) t13.f10110b).keySize_ = i13;
        v13.h(((aa) t13.a()).b());
        ca caVar = daVar.f4215d;
        if (ca.f3831b.equals(caVar)) {
            ju1Var = ju1.TINK;
        } else if (ca.f3832c.equals(caVar)) {
            ju1Var = ju1.CRUNCHY;
        } else if (ca.f3833d.equals(caVar)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + caVar);
        }
        v13.g(ju1Var);
        a51 a51Var = (a51) v13.a();
        return new j22(a51Var, sx2.b(a51Var.t()));
    }
}
