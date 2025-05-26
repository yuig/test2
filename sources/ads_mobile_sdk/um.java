package ads_mobile_sdk;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class um {

    /* renamed from: a, reason: collision with root package name */
    public static final nv1 f12111a;

    /* renamed from: b, reason: collision with root package name */
    public static final kv1 f12112b;

    /* renamed from: c, reason: collision with root package name */
    public static final u41 f12113c;

    /* renamed from: d, reason: collision with root package name */
    public static final r41 f12114d;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f12111a = new nv1(new a.sc(12), tm.class);
        f12112b = new kv1(new a.sc(13), b13);
        f12113c = new u41(new a.sc(14), om.class);
        f12114d = new r41(new a.sc(15), b13);
    }

    public static om a(i22 i22Var, me2 me2Var) {
        sm smVar;
        if (!i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            nm a13 = nm.a(i22Var.f6186c, jc0.a());
            if (a13.s() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ju1 ju1Var = i22Var.f6188e;
            int ordinal = ju1Var.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        smVar = sm.f11148d;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ju1Var.a());
                    }
                }
                smVar = sm.f11147c;
            } else {
                smVar = sm.f11146b;
            }
            byte[] e13 = a13.r().e();
            me2.a(me2Var);
            return om.a(smVar, new le2(jl.a(e13)), i22Var.f6189f);
        } catch (e21 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static tm a(j22 j22Var) {
        sm smVar;
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                qm.a(j22Var.f6610b.u(), jc0.a());
                ju1 s13 = j22Var.f6610b.s();
                int ordinal = s13.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            smVar = sm.f11148d;
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s13.a());
                        }
                    }
                    smVar = sm.f11147c;
                } else {
                    smVar = sm.f11146b;
                }
                return new tm(smVar);
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(om omVar, me2 me2Var) {
        ju1 ju1Var;
        a.e8 t13 = nm.t();
        le2 le2Var = omVar.f9366b;
        me2.a(me2Var);
        gl a13 = il.a(le2Var.f7789a.a());
        t13.b();
        nm nmVar = (nm) t13.f10110b;
        nmVar.getClass();
        nmVar.keyValue_ = a13;
        gl b13 = ((nm) t13.a()).b();
        n41 n41Var = n41.SYMMETRIC;
        sm smVar = omVar.f9365a.f11593a;
        if (sm.f11146b.equals(smVar)) {
            ju1Var = ju1.TINK;
        } else if (sm.f11147c.equals(smVar)) {
            ju1Var = ju1.CRUNCHY;
        } else if (sm.f11148d.equals(smVar)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + smVar);
        }
        return i22.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", b13, n41Var, ju1Var, omVar.f9368d);
    }

    public static j22 a(tm tmVar) {
        ju1 ju1Var;
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        v13.h(qm.r().b());
        sm smVar = tmVar.f11593a;
        if (sm.f11146b.equals(smVar)) {
            ju1Var = ju1.TINK;
        } else if (sm.f11147c.equals(smVar)) {
            ju1Var = ju1.CRUNCHY;
        } else if (sm.f11148d.equals(smVar)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + smVar);
        }
        v13.g(ju1Var);
        a51 a51Var = (a51) v13.a();
        return new j22(a51Var, sx2.b(a51Var.t()));
    }
}
