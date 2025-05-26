package a;

import ads_mobile_sdk.i22;
import ads_mobile_sdk.j22;
import ads_mobile_sdk.j61;
import ads_mobile_sdk.me2;
import ads_mobile_sdk.o13;
import ads_mobile_sdk.om;
import ads_mobile_sdk.q61;
import ads_mobile_sdk.t13;
import ads_mobile_sdk.t61;
import ads_mobile_sdk.tm;
import ads_mobile_sdk.u13;
import ads_mobile_sdk.u61;
import ads_mobile_sdk.um;
import ads_mobile_sdk.w61;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class sc implements t9, p7, de, lb, y, v.u0, b2.r, el.m, el.m0, el.k0, el.o, Continuation, o82.o2, q5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167a;

    public /* synthetic */ sc(int i13) {
        this.f167a = i13;
    }

    private static jl.f h(el.u0 u0Var) {
        String str = u0Var.f59537a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: " + str);
        }
        try {
            il.r1 G = il.r1.G(u0Var.f59539c, com.google.crypto.tink.shaded.protobuf.u.a());
            if (G.E() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            il.u1 D = G.D();
            m.h b13 = jl.e.b();
            b13.f85199d = kl.b.e(D.E().G());
            b13.f85197b = kl.b.g(D.E().F());
            b13.f85198c = kl.b.d(D.E().D());
            b13.f85200e = kl.b.h(u0Var.f59541e);
            jl.e s13 = b13.s();
            gi.m mVar = new gi.m((gi.l) null);
            mVar.f65093b = s13;
            mVar.f65095d = new ECPoint(c0.d.Q(D.G().i()), c0.d.Q(D.H().i()));
            mVar.f65094c = u0Var.f59542f;
            jl.g l13 = mVar.l();
            com.google.android.gms.internal.measurement.x xVar = new com.google.android.gms.internal.measurement.x((c) (0 == true ? 1 : 0));
            xVar.f31694b = l13;
            xVar.f31695c = ll.j.j(c0.d.Q(G.C().i()));
            return xVar.l();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    @Override // a.p7
    public p6 a(ea eaVar) {
        j22 j22Var = (j22) eaVar;
        switch (this.f167a) {
            case 1:
                return ads_mobile_sdk.t8.a(j22Var);
            case 5:
                return u13.a(j22Var);
            case 9:
                return u61.a(j22Var);
            default:
                return um.a(j22Var);
        }
    }

    @Override // el.m
    public se.l b(el.u0 u0Var) {
        gi.j jVar = null;
        byte b13 = 0;
        byte b14 = 0;
        byte b15 = 0;
        Integer num = u0Var.f59542f;
        il.o5 o5Var = u0Var.f59541e;
        com.google.crypto.tink.shaded.protobuf.k kVar = u0Var.f59539c;
        String str = u0Var.f59537a;
        switch (this.f167a) {
            case 0:
                return h(u0Var);
            case 4:
                el.l0 l0Var = kl.c.f80010a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: " + str);
                }
                try {
                    il.w2 F = il.w2.F(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (F.D() == 0) {
                        return jl.m.n((jl.i) kl.c.f80016g.b(o5Var), ml.a.a(F.C().i()), num);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            case 6:
                el.l0 l0Var2 = kl.c.f80010a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: " + str);
                }
                try {
                    il.t2 G = il.t2.G(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (G.E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return jl.k.n(jl.m.n((jl.i) kl.c.f80016g.b(o5Var), ml.a.a(G.D().C().i()), num), new ll.j(ml.a.a(G.C().i()), 3));
                } catch (InvalidProtocolBufferException unused2) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            case 10:
                el.l0 l0Var3 = kl.g.f80021a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: " + str);
                }
                try {
                    il.c6 J2 = il.c6.J(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (J2.H() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger Q = c0.d.Q(J2.F().i());
                    int bitLength = Q.bitLength();
                    jl.s b16 = jl.v.b();
                    b16.f76894c = (jl.t) kl.g.f80028h.b(J2.G().C());
                    b16.f76893b = c0.d.Q(J2.E().i());
                    b16.f76892a = Integer.valueOf(bitLength);
                    b16.f76895d = (jl.u) kl.g.f80027g.b(o5Var);
                    jl.v a13 = b16.a();
                    gi.m mVar = new gi.m((gi.g) (b13 == true ? 1 : 0));
                    mVar.f65093b = a13;
                    mVar.f65095d = Q;
                    mVar.f65094c = num;
                    return mVar.m();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            case 12:
                el.l0 l0Var4 = kl.g.f80021a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: " + str);
                }
                try {
                    il.z5 R = il.z5.R(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (R.P() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    il.c6 N = R.N();
                    BigInteger Q2 = c0.d.Q(N.F().i());
                    int bitLength2 = Q2.bitLength();
                    BigInteger Q3 = c0.d.Q(N.E().i());
                    jl.s b17 = jl.v.b();
                    b17.f76894c = (jl.t) kl.g.f80028h.b(N.G().C());
                    b17.f76893b = Q3;
                    b17.f76892a = Integer.valueOf(bitLength2);
                    b17.f76895d = (jl.u) kl.g.f80027g.b(o5Var);
                    jl.v a14 = b17.a();
                    gi.m mVar2 = new gi.m((gi.g) (b14 == true ? 1 : 0));
                    mVar2.f65093b = a14;
                    mVar2.f65095d = Q2;
                    mVar2.f65094c = num;
                    jl.x m13 = mVar2.m();
                    jf2.c cVar = new jf2.c();
                    cVar.f75872a = m13;
                    ll.j a15 = kl.g.a(R.M());
                    ll.j a16 = kl.g.a(R.O());
                    cVar.f75874c = a15;
                    cVar.f75875d = a16;
                    cVar.f75873b = kl.g.a(R.J());
                    ll.j a17 = kl.g.a(R.K());
                    ll.j a18 = kl.g.a(R.L());
                    cVar.f75876e = a17;
                    cVar.f75877f = a18;
                    cVar.f75878g = kl.g.a(R.I());
                    return cVar.c();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
            case 16:
                el.l0 l0Var5 = kl.i.f80037a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: " + str);
                }
                try {
                    il.o6 K = il.o6.K(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (K.I() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger Q4 = c0.d.Q(K.G().i());
                    int bitLength3 = Q4.bitLength();
                    jl.z b18 = jl.c0.b();
                    pd.d0 d0Var = kl.i.f80044h;
                    b18.f76931c = (jl.a0) d0Var.b(K.H().G());
                    b18.f76932d = (jl.a0) d0Var.b(K.H().E());
                    b18.f76930b = c0.d.Q(K.F().i());
                    b18.f76929a = Integer.valueOf(bitLength3);
                    b18.b(K.H().F());
                    b18.f76934f = (jl.b0) kl.i.f80043g.b(o5Var);
                    jl.c0 a19 = b18.a();
                    gi.m mVar3 = new gi.m((gi.j) (b15 == true ? 1 : 0));
                    mVar3.f65093b = a19;
                    mVar3.f65095d = Q4;
                    mVar3.f65094c = num;
                    return mVar3.n();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
                }
            default:
                el.l0 l0Var6 = kl.i.f80037a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: " + str);
                }
                try {
                    il.l6 R2 = il.l6.R(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (R2.P() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    il.o6 N2 = R2.N();
                    BigInteger Q5 = c0.d.Q(N2.G().i());
                    int bitLength4 = Q5.bitLength();
                    BigInteger Q6 = c0.d.Q(N2.F().i());
                    jl.z b19 = jl.c0.b();
                    pd.d0 d0Var2 = kl.i.f80044h;
                    b19.f76931c = (jl.a0) d0Var2.b(N2.H().G());
                    b19.f76932d = (jl.a0) d0Var2.b(N2.H().E());
                    b19.f76930b = Q6;
                    b19.f76929a = Integer.valueOf(bitLength4);
                    b19.b(N2.H().F());
                    b19.f76934f = (jl.b0) kl.i.f80043g.b(o5Var);
                    jl.c0 a23 = b19.a();
                    gi.m mVar4 = new gi.m(jVar);
                    mVar4.f65093b = a23;
                    mVar4.f65095d = Q5;
                    mVar4.f65094c = num;
                    jl.e0 n13 = mVar4.n();
                    jf2.c cVar2 = new jf2.c();
                    cVar2.f75872a = n13;
                    ll.j a24 = kl.i.a(R2.M());
                    ll.j a25 = kl.i.a(R2.O());
                    cVar2.f75874c = a24;
                    cVar2.f75875d = a25;
                    cVar2.f75873b = kl.i.a(R2.J());
                    ll.j a26 = kl.i.a(R2.K());
                    ll.j a27 = kl.i.a(R2.L());
                    cVar2.f75876e = a26;
                    cVar2.f75877f = a27;
                    cVar2.f75878g = kl.i.a(R2.I());
                    return cVar2.d();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
        }
    }

    @Override // a.t9
    public j22 c(nb nbVar) {
        switch (this.f167a) {
            case 0:
                return ads_mobile_sdk.t8.b((ads_mobile_sdk.s8) nbVar);
            case 4:
                return u13.a((t13) nbVar);
            case 8:
                return u61.a((t61) nbVar);
            default:
                return um.a((tm) nbVar);
        }
    }

    @Override // el.o
    public el.u0 d(se.l lVar) {
        uk.l lVar2 = uk.l.f122370b;
        switch (this.f167a) {
            case 3:
                jl.m mVar = (jl.m) lVar;
                return el.u0.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", kl.c.a(mVar).e(), il.i4.ASYMMETRIC_PUBLIC, (il.o5) kl.c.f80016g.c(mVar.f76868c.f76859a), mVar.f76871f);
            case 5:
                jl.k kVar = (jl.k) lVar;
                el.l0 l0Var = kl.c.f80010a;
                il.s2 F = il.t2.F();
                il.w2 a13 = kl.c.a(kVar.f76860c);
                F.g();
                il.t2.B((il.t2) F.f33596b, a13);
                byte[] J2 = kVar.f76861d.J(lVar2);
                com.google.crypto.tink.shaded.protobuf.j d2 = com.google.crypto.tink.shaded.protobuf.k.d(J2, 0, J2.length);
                F.g();
                il.t2.A((il.t2) F.f33596b, d2);
                return el.u0.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((il.t2) F.a()).e(), il.i4.ASYMMETRIC_PRIVATE, (il.o5) kl.c.f80016g.c(kVar.f76860c.f76868c.f76859a), kVar.j());
            case 9:
                jl.x xVar = (jl.x) lVar;
                return el.u0.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", kl.g.c(xVar).e(), il.i4.ASYMMETRIC_PUBLIC, (il.o5) kl.g.f80027g.c(xVar.f76917c.f76908c), xVar.f76920f);
            case 11:
                jl.w wVar = (jl.w) lVar;
                el.l0 l0Var2 = kl.g.f80021a;
                il.y5 Q = il.z5.Q();
                Q.g();
                il.z5.A((il.z5) Q.f33596b);
                il.c6 c13 = kl.g.c(wVar.f76910c);
                Q.g();
                il.z5.F((il.z5) Q.f33596b, c13);
                com.google.crypto.tink.shaded.protobuf.j b13 = kl.g.b(wVar.f76911d.k(lVar2));
                Q.g();
                il.z5.G((il.z5) Q.f33596b, b13);
                com.google.crypto.tink.shaded.protobuf.j b14 = kl.g.b(wVar.f76912e.k(lVar2));
                Q.g();
                il.z5.H((il.z5) Q.f33596b, b14);
                com.google.crypto.tink.shaded.protobuf.j b15 = kl.g.b(wVar.f76913f.k(lVar2));
                Q.g();
                il.z5.B((il.z5) Q.f33596b, b15);
                com.google.crypto.tink.shaded.protobuf.j b16 = kl.g.b(wVar.f76914g.k(lVar2));
                Q.g();
                il.z5.C((il.z5) Q.f33596b, b16);
                com.google.crypto.tink.shaded.protobuf.j b17 = kl.g.b(wVar.f76915h.k(lVar2));
                Q.g();
                il.z5.D((il.z5) Q.f33596b, b17);
                com.google.crypto.tink.shaded.protobuf.j b18 = kl.g.b(wVar.f76916i.k(lVar2));
                Q.g();
                il.z5.E((il.z5) Q.f33596b, b18);
                return el.u0.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((il.z5) Q.a()).e(), il.i4.ASYMMETRIC_PRIVATE, (il.o5) kl.g.f80027g.c(wVar.f76910c.f76917c.f76908c), wVar.j());
            case 15:
                jl.e0 e0Var = (jl.e0) lVar;
                return el.u0.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", kl.i.d(e0Var).e(), il.i4.ASYMMETRIC_PUBLIC, (il.o5) kl.i.f80043g.c(e0Var.f76832c.f76812c), e0Var.f76835f);
            default:
                jl.d0 d0Var = (jl.d0) lVar;
                el.l0 l0Var3 = kl.i.f80037a;
                il.k6 Q2 = il.l6.Q();
                Q2.g();
                il.l6.A((il.l6) Q2.f33596b);
                il.o6 d13 = kl.i.d(d0Var.f76821c);
                Q2.g();
                il.l6.F((il.l6) Q2.f33596b, d13);
                com.google.crypto.tink.shaded.protobuf.j b19 = kl.i.b(d0Var.f76822d.k(lVar2));
                Q2.g();
                il.l6.G((il.l6) Q2.f33596b, b19);
                com.google.crypto.tink.shaded.protobuf.j b23 = kl.i.b(d0Var.f76823e.k(lVar2));
                Q2.g();
                il.l6.H((il.l6) Q2.f33596b, b23);
                com.google.crypto.tink.shaded.protobuf.j b24 = kl.i.b(d0Var.f76824f.k(lVar2));
                Q2.g();
                il.l6.B((il.l6) Q2.f33596b, b24);
                com.google.crypto.tink.shaded.protobuf.j b25 = kl.i.b(d0Var.f76825g.k(lVar2));
                Q2.g();
                il.l6.C((il.l6) Q2.f33596b, b25);
                com.google.crypto.tink.shaded.protobuf.j b26 = kl.i.b(d0Var.f76826h.k(lVar2));
                Q2.g();
                il.l6.D((il.l6) Q2.f33596b, b26);
                com.google.crypto.tink.shaded.protobuf.j b27 = kl.i.b(d0Var.f76827i.k(lVar2));
                Q2.g();
                il.l6.E((il.l6) Q2.f33596b, b27);
                return el.u0.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((il.l6) Q2.a()).e(), il.i4.ASYMMETRIC_PRIVATE, (il.o5) kl.i.f80043g.c(d0Var.f76821c.f76832c.f76812c), d0Var.j());
        }
    }

    @Override // a.y
    public Object e(i7 i7Var) {
        return j61.a((w61) i7Var);
    }

    public Object f(Object obj) {
        switch (this.f167a) {
            case 20:
                im.e eVar = (im.e) obj;
                eVar.getClass();
                gi.m mVar = com.google.firebase.messaging.n.f33795a;
                mVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    mVar.t(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                return ((nm.s) obj).p();
        }
    }

    @Override // b2.r
    public b2.o g(b2.o0 o0Var) {
        int i13 = this.f167a;
        b2.m mVar = o0Var.f21193c;
        switch (i13) {
            case 27:
                return new b2.o(mVar.a(mVar.f21175a), mVar.a(mVar.f21176b), o0Var.a() == b2.i.CROSSED);
            default:
                b2.p pVar = b2.p.f21195c;
                boolean z13 = o0Var.a() == b2.i.CROSSED;
                return new b2.o(e0.t.e(mVar, z13, true, pVar), e0.t.e(mVar, z13, false, pVar), z13);
        }
    }

    @Override // a.lb
    public i7 i(ea eaVar, me2 me2Var) {
        i22 i22Var = (i22) eaVar;
        switch (this.f167a) {
            case 3:
                return ads_mobile_sdk.t8.a(i22Var, me2Var);
            case 7:
                return u13.a(i22Var, me2Var);
            case 11:
                return u61.a(i22Var, me2Var);
            default:
                return um.a(i22Var, me2Var);
        }
    }

    @Override // o82.o2
    public Object invoke(Object obj) {
        Integer p13;
        List list;
        String str;
        String str2;
        String q13;
        String l13;
        List list2;
        String str3;
        String str4;
        String q14;
        String l14;
        String str5 = "";
        switch (this.f167a) {
            case 21:
                int i13 = ns.r.f91954c1;
                Intrinsics.checkNotNullParameter((ns.u) obj, "vmState");
                return new ns.p();
            case 22:
                fx.c vmState = (fx.c) obj;
                int i14 = ex.e.f60367h;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                com.pinterest.api.model.h2 h2Var = vmState.f63071a;
                p13 = h2Var != null ? h2Var.p() : -1;
                com.pinterest.api.model.h2 h2Var2 = vmState.f63071a;
                if (h2Var2 == null || (l13 = h2Var2.l()) == null || (list = kotlin.collections.e0.b(l13)) == null) {
                    list = kotlin.collections.q0.f80391a;
                }
                List list3 = list;
                if (h2Var2 == null || (str = h2Var2.o()) == null) {
                    str = "";
                }
                u50.f0 f0Var = new u50.f0(str);
                if (h2Var2 == null || (str2 = h2Var2.o()) == null) {
                    str2 = "";
                }
                u50.f0 f0Var2 = new u50.f0(str2);
                if (h2Var2 != null && (q13 = h2Var2.q()) != null) {
                    str5 = q13;
                }
                return new fx.f(f0Var, list3, new u50.f0(str5), f0Var2, false, p13.intValue(), RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
            case 23:
                fx.c vmState2 = (fx.c) obj;
                int i15 = ex.e.f60367h;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                com.pinterest.api.model.h2 h2Var3 = vmState2.f63071a;
                p13 = h2Var3 != null ? h2Var3.p() : -1;
                com.pinterest.api.model.h2 h2Var4 = vmState2.f63071a;
                if (h2Var4 == null || (l14 = h2Var4.l()) == null || (list2 = kotlin.collections.e0.b(l14)) == null) {
                    list2 = kotlin.collections.q0.f80391a;
                }
                List list4 = list2;
                if (h2Var4 == null || (str3 = h2Var4.o()) == null) {
                    str3 = "";
                }
                u50.f0 f0Var3 = new u50.f0(str3);
                if (h2Var4 == null || (str4 = h2Var4.o()) == null) {
                    str4 = "";
                }
                u50.f0 f0Var4 = new u50.f0(str4);
                if (h2Var4 != null && (q14 = h2Var4.q()) != null) {
                    str5 = q14;
                }
                return new fx.f(f0Var3, list4, new u50.f0(str5), f0Var4, vmState2.f63072b, p13.intValue(), 48);
            case 24:
            case 25:
            default:
                fa0.z0 vmState3 = (fa0.z0) obj;
                int i16 = fa0.t.V0;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                return kotlin.jvm.internal.r.q0(vmState3);
            case 26:
                m90.i1 vmState4 = (m90.i1) obj;
                int i17 = m90.w.X0;
                Intrinsics.checkNotNullParameter(vmState4, "vmState");
                return m90.a0.c(vmState4);
            case 27:
                p90.z0 vmState5 = (p90.z0) obj;
                int i18 = p90.w.Y0;
                Intrinsics.checkNotNullParameter(vmState5, "vmState");
                return p90.y.c(vmState5);
        }
    }

    @Override // q5.v
    public q5.a2 k(View view, q5.a2 windowInsets) {
        q5.y1 y1Var = windowInsets.f102400a;
        switch (this.f167a) {
            case 24:
                int i13 = g90.n.f64537w0;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                f5.e f13 = y1Var.f(7);
                Intrinsics.checkNotNullExpressionValue(f13, "getInsets(...)");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = f13.f61084d;
                view.setLayoutParams(layoutParams2);
                break;
            default:
                int i14 = k90.c.f78723v1;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                f5.e f14 = y1Var.f(7);
                Intrinsics.checkNotNullExpressionValue(f14, "getInsets(...)");
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.bottomMargin = f14.f61084d;
                view.setLayoutParams(layoutParams4);
                break;
        }
        return q5.a2.f102399b;
    }

    @Override // el.m0
    public el.v0 l(uk.q qVar) {
        switch (this.f167a) {
            case 1:
                el.l0 l0Var = kl.c.f80010a;
                il.n4 H = il.o4.H();
                H.j("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                H.k(il.q2.B().e());
                H.i((il.o5) kl.c.f80016g.c(((jl.j) qVar).f76859a));
                return el.v0.a((il.o4) H.a());
            case 7:
                jl.v vVar = (jl.v) qVar;
                el.l0 l0Var2 = kl.g.f80021a;
                il.n4 H2 = il.o4.H();
                H2.j("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                il.s5 G = il.t5.G();
                il.v5 D = il.w5.D();
                il.d3 d3Var = (il.d3) kl.g.f80028h.c(vVar.f76909d);
                D.g();
                il.w5.A((il.w5) D.f33596b, d3Var);
                il.w5 w5Var = (il.w5) D.a();
                G.g();
                il.t5.A((il.t5) G.f33596b, w5Var);
                G.g();
                il.t5.B((il.t5) G.f33596b, vVar.f76906a);
                com.google.crypto.tink.shaded.protobuf.j b13 = kl.g.b(vVar.f76907b);
                G.g();
                il.t5.C((il.t5) G.f33596b, b13);
                H2.k(((il.t5) G.a()).e());
                H2.i((il.o5) kl.g.f80027g.c(vVar.f76908c));
                return el.v0.a((il.o4) H2.a());
            default:
                jl.c0 c0Var = (jl.c0) qVar;
                el.l0 l0Var3 = kl.i.f80037a;
                il.n4 H3 = il.o4.H();
                H3.j("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                il.e6 G2 = il.f6.G();
                il.i6 c13 = kl.i.c(c0Var);
                G2.g();
                il.f6.A((il.f6) G2.f33596b, c13);
                G2.g();
                il.f6.B((il.f6) G2.f33596b, c0Var.f76810a);
                com.google.crypto.tink.shaded.protobuf.j b14 = kl.i.b(c0Var.f76811b);
                G2.g();
                il.f6.C((il.f6) G2.f33596b, b14);
                H3.k(((il.f6) G2.a()).e());
                H3.i((il.o5) kl.i.f80043g.c(c0Var.f76812c));
                return el.v0.a((il.o4) H3.a());
        }
    }

    @Override // a.de
    public i22 m(i7 i7Var, me2 me2Var) {
        switch (this.f167a) {
            case 2:
                return ads_mobile_sdk.t8.a((ads_mobile_sdk.l8) i7Var, me2Var);
            case 6:
                return u13.a((o13) i7Var, me2Var);
            case 10:
                return u61.a((q61) i7Var, me2Var);
            default:
                return um.a((om) i7Var, me2Var);
        }
    }

    @Override // el.k0
    public uk.q o(el.v0 v0Var) {
        int i13 = this.f167a;
        il.o4 o4Var = v0Var.f59546b;
        switch (i13) {
            case 2:
                el.l0 l0Var = kl.c.f80010a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    if (il.q2.D(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a()).C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return new jl.j((jl.i) kl.c.f80016g.b(o4Var.E()));
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e13);
                }
            case 8:
                el.l0 l0Var2 = kl.g.f80021a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    il.t5 H = il.t5.H(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a());
                    jl.s b13 = jl.v.b();
                    b13.f76894c = (jl.t) kl.g.f80028h.b(H.E().C());
                    b13.f76893b = c0.d.Q(H.F().i());
                    b13.f76892a = Integer.valueOf(H.D());
                    b13.f76895d = (jl.u) kl.g.f80027g.b(o4Var.E());
                    return b13.a();
                } catch (InvalidProtocolBufferException e14) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e14);
                }
            default:
                el.l0 l0Var3 = kl.i.f80037a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    il.f6 H2 = il.f6.H(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a());
                    jl.z b14 = jl.c0.b();
                    il.d3 G = H2.E().G();
                    pd.d0 d0Var = kl.i.f80044h;
                    b14.f76931c = (jl.a0) d0Var.b(G);
                    b14.f76932d = (jl.a0) d0Var.b(H2.E().E());
                    b14.f76930b = c0.d.Q(H2.F().i());
                    b14.f76929a = Integer.valueOf(H2.D());
                    b14.b(H2.E().F());
                    b14.f76934f = (jl.b0) kl.i.f80043g.b(o4Var.E());
                    return b14.a();
                } catch (InvalidProtocolBufferException e15) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e15);
                }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Object obj = com.google.firebase.messaging.h.f33780c;
        return 403;
    }
}
