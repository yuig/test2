package vk;

import el.c1;
import il.g4;
import il.j4;
import il.n4;
import il.o4;
import il.o5;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements el.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125954a;

    @Override // el.z
    public final se.l a(uk.q qVar, Integer num) {
        gi.h hVar = null;
        byte b13 = 0;
        byte b14 = 0;
        byte b15 = 0;
        switch (this.f125954a) {
            case 0:
                l lVar = (l) qVar;
                int i13 = lVar.f125984a;
                if (i13 != 16 && i13 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                m.h hVar2 = new m.h();
                hVar2.f85197b = lVar;
                hVar2.f85200e = num;
                hVar2.f85198c = ll.j.F(lVar.f125984a);
                hVar2.f85199d = ll.j.F(lVar.f125985b);
                return hVar2.t();
            case 1:
                p pVar = (p) qVar;
                el.n0 n0Var = n.f126001a;
                int i14 = pVar.f126013a;
                if (i14 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                gi.m mVar = new gi.m();
                mVar.f65093b = pVar;
                mVar.f65094c = num;
                mVar.f65095d = ll.j.F(i14);
                return mVar.o();
            case 2:
                t tVar = (t) qVar;
                el.n0 n0Var2 = r.f126028a;
                int i15 = tVar.f126043a;
                if (i15 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                gi.m mVar2 = new gi.m((Object) (b13 == true ? 1 : 0));
                mVar2.f65093b = tVar;
                mVar2.f65094c = num;
                mVar2.f65095d = ll.j.F(i15);
                return mVar2.p();
            case 3:
                x xVar = (x) qVar;
                el.n0 n0Var3 = v.f126059a;
                gi.m mVar3 = new gi.m((d7.g) (b14 == true ? 1 : 0));
                mVar3.f65093b = xVar;
                mVar3.f65094c = num;
                mVar3.f65095d = ll.j.F(xVar.f126068a);
                return mVar3.q();
            case 4:
                el.n0 n0Var4 = z.f126074a;
                return y.j(((b0) qVar).f125930a, ll.j.F(32), num);
            case 5:
                el.n0 n0Var5 = c0.f125931a;
                return e0.j((g0) qVar, num);
            case 6:
                el.q qVar2 = d0.f125937a;
                return j0.j((m0) qVar, num);
            case 7:
                el.n0 n0Var6 = t0.f126047a;
                return s0.j(((v0) qVar).f126063a, ll.j.F(32), num);
            case 8:
                el.a0 a0Var = el.a0.f59451b;
                o4 o4Var = ((el.u) qVar).f59536a.f59546b;
                el.k kVar = el.k.f59500d;
                uk.h a13 = kVar.a(o4Var.F());
                if (!((Boolean) kVar.f59502b.get(o4Var.F())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                com.google.crypto.tink.shaded.protobuf.k G = o4Var.G();
                el.q qVar3 = (el.q) a13;
                qVar3.getClass();
                n4 H = o4.H();
                H.j(qVar3.f59517a);
                H.k(G);
                H.i(o5.RAW);
                o4 o4Var2 = (o4) H.a();
                el.v0 v0Var = new el.v0(o4Var2, c1.a(o4Var2.F()));
                el.h0 h0Var = el.h0.f59491b;
                el.u0 u0Var = (el.u0) h0Var.g(el.a0.f59451b.b(h0Var.b(v0Var), null));
                g4 H2 = j4.H();
                H2.j(u0Var.f59537a);
                H2.k(u0Var.f59539c);
                H2.i(u0Var.f59540d);
                j4 j4Var = (j4) H2.a();
                return new el.s(el.u0.a(j4Var.F(), j4Var.G(), j4Var.E(), o4Var.E(), num));
            case 9:
                fl.d dVar = (fl.d) qVar;
                h hVar3 = fl.b.f62500a;
                int i16 = dVar.f62509a;
                if (i16 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                gi.m mVar4 = new gi.m((gi.i) (b15 == true ? 1 : 0));
                mVar4.f65093b = dVar;
                mVar4.f65095d = ll.j.F(i16);
                mVar4.f65094c = num;
                return mVar4.h();
            default:
                fl.l lVar2 = (fl.l) qVar;
                el.n0 n0Var7 = fl.i.f62517a;
                gi.m mVar5 = new gi.m(hVar);
                mVar5.f65093b = lVar2;
                mVar5.f65095d = ll.j.F(lVar2.f62534a);
                mVar5.f65094c = num;
                return mVar5.k();
        }
    }
}
