package mj;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.x;
import androidx.recyclerview.widget.e2;
import bl.p;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.firebase.messaging.q;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.PinterestEditText;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.unauth.sba.e0;
import ct0.s;
import el.b1;
import el.i0;
import el.k0;
import el.l0;
import el.m0;
import el.n0;
import el.o;
import el.o0;
import el.u0;
import ht0.r;
import il.a4;
import il.b2;
import il.b4;
import il.c2;
import il.e4;
import il.f2;
import il.g4;
import il.h2;
import il.i2;
import il.i4;
import il.j4;
import il.l2;
import il.n4;
import il.o4;
import il.o5;
import il.u3;
import il.v0;
import il.v3;
import il.x0;
import il.y0;
import il.y3;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import ma1.w;
import nx.h1;
import ny0.a0;
import ny0.b0;
import ny0.c1;
import ny0.d1;
import ny0.e1;
import ny0.y;
import o82.o2;
import pd.d0;
import q5.a2;
import q5.v;
import qm0.m2;
import qm0.p0;
import u50.j0;
import uk.t;
import va1.m1;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements bk.n, com.google.android.material.internal.h, o0, b1, m0, k0, o, el.m, t5.c, h1, o2, ak2.c, v, eb2.g, e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87265a;

    public /* synthetic */ m(int i13) {
        this.f87265a = i13;
    }

    @Override // eb2.g
    public int a() {
        switch (this.f87265a) {
            case 10:
                int i13 = s.S0;
                return 0;
            default:
                int i14 = r.G0;
                return 1;
        }
    }

    @Override // ak2.c
    public Object apply(Object obj, Object obj2) {
        switch (this.f87265a) {
            case 6:
                v7 board = (v7) obj;
                ba boardSection = (ba) obj2;
                Intrinsics.checkNotNullParameter(board, "board");
                Intrinsics.checkNotNullParameter(boardSection, "boardSection");
                return new Pair(board, boardSection);
            default:
                wy0 user = (wy0) obj;
                v7 board2 = (v7) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(board2, "board");
                return new Pair(user, board2);
        }
    }

    @Override // el.m
    public se.l b(u0 u0Var) {
        bl.b bVar = bl.b.f23404e;
        int i13 = 3;
        Integer num = u0Var.f59542f;
        o5 o5Var = u0Var.f59541e;
        com.google.crypto.tink.shaded.protobuf.k kVar = u0Var.f59539c;
        String str = u0Var.f59537a;
        switch (this.f87265a) {
            case 11:
                l0 l0Var = al.a.f15467a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    v0 E = v0.E(kVar, u.a());
                    if (E.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    bh.b bVar2 = new bh.b();
                    bVar2.w(E.B().size());
                    bVar2.f22799c = al.a.b(o5Var);
                    zk.f d2 = bVar2.d();
                    gi.m mVar = new gi.m((gi.k) null);
                    mVar.f65093b = d2;
                    mVar.f65095d = new ll.j(ml.a.a(E.B().i()), i13);
                    mVar.f65094c = num;
                    return mVar.r();
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("Parsing AesSivKey failed");
                }
            case 18:
                l0 l0Var2 = bl.o.f23455a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: " + str);
                }
                try {
                    e4 I = e4.I(kVar, u.a());
                    if (I.G() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    bl.m b13 = bl.o.b(o5Var, I.E());
                    return p.n(b13, bl.o.a(b13.f23449a, I.F().i()), num);
                } catch (InvalidProtocolBufferException unused2) {
                    throw new GeneralSecurityException("Parsing HpkePublicKey failed");
                }
            case 20:
                l0 l0Var3 = bl.o.f23455a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: " + str);
                }
                try {
                    b4 H = b4.H(kVar, u.a());
                    if (H.F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    e4 E2 = H.E();
                    bl.m b14 = bl.o.b(o5Var, E2.E());
                    bl.k kVar2 = b14.f23449a;
                    return bl.n.n(p.n(b14, bl.o.a(kVar2, E2.F().i()), num), new ll.j(ml.a.a(c0.d.Q2(cl.k.a(kVar2), c0.d.Q(H.D().i()))), i13));
                } catch (InvalidProtocolBufferException unused3) {
                    throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
                }
            case 26:
                l0 l0Var4 = cl.c.f27929a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + str);
                }
                try {
                    l2 K = l2.K(kVar, u.a());
                    if (K.G() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    bl.f a13 = cl.c.a(o5Var, K.F());
                    if (!a13.f23421a.equals(bVar)) {
                        return bl.h.o(a13, new ECPoint(c0.d.Q(K.H().i()), c0.d.Q(K.I().i())), num);
                    }
                    if (K.I().size() == 0) {
                        return bl.h.n(a13, ml.a.a(K.H().i()), num);
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            default:
                l0 l0Var5 = cl.c.f27929a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + str);
                }
                try {
                    i2 H2 = i2.H(kVar, u.a());
                    if (H2.F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    l2 E3 = H2.E();
                    bl.f a14 = cl.c.a(o5Var, E3.F());
                    return a14.f23421a.equals(bVar) ? bl.g.n(bl.h.n(a14, ml.a.a(E3.H().i()), num), new ll.j(ml.a.a(H2.D().i()), i13)) : bl.g.o(bl.h.o(a14, new ECPoint(c0.d.Q(E3.H().i()), c0.d.Q(E3.I().i())), num), ll.j.j(c0.d.Q(H2.D().i())));
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
        }
    }

    @Override // el.o
    public u0 d(se.l lVar) {
        switch (this.f87265a) {
            case 10:
                zk.a aVar = (zk.a) lVar;
                l0 l0Var = al.a.f15467a;
                il.u0 D = v0.D();
                byte[] b13 = ((ml.a) aVar.f142062c.f83754b).b();
                com.google.crypto.tink.shaded.protobuf.j d2 = com.google.crypto.tink.shaded.protobuf.k.d(b13, 0, b13.length);
                D.g();
                v0.A((v0) D.f33596b, d2);
                return u0.a("type.googleapis.com/google.crypto.tink.AesSivKey", ((v0) D.a()).e(), i4.SYMMETRIC, al.a.a(aVar.f142061b.f142075b), aVar.f142064e);
            case 17:
                p pVar = (p) lVar;
                return u0.a("type.googleapis.com/google.crypto.tink.HpkePublicKey", bl.o.d(pVar).e(), i4.ASYMMETRIC_PUBLIC, (o5) bl.o.f23461g.c(pVar.f23465c.f23452d), pVar.f23468f);
            case 19:
                bl.n nVar = (bl.n) lVar;
                l0 l0Var2 = bl.o.f23455a;
                a4 G = b4.G();
                G.g();
                b4.A((b4) G.f33596b);
                e4 d13 = bl.o.d(nVar.f23453c);
                G.g();
                b4.B((b4) G.f33596b, d13);
                byte[] b14 = ((ml.a) nVar.f23454d.f83754b).b();
                com.google.crypto.tink.shaded.protobuf.j d14 = com.google.crypto.tink.shaded.protobuf.k.d(b14, 0, b14.length);
                G.g();
                b4.C((b4) G.f33596b, d14);
                return u0.a("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((b4) G.a()).e(), i4.ASYMMETRIC_PRIVATE, (o5) bl.o.f23461g.c(nVar.f23453c.f23465c.f23452d), nVar.j());
            case 25:
                bl.h hVar = (bl.h) lVar;
                return u0.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", cl.c.d(hVar).e(), i4.ASYMMETRIC_PUBLIC, (o5) cl.c.f27935g.c(hVar.f23430c.f23424d), hVar.f23434g);
            default:
                bl.g gVar = (bl.g) lVar;
                l0 l0Var3 = cl.c.f27929a;
                h2 G2 = i2.G();
                G2.g();
                i2.A((i2) G2.f33596b);
                l2 d15 = cl.c.d(gVar.f23427c);
                G2.g();
                i2.B((i2) G2.f33596b, d15);
                bl.h hVar2 = gVar.f23427c;
                boolean equals = hVar2.f23430c.f23421a.equals(bl.b.f23404e);
                bl.f fVar = hVar2.f23430c;
                if (equals) {
                    byte[] b15 = ((ml.a) gVar.f23429e.f83754b).b();
                    com.google.crypto.tink.shaded.protobuf.j d16 = com.google.crypto.tink.shaded.protobuf.k.d(b15, 0, b15.length);
                    G2.g();
                    i2.C((i2) G2.f33596b, d16);
                } else {
                    byte[] Q2 = c0.d.Q2(cl.c.b(fVar.f23421a), (BigInteger) gVar.f23428d.f83754b);
                    com.google.crypto.tink.shaded.protobuf.j d17 = com.google.crypto.tink.shaded.protobuf.k.d(Q2, 0, Q2.length);
                    G2.g();
                    i2.C((i2) G2.f33596b, d17);
                }
                return u0.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((i2) G2.a()).e(), i4.ASYMMETRIC_PRIVATE, (o5) cl.c.f27935g.c(fVar.f23424d), gVar.j());
        }
    }

    @Override // nx.h1
    public HashMap f() {
        return null;
    }

    @Override // el.o0
    public Object g(se.l lVar) {
        byte[] b13;
        byte[] b14;
        ll.n nVar;
        switch (this.f87265a) {
            case 5:
                zk.a aVar = (zk.a) lVar;
                n0 n0Var = zk.d.f142066a;
                zk.d.a(aVar.f142061b);
                return new ll.d(((ml.a) aVar.f142062c.f83754b).b(), aVar.f142063d);
            case 6:
                el.s sVar = (el.s) lVar;
                u0 u0Var = sVar.f59529b;
                el.s.j(u0Var);
                g4 H = j4.H();
                H.j(u0Var.f59537a);
                H.k(u0Var.f59539c);
                H.i(u0Var.f59540d);
                uk.d dVar = (uk.d) t.a((j4) H.a(), uk.d.class);
                int[] iArr = al.b.f15473a;
                o5 o5Var = u0Var.f59541e;
                int i13 = iArr[o5Var.ordinal()];
                if (i13 != 1) {
                    u0 u0Var2 = sVar.f59529b;
                    if (i13 == 2 || i13 == 3) {
                        b13 = i0.a(u0Var2.f59542f.intValue()).b();
                    } else {
                        if (i13 != 4) {
                            throw new GeneralSecurityException("unknown output prefix type " + o5Var.getNumber());
                        }
                        b13 = i0.b(u0Var2.f59542f.intValue()).b();
                    }
                } else {
                    b13 = i0.f59494a.b();
                }
                return new zk.h(dVar, o5Var, b13);
            case 12:
                bl.g gVar = (bl.g) lVar;
                el.a.J((ll.n) ll.i.f83744g.c(gVar.f23427c.f23430c.f23421a), c0.d.P2((BigInteger) gVar.f23428d.f83754b));
                bl.h hVar = gVar.f23427c;
                ml.a aVar2 = hVar.f23430c.f23426f;
                if (aVar2 != null) {
                    aVar2.b();
                }
                bl.f fVar = hVar.f23430c;
                ll.i.b(fVar.f23422b);
                cl.b.a(fVar);
                gVar.k().b();
                return new cl.f();
            case 13:
                bl.h hVar2 = (bl.h) lVar;
                d0 d0Var = ll.i.f83744g;
                ll.n nVar2 = (ll.n) ll.i.f83744g.c(hVar2.f23430c.f23421a);
                ECPoint eCPoint = hVar2.f23431d;
                ECPublicKey L = el.a.L(nVar2, eCPoint.getAffineX().toByteArray(), eCPoint.getAffineY().toByteArray());
                byte[] bArr = new byte[0];
                bl.f fVar2 = hVar2.f23430c;
                ml.a aVar3 = fVar2.f23426f;
                if (aVar3 != null) {
                    bArr = aVar3.b();
                }
                return new ll.i(L, bArr, ll.i.b(fVar2.f23422b), (ll.p) ll.i.f83745h.c(fVar2.f23423c), cl.b.a(fVar2), hVar2.f23433f.b());
            case 21:
                el.s sVar2 = (el.s) lVar;
                u0 u0Var3 = sVar2.f59529b;
                el.s.j(u0Var3);
                g4 H2 = j4.H();
                H2.j(u0Var3.f59537a);
                H2.k(u0Var3.f59539c);
                H2.i(u0Var3.f59540d);
                int[] iArr2 = cl.l.f27971a;
                o5 o5Var2 = u0Var3.f59541e;
                int i14 = iArr2[o5Var2.ordinal()];
                if (i14 != 1) {
                    u0 u0Var4 = sVar2.f59529b;
                    if (i14 == 2 || i14 == 3) {
                        i0.a(u0Var4.f59542f.intValue()).b();
                    } else {
                        if (i14 != 4) {
                            throw new GeneralSecurityException("unknown output prefix type " + o5Var2);
                        }
                        i0.b(u0Var4.f59542f.intValue()).b();
                    }
                } else {
                    i0.f59494a.b();
                }
                return new bl.r();
            case 22:
                el.s sVar3 = (el.s) lVar;
                u0 u0Var5 = sVar3.f59529b;
                el.s.j(u0Var5);
                g4 H3 = j4.H();
                H3.j(u0Var5.f59537a);
                H3.k(u0Var5.f59539c);
                H3.i(u0Var5.f59540d);
                uk.f fVar3 = (uk.f) t.a((j4) H3.a(), uk.f.class);
                int[] iArr3 = cl.m.f27972a;
                o5 o5Var3 = u0Var5.f59541e;
                int i15 = iArr3[o5Var3.ordinal()];
                if (i15 != 1) {
                    u0 u0Var6 = sVar3.f59529b;
                    if (i15 == 2 || i15 == 3) {
                        b14 = i0.a(u0Var6.f59542f.intValue()).b();
                    } else {
                        if (i15 != 4) {
                            throw new GeneralSecurityException("unknown output prefix type " + o5Var3);
                        }
                        b14 = i0.b(u0Var6.f59542f.intValue()).b();
                    }
                } else {
                    b14 = i0.f59494a.b();
                }
                return new bl.t(fVar3, b14);
            default:
                bl.n nVar3 = (bl.n) lVar;
                bl.m mVar = nVar3.f23453c.f23465c;
                cl.g.d(mVar.f23449a);
                cl.g.c(mVar.f23450b);
                cl.g.b(mVar.f23451c);
                bl.k kVar = bl.k.f23444g;
                bl.k kVar2 = mVar.f23449a;
                boolean equals = kVar2.equals(kVar);
                bl.k kVar3 = bl.k.f23443f;
                bl.k kVar4 = bl.k.f23442e;
                bl.k kVar5 = bl.k.f23441d;
                if (!equals && !kVar2.equals(kVar5) && !kVar2.equals(kVar4) && !kVar2.equals(kVar3)) {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                p pVar = nVar3.f23453c;
                bl.k kVar6 = pVar.f23465c.f23449a;
                boolean equals2 = kVar6.equals(kVar);
                ll.j jVar = nVar3.f23454d;
                if (equals2) {
                    byte[] b15 = ((ml.a) jVar.f83754b).b();
                    byte[] i16 = kh2.r.i1(b15);
                    ml.a.a(b15);
                    ml.a.a(i16);
                } else {
                    if (!kVar6.equals(kVar5) && !kVar6.equals(kVar4) && !kVar6.equals(kVar3)) {
                        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                    }
                    byte[] b16 = ((ml.a) jVar.f83754b).b();
                    byte[] b17 = pVar.f23466d.b();
                    if (kVar6.equals(kVar5)) {
                        nVar = ll.n.NIST_P256;
                    } else if (kVar6.equals(kVar4)) {
                        nVar = ll.n.NIST_P384;
                    } else {
                        if (!kVar6.equals(kVar3)) {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                        nVar = ll.n.NIST_P521;
                    }
                    ECPublicKey K = el.a.K(nVar, ll.p.UNCOMPRESSED, b17);
                    ECPrivateKey J2 = el.a.J(nVar, b16);
                    el.a.K2(J2, K);
                    el.f.b(K.getW(), J2.getParams().getCurve());
                    ml.a.a(b16);
                    ml.a.a(b17);
                }
                ml.a k13 = nVar3.k();
                cl.f fVar4 = new cl.f();
                k13.b();
                return fVar4;
        }
    }

    @Override // el.b1
    public Object get() {
        switch (this.f87265a) {
            case 7:
                zk.f fVar = zk.j.f142081a;
                bh.b bVar = new bh.b();
                bVar.w(64);
                bVar.f22799c = zk.e.f142070b;
                return bVar.d();
            default:
                Set set = bl.f.f23420g;
                HashSet hashSet = new HashSet();
                q b13 = vk.t.b();
                b13.C();
                b13.E(16);
                b13.M();
                vk.s sVar = vk.s.f126037d;
                b13.f33806d = sVar;
                hashSet.add(b13.g());
                q b14 = vk.t.b();
                b14.C();
                b14.E(32);
                b14.M();
                b14.f33806d = sVar;
                hashSet.add(b14.g());
                x b15 = vk.l.b();
                b15.x(16);
                b15.z(32);
                b15.C(16);
                b15.A(16);
                vk.j jVar = vk.j.f125967d;
                b15.f16712e = jVar;
                vk.k kVar = vk.k.f125975d;
                b15.f16713f = kVar;
                hashSet.add(b15.e());
                x b16 = vk.l.b();
                b16.x(32);
                b16.z(32);
                b16.C(32);
                b16.A(16);
                b16.f16712e = jVar;
                b16.f16713f = kVar;
                hashSet.add(b16.e());
                hashSet.add(new vk.v0(vk.u0.f126057d));
                bh.b bVar2 = new bh.b();
                bVar2.w(64);
                bVar2.f22799c = zk.e.f142072d;
                hashSet.add(bVar2.d());
                return Collections.unmodifiableSet(hashSet);
        }
    }

    @Override // bk.n
    public bk.d h(bk.d dVar) {
        int i13 = MaskableFrameLayout.f32411e;
        return dVar instanceof bk.a ? new bk.c(((bk.a) dVar).f23018a) : dVar;
    }

    @Override // o82.o2
    public Object invoke(Object obj) {
        u50.i0 k0Var;
        switch (this.f87265a) {
            case 3:
                m2 vmState = (m2) obj;
                int i13 = p0.f104322d1;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return tm0.f.d(vmState);
            case 13:
                a0 vmState2 = (a0) obj;
                int i14 = ny0.v.T0;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                if (vmState2 instanceof y) {
                    int i15 = jv1.g.pin_picker_title_before_minimum;
                    int i16 = ((y) vmState2).f92654a;
                    String[] formatArgs = {String.valueOf(i16)};
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    k0Var = new j0(i15, i16, c0.b0(formatArgs));
                } else {
                    if (!(vmState2 instanceof ny0.x)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i17 = jv1.h.pin_picker_header_after_minimum;
                    Intrinsics.checkNotNullParameter(new String[0], "formatArgs");
                    k0Var = new u50.k0(i17, new ArrayList(0));
                }
                return new b0(k0Var);
            case 14:
                d1 it = (d1) obj;
                int i18 = ny0.v.T0;
                Intrinsics.checkNotNullParameter(it, "it");
                return new e1(it.f92573a);
            case 15:
                ny0.b1 it2 = (ny0.b1) obj;
                int i19 = ny0.v.T0;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new c1(it2.f92555a);
            case 16:
                iz0.s item = (iz0.s) obj;
                int i23 = iz0.n.Y0;
                Intrinsics.checkNotNullParameter(item, "item");
                return new iz0.u(item.f73934a);
            case 21:
                x91.u it3 = (x91.u) obj;
                int i24 = x91.s.L0;
                Intrinsics.checkNotNullParameter(it3, "it");
                return new x91.v(it3.f134356a);
            case 22:
                int i25 = ma1.n.K0;
                Intrinsics.checkNotNullParameter((w) obj, "it");
                return new ma1.d();
            case 23:
                ma1.q connectedDevicesItemVMState = (ma1.q) obj;
                int i26 = ma1.n.K0;
                Intrinsics.checkNotNullParameter(connectedDevicesItemVMState, "connectedDevicesItemVMState");
                String format = new SimpleDateFormat("dd MMM yyyy, HH:mm", Locale.getDefault()).format(new Date(connectedDevicesItemVMState.f86801b * 1000));
                String str = connectedDevicesItemVMState.f86808i + connectedDevicesItemVMState.f86805f;
                Intrinsics.f(format);
                return new ma1.p(format, connectedDevicesItemVMState.f86803d, connectedDevicesItemVMState.f86806g, str, connectedDevicesItemVMState.f86802c, connectedDevicesItemVMState.f86800a);
            case 24:
                com.pinterest.feature.settings.notifications.l0 item2 = (com.pinterest.feature.settings.notifications.l0) obj;
                int i27 = com.pinterest.feature.settings.notifications.v.J0;
                Intrinsics.checkNotNullParameter(item2, "item");
                return new com.pinterest.feature.settings.notifications.p0(item2.f48237a);
            case 25:
                rb1.o item3 = (rb1.o) obj;
                int i28 = rb1.k.K0;
                Intrinsics.checkNotNullParameter(item3, "item");
                rb1.p q13 = item3.q();
                return new rb1.u(q13 instanceof m1 ? q13 : null);
            case 26:
                kc1.b it4 = (kc1.b) obj;
                int i29 = kc1.d0.L0;
                Intrinsics.checkNotNullParameter(it4, "it");
                ic1.y yVar = it4.f79136a;
                String str2 = yVar != null ? yVar.f72099a : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = yVar != null ? yVar.f72099a : null;
                return new kc1.a(str2, str3 != null ? str3 : "", it4.f79137b);
            default:
                e0 vmState3 = (e0) obj;
                int i33 = com.pinterest.feature.unauth.sba.w.I0;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                com.pinterest.feature.unauth.sba.y yVar2 = com.pinterest.feature.unauth.sba.y.f48879a;
                return e0.n(vmState3);
        }
    }

    @Override // q5.v
    public a2 k(View view, a2 windowInsets) {
        int i13 = hp0.t.A0;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        f5.e f13 = windowInsets.f102400a.f(7);
        Intrinsics.checkNotNullExpressionValue(f13, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = f13.f61084d;
        view.setLayoutParams(layoutParams2);
        return a2.f102399b;
    }

    @Override // el.m0
    public el.v0 l(uk.q qVar) {
        switch (this.f87265a) {
            case 8:
                zk.f fVar = (zk.f) qVar;
                l0 l0Var = al.a.f15467a;
                n4 H = o4.H();
                H.j("type.googleapis.com/google.crypto.tink.AesSivKey");
                x0 D = y0.D();
                int i13 = fVar.f142074a;
                D.g();
                y0.A((y0) D.f33596b, i13);
                H.k(((y0) D.a()).e());
                H.i(al.a.a(fVar.f142075b));
                return el.v0.a((o4) H.a());
            case 15:
                bl.m mVar = (bl.m) qVar;
                l0 l0Var2 = bl.o.f23455a;
                n4 H2 = o4.H();
                H2.j("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
                u3 C = v3.C();
                y3 c13 = bl.o.c(mVar);
                C.g();
                v3.A((v3) C.f33596b, c13);
                H2.k(((v3) C.a()).e());
                H2.i((o5) bl.o.f23461g.c(mVar.f23452d));
                return el.v0.a((o4) H2.a());
            default:
                bl.f fVar2 = (bl.f) qVar;
                l0 l0Var3 = cl.c.f27929a;
                n4 H3 = o4.H();
                H3.j("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
                b2 C2 = c2.C();
                f2 c14 = cl.c.c(fVar2);
                C2.g();
                c2.A((c2) C2.f33596b, c14);
                H3.k(((c2) C2.a()).e());
                H3.i((o5) cl.c.f27935g.c(fVar2.f23424d));
                return el.v0.a((o4) H3.a());
        }
    }

    @Override // androidx.recyclerview.widget.e2
    public int n(int i13, int i14) {
        int i15 = PinCloseupFragment.f46972m3;
        if (i13 > 0) {
            return (i13 - i14) - 1;
        }
        return 0;
    }

    @Override // el.k0
    public uk.q o(el.v0 v0Var) {
        int i13 = this.f87265a;
        o4 o4Var = v0Var.f59546b;
        switch (i13) {
            case 9:
                l0 l0Var = al.a.f15467a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + o4Var.F());
                }
                try {
                    y0 E = y0.E(o4Var.G(), u.a());
                    if (E.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    bh.b bVar = new bh.b();
                    bVar.w(E.B());
                    bVar.f22799c = al.a.b(o4Var.E());
                    return bVar.d();
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e13);
                }
            case 16:
                l0 l0Var2 = bl.o.f23455a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    return bl.o.b(o4Var.E(), v3.D(o4Var.G(), u.a()).B());
                } catch (InvalidProtocolBufferException e14) {
                    throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e14);
                }
            default:
                l0 l0Var3 = cl.c.f27929a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    return cl.c.a(o4Var.E(), c2.D(o4Var.G(), u.a()).B());
                } catch (InvalidProtocolBufferException e15) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e15);
                }
        }
    }

    @Override // t5.c
    public boolean q(t5.e eVar, int i13, Bundle bundle) {
        int i14 = PinterestEditText.f44834r;
        return true;
    }
}
