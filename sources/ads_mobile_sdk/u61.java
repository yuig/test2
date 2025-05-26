package ads_mobile_sdk;

import a.p6;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class u61 {

    /* renamed from: a, reason: collision with root package name */
    public static final nv1 f11859a;

    /* renamed from: b, reason: collision with root package name */
    public static final kv1 f11860b;

    /* renamed from: c, reason: collision with root package name */
    public static final u41 f11861c;

    /* renamed from: d, reason: collision with root package name */
    public static final r41 f11862d;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f11859a = new nv1(new a.sc(8), t61.class);
        f11860b = new kv1(new a.sc(9), b13);
        f11861c = new u41(new a.sc(10), q61.class);
        f11862d = new r41(new a.sc(11), b13);
    }

    public static q61 a(i22 i22Var, me2 me2Var) {
        if (!i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            d61 a13 = d61.a(i22Var.f6186c, jc0.a());
            if (a13.s() == 0) {
                return q61.a(a(a13.r(), i22Var.f6188e), i22Var.f6189f);
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + a13);
        } catch (e21 e13) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f61 b(t61 t61Var) {
        byte[] a13;
        int i13;
        a.nb nbVar = t61Var.f11427d;
        if (nbVar instanceof x61) {
            a13 = ((x61) nbVar).f13510a.f6610b.a();
        } else {
            te2 te2Var = (te2) cf1.f3890b.f3891a.get();
            te2Var.getClass();
            se2 se2Var = new se2(nbVar.getClass(), j22.class);
            if (!te2Var.f11519c.containsKey(se2Var)) {
                throw new GeneralSecurityException("No Key Format serializer for " + se2Var + " available");
            }
            a13 = ((nv1) ((pv1) te2Var.f11519c.get(se2Var))).f9003c.c(nbVar).f6610b.a();
        }
        try {
            a51 a14 = a51.a(a13, jc0.a());
            a.y1 u13 = f61.u();
            String str = t61Var.f11425b;
            u13.b();
            f61 f61Var = (f61) u13.f10110b;
            f61Var.getClass();
            str.getClass();
            f61Var.kekUri_ = str;
            u13.b();
            f61 f61Var2 = (f61) u13.f10110b;
            f61Var2.getClass();
            a14.getClass();
            f61Var2.dekTemplate_ = a14;
            i13 = f61Var2.bitField0_;
            f61Var2.bitField0_ = i13 | 1;
            return (f61) u13.a();
        } catch (e21 e13) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e13);
        }
    }

    public static t61 a(j22 j22Var) {
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return a(f61.a(j22Var.f6610b.u(), jc0.a()), j22Var.f6610b.s());
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(q61 q61Var, me2 me2Var) {
        int i13;
        ju1 ju1Var;
        a.u0 t13 = d61.t();
        f61 b13 = b(q61Var.f9963a);
        t13.b();
        d61 d61Var = (d61) t13.f10110b;
        d61Var.getClass();
        d61Var.params_ = b13;
        i13 = d61Var.bitField0_;
        d61Var.bitField0_ = i13 | 1;
        gl b14 = ((d61) t13.a()).b();
        n41 n41Var = n41.REMOTE;
        s61 s61Var = q61Var.f9963a.f11424a;
        if (s61.f10967b.equals(s61Var)) {
            ju1Var = ju1.TINK;
        } else if (s61.f10968c.equals(s61Var)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + s61Var);
        }
        return i22.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", b14, n41Var, ju1Var, q61Var.f9965c);
    }

    public static j22 a(t61 t61Var) {
        ju1 ju1Var;
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        v13.h(b(t61Var).b());
        s61 s61Var = t61Var.f11424a;
        if (s61.f10967b.equals(s61Var)) {
            ju1Var = ju1.TINK;
        } else if (s61.f10968c.equals(s61Var)) {
            ju1Var = ju1.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: " + s61Var);
        }
        v13.g(ju1Var);
        a51 a51Var = (a51) v13.a();
        return new j22(a51Var, sx2.b(a51Var.t()));
    }

    public static t61 a(f61 f61Var, ju1 ju1Var) {
        p6 a13;
        r61 r61Var;
        s61 s61Var;
        a.sg v13 = a51.v();
        v13.i(f61Var.s().t());
        v13.h(f61Var.s().u());
        v13.g(ju1.RAW);
        try {
            a51 a14 = a51.a(((a51) v13.a()).a(), jc0.a());
            cf1 cf1Var = cf1.f3890b;
            jl a15 = sx2.a(a14.t());
            j22 j22Var = new j22(a14, a15);
            te2 te2Var = (te2) cf1Var.f3891a.get();
            te2Var.getClass();
            if (!te2Var.f11520d.containsKey(new re2(a15, j22.class))) {
                a13 = new x61(j22Var);
            } else {
                a13 = cf1Var.a(j22Var);
            }
            if (a13 instanceof da) {
                r61Var = r61.f10516b;
            } else if (a13 instanceof tm) {
                r61Var = r61.f10518d;
            } else if (a13 instanceof t13) {
                r61Var = r61.f10517c;
            } else if (a13 instanceof s8) {
                r61Var = r61.f10519e;
            } else if (a13 instanceof o9) {
                r61Var = r61.f10520f;
            } else if (a13 instanceof ra) {
                r61Var = r61.f10521g;
            } else {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + a13);
            }
            int ordinal = ju1Var.ordinal();
            if (ordinal == 1) {
                s61Var = s61.f10967b;
            } else if (ordinal == 3) {
                s61Var = s61.f10968c;
            } else {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ju1Var.a());
            }
            String t13 = f61Var.t();
            a.nb nbVar = (a.nb) a13;
            if (t13 == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (nbVar != null) {
                if (!nbVar.a()) {
                    if ((r61Var.equals(r61.f10516b) && (nbVar instanceof da)) || ((r61Var.equals(r61.f10518d) && (nbVar instanceof tm)) || ((r61Var.equals(r61.f10517c) && (nbVar instanceof t13)) || ((r61Var.equals(r61.f10519e) && (nbVar instanceof s8)) || ((r61Var.equals(r61.f10520f) && (nbVar instanceof o9)) || (r61Var.equals(r61.f10521g) && (nbVar instanceof ra))))))) {
                        return new t61(s61Var, t13, r61Var, nbVar);
                    }
                    throw new GeneralSecurityException("Cannot use parsing strategy " + r61Var.f10522a + " when new keys are picked according to " + nbVar + ".");
                }
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        } catch (IOException e13) {
            throw new GeneralSecurityException("Failed to parse proto", e13);
        }
    }
}
