package vk;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import el.c1;
import il.l5;
import il.m5;
import il.n4;
import il.o4;
import il.o5;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final el.l0 f126009a;

    /* renamed from: b, reason: collision with root package name */
    public static final el.j0 f126010b;

    /* renamed from: c, reason: collision with root package name */
    public static final el.n f126011c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.l f126012d;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f126009a = new el.l0(new c3.e(17), m0.class);
        f126010b = new el.j0(new c3.e(18), c13);
        f126011c = new el.n(new c3.e(19), j0.class);
        f126012d = new el.l(new c3.e(20), c13);
    }

    public static m0 a(m5 m5Var, o5 o5Var) {
        k0 k0Var;
        l0 l0Var;
        n4 H = o4.H();
        H.j(m5Var.D().F());
        H.k(m5Var.D().G());
        H.i(o5.RAW);
        uk.q f13 = kh2.r.f1(((o4) H.a()).d());
        if (f13 instanceof t) {
            k0Var = k0.f125977b;
        } else if (f13 instanceof b0) {
            k0Var = k0.f125979d;
        } else if (f13 instanceof v0) {
            k0Var = k0.f125978c;
        } else if (f13 instanceof l) {
            k0Var = k0.f125980e;
        } else if (f13 instanceof p) {
            k0Var = k0.f125981f;
        } else {
            if (!(f13 instanceof x)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + f13);
            }
            k0Var = k0.f125982g;
        }
        m.h hVar = new m.h((Object) null);
        int i13 = n0.f126004a[o5Var.ordinal()];
        if (i13 == 1) {
            l0Var = l0.f125990b;
        } else {
            if (i13 != 2) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
            }
            l0Var = l0.f125991c;
        }
        hVar.L(l0Var);
        hVar.K(m5Var.E());
        hVar.I((c) f13);
        hVar.J(k0Var);
        return hVar.u();
    }

    public static m5 b(m0 m0Var) {
        try {
            o4 I = o4.I(kh2.r.k1(m0Var.f126000d), com.google.crypto.tink.shaded.protobuf.u.a());
            l5 F = m5.F();
            F.j(m0Var.f125998b);
            F.i(I);
            return (m5) F.a();
        } catch (InvalidProtocolBufferException e13) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e13);
        }
    }

    public static o5 c(l0 l0Var) {
        if (l0.f125990b.equals(l0Var)) {
            return o5.TINK;
        }
        if (l0.f125991c.equals(l0Var)) {
            return o5.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + l0Var);
    }
}
