package ru1;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m60.f0;
import nx.d0;
import so.oa;

/* loaded from: classes2.dex */
public final class k implements r70.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f110068a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f110069b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f110070c;

    public k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f110068a = new LinearLayout(context);
        Object k03 = l0.k0(context.getApplicationContext(), so1.b.class);
        Intrinsics.checkNotNullExpressionValue(k03, "get(...)");
        ((r70.f) ((oa) ((so1.b) k03)).Ac.get()).b(false).size();
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
        this.f110069b = hVar;
        this.f110070c = vb0.j.f125466a;
    }

    @Override // r70.a
    public final boolean a() {
        return false;
    }

    @Override // r70.a
    public final void b() {
        q("goToProfileTab()");
        p("goToProfileTab()");
    }

    @Override // r70.a
    public final void c(boolean z13) {
        q("updateVisibilityIfNecessary(true, " + z13 + ")");
    }

    @Override // r70.a
    public final void d() {
        q("resetNavbarAndTabColors()");
    }

    @Override // r70.a
    public final void e(int i13, com.pinterest.framework.screens.u uVar) {
        String str = "selectTab(" + i13 + ", " + uVar + ")";
        q(str);
        p(str);
    }

    @Override // r70.a
    public final void f(boolean z13) {
        q("setFromDeeplink(" + z13 + ")");
    }

    @Override // r70.a
    public final void g(boolean z13, boolean z14) {
        q("setShouldShow(" + z13 + ", " + z14 + ")");
    }

    @Override // r70.a
    public final LinearLayout getView() {
        return this.f110068a;
    }

    @Override // r70.a
    public final void h() {
        q("goToSearchTab()");
        p("goToSearchTab()");
    }

    @Override // r70.a
    public final int i(u70.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        String str = "getIndexForTab(" + type + ")";
        q(str);
        p(str);
        return -1;
    }

    @Override // r70.a
    public final void j(com.pinterest.framework.screens.s listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        q("setListener(" + listener + ")");
    }

    @Override // r70.a
    public final void k(com.pinterest.framework.screens.u tabSelectionSource) {
        Intrinsics.checkNotNullParameter(tabSelectionSource, "tabSelectionSource");
        String str = "goToHomeTab(" + tabSelectionSource + ")";
        q(str);
        p(str);
    }

    @Override // r70.a
    public final void l(u70.a bottomNavTabType, int i13, Bundle bundle, boolean z13) {
        Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
        String str = "insertIfNeededAndSelectTab(" + bottomNavTabType + ", " + i13 + ", " + bundle + ", " + z13 + ")";
        q(str);
        p(str);
    }

    @Override // r70.a
    public final void m(boolean z13) {
        q("changeViewState(" + z13 + ")");
    }

    @Override // r70.a
    public final void o(boolean z13) {
        q("setShouldShowNewUserNavLabels(" + z13 + ")");
    }

    public final void p(String str) {
        this.f110070c.S(false, a.a.D(str, " should NOT be invoked on ", k.class.getSimpleName()), new Object[0]);
    }

    public final void q(String str) {
        this.f110069b.h(k.class.getSimpleName() + "::" + str);
    }

    @Override // r70.a
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        q("setPinalytics(" + pinalytics + ")");
    }
}
