package zk;

import com.google.android.gms.internal.measurement.x;
import el.n0;
import el.z;
import gi.k;
import gi.m;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;
import jl.c0;
import jl.e0;
import jl.f0;
import jl.v;
import jl.y;
import kh2.r;
import ll.n;
import ll.p;
import ll.s;
import se.l;
import uk.q;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142065a;

    @Override // el.z
    public final l a(q qVar, Integer num) {
        ECParameterSpec eCParameterSpec;
        n nVar;
        ml.a a13;
        ll.j jVar;
        switch (this.f142065a) {
            case 0:
                f fVar = (f) qVar;
                d.a(fVar);
                m mVar = new m((k) null);
                mVar.f65093b = fVar;
                mVar.f65094c = num;
                mVar.f65095d = ll.j.F(fVar.f142074a);
                return mVar.r();
            case 1:
                bl.f fVar2 = (bl.f) qVar;
                n0 n0Var = bl.a.f23396a;
                bl.b bVar = fVar2.f23421a;
                if (bVar == bl.b.f23401b) {
                    eCParameterSpec = el.f.f59479a;
                } else if (bVar == bl.b.f23402c) {
                    eCParameterSpec = el.f.f59480b;
                } else {
                    if (bVar != bl.b.f23403d) {
                        throw new GeneralSecurityException("Unsupported curve type: " + bVar);
                    }
                    eCParameterSpec = el.f.f59481c;
                }
                KeyPair F = el.a.F(eCParameterSpec);
                return bl.g.o(bl.h.o(fVar2, ((ECPublicKey) F.getPublic()).getW(), num), new ll.j(((ECPrivateKey) F.getPrivate()).getS(), 2));
            case 2:
                bl.m mVar2 = (bl.m) qVar;
                n0 n0Var2 = cl.j.f27951a;
                if (mVar2.f23449a.equals(bl.k.f23444g)) {
                    byte[] J2 = r.J();
                    jVar = new ll.j(ml.a.a(J2), 3);
                    a13 = ml.a.a(r.i1(J2));
                } else {
                    bl.k kVar = bl.k.f23441d;
                    bl.k kVar2 = mVar2.f23449a;
                    boolean equals = kVar2.equals(kVar);
                    bl.k kVar3 = bl.k.f23443f;
                    bl.k kVar4 = bl.k.f23442e;
                    if (!equals && !kVar2.equals(kVar4) && !kVar2.equals(kVar3)) {
                        throw new GeneralSecurityException("Unknown KEM ID");
                    }
                    byte[] bArr = cl.k.f27956a;
                    if (kVar2 == kVar) {
                        nVar = n.NIST_P256;
                    } else if (kVar2 == kVar4) {
                        nVar = n.NIST_P384;
                    } else {
                        if (kVar2 != kVar3) {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                        nVar = n.NIST_P521;
                    }
                    KeyPair F2 = el.a.F(el.a.I(nVar));
                    a13 = ml.a.a(el.a.s2(el.a.I(nVar).getCurve(), p.UNCOMPRESSED, ((ECPublicKey) F2.getPublic()).getW()));
                    jVar = new ll.j(ml.a.a(c0.d.Q2(cl.k.a(kVar2), ((ECPrivateKey) F2.getPrivate()).getS())), 3);
                }
                return bl.n.n(bl.p.n(mVar2, a13, num), jVar);
            case 3:
                jl.e eVar = (jl.e) qVar;
                n0 n0Var3 = jl.h.f76848a;
                KeyPair F3 = el.a.F(eVar.f76829b.f76792b);
                ECPublicKey eCPublicKey = (ECPublicKey) F3.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) F3.getPrivate();
                m mVar3 = new m((gi.l) null);
                mVar3.f65093b = eVar;
                mVar3.f65094c = num;
                mVar3.f65095d = eCPublicKey.getW();
                jl.g l13 = mVar3.l();
                x xVar = new x((a.c) null);
                xVar.f31694b = l13;
                xVar.f31695c = new ll.j(eCPrivateKey.getS(), 2);
                return xVar.l();
            case 4:
                jl.j jVar2 = (jl.j) qVar;
                n0 n0Var4 = jl.l.f76862a;
                byte[] s13 = jk.r.s(32);
                if (s13.length != 32) {
                    throw new IllegalArgumentException("Given secret seed length is not 32");
                }
                return jl.k.n(jl.m.n(jVar2.f76859a, ml.a.a(Arrays.copyOf(el.a.z2(el.a.N(s13)).H(), 32)), num), new ll.j(ml.a.a(Arrays.copyOf(s13, s13.length)), 3));
            case 5:
                v vVar = (v) qVar;
                n0 n0Var5 = y.f76921a;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) s.f83773g.a("RSA");
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(vVar.f76906a, new BigInteger(1, vVar.f76907b.toByteArray())));
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
                m mVar4 = new m((gi.g) null);
                mVar4.f65093b = vVar;
                mVar4.f65095d = rSAPublicKey.getModulus();
                mVar4.f65094c = num;
                jl.x m13 = mVar4.m();
                jf2.c cVar = new jf2.c();
                cVar.f75872a = m13;
                ll.j j13 = ll.j.j(rSAPrivateCrtKey.getPrimeP());
                ll.j j14 = ll.j.j(rSAPrivateCrtKey.getPrimeQ());
                cVar.f75874c = j13;
                cVar.f75875d = j14;
                cVar.f75873b = ll.j.j(rSAPrivateCrtKey.getPrivateExponent());
                ll.j j15 = ll.j.j(rSAPrivateCrtKey.getPrimeExponentP());
                ll.j j16 = ll.j.j(rSAPrivateCrtKey.getPrimeExponentQ());
                cVar.f75876e = j15;
                cVar.f75877f = j16;
                cVar.f75878g = ll.j.j(rSAPrivateCrtKey.getCrtCoefficient());
                return cVar.c();
            default:
                c0 c0Var = (c0) qVar;
                n0 n0Var6 = f0.f76838a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) s.f83773g.a("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(c0Var.f76810a, new BigInteger(1, c0Var.f76811b.toByteArray())));
                KeyPair generateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) generateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) generateKeyPair2.getPrivate();
                m mVar5 = new m((gi.j) null);
                mVar5.f65093b = c0Var;
                mVar5.f65095d = rSAPublicKey2.getModulus();
                mVar5.f65094c = num;
                e0 n13 = mVar5.n();
                jf2.c cVar2 = new jf2.c();
                cVar2.f75872a = n13;
                ll.j j17 = ll.j.j(rSAPrivateCrtKey2.getPrimeP());
                ll.j j18 = ll.j.j(rSAPrivateCrtKey2.getPrimeQ());
                cVar2.f75874c = j17;
                cVar2.f75875d = j18;
                cVar2.f75873b = ll.j.j(rSAPrivateCrtKey2.getPrivateExponent());
                ll.j j19 = ll.j.j(rSAPrivateCrtKey2.getPrimeExponentP());
                ll.j j23 = ll.j.j(rSAPrivateCrtKey2.getPrimeExponentQ());
                cVar2.f75876e = j19;
                cVar2.f75877f = j23;
                cVar2.f75878g = ll.j.j(rSAPrivateCrtKey2.getCrtCoefficient());
                return cVar2.d();
        }
    }
}
