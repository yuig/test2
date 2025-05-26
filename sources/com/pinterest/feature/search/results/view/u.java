package com.pinterest.feature.search.results.view;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import x02.i2;

/* loaded from: classes5.dex */
public final class u implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47829a;

    public u(SearchGridMultiSectionFragment searchGridMultiSectionFragment) {
        this.f47829a = searchGridMultiSectionFragment;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull rg0.i0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47829a;
        i2 i2Var = searchGridMultiSectionFragment.Z0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        hk2.h h10 = i2Var.M(event.f108030a).e(wj2.c.a()).h(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(h10, "subscribeOn(...)");
        searchGridMultiSectionFragment.R6(nl.b.o(h10, new y11.c(24, searchGridMultiSectionFragment, event), is1.v.f73649j));
    }
}
