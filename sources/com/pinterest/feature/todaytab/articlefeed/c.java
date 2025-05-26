package com.pinterest.feature.todaytab.articlefeed;

import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ GestaltButton.SmallSecondaryButton f48605i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GestaltButton.SmallSecondaryButton smallSecondaryButton) {
        super(1);
        this.f48605i = smallSecondaryButton;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yl1.b it = (yl1.b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return yl1.b.f(it, d7.g.q(this.f48605i.getResources(), x0.today_tab_article_feed_go_back, "getString(...)"), false, null, null, null, null, null, null, 0, null, 1022);
    }
}
