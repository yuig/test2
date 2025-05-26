package com.pinterest.feature.todaytab.tab.view;

import android.content.Context;
import g4.u;
import h32.g0;
import h32.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class h extends c implements ch1.a {

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f48728f;

    /* renamed from: g, reason: collision with root package name */
    public dh1.a f48729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, j dismissScreen) {
        super(context, x0.today_tab_thats_all_for_today, x0.today_tab_come_back_tomorrow);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dismissScreen, "dismissScreen");
        this.f48728f = dismissScreen;
    }

    @Override // com.pinterest.feature.todaytab.tab.view.c
    public final void a() {
        dh1.a aVar = this.f48729g;
        if (aVar != null) {
            if (aVar.f54989a) {
                ((h) ((ch1.a) aVar.getView())).f48728f.invoke();
                return;
            }
            aVar.getPresenterPinalytics().f122379a.F(g0.NAVIGATION, u0.BACK_TO_HOME_FEED_BUTTON);
            aVar.f54991c.d(new u());
        }
    }
}
