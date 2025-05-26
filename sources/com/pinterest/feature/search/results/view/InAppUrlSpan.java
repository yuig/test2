package com.pinterest.feature.search.results.view;

import android.text.style.URLSpan;
import android.view.View;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.u4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/search/results/view/InAppUrlSpan;", "Landroid/text/style/URLSpan;", "todayTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class InAppUrlSpan extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f47682a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUrlSpan(m60.w eventManager, String url) {
        super(url);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f47682a = eventManager;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kg.n.a(widget);
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.f47682a.d(Navigation.z0((ScreenLocation) u4.f51435a.getValue(), getURL()));
    }
}
