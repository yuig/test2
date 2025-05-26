package ads_mobile_sdk;

import a.ga;
import a.h5;
import a.j2;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class rp0 {

    /* renamed from: a, reason: collision with root package name */
    public static final tb0 f10736a;

    /* renamed from: b, reason: collision with root package name */
    public static final tb0 f10737b;

    /* renamed from: c, reason: collision with root package name */
    public static final nv1 f10738c;

    /* renamed from: d, reason: collision with root package name */
    public static final kv1 f10739d;

    /* renamed from: e, reason: collision with root package name */
    public static final u41 f10740e;

    /* renamed from: f, reason: collision with root package name */
    public static final r41 f10741f;

    static {
        jl b13 = sx2.b("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ju1 ju1Var = ju1.RAW;
        np0 np0Var = np0.f8909e;
        hashMap.put(ju1Var, np0Var);
        hashMap2.put(np0Var, ju1Var);
        ju1 ju1Var2 = ju1.TINK;
        np0 np0Var2 = np0.f8906b;
        hashMap.put(ju1Var2, np0Var2);
        hashMap2.put(np0Var2, ju1Var2);
        ju1 ju1Var3 = ju1.LEGACY;
        np0 np0Var3 = np0.f8908d;
        hashMap.put(ju1Var3, np0Var3);
        hashMap2.put(np0Var3, ju1Var3);
        ju1 ju1Var4 = ju1.CRUNCHY;
        np0 np0Var4 = np0.f8907c;
        hashMap.put(ju1Var4, np0Var4);
        hashMap2.put(np0Var4, ju1Var4);
        f10736a = new tb0(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        wo0 wo0Var = wo0.SHA1;
        mp0 mp0Var = mp0.f8318b;
        hashMap3.put(wo0Var, mp0Var);
        hashMap4.put(mp0Var, wo0Var);
        wo0 wo0Var2 = wo0.SHA224;
        mp0 mp0Var2 = mp0.f8319c;
        hashMap3.put(wo0Var2, mp0Var2);
        hashMap4.put(mp0Var2, wo0Var2);
        wo0 wo0Var3 = wo0.SHA256;
        mp0 mp0Var3 = mp0.f8320d;
        hashMap3.put(wo0Var3, mp0Var3);
        hashMap4.put(mp0Var3, wo0Var3);
        wo0 wo0Var4 = wo0.SHA384;
        mp0 mp0Var4 = mp0.f8321e;
        hashMap3.put(wo0Var4, mp0Var4);
        hashMap4.put(mp0Var4, wo0Var4);
        wo0 wo0Var5 = wo0.SHA512;
        mp0 mp0Var5 = mp0.f8322f;
        hashMap3.put(wo0Var5, mp0Var5);
        hashMap4.put(mp0Var5, wo0Var5);
        f10737b = new tb0(Collections.unmodifiableMap(hashMap3), Collections.unmodifiableMap(hashMap4));
        f10738c = new nv1(new h5(22), op0.class);
        f10739d = new kv1(new h5(23), b13);
        f10740e = new u41(new h5(24), hp0.class);
        f10741f = new r41(new h5(25), b13);
    }

    public static hp0 a(i22 i22Var, me2 me2Var) {
        if (!i22Var.f6184a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            gp0 a13 = gp0.a(i22Var.f6186c, jc0.a());
            if (a13.u() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            lp0 lp0Var = new lp0();
            lp0Var.f7912a = Integer.valueOf(a13.s().size());
            lp0Var.f7913b = Integer.valueOf(a13.t().t());
            tb0 tb0Var = f10737b;
            wo0 s13 = a13.t().s();
            Object obj = tb0Var.f11492a.get(s13);
            if (obj == null) {
                throw new GeneralSecurityException("Unable to convert proto enum: " + s13);
            }
            lp0Var.f7914c = (mp0) obj;
            tb0 tb0Var2 = f10736a;
            ju1 ju1Var = i22Var.f6188e;
            Object obj2 = tb0Var2.f11492a.get(ju1Var);
            if (obj2 == null) {
                throw new GeneralSecurityException("Unable to convert proto enum: " + ju1Var);
            }
            lp0Var.f7915d = (np0) obj2;
            op0 a14 = lp0Var.a();
            fp0 fp0Var = new fp0();
            fp0Var.f5232a = a14;
            byte[] e13 = a13.s().e();
            me2.a(me2Var);
            fp0Var.f5233b = new le2(jl.a(e13));
            fp0Var.f5234c = i22Var.f6189f;
            return fp0Var.a();
        } catch (e21 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static op0 a(j22 j22Var) {
        if (j22Var.f6610b.t().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                jp0 a13 = jp0.a(j22Var.f6610b.u(), jc0.a());
                if (a13.u() == 0) {
                    lp0 lp0Var = new lp0();
                    lp0Var.f7912a = Integer.valueOf(a13.s());
                    lp0Var.f7913b = Integer.valueOf(a13.t().t());
                    tb0 tb0Var = f10737b;
                    wo0 s13 = a13.t().s();
                    Object obj = tb0Var.f11492a.get(s13);
                    if (obj != null) {
                        lp0Var.f7914c = (mp0) obj;
                        tb0 tb0Var2 = f10736a;
                        ju1 s14 = j22Var.f6610b.s();
                        Object obj2 = tb0Var2.f11492a.get(s14);
                        if (obj2 != null) {
                            lp0Var.f7915d = (np0) obj2;
                            return lp0Var.a();
                        }
                        throw new GeneralSecurityException("Unable to convert proto enum: " + s14);
                    }
                    throw new GeneralSecurityException("Unable to convert proto enum: " + s13);
                }
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + a13.u());
            } catch (e21 e13) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e13);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + j22Var.f6610b.t());
    }

    public static i22 a(hp0 hp0Var, me2 me2Var) {
        int i13;
        j2 v13 = gp0.v();
        op0 op0Var = hp0Var.f6037a;
        ga u13 = qp0.u();
        int i14 = op0Var.f9391b;
        u13.b();
        ((qp0) u13.f10110b).tagSize_ = i14;
        tb0 tb0Var = f10737b;
        mp0 mp0Var = op0Var.f9393d;
        Enum r33 = (Enum) tb0Var.f11493b.get(mp0Var);
        if (r33 != null) {
            u13.g((wo0) r33);
            qp0 qp0Var = (qp0) u13.a();
            v13.b();
            gp0 gp0Var = (gp0) v13.f10110b;
            gp0Var.getClass();
            gp0Var.params_ = qp0Var;
            i13 = gp0Var.bitField0_;
            gp0Var.bitField0_ = i13 | 1;
            le2 le2Var = hp0Var.f6038b;
            me2.a(me2Var);
            gl a13 = il.a(le2Var.f7789a.a());
            v13.b();
            gp0 gp0Var2 = (gp0) v13.f10110b;
            gp0Var2.getClass();
            gp0Var2.keyValue_ = a13;
            gl b13 = ((gp0) v13.a()).b();
            n41 n41Var = n41.SYMMETRIC;
            tb0 tb0Var2 = f10736a;
            np0 np0Var = hp0Var.f6037a.f9392c;
            Enum r13 = (Enum) tb0Var2.f11493b.get(np0Var);
            if (r13 != null) {
                return i22.a("type.googleapis.com/google.crypto.tink.HmacKey", b13, n41Var, (ju1) r13, hp0Var.f6040d);
            }
            throw new GeneralSecurityException("Unable to convert object enum: " + np0Var);
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + mp0Var);
    }

    public static j22 a(op0 op0Var) {
        int i13;
        a.sg v13 = a51.v();
        v13.i("type.googleapis.com/google.crypto.tink.HmacKey");
        a.u5 v14 = jp0.v();
        ga u13 = qp0.u();
        int i14 = op0Var.f9391b;
        u13.b();
        ((qp0) u13.f10110b).tagSize_ = i14;
        tb0 tb0Var = f10737b;
        mp0 mp0Var = op0Var.f9393d;
        Enum r33 = (Enum) tb0Var.f11493b.get(mp0Var);
        if (r33 != null) {
            u13.g((wo0) r33);
            qp0 qp0Var = (qp0) u13.a();
            v14.b();
            jp0 jp0Var = (jp0) v14.f10110b;
            jp0Var.getClass();
            jp0Var.params_ = qp0Var;
            i13 = jp0Var.bitField0_;
            jp0Var.bitField0_ = i13 | 1;
            int i15 = op0Var.f9390a;
            v14.b();
            ((jp0) v14.f10110b).keySize_ = i15;
            v13.h(((jp0) v14.a()).b());
            tb0 tb0Var2 = f10736a;
            np0 np0Var = op0Var.f9392c;
            Enum r13 = (Enum) tb0Var2.f11493b.get(np0Var);
            if (r13 != null) {
                v13.g((ju1) r13);
                a51 a51Var = (a51) v13.a();
                return new j22(a51Var, sx2.b(a51Var.t()));
            }
            throw new GeneralSecurityException("Unable to convert object enum: " + np0Var);
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + mp0Var);
    }
}
