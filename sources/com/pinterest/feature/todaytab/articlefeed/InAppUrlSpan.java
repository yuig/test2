package com.pinterest.feature.todaytab.articlefeed;

import android.text.style.URLSpan;
import android.view.View;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.v4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/todaytab/articlefeed/InAppUrlSpan;", "Landroid/text/style/URLSpan;", "todayTab_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class InAppUrlSpan extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    public final w f48604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUrlSpan(w eventManager, String url) {
        super(url);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f48604a = eventManager;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kg.n.a(widget);
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.f48604a.d(Navigation.z0((ScreenLocation) v4.f51467a.getValue(), getURL()));
    }
}
