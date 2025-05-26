package a;

import ads_mobile_sdk.b13;
import ads_mobile_sdk.g13;
import ads_mobile_sdk.ga0;
import ads_mobile_sdk.hp0;
import ads_mobile_sdk.i22;
import ads_mobile_sdk.j13;
import ads_mobile_sdk.j22;
import ads_mobile_sdk.k61;
import ads_mobile_sdk.m61;
import ads_mobile_sdk.me2;
import ads_mobile_sdk.o13;
import ads_mobile_sdk.o61;
import ads_mobile_sdk.om;
import ads_mobile_sdk.op0;
import ads_mobile_sdk.p61;
import ads_mobile_sdk.r13;
import ads_mobile_sdk.rm;
import ads_mobile_sdk.rp0;
import ads_mobile_sdk.w02;
import ads_mobile_sdk.w61;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.pinterest.api.model.DynamicFeed;
import com.pinterest.ui.grid.PinGridFeedbackView;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class h5 implements t9, p7, de, lb, y, b3, el.o0, el.b1, el.m0, el.k0, el.o, el.m, ak2.f, d7.i, ak2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50a;

    public /* synthetic */ h5(int i13) {
        this.f50a = i13;
    }

    @Override // a.p7
    public p6 a(ea eaVar) {
        j22 j22Var = (j22) eaVar;
        switch (this.f50a) {
            case 2:
                return j13.a(j22Var);
            case 11:
                return p61.a(j22Var);
            case 18:
                return ads_mobile_sdk.r9.a(j22Var);
            case 23:
                return rp0.a(j22Var);
            default:
                return ads_mobile_sdk.sa.a(j22Var);
        }
    }

    @Override // d7.i
    public void accept(Object obj) {
        ((s7.m) obj).d(this.f50a);
    }

    @Override // ak2.f
    public Object apply(Object obj) {
        switch (this.f50a) {
            case 0:
                DynamicFeed dynamicFeed = (DynamicFeed) obj;
                List a13 = dynamicFeed.a();
                String str = dynamicFeed.f35555c;
                if (str == null) {
                    str = "";
                }
                String str2 = dynamicFeed.f35556d;
                return new qr0.e(a13, str, str2 != null ? str2 : "");
            case 1:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                throw new IllegalStateException();
            default:
                int i13 = PinGridFeedbackView.f52492e;
                return (gb2.i) ep.b.i((List) obj, 1);
        }
    }

    @Override // el.m
    public se.l b(el.u0 u0Var) {
        el.l0 l0Var = kl.b.f80004a;
        String str = u0Var.f59537a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: " + str);
        }
        try {
            il.u1 J2 = il.u1.J(u0Var.f59539c, com.google.crypto.tink.shaded.protobuf.u.a());
            if (J2.F() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            m.h b13 = jl.e.b();
            b13.f85199d = kl.b.e(J2.E().G());
            b13.f85197b = kl.b.g(J2.E().F());
            b13.f85198c = kl.b.d(J2.E().D());
            b13.f85200e = kl.b.h(u0Var.f59541e);
            jl.e s13 = b13.s();
            gi.m mVar = new gi.m((gi.l) null);
            mVar.f65093b = s13;
            mVar.f65095d = new ECPoint(c0.d.Q(J2.G().i()), c0.d.Q(J2.H().i()));
            mVar.f65094c = u0Var.f59542f;
            return mVar.l();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.t9
    public j22 c(nb nbVar) {
        switch (this.f50a) {
            case 1:
                return j13.a((g13) nbVar);
            case 10:
                return p61.a((o61) nbVar);
            case 17:
                return ads_mobile_sdk.r9.a((ads_mobile_sdk.o9) nbVar);
            case 22:
                return rp0.a((op0) nbVar);
            default:
                return ads_mobile_sdk.sa.a((ads_mobile_sdk.ra) nbVar);
        }
    }

    @Override // el.o
    public el.u0 d(se.l lVar) {
        switch (this.f50a) {
            case 27:
                jl.g gVar = (jl.g) lVar;
                return el.u0.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", kl.b.c(gVar).e(), il.i4.ASYMMETRIC_PUBLIC, kl.b.f(gVar.f76844c.f76831d), gVar.f76847f);
            default:
                jl.f fVar = (jl.f) lVar;
                el.l0 l0Var = kl.b.f80004a;
                int a13 = kl.b.a(fVar.f76836c.f76844c.f76829b);
                il.q1 F = il.r1.F();
                jl.g gVar2 = fVar.f76836c;
                il.u1 c13 = kl.b.c(gVar2);
                F.g();
                il.r1.A((il.r1) F.f33596b, c13);
                byte[] Q2 = c0.d.Q2(a13, (BigInteger) fVar.f76837d.f83754b);
                com.google.crypto.tink.shaded.protobuf.j d2 = com.google.crypto.tink.shaded.protobuf.k.d(Q2, 0, Q2.length);
                F.g();
                il.r1.B((il.r1) F.f33596b, d2);
                return el.u0.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((il.r1) F.a()).e(), il.i4.ASYMMETRIC_PRIVATE, kl.b.f(gVar2.f76844c.f76831d), fVar.j());
        }
    }

    @Override // a.y
    public Object e(i7 i7Var) {
        switch (this.f50a) {
            case 5:
                return k61.a((w61) i7Var);
            case 6:
                m0 m0Var = new m0();
                if (l3.c.o()) {
                    return m0Var;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 7:
                return w02.a((hp0) i7Var);
            case 8:
                return ads_mobile_sdk.e9.a((ads_mobile_sdk.i9) i7Var);
            case 9:
                return ga0.a((ads_mobile_sdk.l8) i7Var);
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            default:
                return rm.a((om) i7Var);
            case 14:
                return ads_mobile_sdk.ha.a((ads_mobile_sdk.ma) i7Var);
            case 16:
                return r13.a((o13) i7Var);
        }
    }

    @Override // el.o0
    public Object g(se.l lVar) {
        Object f0Var;
        jl.i iVar = jl.i.f76856d;
        jl.b0 b0Var = jl.b0.f76803d;
        uk.l lVar2 = uk.l.f122370b;
        switch (this.f50a) {
            case 0:
                bl.p pVar = (bl.p) lVar;
                bl.m mVar = pVar.f23465c;
                return new cl.g(pVar.f23466d, cl.g.d(mVar.f23449a), cl.g.c(mVar.f23450b), cl.g.b(mVar.f23451c), pVar.f23467e);
            case 1:
                jl.f fVar = (jl.f) lVar;
                yk.d dVar = ll.g.f83718g;
                ll.u uVar = (ll.u) ll.h.f83734j.c(fVar.f76836c.f76844c.f76830c);
                pd.d0 d0Var = ll.h.f83735k;
                jl.g gVar = fVar.f76836c;
                ll.o oVar = (ll.o) d0Var.c(gVar.f76844c.f76828a);
                pd.d0 d0Var2 = ll.h.f83736l;
                jl.e eVar = gVar.f76844c;
                ll.g gVar2 = new ll.g(el.a.J((ll.n) d0Var2.c(eVar.f76829b), ((BigInteger) fVar.f76837d.f83754b).toByteArray()), uVar, oVar, fVar.k().b(), eVar.f76831d.equals(jl.d.f76818d) ? ll.g.f83720i : ll.g.f83719h);
                ll.h b13 = ll.h.b(gVar);
                try {
                    byte[] bArr = ll.g.f83721j;
                    b13.a(gVar2.a(bArr), bArr);
                    return gVar2;
                } catch (GeneralSecurityException e13) {
                    throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e13);
                }
            case 2:
                return ll.h.b((jl.g) lVar);
            case 3:
                jl.k kVar = (jl.k) lVar;
                return new ll.k(((ml.a) kVar.f76861d.f83754b).b(), kVar.k().b(), kVar.f76860c.f76868c.f76859a.equals(iVar) ? new byte[]{0} : new byte[0]);
            case 4:
                jl.m mVar2 = (jl.m) lVar;
                if (ll.l.f83756d.isCompatible()) {
                    return new ll.l(mVar2.f76869d.b(), mVar2.f76870e.b(), mVar2.f76868c.f76859a.equals(iVar) ? new byte[]{0} : new byte[0]);
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 19:
                el.u0 u0Var = ((el.s) lVar).f59529b;
                el.s.j(u0Var);
                il.g4 H = il.j4.H();
                H.j(u0Var.f59537a);
                H.k(u0Var.f59539c);
                H.i(u0Var.f59540d);
                return new kl.d((uk.r) uk.t.a((il.j4) H.a(), uk.r.class), kl.f.b(u0Var), u0Var.f59541e.equals(il.o5.LEGACY) ? new byte[]{0} : new byte[0]);
            case 20:
                el.u0 u0Var2 = ((el.s) lVar).f59529b;
                el.s.j(u0Var2);
                il.g4 H2 = il.j4.H();
                H2.j(u0Var2.f59537a);
                H2.k(u0Var2.f59539c);
                H2.i(u0Var2.f59540d);
                return new kl.f((uk.s) uk.t.a((il.j4) H2.a(), uk.s.class), kl.f.b(u0Var2), u0Var2.f59541e.equals(il.o5.LEGACY) ? new byte[]{0} : new byte[0]);
            case 21:
                jl.w wVar = (jl.w) lVar;
                yk.d dVar2 = ll.a0.f83672f;
                KeyFactory keyFactory = (KeyFactory) ll.s.f83774h.a("RSA");
                jl.x xVar = wVar.f76910c;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(xVar.f76918d, xVar.f76917c.f76907b, wVar.f76911d.k(lVar2), wVar.f76912e.k(lVar2), wVar.f76913f.k(lVar2), wVar.f76914g.k(lVar2), wVar.f76915h.k(lVar2), wVar.f76916i.k(lVar2)));
                pd.d0 d0Var3 = ll.d0.f83706c;
                jl.x xVar2 = wVar.f76910c;
                ll.a0 a0Var = new ll.a0(rSAPrivateCrtKey, (ll.u) d0Var3.c(xVar2.f76917c.f76909d), wVar.k().b(), xVar2.f76917c.f76908c.equals(jl.u.f76902d) ? ll.a0.f83674h : ll.a0.f83673g);
                uk.s b14 = ll.d0.b(xVar2);
                try {
                    byte[] bArr2 = ll.a0.f83675i;
                    b14.a(a0Var.a(bArr2), bArr2);
                    return a0Var;
                } catch (GeneralSecurityException e14) {
                    throw new GeneralSecurityException("RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e14);
                }
            case 22:
                return ll.d0.b((jl.x) lVar);
            case 23:
                jl.d0 d0Var4 = (jl.d0) lVar;
                byte[] bArr3 = ll.e0.f83709a;
                yk.d dVar3 = kl.j.f80045a;
                Provider provider = kl.k.f80051i;
                if (provider != null) {
                    if (provider == null) {
                        throw new GeneralSecurityException("RSA SSA PSS using Conscrypt is not supported.");
                    }
                    KeyFactory keyFactory2 = KeyFactory.getInstance("RSA", provider);
                    jl.c0 c0Var = d0Var4.f76821c.f76832c;
                    return new kl.j((RSAPrivateCrtKey) keyFactory2.generatePrivate(new RSAPrivateCrtKeySpec(d0Var4.f76821c.f76833d, c0Var.f76811b, d0Var4.f76822d.k(lVar2), d0Var4.f76823e.k(lVar2), d0Var4.f76824f.k(lVar2), d0Var4.f76825g.k(lVar2), d0Var4.f76826h.k(lVar2), d0Var4.f76827i.k(lVar2))), c0Var.f76813d, c0Var.f76814e, c0Var.f76815f, d0Var4.k().b(), c0Var.f76812c.equals(b0Var) ? kl.j.f80047c : kl.j.f80046b);
                }
                KeyFactory keyFactory3 = (KeyFactory) ll.s.f83774h.a("RSA");
                jl.e0 e0Var = d0Var4.f76821c;
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory3.generatePrivate(new RSAPrivateCrtKeySpec(e0Var.f76833d, e0Var.f76832c.f76811b, d0Var4.f76822d.k(lVar2), d0Var4.f76823e.k(lVar2), d0Var4.f76824f.k(lVar2), d0Var4.f76825g.k(lVar2), d0Var4.f76826h.k(lVar2), d0Var4.f76827i.k(lVar2)));
                jl.e0 e0Var2 = d0Var4.f76821c;
                jl.c0 c0Var2 = e0Var2.f76832c;
                pd.d0 d0Var5 = ll.g0.f83728a;
                return new kl.d(rSAPrivateCrtKey2, (ll.u) d0Var5.c(c0Var2.f76813d), (ll.u) d0Var5.c(c0Var2.f76814e), c0Var2.f76815f, d0Var4.k().b(), e0Var2.f76832c.f76812c.equals(b0Var) ? ll.e0.f83710b : ll.e0.f83709a);
            default:
                jl.e0 e0Var3 = (jl.e0) lVar;
                pd.d0 d0Var6 = ll.g0.f83728a;
                Provider provider2 = kl.k.f80051i;
                if (provider2 == null) {
                    KeyFactory keyFactory4 = (KeyFactory) ll.s.f83774h.a("RSA");
                    BigInteger bigInteger = e0Var3.f76833d;
                    jl.c0 c0Var3 = e0Var3.f76832c;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory4.generatePublic(new RSAPublicKeySpec(bigInteger, c0Var3.f76811b));
                    pd.d0 d0Var7 = ll.g0.f83728a;
                    f0Var = new ll.f0(rSAPublicKey, (ll.u) d0Var7.c(c0Var3.f76813d), (ll.u) d0Var7.c(c0Var3.f76814e), c0Var3.f76815f, e0Var3.f76834e.b(), c0Var3.f76812c.equals(b0Var) ? ll.g0.f83730c : ll.g0.f83729b);
                } else {
                    if (provider2 == null) {
                        throw new GeneralSecurityException("RSA SSA PSS using Conscrypt is not supported.");
                    }
                    KeyFactory keyFactory5 = KeyFactory.getInstance("RSA", provider2);
                    BigInteger bigInteger2 = e0Var3.f76833d;
                    jl.c0 c0Var4 = e0Var3.f76832c;
                    f0Var = new kl.k((RSAPublicKey) keyFactory5.generatePublic(new RSAPublicKeySpec(bigInteger2, c0Var4.f76811b)), c0Var4.f76813d, c0Var4.f76814e, c0Var4.f76815f, e0Var3.f76834e.b(), c0Var4.f76812c.equals(b0Var) ? kl.k.f80050h : kl.k.f80049g);
                }
                return f0Var;
        }
    }

    @Override // el.b1
    public Object get() {
        jl.b0 b0Var = jl.b0.f76801b;
        jl.u uVar = jl.u.f76900b;
        jl.t tVar = jl.t.f76896b;
        jl.c cVar = jl.c.f76807c;
        jl.b bVar = jl.b.f76797b;
        jl.c cVar2 = jl.c.f76806b;
        jl.b bVar2 = jl.b.f76799d;
        jl.d dVar = jl.d.f76816b;
        switch (this.f50a) {
            case 5:
                jl.e eVar = jl.n.f76872a;
                m.h b13 = jl.e.b();
                b13.f85199d = bVar;
                b13.f85198c = jl.a.f76788c;
                b13.f85197b = cVar;
                b13.f85200e = dVar;
                return b13.s();
            case 6:
                jl.e eVar2 = jl.n.f76872a;
                jl.s b14 = jl.v.b();
                b14.f76894c = tVar;
                b14.f76892a = 3072;
                b14.f76893b = jl.v.f76905e;
                b14.f76895d = jl.u.f76903e;
                return b14.a();
            case 7:
                jl.e eVar3 = jl.n.f76872a;
                jl.s b15 = jl.v.b();
                b15.f76894c = jl.t.f76898d;
                b15.f76892a = 4096;
                b15.f76893b = jl.v.f76905e;
                b15.f76895d = uVar;
                return b15.a();
            case 8:
                jl.e eVar4 = jl.n.f76872a;
                jl.z b16 = jl.c0.b();
                jl.a0 a0Var = jl.a0.f76793b;
                b16.f76931c = a0Var;
                b16.f76932d = a0Var;
                b16.b(32);
                b16.f76929a = 3072;
                b16.f76930b = jl.c0.f76809g;
                b16.f76934f = b0Var;
                return b16.a();
            case 9:
                jl.e eVar5 = jl.n.f76872a;
                jl.z b17 = jl.c0.b();
                jl.a0 a0Var2 = jl.a0.f76795d;
                b17.f76931c = a0Var2;
                b17.f76932d = a0Var2;
                b17.b(64);
                b17.f76929a = 4096;
                b17.f76930b = jl.c0.f76809g;
                b17.f76934f = b0Var;
                return b17.a();
            case 10:
                jl.e eVar6 = jl.n.f76872a;
                m.h b18 = jl.e.b();
                b18.f85199d = bVar2;
                b18.f85198c = jl.a.f76789d;
                b18.f85197b = cVar;
                b18.f85200e = dVar;
                return b18.s();
            case 11:
                jl.e eVar7 = jl.n.f76872a;
                m.h b19 = jl.e.b();
                b19.f85199d = bVar2;
                b19.f85198c = jl.a.f76790e;
                b19.f85197b = cVar;
                b19.f85200e = dVar;
                return b19.s();
            case 12:
                jl.e eVar8 = jl.n.f76872a;
                m.h b23 = jl.e.b();
                b23.f85197b = cVar2;
                b23.f85198c = jl.a.f76788c;
                b23.f85199d = bVar;
                b23.f85200e = dVar;
                return b23.s();
            case 13:
                jl.e eVar9 = jl.n.f76872a;
                m.h b24 = jl.e.b();
                b24.f85197b = cVar2;
                b24.f85198c = jl.a.f76789d;
                b24.f85199d = bVar2;
                b24.f85200e = dVar;
                return b24.s();
            case 14:
                jl.e eVar10 = jl.n.f76872a;
                m.h b25 = jl.e.b();
                b25.f85197b = cVar2;
                b25.f85198c = jl.a.f76788c;
                b25.f85199d = bVar;
                b25.f85200e = jl.d.f76819e;
                return b25.s();
            case 15:
                jl.e eVar11 = jl.n.f76872a;
                m.h b26 = jl.e.b();
                b26.f85199d = bVar2;
                b26.f85198c = jl.a.f76790e;
                b26.f85197b = cVar2;
                b26.f85200e = dVar;
                return b26.s();
            case 16:
                jl.e eVar12 = jl.n.f76872a;
                return new jl.j(jl.i.f76854b);
            case 17:
                jl.e eVar13 = jl.n.f76872a;
                return new jl.j(jl.i.f76857e);
            default:
                jl.e eVar14 = jl.n.f76872a;
                jl.s b27 = jl.v.b();
                b27.f76894c = tVar;
                b27.f76892a = 3072;
                b27.f76893b = jl.v.f76905e;
                b27.f76895d = uVar;
                return b27.a();
        }
    }

    @Override // a.lb
    public i7 i(ea eaVar, me2 me2Var) {
        i22 i22Var = (i22) eaVar;
        switch (this.f50a) {
            case 4:
                return j13.a(i22Var, me2Var);
            case 13:
                return p61.a(i22Var, me2Var);
            case 20:
                return ads_mobile_sdk.r9.a(i22Var, me2Var);
            case 25:
                return rp0.a(i22Var, me2Var);
            default:
                return ads_mobile_sdk.sa.a(i22Var, me2Var);
        }
    }

    @Override // el.m0
    public el.v0 l(uk.q qVar) {
        jl.e eVar = (jl.e) qVar;
        el.l0 l0Var = kl.b.f80004a;
        il.n4 H = il.o4.H();
        H.j("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        il.k1 C = il.l1.C();
        il.o1 b13 = kl.b.b(eVar);
        C.g();
        il.l1.A((il.l1) C.f33596b, b13);
        H.k(((il.l1) C.a()).e());
        H.i(kl.b.f(eVar.f76831d));
        return el.v0.a((il.o4) H.a());
    }

    @Override // a.de
    public i22 m(i7 i7Var, me2 me2Var) {
        switch (this.f50a) {
            case 3:
                return j13.a((b13) i7Var, me2Var);
            case 12:
                return p61.a((m61) i7Var, me2Var);
            case 19:
                return ads_mobile_sdk.r9.a((ads_mobile_sdk.i9) i7Var, me2Var);
            case 24:
                return rp0.a((hp0) i7Var, me2Var);
            default:
                return ads_mobile_sdk.sa.a((ads_mobile_sdk.ma) i7Var, me2Var);
        }
    }

    @Override // el.k0
    public uk.q o(el.v0 v0Var) {
        el.l0 l0Var = kl.b.f80004a;
        il.o4 o4Var = v0Var.f59546b;
        if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: " + o4Var.F());
        }
        try {
            il.l1 D = il.l1.D(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a());
            m.h b13 = jl.e.b();
            b13.f85199d = kl.b.e(D.B().G());
            b13.f85197b = kl.b.g(D.B().F());
            b13.f85198c = kl.b.d(D.B().D());
            b13.f85200e = kl.b.h(o4Var.E());
            return b13.s();
        } catch (InvalidProtocolBufferException e13) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e13);
        }
    }

    @Override // ak2.c
    public Object apply(Object obj, Object obj2) {
        Throwable error = (Throwable) obj;
        Integer num = (Integer) obj2;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(error, "error");
        if (intValue <= this.f50a) {
            return num;
        }
        throw error;
    }
}
