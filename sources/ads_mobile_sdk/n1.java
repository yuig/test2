package ads_mobile_sdk;

import ao2.j0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n1 extends wb0 implements a.q6, a.g6 {

    /* renamed from: c, reason: collision with root package name */
    public final r0 f8492c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f8493d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f8494e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f8495f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f8496g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(j0 backgroundScope, Map listeners, r0 adConfiguration) {
        super(backgroundScope, listeners);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f8492c = adConfiguration;
        this.f8493d = new AtomicBoolean(false);
        this.f8494e = new AtomicBoolean(false);
        this.f8495f = new AtomicBoolean(false);
        this.f8496g = new AtomicBoolean(false);
    }

    @Override // a.q6
    public final Object a(bl2.c cVar) {
        if (!this.f8495f.getAndSet(true)) {
            for (Map.Entry entry : this.f12972b.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                j0 j0Var = this.f12971a;
                a1 block = new a1("onAdDestroyed", str, value, null);
                kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
            }
        }
        return Unit.f80348a;
    }

    @Override // a.g6
    public final Unit d(bl2.c cVar) {
        Unit m13 = m(cVar);
        return m13 == cl2.a.COROUTINE_SUSPENDED ? m13 : Unit.f80348a;
    }

    @Override // a.q6
    public final Unit e(bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            j0 j0Var = this.f12971a;
            h1 block = new h1("onAdSwipeGestureClicked", str, value, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Unit g(bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            j0 j0Var = this.f12971a;
            c1 block = new c1("onAdDismissedFullscreenContent", str, value, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.g6
    public final Unit h(bl2.c cVar) {
        Unit g13 = g(cVar);
        return g13 == cl2.a.COROUTINE_SUSPENDED ? g13 : Unit.f80348a;
    }

    @Override // a.q6
    public final Object i(bl2.c cVar) {
        Object O = dl2.b.O(new j1(this, "onAdWillBeReturned", null), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }

    @Override // a.q6
    public final Object l(bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            j0 j0Var = this.f12971a;
            z0 block = new z0("onAdClicked", str, value, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Unit m(bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            j0 j0Var = this.f12971a;
            g1 block = new g1("onAdShowedFullscreenContent", str, value, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Object o(bl2.c cVar) {
        Unit a13;
        if (this.f8493d.getAndSet(true)) {
            return Unit.f80348a;
        }
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            j0 j0Var = this.f12971a;
            e1 block = new e1("onAdImpression", str, value, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        c6 c6Var = this.f8492c.f10379m;
        return c6Var == null ? Unit.f80348a : (c6Var.f3778a == e6.f4724d && !this.f8494e.getAndSet(true) && (a13 = a(new wi.j(c6Var.f3780c, c6Var.f3779b, c6Var.f3781d), cVar)) == cl2.a.COROUTINE_SUSPENDED) ? a13 : Unit.f80348a;
    }

    @Override // a.q6
    public final Object a(wi.o oVar, bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            j0 j0Var = this.f12971a;
            d1 block = new d1("onAdFailedToShowFullScreenContent", str, value, null, oVar);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Unit a(wi.j jVar, bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            j0 j0Var = this.f12971a;
            f1 block = new f1("onAdPaid", str, value, null, jVar);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Unit a(String str, String str2, bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            j0 j0Var = this.f12971a;
            k1 block = new k1("onAppEvent", str3, value, null, str, str2);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Unit a(String str, bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            j0 j0Var = this.f12971a;
            l1 block = new l1("onCustomClick", str2, value, null, str);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }
}
