package yl2;

import am2.a1;
import am2.c1;
import am2.d0;
import am2.z0;
import dm2.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.i1;
import pn2.u0;
import xl2.r;

/* loaded from: classes4.dex */
public final class b extends pn2.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f139362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar.f139365e);
        this.f139362c = cVar;
    }

    @Override // pn2.b, pn2.b1
    public final am2.j b() {
        return this.f139362c;
    }

    @Override // pn2.b1
    public final boolean d() {
        return true;
    }

    @Override // pn2.l
    public final Collection e() {
        List j13;
        c cVar = this.f139362c;
        l lVar = cVar.f139367g;
        h hVar = h.f139372c;
        if (Intrinsics.d(lVar, hVar)) {
            j13 = e0.b(c.f139363l);
        } else if (Intrinsics.d(lVar, i.f139373c)) {
            j13 = f0.j(c.f139364m, new ym2.b(r.f135332l, hVar.a(cVar.f139368h)));
        } else {
            k kVar = k.f139375c;
            if (Intrinsics.d(lVar, kVar)) {
                j13 = e0.b(c.f139363l);
            } else {
                if (!Intrinsics.d(lVar, j.f139374c)) {
                    int i13 = xn2.a.f135458a;
                    Intrinsics.checkNotNullParameter("should not be called", "message");
                    throw new IllegalStateException("should not be called".toString());
                }
                j13 = f0.j(c.f139364m, new ym2.b(r.f135326f, kVar.a(cVar.f139368h)));
            }
        }
        d0 g13 = ((k0) cVar.f139366f).g();
        List<ym2.b> list = j13;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (ym2.b bVar : list) {
            am2.g c03 = l0.c0(g13, bVar);
            if (c03 == null) {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            List z03 = CollectionsKt.z0(c03.e().getParameters().size(), cVar.f139371k);
            ArrayList arrayList2 = new ArrayList(g0.q(z03, 10));
            Iterator it = z03.iterator();
            while (it.hasNext()) {
                arrayList2.add(new i1(((c1) it.next()).j()));
            }
            u0.f100848b.getClass();
            arrayList.add(pn2.g.p(u0.f100849c, c03, arrayList2));
        }
        return CollectionsKt.F0(arrayList);
    }

    @Override // pn2.b1
    public final List getParameters() {
        return this.f139362c.f139371k;
    }

    @Override // pn2.l
    public final a1 j() {
        return z0.f15606a;
    }

    @Override // pn2.b
    /* renamed from: q */
    public final am2.g b() {
        return this.f139362c;
    }

    public final String toString() {
        return this.f139362c.toString();
    }
}
