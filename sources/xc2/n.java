package xc2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final n f134562j = new n(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n f134563k = new n(1);

    /* renamed from: l, reason: collision with root package name */
    public static final n f134564l = new n(2);

    /* renamed from: m, reason: collision with root package name */
    public static final n f134565m = new n(3);

    /* renamed from: n, reason: collision with root package name */
    public static final n f134566n = new n(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134567i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13) {
        super(1);
        this.f134567i = i13;
    }

    public final List b(pc.h response) {
        p50.b bVar;
        p50.c cVar;
        p50.g gVar;
        List list;
        j jVar;
        p50.e eVar;
        p50.e eVar2;
        p50.m mVar;
        List list2;
        j jVar2;
        ArrayList arrayList = null;
        switch (this.f134567i) {
            case 0:
                Intrinsics.checkNotNullParameter(response, "response");
                p50.j jVar3 = (p50.j) response.f99563c;
                if (jVar3 != null && (bVar = jVar3.f98869a) != null) {
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    p50.i iVar = bVar instanceof p50.i ? (p50.i) bVar : null;
                    if (iVar != null && (cVar = iVar.f98868b) != null) {
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        p50.h hVar = cVar instanceof p50.h ? (p50.h) cVar : null;
                        if (hVar != null && (gVar = hVar.f98866b) != null && (list = gVar.f98864a) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : list) {
                                p50.f fVar = (p50.f) obj;
                                if (((fVar == null || (eVar2 = fVar.f98863a) == null) ? null : eVar2.f98862b) != null) {
                                    arrayList2.add(obj);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                p50.f fVar2 = (p50.f) it.next();
                                if (fVar2 == null || (eVar = fVar2.f98863a) == null) {
                                    jVar = null;
                                } else {
                                    String str = eVar.f98862b;
                                    Intrinsics.f(str);
                                    jVar = new j(eVar.f98861a, str);
                                }
                                if (jVar != null) {
                                    arrayList3.add(jVar);
                                }
                            }
                            arrayList = arrayList3;
                        }
                    }
                }
                if (arrayList == null) {
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(response, "response");
                p50.p pVar = (p50.p) response.f99563c;
                if (pVar != null && (mVar = pVar.f98879a) != null) {
                    Intrinsics.checkNotNullParameter(mVar, "<this>");
                    p50.o oVar = mVar instanceof p50.o ? (p50.o) mVar : null;
                    if (oVar != null && (list2 = oVar.f98878b) != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : list2) {
                            p50.n nVar = (p50.n) obj2;
                            if ((nVar != null ? nVar.f98876b : null) != null) {
                                arrayList4.add(obj2);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            p50.n nVar2 = (p50.n) it2.next();
                            if (nVar2 != null) {
                                String str2 = nVar2.f98876b;
                                Intrinsics.f(str2);
                                jVar2 = new j(nVar2.f98875a, str2);
                            } else {
                                jVar2 = null;
                            }
                            if (jVar2 != null) {
                                arrayList5.add(jVar2);
                            }
                        }
                        arrayList = arrayList5;
                    }
                }
                if (arrayList == null) {
                    break;
                }
                break;
        }
        return q0.f80391a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134567i) {
            case 0:
                return b((pc.h) obj);
            case 1:
                return b((pc.h) obj);
            case 2:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.f134572a;
            case 3:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return uj2.q.y(new r(throwable.getMessage(), "BOARD"));
            default:
                return Unit.f80348a;
        }
    }
}
