package he2;

import android.content.Context;
import android.graphics.Bitmap;
import com.pinterest.api.model.iw;
import dv0.q;
import eu.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kv0.p;
import pd2.q0;
import rl2.u;

/* loaded from: classes4.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68988i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f68989j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(q qVar, int i13) {
        super(1);
        this.f68988i = i13;
        this.f68989j = qVar;
    }

    public final void b(ke2.d xrItem) {
        q0 q0Var;
        int i13 = this.f68988i;
        q qVar = this.f68989j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(xrItem, "xrItem");
                if (xrItem.f79319a.f79338f != null && qVar.r(xrItem) == null) {
                    ee2.e eVar = new ee2.e(k.a(xrItem.f79319a, (Context) qVar.f56381b), xrItem.f79320b);
                    ((List) ((p) qVar.f56383d).f80994a).add(eVar);
                    ((List) qVar.f56384e).add(new b(xrItem, eVar));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(xrItem, "xrItem");
                ee2.e r13 = qVar.r(xrItem);
                if (r13 != null) {
                    ke2.i iVar = xrItem.f79319a;
                    boolean z13 = iVar.f79337e;
                    iVar.f79337e = false;
                    if (z13) {
                        ee2.e eVar2 = new ee2.e(k.a(iVar, (Context) qVar.f56381b), xrItem.f79320b);
                        ((List) ((p) qVar.f56383d).f80994a).remove(r13);
                        ((List) ((p) qVar.f56383d).f80994a).add(eVar2);
                        ((List) qVar.f56384e).removeIf(new iw(18, new h(r13, 0)));
                        ((List) qVar.f56384e).add(new b(xrItem, eVar2));
                    }
                    ke2.b bVar = xrItem.f79320b;
                    Intrinsics.checkNotNullParameter(bVar, "<set-?>");
                    r13.f58825b = bVar;
                    ke2.i iVar2 = xrItem.f79319a;
                    float f13 = iVar2.f79339g;
                    fe2.b bVar2 = r13.f58824a;
                    bVar2.a(f13);
                    bVar2.f62088n = iVar2.b();
                    Bitmap bitmap = bVar2.f62087m;
                    bVar2.f62089o = (bitmap.getHeight() * bVar2.f62088n) / bitmap.getWidth();
                    bVar2.f62089o = iVar2.a();
                    bVar2.f62088n = (bitmap.getWidth() * bVar2.f62089o) / bitmap.getHeight();
                    ee2.e r14 = qVar.r(xrItem);
                    if (r14 != null) {
                        od2.c cVar = iVar2.f79343k;
                        boolean z14 = iVar2.f79336d;
                        iVar2.f79336d = false;
                        gd2.c cVar2 = iVar2.f79342j;
                        gd2.c cVar3 = iVar2.f79341i;
                        gd2.c cVar4 = iVar2.f79340h;
                        fe2.b bVar3 = r14.f58824a;
                        if (z14) {
                            bVar3.f58822g.clear();
                            gd2.c cVar5 = bVar3.f58821f;
                            cVar5.clear();
                            gd2.c cVar6 = bVar3.f58820e;
                            cVar6.clear();
                            u uVar = ee2.d.f58814i[0];
                            m mVar = bVar3.f58823h;
                            mVar.d(bVar3, uVar, null);
                            ArrayList arrayList = new ArrayList(g0.q(cVar2, 10));
                            Iterator it = cVar2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(k.F((od2.a) it.next(), (Context) qVar.f56381b));
                            }
                            k0.u(arrayList, bVar3.f58822g);
                            ArrayList arrayList2 = new ArrayList(g0.q(cVar3, 10));
                            Iterator it2 = cVar3.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(k.G((od2.b) it2.next(), (Context) qVar.f56381b));
                            }
                            k0.u(arrayList2, cVar5);
                            mVar.d(bVar3, ee2.d.f58814i[0], cVar != null ? k.H(cVar, (Context) qVar.f56381b) : null);
                            ArrayList arrayList3 = new ArrayList(g0.q(cVar4, 10));
                            Iterator it3 = cVar4.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(k.E((nd2.b) it3.next(), (Context) qVar.f56381b));
                            }
                            k0.u(arrayList3, cVar6);
                        }
                        Iterator it4 = cVar2.iterator();
                        int i14 = 0;
                        while (it4.hasNext()) {
                            int i15 = i14 + 1;
                            od2.a aVar = (od2.a) it4.next();
                            boolean z15 = aVar.f94188d;
                            aVar.f94188d = false;
                            if (z15) {
                                ((ud2.a) bVar3.f58822g.f64833d.get(i14)).f121933c.c(aVar.f94189e.e());
                            }
                            i14 = i15;
                        }
                        Iterator it5 = cVar3.iterator();
                        int i16 = 0;
                        while (it5.hasNext()) {
                            int i17 = i16 + 1;
                            od2.b bVar4 = (od2.b) it5.next();
                            boolean z16 = bVar4.f94188d;
                            bVar4.f94188d = false;
                            if (z16) {
                                ((ud2.b) bVar3.f58821f.f64833d.get(i16)).f121933c.c(bVar4.f94189e.e());
                            }
                            i16 = i17;
                        }
                        if (cVar != null) {
                            boolean z17 = cVar.f94188d;
                            cVar.f94188d = false;
                            if (z17) {
                                bVar3.getClass();
                                ud2.c cVar7 = (ud2.c) bVar3.f58823h.c(bVar3, ee2.d.f58814i[0]);
                                if (cVar7 != null && (q0Var = cVar7.f121933c) != null) {
                                    q0Var.c(cVar.f94189e.e());
                                }
                            }
                        }
                        Iterator it6 = cVar4.iterator();
                        int i18 = 0;
                        while (it6.hasNext()) {
                            int i19 = i18 + 1;
                            nd2.b bVar5 = (nd2.b) it6.next();
                            boolean z18 = bVar5.f90430e;
                            bVar5.f90430e = false;
                            if (z18) {
                                ((td2.a) bVar3.f58820e.f64833d.get(i18)).f117474c.c(bVar5.f90431f.e());
                            }
                            i18 = i19;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f68988i) {
            case 0:
                b((ke2.d) obj);
                break;
            default:
                b((ke2.d) obj);
                break;
        }
        return Unit.f80348a;
    }
}
