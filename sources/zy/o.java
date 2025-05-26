package zy;

import h32.d4;
import h32.f1;
import h32.h2;
import h32.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import nx.e1;

/* loaded from: classes3.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f143098r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ nu.b f143099s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(y yVar, nu.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f143098r = yVar;
        this.f143099s = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f143098r, this.f143099s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        boolean z13;
        String str;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        y yVar = this.f143098r;
        boolean z14 = yVar instanceof v;
        nu.b bVar = this.f143099s;
        if (z14) {
            v vVar = (v) yVar;
            bVar.getClass();
            boolean z15 = vVar instanceof q;
            Object obj2 = bVar.f92308c;
            if (z15) {
                q qVar = (q) vVar;
                h32.i0 pinalyticsContext = qVar.f143108b;
                d1 trackingParamAttacher = (d1) bVar.f92309d;
                ((nx.o0) obj2).getClass();
                Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
                List pinImpressions = qVar.f143107a;
                Intrinsics.checkNotNullParameter(pinImpressions, "pinImpressions");
                Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                Iterator it = pinImpressions.iterator();
                while (true) {
                    z13 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    nx.c0 c0Var = (nx.c0) it.next();
                    nx.c cVar = c0Var.f92384b;
                    if (concurrentHashMap.get(cVar) == null) {
                        concurrentHashMap.put(cVar, new ArrayList());
                    }
                    List list = (List) concurrentHashMap.get(cVar);
                    if (list != null) {
                        z1 source = c0Var.f92383a;
                        String str2 = source.f67482c;
                        if (str2 != null && str2.length() != 0 && ((str = source.f67477J) == null || kotlin.text.z.j(str) || kotlin.text.z.h(str, "~0", false))) {
                            String pinId = source.f67482c;
                            Intrinsics.f(pinId);
                            trackingParamAttacher.getClass();
                            Intrinsics.checkNotNullParameter(pinId, "pinId");
                            Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
                            Intrinsics.checkNotNullParameter(pinId, "pinId");
                            Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
                            d4 d4Var = pinalyticsContext.f67081a;
                            e1 e1Var = d4Var != null ? new e1(pinalyticsContext.f67082b, d4Var, pinId, qVar.f143109c) : null;
                            String f13 = e1Var != null ? trackingParamAttacher.f(e1Var) : null;
                            if (f13 != null && f13.length() != 0) {
                                Intrinsics.checkNotNullParameter(source, "source");
                                c0Var = new nx.c0(new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, f13, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0), c0Var.f92384b);
                            }
                        }
                        list.add(c0Var.f92383a);
                    }
                }
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    nx.c cVar2 = (nx.c) entry.getKey();
                    List<z1> list2 = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
                    for (z1 source2 : list2) {
                        if (Intrinsics.d(source2.f67510u, Boolean.TRUE)) {
                            z13 = true;
                        }
                        Intrinsics.checkNotNullParameter(source2, "source");
                        h2 h2Var = cVar2.f92382d;
                        if (h2Var == null) {
                            h2Var = source2.f67496j;
                        }
                        arrayList.add(new z1(source2.f67478a, source2.f67480b, source2.f67482c, source2.f67484d, source2.f67486e, source2.f67488f, source2.f67490g, source2.f67492h, source2.f67494i, h2Var, source2.f67498k, source2.f67500l, source2.f67502m, source2.f67503n, source2.f67504o, source2.f67505p, source2.f67506q, source2.f67507r, source2.f67508s, source2.f67509t, source2.f67510u, source2.f67511v, source2.f67512w, source2.f67513x, source2.f67514y, source2.f67515z, source2.A, source2.B, source2.C, source2.D, source2.E, source2.F, source2.G, source2.H, source2.I, source2.f67477J, source2.K, source2.L, source2.M, source2.N, source2.O, source2.P, source2.Q, source2.R, source2.S, source2.T, source2.U, source2.V, source2.W, source2.X, source2.Y, source2.Z, source2.f67479a0, source2.f67481b0, source2.f67483c0, source2.f67485d0, source2.f67487e0, source2.f67489f0, source2.f67491g0, source2.f67493h0, source2.f67495i0, source2.f67497j0, source2.f67499k0, source2.f67501l0));
                    }
                    ArrayList H0 = CollectionsKt.H0(arrayList);
                    h32.g0 g0Var = cVar2.f92379a;
                    h32.i0 i0Var = qVar.f143108b;
                    if (g0Var == null) {
                        g0Var = i0Var.f67084d;
                    }
                    nx.q qVar2 = cVar2.f92380b;
                    HashMap b13 = qVar2 != null ? qVar2.b() : new HashMap();
                    if (z13) {
                        b13.put("debug_code_path", "5");
                    }
                    ((rd.j) bVar.f92307b).o(new n(com.bumptech.glide.d.z0(i0Var, new wt.c(g0Var, 20)), new nx.s(H0), f1.PIN_IMPRESSION_ONE_PIXEL, null, b13, 32));
                }
            } else if (vVar instanceof s) {
                nx.o0 o0Var = (nx.o0) obj2;
                List impressions = ((s) vVar).f143116a;
                o0Var.getClass();
                Intrinsics.checkNotNullParameter(impressions, "impressions");
                Iterator it2 = impressions.iterator();
                while (it2.hasNext()) {
                    o0Var.h(((nx.c0) it2.next()).f92383a);
                }
            } else if (vVar instanceof r) {
                nx.o0 o0Var2 = (nx.o0) obj2;
                z1 pinImpression = ((r) vVar).f143115a;
                o0Var2.getClass();
                Intrinsics.checkNotNullParameter(pinImpression, "pinImpression");
                o0Var2.h(pinImpression);
            } else if (vVar instanceof u) {
                nx.o0 o0Var3 = (nx.o0) obj2;
                List impressions2 = ((u) vVar).f143118a;
                o0Var3.getClass();
                Intrinsics.checkNotNullParameter(impressions2, "impressions");
                Iterator it3 = impressions2.iterator();
                while (it3.hasNext()) {
                    o0Var3.a((z1) it3.next());
                }
            } else if (vVar instanceof t) {
                nx.o0 o0Var4 = (nx.o0) obj2;
                z1 pinImpression2 = ((t) vVar).f143117a;
                o0Var4.getClass();
                Intrinsics.checkNotNullParameter(pinImpression2, "pinImpression");
                o0Var4.a(pinImpression2);
            }
        } else if (yVar instanceof p) {
            p pVar = (p) yVar;
            bVar.getClass();
            if (pVar instanceof p) {
                ((rd.j) bVar.f92307b).o(pVar.f143104a);
            }
        } else if (yVar instanceof x) {
            x xVar = (x) yVar;
            bVar.getClass();
            if (xVar instanceof x) {
                ((rd.j) bVar.f92307b).o(xVar.f143120a);
            }
        } else if (yVar instanceof w) {
            w wVar = (w) yVar;
            bVar.getClass();
            if (wVar instanceof w) {
                ((rd.j) bVar.f92307b).o(wVar.f143119a);
            }
        }
        return Unit.f80348a;
    }
}
