package com.pinterest.feature.search.results.view;

import i32.y0;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class s implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47827a;

    public s(SearchGridMultiSectionFragment searchGridMultiSectionFragment) {
        this.f47827a = searchGridMultiSectionFragment;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x70.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f134109a;
        if (str == null) {
            return;
        }
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47827a;
        if (Intrinsics.d(str, searchGridMultiSectionFragment.J2)) {
            searchGridMultiSectionFragment.J2 = null;
            SearchGridMultiSectionFragment.j9(searchGridMultiSectionFragment, y0.ANDROID_SEARCH_RESULTS_AFTER_CLICKTHROUGH, z0.g(new Pair(rg0.o.CONTEXT_SEARCH_QUERY.getValue(), searchGridMultiSectionFragment.Q1), new Pair(rg0.o.CONTEXT_PIN_ID.getValue(), str), new Pair(rg0.o.IS_PROMOTED.getValue(), String.valueOf(event.f134110b))));
        }
    }
}
