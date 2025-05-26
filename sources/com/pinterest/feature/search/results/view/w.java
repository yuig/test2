package com.pinterest.feature.search.results.view;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class w implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47831a;

    public w(SearchGridMultiSectionFragment searchGridMultiSectionFragment) {
        this.f47831a = searchGridMultiSectionFragment;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.t event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = SearchGridMultiSectionFragment.O2;
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47831a;
        Context context = searchGridMultiSectionFragment.getContext();
        if (context != null) {
            lr.z zVar = new lr.z(context, 3);
            i92.k kVar = searchGridMultiSectionFragment.f47723o1;
            if (kVar != null) {
                kVar.c(zVar);
            } else {
                Intrinsics.r("toastUtils");
                throw null;
            }
        }
    }
}
