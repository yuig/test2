package com.pinterest.feature.todaytab.articlefeed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements com.google.android.material.appbar.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f48608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f48609b;

    public e(j jVar) {
        this.f48609b = jVar;
    }

    @Override // com.google.android.material.appbar.f
    public final void a(AppBarLayout appBarLayout, int i13) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        j jVar = this.f48609b;
        Navigation navigation = jVar.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_TODAY_ARTICLE_TITLE") : null;
        int i14 = 17;
        if (Math.abs(i13) < jVar.getResources().getDimensionPixelOffset(n92.a.article_feed_header_height) - jVar.getResources().getDimensionPixelOffset(eo1.c.toolbar_height)) {
            if (this.f48608a) {
                boolean z13 = false;
                this.f48608a = false;
                fo1.a i73 = jVar.i7();
                if (i73 != null) {
                    GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
                    Drawable u13 = gestaltToolbarImpl.u();
                    Context context = gestaltToolbarImpl.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    u13.setTint(dl2.b.x0(context, eo1.a.base_color_grayscale_0));
                    gestaltToolbarImpl.S(u13);
                    gestaltToolbarImpl.c0(v03, fm1.c.GONE);
                    gestaltToolbarImpl.M(eo1.b.color_themed_transparent);
                    GestaltIconButton gestaltIconButton = jVar.f48626a1;
                    if (gestaltIconButton != null) {
                        gestaltIconButton.t(new fd1.h(z13, i14));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (this.f48608a) {
            return;
        }
        boolean z14 = true;
        this.f48608a = true;
        fo1.a i74 = jVar.i7();
        if (i74 != null) {
            GestaltToolbarImpl gestaltToolbarImpl2 = (GestaltToolbarImpl) i74;
            Drawable u14 = gestaltToolbarImpl2.u();
            Context context2 = gestaltToolbarImpl2.getContext();
            int i15 = eo1.b.color_themed_text_default;
            Object obj = d5.a.f53679a;
            u14.setTint(context2.getColor(i15));
            gestaltToolbarImpl2.S(u14);
            gestaltToolbarImpl2.b0(v03);
            gestaltToolbarImpl2.n();
            gestaltToolbarImpl2.M(eo1.b.color_themed_background_default);
            GestaltIconButton gestaltIconButton2 = jVar.f48626a1;
            if (gestaltIconButton2 != null) {
                gestaltIconButton2.t(new fd1.h(z14, i14));
            }
        }
    }
}
