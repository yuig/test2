package com.pinterest.feature.search.results.view;

import ey.f5;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47828a;

    public t(SearchGridMultiSectionFragment searchGridMultiSectionFragment) {
        this.f47828a = searchGridMultiSectionFragment;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull f5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f47828a.J2 = event.f60486d;
    }
}
