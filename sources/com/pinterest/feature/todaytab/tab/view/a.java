package com.pinterest.feature.todaytab.tab.view;

import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ GestaltButton.LargeSecondaryButton f48692i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GestaltButton.LargeSecondaryButton largeSecondaryButton) {
        super(1);
        this.f48692i = largeSecondaryButton;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yl1.b it = (yl1.b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return yl1.b.f(it, bs1.c.h2(bs1.c.f2(this.f48692i, o92.d.today_tab_go_to_home_feed)), false, null, null, null, null, null, null, 0, null, 1022);
    }
}
