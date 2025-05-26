package c91;

import android.app.Activity;
import android.content.res.Resources;
import ao2.j0;
import ao2.v0;
import h32.f1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import nx.d0;
import so.na;
import tb.l;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f26983a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f26984b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26985c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26986d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26987e;

    /* renamed from: f, reason: collision with root package name */
    public b f26988f;

    public d(na applicationProvider, j0 applicationScope) {
        Intrinsics.checkNotNullParameter(applicationProvider, "applicationProvider");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        this.f26983a = applicationProvider;
        this.f26984b = applicationScope;
        this.f26987e = true;
    }

    public final boolean a(hp1.a onDemandModule) {
        Intrinsics.checkNotNullParameter(onDemandModule, "onDemandModule");
        onDemandModule.getClass();
        Intrinsics.checkNotNullParameter("modiface", "moduleName");
        return ((jk.b) ((at1.d) this.f26983a.get()).f20447l.getValue()).d().contains("modiface");
    }

    public final void b(Activity activity, boolean z13, d0 pinalytics, String str, List onDemandModuleList) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(onDemandModuleList, "onDemandModuleList");
        this.f26987e = z13 && this.f26987e;
        if (activity != null) {
            if (this.f26986d) {
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                d(onDemandModuleList, resources, pinalytics, str, 2);
                return;
            }
            this.f26986d = true;
            wk2.a aVar = this.f26983a;
            jk.b bVar = (jk.b) ((at1.d) aVar.get()).f20447l.getValue();
            b bVar2 = new b(this, (jk.b) ((at1.d) aVar.get()).f20447l.getValue(), activity, onDemandModuleList, pinalytics, activity.getResources(), str);
            bVar.a(bVar2);
            this.f26988f = bVar2;
            l lVar = new l();
            Intrinsics.checkNotNullExpressionValue(lVar, "newBuilder(...)");
            Iterator it = onDemandModuleList.iterator();
            while (it.hasNext()) {
                ((hp1.a) it.next()).getClass();
                ((List) lVar.f116986b).add("modiface");
            }
            bVar.f(new qq2.c(lVar));
        }
    }

    public final void c() {
        Intrinsics.checkNotNullParameter("modiface", "moduleName");
        ko2.f fVar = v0.f20219a;
        j.z(this.f26984b, ko2.e.f80326c, null, new c(this, "modiface", null), 2);
    }

    public final void d(List list, Resources resources, d0 d0Var, String str, int i13) {
        if (this.f26987e || !a.a(list)) {
            return;
        }
        a.b(resources, d0Var, str, i13);
        f1 f1Var = f1.ANDROID_DFM_TOAST_SHOWN;
        HashMap x13 = a.a.x("name", "modiface", "status_code", "toast shown");
        Unit unit = Unit.f80348a;
        d0Var.g(f1Var, "", x13, false);
    }
}
