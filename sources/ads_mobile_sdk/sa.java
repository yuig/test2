package ads_mobile_sdk;

import a.h5;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public abstract class sa {

    /* renamed from: a, reason: collision with root package name */
    public static final nv1 f11010a;

    /* renamed from: b, reason: collision with root package name */
    public static final kv1 f11011b;

    /* renamed from: c, reason: collision with root package name */
    public static final u41 f11012c;

    /* renamed from: d, reason: collision with root package name */
    public static final r41 f11013d;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f11010a = new nv1(new h5(26), ra.class);
        f11011b = new kv1(new h5(27), b13);
        f11012c = new u41(new h5(28), ma.class);
        f11013d = new r41(new h5(29), b13);
    }

    public static ma a(i22 i22Var, me2 me2Var) {
        qa qaVar;
        if (!i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            la a13 = la.a(i22Var.f6186c, jc0.a());
            if (a13.s() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            int size = a13.r().size();
            if (size != 16 && size != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
            }
            ju1 ju1Var = i22Var.f6188e;
            int ordinal = ju1Var.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        qaVar = qa.f9997d;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ju1Var.a());
                    }
                }
                qaVar = qa.f9996c;
            } else {
                qaVar = qa.f9995b;
            }
            ra raVar = new ra(size, qaVar);
            ka kaVar = new ka();
            kaVar.f7182a = raVar;
            byte[] e13 = a13.r().e();
            me2.a(me2Var);
            kaVar.f7183b = new le2(jl.a(e13));
            kaVar.f7184c = i22Var.f6189f;
            return kaVar.a();
        } catch (e21 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static ra a(j22 j22Var) {
        qa qaVar;
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                oa a13 = oa.a(j22Var.f6610b.u(), jc0.a());
                if (a13.s() == 0) {
                    int r13 = a13.r();
                    if (r13 != 16 && r13 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(r13)));
                    }
                    ju1 s13 = j22Var.f6610b.s();
                    int ordinal = s13.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                qaVar = qa.f9997d;
                            } else if (ordinal != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s13.a());
                            }
                        }
                        qaVar = qa.f9996c;
                    } else {
                        qaVar = qa.f9995b;
                    }
                    return new ra(r13, qaVar);
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(ma maVar, me2 me2Var) {
        ju1 ju1Var;
        a.f6 t13 = la.t();
        le2 le2Var = maVar.f8144b;
        me2.a(me2Var);
        gl a13 = il.a(le2Var.f7789a.a());
        t13.b();
        la laVar = (la) t13.f10110b;
        laVar.getClass();
        laVar.keyValue_ = a13;
        gl b13 = ((la) t13.a()).b();
        n41 n41Var = n41.SYMMETRIC;
        qa qaVar = maVar.f8143a.f10557b;
        if (qa.f9995b.equals(qaVar)) {
            ju1Var = ju1.TINK;
        } else if (qa.f9996c.equals(qaVar)) {
            ju1Var = ju1.CRUNCHY;
        } else if (qa.f9997d.equals(qaVar)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + qaVar);
        }
        return i22.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", b13, n41Var, ju1Var, maVar.f8146d);
    }

    public static j22 a(ra raVar) {
        ju1 ju1Var;
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a.t8 t13 = oa.t();
        int i13 = raVar.f10556a;
        t13.b();
        ((oa) t13.f10110b).keySize_ = i13;
        v13.h(((oa) t13.a()).b());
        qa qaVar = raVar.f10557b;
        if (qa.f9995b.equals(qaVar)) {
            ju1Var = ju1.TINK;
        } else if (qa.f9996c.equals(qaVar)) {
            ju1Var = ju1.CRUNCHY;
        } else if (qa.f9997d.equals(qaVar)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + qaVar);
        }
        v13.g(ju1Var);
        a51 a51Var = (a51) v13.a();
        return new j22(a51Var, sx2.b(a51Var.t()));
    }
}
