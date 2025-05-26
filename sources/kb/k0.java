package kb;

import android.os.Trace;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f79014c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f79015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f79016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f79017f;

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f79012a = i13;
        this.f79013b = obj;
        this.f79014c = obj2;
        this.f79015d = obj3;
        this.f79016e = obj4;
        this.f79017f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h32.g0 g0Var;
        nx.q qVar;
        h2 h2Var;
        String str;
        int i13 = this.f79012a;
        Object obj = this.f79017f;
        Object obj2 = this.f79016e;
        Object obj3 = this.f79015d;
        Object obj4 = this.f79014c;
        Object obj5 = this.f79013b;
        switch (i13) {
            case 0:
                String str2 = (String) obj4;
                Function0 function0 = (Function0) obj3;
                androidx.lifecycle.l0 l0Var = (androidx.lifecycle.l0) obj2;
                r4.i iVar = (r4.i) obj;
                ((bk.f) obj5).getClass();
                boolean Q = tb.f.Q();
                if (Q) {
                    try {
                        bk.f.s(str2);
                    } finally {
                        if (Q) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    function0.invoke();
                    h0 h0Var = i0.Fo;
                    l0Var.i(h0Var);
                    iVar.b(h0Var);
                } catch (Throwable th3) {
                    l0Var.i(new g0(th3));
                    iVar.d(th3);
                }
                Unit unit = Unit.f80348a;
                if (Q) {
                    return;
                } else {
                    return;
                }
            default:
                nx.o0 this_reportPinImpressions = (nx.o0) obj5;
                nx.d0 pinalytics = (nx.d0) obj4;
                List pinImpressions = (List) obj3;
                d1 trackingParamAttacher = (d1) obj2;
                h32.i0 context = (h32.i0) obj;
                Intrinsics.checkNotNullParameter(this_reportPinImpressions, "$this_reportPinImpressions");
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                Intrinsics.checkNotNullParameter(pinImpressions, "$pinImpressions");
                Intrinsics.checkNotNullParameter(trackingParamAttacher, "$trackingParamAttacher");
                Intrinsics.checkNotNullParameter(context, "$context");
                this_reportPinImpressions.getClass();
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(pinImpressions, "pinImpressions");
                Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                Iterator it = pinImpressions.iterator();
                while (true) {
                    String str3 = "source";
                    if (!it.hasNext()) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            nx.c cVar = (nx.c) entry.getKey();
                            Iterable<z1> iterable = (Iterable) entry.getValue();
                            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable, 10));
                            boolean z13 = false;
                            for (z1 z1Var : iterable) {
                                if (Intrinsics.d(z1Var.f67510u, Boolean.TRUE)) {
                                    z13 = true;
                                }
                                Intrinsics.checkNotNullParameter(z1Var, str3);
                                if (cVar == null || (h2Var = cVar.f92382d) == null) {
                                    h2Var = z1Var.f67496j;
                                }
                                arrayList.add(new z1(z1Var.f67478a, z1Var.f67480b, z1Var.f67482c, z1Var.f67484d, z1Var.f67486e, z1Var.f67488f, z1Var.f67490g, z1Var.f67492h, z1Var.f67494i, h2Var, z1Var.f67498k, z1Var.f67500l, z1Var.f67502m, z1Var.f67503n, z1Var.f67504o, z1Var.f67505p, z1Var.f67506q, z1Var.f67507r, z1Var.f67508s, z1Var.f67509t, z1Var.f67510u, z1Var.f67511v, z1Var.f67512w, z1Var.f67513x, z1Var.f67514y, z1Var.f67515z, z1Var.A, z1Var.B, z1Var.C, z1Var.D, z1Var.E, z1Var.F, z1Var.G, z1Var.H, z1Var.I, z1Var.f67477J, z1Var.K, z1Var.L, z1Var.M, z1Var.N, z1Var.O, z1Var.P, z1Var.Q, z1Var.R, z1Var.S, z1Var.T, z1Var.U, z1Var.V, z1Var.W, z1Var.X, z1Var.Y, z1Var.Z, z1Var.f67479a0, z1Var.f67481b0, z1Var.f67483c0, z1Var.f67485d0, z1Var.f67487e0, z1Var.f67489f0, z1Var.f67491g0, z1Var.f67493h0, z1Var.f67495i0, z1Var.f67497j0, z1Var.f67499k0, z1Var.f67501l0));
                            }
                            ArrayList H0 = CollectionsKt.H0(arrayList);
                            if (cVar == null || (g0Var = cVar.f92379a) == null) {
                                g0Var = context.f67084d;
                            }
                            HashMap hashMap = (cVar == null || (qVar = cVar.f92380b) == null) ? new HashMap() : qVar.b();
                            if (z13) {
                                hashMap.put("debug_code_path", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
                            }
                            pinalytics.C(f1.PIN_IMPRESSION_ONE_PIXEL, null, H0, hashMap, cVar != null ? cVar.f92381c : null, null, g0Var);
                            pinImpressions.size();
                            str3 = str3;
                        }
                        return;
                    }
                    nx.c0 c0Var = (nx.c0) it.next();
                    nx.c cVar2 = c0Var.f92384b;
                    if (concurrentHashMap.get(cVar2) == null) {
                        concurrentHashMap.put(cVar2, new ArrayList());
                    }
                    List list = (List) concurrentHashMap.get(cVar2);
                    if (list != null) {
                        z1 source = c0Var.f92383a;
                        String str4 = source.f67482c;
                        if (str4 != null && str4.length() != 0 && ((str = source.f67477J) == null || kotlin.text.z.j(str) || kotlin.text.z.h(str, "~0", false))) {
                            String str5 = source.f67482c;
                            Intrinsics.f(str5);
                            String e13 = trackingParamAttacher.e(pinalytics, str5);
                            if (e13 != null && e13.length() != 0) {
                                Intrinsics.checkNotNullParameter(source, "source");
                                c0Var = new nx.c0(new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, e13, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0), c0Var.f92384b);
                            }
                        }
                        list.add(c0Var.f92383a);
                    }
                }
                break;
        }
    }
}
