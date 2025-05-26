package k1;

import android.content.res.Configuration;
import android.os.CancellationSignal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.pinterest.error.NetworkError;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.error.ServerError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.x3;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import okhttp3.Call;

/* loaded from: classes.dex */
public final class s2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78006i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f78007j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(Object obj, int i13) {
        super(1);
        this.f78006i = i13;
        this.f78007j = obj;
    }

    public final void b(d3.h hVar) {
        int i13 = this.f78006i;
        Object obj = this.f78007j;
        switch (i13) {
            case 10:
                e3.d dVar = (e3.d) obj;
                b3.o0 o0Var = dVar.f57015l;
                if (!dVar.f57017n || !dVar.f57025v || o0Var == null) {
                    dVar.f57007d.invoke(hVar);
                    return;
                }
                Function1 function1 = dVar.f57007d;
                d3.b p03 = hVar.p0();
                long e13 = p03.e();
                p03.a().j();
                try {
                    p03.f53648a.a(o0Var, 1);
                    function1.invoke(hVar);
                    return;
                } finally {
                    ep.b.z(p03, e13);
                }
            default:
                b3.u a13 = hVar.p0().a();
                Function2 function2 = ((t3.p2) obj).f116142d;
                if (function2 != null) {
                    function2.invoke(a13, hVar.p0().f53649b);
                    return;
                }
                return;
        }
    }

    public final void e(Object obj) {
        switch (this.f78006i) {
            case 5:
                ((i2.z) ((i2.i0) this.f78007j)).c(obj);
                return;
            case 6:
                if (obj instanceof s2.a0) {
                    ((s2.a0) obj).g(4);
                }
                ((g1.g0) this.f78007j).d(obj);
                return;
            case 7:
            default:
                if (t3.o2.f116109b.compareAndSet(false, true)) {
                    ((co2.q) this.f78007j).g(Unit.f80348a);
                    return;
                }
                return;
            case 8:
                s2.w wVar = (s2.w) this.f78007j;
                if (wVar.f110704h) {
                    return;
                }
                synchronized (wVar.f110702f) {
                    s2.v vVar = wVar.f110705i;
                    Intrinsics.f(vVar);
                    Object obj2 = vVar.f110686b;
                    Intrinsics.f(obj2);
                    int i13 = vVar.f110688d;
                    g1.z zVar = vVar.f110687c;
                    if (zVar == null) {
                        zVar = new g1.z();
                        vVar.f110687c = zVar;
                        vVar.f110690f.l(obj2, zVar);
                        Unit unit = Unit.f80348a;
                    }
                    vVar.c(obj, i13, obj2, zVar);
                    Unit unit2 = Unit.f80348a;
                }
                return;
        }
    }

    public final void f(Throwable throwable) {
        v.f1 f1Var;
        qz.d M;
        qz.d M2;
        switch (this.f78006i) {
            case 4:
                CancellationException c13 = kh2.u2.c("Recomposer effect job completed", throwable);
                i2.o2 o2Var = (i2.o2) this.f78007j;
                synchronized (o2Var.f71209b) {
                    try {
                        ao2.o1 o1Var = o2Var.f71210c;
                        if (o1Var != null) {
                            o2Var.f71225r.i(i2.h2.ShuttingDown);
                            o1Var.cancel(c13);
                            o2Var.f71222o = null;
                            o1Var.invokeOnCompletion(new j1.x0(19, o2Var, throwable));
                        } else {
                            o2Var.f71211d = c13;
                            o2Var.f71225r.i(i2.h2.ShutDown);
                            Unit unit = Unit.f80348a;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 21:
                ((CancellationSignal) this.f78007j).cancel();
                return;
            case 22:
                if (throwable != null) {
                    ((a6.j0) this.f78007j).f861g.i(new a6.j(throwable));
                }
                Object obj = a6.j0.f854k;
                a6.j0 j0Var = (a6.j0) this.f78007j;
                synchronized (obj) {
                    a6.j0.f853j.remove(j0Var.d().getAbsolutePath());
                    Unit unit2 = Unit.f80348a;
                }
                return;
            case 24:
                ((Call) this.f78007j).cancel();
                return;
            case 26:
                nx.s0 s0Var = (nx.s0) this.f78007j;
                ox.b analyticsApi = (ox.b) s0Var.f92460e.getValue();
                Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
                synchronized (s0Var.f92458c) {
                    try {
                        int i13 = 0;
                        if (throwable instanceof NetworkError) {
                            if (((NetworkError) throwable).f45043a != null) {
                                f1Var = ((NetworkError) throwable).f45043a;
                                if (f1Var != null && (M2 = k3.M(f1Var)) != null) {
                                    i13 = M2.f105387g;
                                }
                            } else {
                                f1Var = null;
                            }
                            s0Var.f92463h.size();
                        } else if (throwable instanceof ServerError) {
                            if (((ServerError) throwable).f45043a != null) {
                                f1Var = ((ServerError) throwable).f45043a;
                                if (f1Var != null && (M = k3.M(f1Var)) != null) {
                                    i13 = M.f105387g;
                                }
                            } else {
                                f1Var = null;
                            }
                            s0Var.f92463h.size();
                        } else {
                            if (throwable != null) {
                                throwable.getLocalizedMessage();
                            }
                            f1Var = null;
                        }
                        s0Var.h(f1Var, i13, analyticsApi, throwable != null ? throwable.getClass().getSimpleName() : null);
                        s0Var.g();
                        Unit unit3 = Unit.f80348a;
                    } finally {
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                ((tx.d) this.f78007j).getClass();
                v.f1 f1Var2 = throwable instanceof NetworkResponseError ? ((NetworkResponseError) throwable).f45043a : null;
                if (f1Var2 != null) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.h hVar = tb0.g.f117075a;
                    tb0.k kVar = new tb0.k();
                    kVar.c("DAU-Error", String.valueOf(f1Var2.f123449b));
                    hVar.k("DAU-Ping", kVar.f117102a);
                } else if (rl2.g0.Y(throwable)) {
                    HashSet hashSet2 = tb0.h.f117076w;
                    tb0.h hVar2 = tb0.g.f117075a;
                    tb0.k kVar2 = new tb0.k();
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    kVar2.a(null, null, throwable);
                    hVar2.k("DAU-Ping", kVar2.f117102a);
                }
                throwable.getLocalizedMessage();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = 2;
        switch (this.f78006i) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                t2 t2Var = (t2) this.f78007j;
                float h10 = t2Var.f78027a.h() + floatValue + t2Var.f78031e;
                float f13 = ql2.s.f(h10, 0.0f, t2Var.f78030d.h());
                boolean z13 = !(h10 == f13);
                float h13 = f13 - t2Var.f78027a.h();
                int round = Math.round(h13);
                t2Var.f78027a.i(t2Var.f78027a.h() + round);
                t2Var.f78031e = h13 - round;
                if (z13) {
                    floatValue = h13;
                }
                return Float.valueOf(floatValue);
            case 1:
            case 11:
            default:
                u00.k kVar = (u00.k) this.f78007j;
                kVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                synchronized (kVar) {
                    try {
                        for (Map.Entry entry : kVar.f119856j.entrySet()) {
                            linkedHashMap.put((u00.d) entry.getKey(), CollectionsKt.F0((List) entry.getValue()));
                        }
                        Iterator it = kVar.f119856j.values().iterator();
                        while (it.hasNext()) {
                            ((List) it.next()).clear();
                        }
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    u00.d dVar = (u00.d) entry2.getKey();
                    List<dl1.s> list = (List) entry2.getValue();
                    if (!(dVar instanceof u00.d)) {
                        dVar = null;
                    }
                    if (dVar != null) {
                        for (dl1.s sVar : list) {
                            Function1 function1 = dVar.f119830d;
                            String o13 = sVar.o();
                            if (o13 == null) {
                                o13 = "";
                            }
                            for (Map.Entry entry3 : lb.l0.N0((pc.u0) function1.invoke(o13), (pc.t0) dVar.f119829c.i(sVar), kVar.f119850d, kVar.f119848b).entrySet()) {
                                Object key = entry3.getKey();
                                String str = ((wc.m) entry3.getValue()).f129093a;
                                Map map = ((wc.m) entry3.getValue()).f129094b;
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                for (Map.Entry entry4 : map.entrySet()) {
                                    if (entry4.getValue() != null) {
                                        linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                                    }
                                }
                                linkedHashMap2.put(key, new wc.m(str, linkedHashMap3, null));
                            }
                        }
                    }
                }
                kotlin.jvm.internal.j.z(kVar.f119852f, kVar.f119851e, null, new u00.i(kVar, linkedHashMap2, null), 2);
                u00.k kVar2 = (u00.k) this.f78007j;
                kVar2.getClass();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                synchronized (kVar2) {
                    try {
                        for (Map.Entry entry5 : kVar2.f119857k.entrySet()) {
                            linkedHashMap4.put((u00.d) entry5.getKey(), CollectionsKt.J0((Set) entry5.getValue()));
                        }
                        Iterator it2 = kVar2.f119857k.values().iterator();
                        while (it2.hasNext()) {
                            ((Set) it2.next()).clear();
                        }
                        Unit unit2 = Unit.f80348a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                kotlin.jvm.internal.j.z(kVar2.f119852f, kVar2.f119851e, null, new u00.j(kVar2, linkedHashMap4, null), 2);
                return Unit.f80348a;
            case 2:
                ((m1.g2) this.f78007j).E.f85483s = (q3.x) obj;
                return Unit.f80348a;
            case 3:
                long j13 = ((a3.c) obj).f482a;
                m1.o2 o2Var = (m1.o2) this.f78007j;
                return new a3.c(m1.o2.a(o2Var, o2Var.f85500h, j13, o2Var.f85499g));
            case 4:
                f((Throwable) obj);
                return Unit.f80348a;
            case 5:
                e(obj);
                return Unit.f80348a;
            case 6:
                e(obj);
                return Unit.f80348a;
            case 7:
                return Boolean.valueOf(((List) obj).retainAll((Collection) this.f78007j));
            case 8:
                e(obj);
                return Unit.f80348a;
            case 9:
                b3.y0 y0Var = (b3.y0) this.f78007j;
                b3.u0 u0Var = (b3.u0) ((b3.d0) obj);
                u0Var.l(y0Var.f21399n);
                u0Var.n(y0Var.f21400o);
                u0Var.f(y0Var.f21401p);
                u0Var.E(y0Var.f21402q);
                u0Var.F(y0Var.f21403r);
                u0Var.x(y0Var.f21404s);
                float f14 = y0Var.f21405t;
                if (u0Var.f21363j != f14) {
                    u0Var.f21354a |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    u0Var.f21363j = f14;
                }
                float f15 = y0Var.f21406u;
                if (u0Var.f21364k != f15) {
                    u0Var.f21354a |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    u0Var.f21364k = f15;
                }
                u0Var.j(y0Var.f21407v);
                float f16 = y0Var.f21408w;
                if (u0Var.f21366m != f16) {
                    u0Var.f21354a |= 2048;
                    u0Var.f21366m = f16;
                }
                u0Var.D(y0Var.f21409x);
                u0Var.z(y0Var.f21410y);
                u0Var.i(y0Var.f21411z);
                if (!Intrinsics.d(null, null)) {
                    u0Var.f21354a |= 131072;
                }
                u0Var.h(y0Var.A);
                u0Var.B(y0Var.B);
                int i14 = y0Var.C;
                if (!b3.s0.b(u0Var.f21370q, i14)) {
                    u0Var.f21354a |= 32768;
                    u0Var.f21370q = i14;
                }
                return Unit.f80348a;
            case 10:
                b((d3.h) obj);
                return Unit.f80348a;
            case 12:
                h3.c0 c0Var = (h3.c0) obj;
                h3.c cVar = (h3.c) this.f78007j;
                cVar.h(c0Var);
                Function1 function12 = cVar.f66603i;
                if (function12 != null) {
                    function12.invoke(c0Var);
                }
                return Unit.f80348a;
            case 13:
                ((k2.e) this.f78007j).b((u2.o) obj);
                return Boolean.TRUE;
            case 14:
                i2.q1 q1Var = (i2.q1) this.f78007j;
                Configuration configuration = new Configuration((Configuration) obj);
                i2.u0 u0Var2 = AndroidCompositionLocals_androidKt.f17454a;
                q1Var.setValue(configuration);
                return Unit.f80348a;
            case 15:
                return new j1.k2((t3.j2) this.f78007j, i13);
            case 16:
                e(obj);
                return Unit.f80348a;
            case 17:
                b((d3.h) obj);
                return Unit.f80348a;
            case 18:
                g4.w wVar = (g4.w) obj;
                return ((g4.y) ((g4.f) this.f78007j).a(new g4.w(null, wVar.f63480b, wVar.f63481c, wVar.f63482d, wVar.f63483e))).f63486a;
            case 19:
                ((s3.k0) this.f78007j).b0((n4.b) obj);
                return Unit.f80348a;
            case 20:
                kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new l5.h((l5.i) this.f78007j, (Integer) obj, null));
                return Unit.f80348a;
            case 21:
                f((Throwable) obj);
                return Unit.f80348a;
            case 22:
                f((Throwable) obj);
                return Unit.f80348a;
            case 23:
                ((mc.i) this.f78007j).f86902a.onSuccess((mc.d) obj);
                return Unit.f80348a;
            case 24:
                f((Throwable) obj);
                return Unit.f80348a;
            case 25:
                String content = (String) obj;
                Intrinsics.checkNotNullParameter(content, "content");
                yw.f fVar = (yw.f) this.f78007j;
                fVar.f140264f = content;
                fVar.f140262d.getClass();
                com.bumptech.glide.d.D0(new File(lb0.g.c("ADS_OPEN_MEASUREMENT_SERVICE_CONTENT", true)), content);
                lb0.o oVar = fVar.f140263e;
                ((pb0.g) fVar.f140261c).getClass();
                ((lb0.b) oVar).m("PREF_ADS_OPEN_MEASUREMENT_JS_EXPIRY_MS", System.currentTimeMillis() + yw.f.f140257g);
                return Unit.f80348a;
            case 26:
                f((Throwable) obj);
                return Unit.f80348a;
            case 27:
                f((Throwable) obj);
                return Unit.f80348a;
            case 28:
                h32.h0 update = (h32.h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                h32.i0 i0Var = (h32.i0) this.f78007j;
                update.f67042a = i0Var.f67081a;
                update.f67043b = i0Var.f67082b;
                update.f67045d = i0Var.f67084d;
                update.f67046e = i0Var.f67085e;
                update.f67047f = i0Var.f67086f;
                x3 x3Var = i0Var.f67083c;
                if (x3Var != null) {
                    update.f67044c = x3Var;
                }
                return Unit.f80348a;
        }
    }
}
