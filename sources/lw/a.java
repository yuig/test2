package lw;

import ao2.j0;
import com.pinterest.api.model.bt0;
import com.pinterest.api.model.ft0;
import com.pinterest.api.model.jt0;
import com.pinterest.api.model.nt0;
import com.pinterest.api.model.rt0;
import com.pinterest.api.model.xs0;
import dl2.j;
import ew.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes3.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public c f85031r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f85032s;

    /* renamed from: t, reason: collision with root package name */
    public int f85033t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f85034u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f85035v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f85036w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, long j13, boolean z13, bl2.c cVar2) {
        super(2, cVar2);
        this.f85034u = cVar;
        this.f85035v = j13;
        this.f85036w = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f85034u, this.f85035v, this.f85036w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object a13;
        long j13;
        cl2.a aVar;
        long j14;
        boolean z13;
        jt0 v13;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j15;
        cl2.a aVar2;
        Iterator it;
        nt0 w13;
        List h10;
        nt0 w14;
        List g13;
        nt0 w15;
        List f13;
        jt0 v14;
        rt0 x13;
        cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85033t;
        c cVar = this.f85034u;
        if (i13 == 0) {
            ue.c.H(obj);
            ix.d dVar = cVar.f85049d;
            this.f85033t = 1;
            a13 = dVar.a(this);
            if (a13 == aVar3) {
                return aVar3;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z13 = this.f85032s;
                cVar = this.f85031r;
                ue.c.H(obj);
                cVar.b(z13);
                return Unit.f80348a;
            }
            ue.c.H(obj);
            a13 = obj;
        }
        xs0 config = (xs0) a13;
        if (config != null) {
            if (config.f() != null) {
                cVar.f85054i = r4.u().intValue() * 1000;
            }
            iw.a aVar4 = cVar.f85052g;
            long j16 = cVar.f85054i;
            Iterator it2 = aVar4.f73738b.entrySet().iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                j13 = this.f85035v;
                if (!hasNext) {
                    break;
                }
                Iterator it3 = ((ConcurrentLinkedQueue) ((Map.Entry) it2.next()).getValue()).iterator();
                while (it3.hasNext()) {
                    j16 = Math.min(((iw.b) it3.next()).f73747b - j13, j16);
                }
            }
            cVar.f85057l = j16;
            iw.a aVar5 = cVar.f85052g;
            aVar5.getClass();
            Intrinsics.checkNotNullParameter(config, "config");
            aVar5.f73739c.clear();
            ConcurrentHashMap concurrentHashMap = aVar5.f73742f;
            concurrentHashMap.clear();
            ConcurrentHashMap concurrentHashMap2 = aVar5.f73743g;
            concurrentHashMap2.clear();
            bt0 f14 = config.f();
            int intValue = (f14 != null ? f14.t() : 1).intValue();
            bt0 f15 = config.f();
            if (f15 != null && (x13 = f15.x()) != null) {
                n nVar = n.HOME;
                Integer f16 = x13.f();
                Intrinsics.checkNotNullExpressionValue(f16, "getHomefeed(...)");
                concurrentHashMap.put(nVar, f16);
                n nVar2 = n.RELATED;
                Integer g14 = x13.g();
                Intrinsics.checkNotNullExpressionValue(g14, "getRelatedPins(...)");
                concurrentHashMap.put(nVar2, g14);
                n nVar3 = n.SEARCH;
                Integer h13 = x13.h();
                Intrinsics.checkNotNullExpressionValue(h13, "getSearch(...)");
                concurrentHashMap.put(nVar3, h13);
            }
            bt0 f17 = config.f();
            if (f17 != null && (v14 = f17.v()) != null) {
                n nVar4 = n.HOME;
                List f18 = v14.f();
                concurrentHashMap2.put(nVar4, Integer.valueOf(f18 != null ? f18.size() : 0));
                n nVar5 = n.RELATED;
                List g15 = v14.g();
                concurrentHashMap2.put(nVar5, Integer.valueOf(g15 != null ? g15.size() : 0));
                n nVar6 = n.SEARCH;
                List h14 = v14.h();
                concurrentHashMap2.put(nVar6, Integer.valueOf(h14 != null ? h14.size() : 0));
            }
            bt0 f19 = config.f();
            if (f19 != null && (w15 = f19.w()) != null && (f13 = w15.f()) != null) {
                aVar5.a(intValue, f13);
                aVar5.b(n.HOME, f13);
            }
            bt0 f23 = config.f();
            if (f23 != null && (w14 = f23.w()) != null && (g13 = w14.g()) != null) {
                aVar5.a(intValue, g13);
                aVar5.b(n.RELATED, g13);
            }
            bt0 f24 = config.f();
            if (f24 != null && (w13 = f24.w()) != null && (h10 = w13.h()) != null) {
                aVar5.a(intValue, h10);
                aVar5.b(n.SEARCH, h10);
            }
            bt0 f25 = config.f();
            if (f25 == null || (v13 = f25.v()) == null) {
                aVar = aVar3;
                j14 = j13;
            } else {
                List f26 = v13.f();
                if (f26 != null) {
                    arrayList = new ArrayList();
                    Iterator it4 = f26.iterator();
                    while (it4.hasNext()) {
                        String i14 = ((ft0) it4.next()).i();
                        if (i14 != null) {
                            arrayList.add(i14);
                        }
                    }
                } else {
                    arrayList = null;
                }
                List f27 = v13.f();
                ConcurrentHashMap concurrentHashMap3 = aVar5.f73744h;
                ConcurrentHashMap concurrentHashMap4 = aVar5.f73741e;
                if (f27 != null) {
                    Iterator it5 = f27.iterator();
                    while (it5.hasNext()) {
                        ft0 ft0Var = (ft0) it5.next();
                        String i15 = ft0Var.i();
                        if (i15 != null) {
                            it = it5;
                            aVar2 = aVar3;
                            concurrentHashMap3.put(i15, Long.valueOf(ft0Var.m().intValue()));
                        } else {
                            aVar2 = aVar3;
                            it = it5;
                        }
                        ArrayList arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                        Integer l13 = ft0Var.l();
                        Intrinsics.checkNotNullExpressionValue(l13, "getQiCacheSize(...)");
                        aVar5.a(l13.intValue(), arrayList4);
                        n surface = n.HOME;
                        Intrinsics.checkNotNullParameter(surface, "surface");
                        if (arrayList != null) {
                            concurrentHashMap4.put(surface.name(), arrayList);
                        }
                        aVar3 = aVar2;
                        it5 = it;
                    }
                }
                aVar = aVar3;
                List g16 = v13.g();
                if (g16 != null) {
                    arrayList2 = new ArrayList();
                    Iterator it6 = g16.iterator();
                    while (it6.hasNext()) {
                        String i16 = ((ft0) it6.next()).i();
                        if (i16 != null) {
                            arrayList2.add(i16);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                List<ft0> g17 = v13.g();
                if (g17 != null) {
                    for (ft0 ft0Var2 : g17) {
                        String i17 = ft0Var2.i();
                        if (i17 != null) {
                            j15 = j13;
                            concurrentHashMap3.put(i17, Long.valueOf(ft0Var2.m().intValue()));
                        } else {
                            j15 = j13;
                        }
                        Integer l14 = ft0Var2.l();
                        Intrinsics.checkNotNullExpressionValue(l14, "getQiCacheSize(...)");
                        aVar5.a(l14.intValue(), arrayList2);
                        n surface2 = n.RELATED;
                        Intrinsics.checkNotNullParameter(surface2, "surface");
                        if (arrayList2 != null) {
                            concurrentHashMap4.put(surface2.name(), arrayList2);
                        }
                        j13 = j15;
                    }
                }
                j14 = j13;
                List h15 = v13.h();
                if (h15 != null) {
                    arrayList3 = new ArrayList();
                    Iterator it7 = h15.iterator();
                    while (it7.hasNext()) {
                        String i18 = ((ft0) it7.next()).i();
                        if (i18 != null) {
                            arrayList3.add(i18);
                        }
                    }
                } else {
                    arrayList3 = null;
                }
                List<ft0> h16 = v13.h();
                if (h16 != null) {
                    for (ft0 ft0Var3 : h16) {
                        String i19 = ft0Var3.i();
                        if (i19 != null) {
                            concurrentHashMap3.put(i19, Long.valueOf(ft0Var3.m().intValue()));
                        }
                        Integer l15 = ft0Var3.l();
                        Intrinsics.checkNotNullExpressionValue(l15, "getQiCacheSize(...)");
                        aVar5.a(l15.intValue(), arrayList3);
                        n surface3 = n.SEARCH;
                        Intrinsics.checkNotNullParameter(surface3, "surface");
                        if (arrayList3 != null) {
                            concurrentHashMap4.put(surface3.name(), arrayList3);
                        }
                    }
                }
            }
            ew.c cVar2 = (ew.c) cVar.f85051f;
            cVar2.getClass();
            Intrinsics.checkNotNullParameter(config, "config");
            cVar2.f60288e = config;
            bt0 f28 = config.f();
            if (f28 != null) {
                nt0 w16 = f28.w();
                if (w16 != null) {
                    List<String> f29 = w16.f();
                    if (f29 != null) {
                        for (String str : f29) {
                            Intrinsics.f(str);
                            cVar.c(str, j14, null, null, 0);
                        }
                    }
                    List<String> g18 = w16.g();
                    if (g18 != null) {
                        for (String str2 : g18) {
                            Intrinsics.f(str2);
                            cVar.c(str2, j14, null, null, 0);
                        }
                    }
                    List<String> h17 = w16.h();
                    if (h17 != null) {
                        for (String str3 : h17) {
                            Intrinsics.f(str3);
                            cVar.c(str3, j14, null, null, 0);
                        }
                    }
                }
                jt0 v15 = f28.v();
                if (v15 != null) {
                    List<ft0> f33 = v15.f();
                    if (f33 != null) {
                        for (ft0 ft0Var4 : f33) {
                            String i23 = ft0Var4.i();
                            if (i23 != null) {
                                cVar.c(i23, j14, ft0Var4.j(), ft0Var4.m(), u2.o(ft0Var4));
                            }
                        }
                    }
                    List<ft0> g19 = v15.g();
                    if (g19 != null) {
                        for (ft0 ft0Var5 : g19) {
                            String i24 = ft0Var5.i();
                            if (i24 != null) {
                                cVar.c(i24, j14, ft0Var5.j(), ft0Var5.m(), u2.o(ft0Var5));
                            }
                        }
                    }
                    List<ft0> h18 = v15.h();
                    if (h18 != null) {
                        for (ft0 ft0Var6 : h18) {
                            String i25 = ft0Var6.i();
                            if (i25 != null) {
                                cVar.c(i25, j14, ft0Var6.j(), ft0Var6.m(), u2.o(ft0Var6));
                            }
                        }
                    }
                }
            }
            z13 = this.f85036w;
            if (z13) {
                if (cVar.f85057l < 0) {
                    cVar.f85057l = cVar.f85054i;
                }
                long j17 = cVar.f85057l;
                this.f85031r = cVar;
                this.f85032s = z13;
                this.f85033t = 2;
                cl2.a aVar6 = aVar;
                if (l0.S(j17, this) == aVar6) {
                    return aVar6;
                }
                cVar.b(z13);
            }
        }
        return Unit.f80348a;
    }
}
