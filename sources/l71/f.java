package l71;

import com.pinterest.api.model.vh;
import gk2.b3;
import gk2.f1;
import gk2.h0;
import gk2.k1;
import gk2.r0;
import gk2.w2;
import gk2.z2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jk2.l1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.f3;
import lh0.g1;
import lh0.z3;
import net.quikkly.android.ui.CameraPreview;
import t3.s1;
import uj2.a0;
import uj2.b0;
import x02.a2;
import z32.m0;

/* loaded from: classes5.dex */
public abstract class f extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final lh0.o f81936k;

    /* renamed from: l, reason: collision with root package name */
    public final f3 f81937l;

    /* renamed from: m, reason: collision with root package name */
    public String f81938m;

    /* renamed from: n, reason: collision with root package name */
    public final uk2.d f81939n;

    /* renamed from: o, reason: collision with root package name */
    public xj2.c f81940o;

    /* renamed from: p, reason: collision with root package name */
    public br.d f81941p;

    /* renamed from: q, reason: collision with root package name */
    public br.d f81942q;

    /* renamed from: r, reason: collision with root package name */
    public uk2.d f81943r;

    public f(lh0.o oVar, f3 f3Var) {
        super(null);
        this.f81936k = oVar;
        this.f81937l = f3Var;
        this.f81938m = "";
        this.f81939n = s1.h("create(...)");
    }

    public static boolean C(dl1.s sVar) {
        br.d dVar = sVar instanceof br.d ? (br.d) sVar : null;
        if (dVar == null || dVar.f23707e != br.c.STORY) {
            return false;
        }
        vh vhVar = dVar.f23719q;
        return (vhVar != null ? vhVar.f42868z : null) == m0.SIMPLE_HEADER;
    }

    public abstract boolean B();

    public final boolean D(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return (!z.j(query)) ^ B();
    }

    public final void F(final String query) {
        xj2.c F;
        Integer num;
        final int i13 = 1;
        final int i14 = 0;
        Intrinsics.checkNotNullParameter(query, "query");
        uj2.h s13 = w(query).s();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a0 a0Var = tk2.e.f118016b;
        int i15 = uj2.h.f122339a;
        ck2.i.b(timeUnit, "unit is null");
        ck2.i.b(a0Var, "scheduler is null");
        ArrayList d2 = f0.d(new w2(s13, new z2(Math.max(0L, CameraPreview.AUTOFOCUS_INTERVAL_MILLIS), timeUnit, a0Var), i14));
        if (K()) {
            lh0.o oVar = this.f81936k;
            int intValue = (oVar == null || (num = (Integer) CollectionsKt.firstOrNull(oVar.k(z3.DO_NOT_ACTIVATE_EXPERIMENT, "android_search_client_cache_delay", 0))) == null) ? 0 : num.intValue();
            ck2.i.b(a0Var, "scheduler is null");
            d2.add(0, new kk2.e(v(query), intValue, timeUnit, a0Var).s());
        }
        final ArrayList arrayList = new ArrayList();
        v vVar = new v();
        k1 i16 = new h0(d2, 2).g(ck2.i.f27921a).n(tk2.e.f118017c).i(wj2.c.a());
        d51.a aVar = new d51.a(9, new e(this, i14));
        int i17 = uj2.h.f122339a;
        ck2.i.c(i17, "bufferSize");
        f1 f1Var = new f1(new r0(i16, aVar, i17), new d51.a(16, new y11.c(27, this, vVar)), 2);
        Intrinsics.checkNotNullExpressionValue(f1Var, "filter(...)");
        a2 a2Var = ck2.i.f27924d;
        String str = "SearchTypeaheadBaseFetchedList:loadItems";
        f3 f3Var = this.f81937l;
        if (f3Var != null) {
            z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
            Intrinsics.checkNotNullParameter("enabled_stream", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            if (((g1) f3Var.f83346a).o("android_search_client_cache_delay", "enabled_stream", activate)) {
                F = new cl1.e(f1Var, 3).F(new ak2.e() { // from class: l71.c
                    @Override // ak2.e
                    public final void accept(Object obj) {
                        int i18 = i14;
                        List loadedItems = arrayList;
                        f this$0 = this;
                        String query2 = query;
                        switch (i18) {
                            case 0:
                                dl1.s sVar = (dl1.s) obj;
                                Intrinsics.checkNotNullParameter(query2, "$query");
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(loadedItems, "$loadedItems");
                                if (Intrinsics.d(query2, this$0.z())) {
                                    Intrinsics.f(sVar);
                                    loadedItems.add(sVar);
                                    break;
                                }
                                break;
                            default:
                                List list = (List) obj;
                                Intrinsics.checkNotNullParameter(query2, "$query");
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(loadedItems, "$loadedItems");
                                if (Intrinsics.d(query2, this$0.z())) {
                                    Intrinsics.f(list);
                                    loadedItems.addAll(list);
                                    break;
                                }
                                break;
                        }
                    }
                }, new d(str, i14), new ps.f(1, new px0.g(query, this, arrayList)), a2Var);
                g(F);
            }
        }
        F = new b3(f1Var).u().F(new ak2.e() { // from class: l71.c
            @Override // ak2.e
            public final void accept(Object obj) {
                int i18 = i13;
                List loadedItems = arrayList;
                f this$0 = this;
                String query2 = query;
                switch (i18) {
                    case 0:
                        dl1.s sVar = (dl1.s) obj;
                        Intrinsics.checkNotNullParameter(query2, "$query");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(loadedItems, "$loadedItems");
                        if (Intrinsics.d(query2, this$0.z())) {
                            Intrinsics.f(sVar);
                            loadedItems.add(sVar);
                            break;
                        }
                        break;
                    default:
                        List list = (List) obj;
                        Intrinsics.checkNotNullParameter(query2, "$query");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(loadedItems, "$loadedItems");
                        if (Intrinsics.d(query2, this$0.z())) {
                            Intrinsics.f(list);
                            loadedItems.addAll(list);
                            break;
                        }
                        break;
                }
            }
        }, new d(str, i14), new ps.f(2, new px0.g(query, this, arrayList)), a2Var);
        g(F);
    }

    public void G(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
    }

    public boolean H(dl1.s model) {
        String a13;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!(model instanceof br.d)) {
            return false;
        }
        br.d dVar = (br.d) model;
        if (dVar.f23707e != br.c.ENRICHED_AUTOCOMPLETE || (a13 = dVar.a()) == null || z.j(a13)) {
            return false;
        }
        this.f81941p = dVar;
        return true;
    }

    public void I(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f81938m = str;
    }

    public final void J(uk2.d dVar) {
        if (Intrinsics.d(this.f81943r, dVar)) {
            return;
        }
        xj2.c disposable = this.f81940o;
        if (disposable != null) {
            Intrinsics.checkNotNullParameter(disposable, "disposable");
            if (!disposable.isDisposed()) {
                disposable.dispose();
            }
            this.f135185b.b(disposable);
            this.f81940o = null;
        }
        this.f81943r = dVar;
        if (dVar == null) {
            return;
        }
        l1 A = dVar.t(new d51.a(10, new e(this, 1))).l(0L, TimeUnit.MILLISECONDS, tk2.e.f118016b).o().A(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(A, "observeOn(...)");
        xj2.c m13 = nl.b.m(A, "SearchTypeaheadBaseFetchedList:queryChange", new e(this, 2));
        g(m13);
        this.f81940o = m13;
    }

    public boolean K() {
        return false;
    }

    @Override // xk1.c
    public final uj2.q k() {
        return this.f81939n;
    }

    public b0 v(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        kk2.r rVar = kk2.r.f79973a;
        Intrinsics.checkNotNullExpressionValue(rVar, "never(...)");
        return rVar;
    }

    public abstract b0 w(String str);

    public boolean x(dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }

    public String z() {
        return this.f81938m;
    }
}
