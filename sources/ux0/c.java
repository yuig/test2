package ux0;

import android.content.Context;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.pinterest.gestalt.text.GestaltText;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;
import kx0.l;
import lh0.a4;
import lh0.g1;
import lh0.h2;
import lh0.z3;
import m60.x0;
import pk.a0;

/* loaded from: classes5.dex */
public final class c extends com.pinterest.feature.todaytab.tab.view.c implements yk1.d {

    /* renamed from: f, reason: collision with root package name */
    public a f123237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, x0.today_tab_thats_all_for_today, x0.explore_more_ideas_in_your_home_feed_title);
        Intrinsics.checkNotNullParameter(context, "context");
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
        layoutParams.f19298f = true;
        setLayoutParams(layoutParams);
        h2 b13 = h2.f83379b.b();
        z3 activate = a4.f83297a;
        Intrinsics.checkNotNullParameter("enabled", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        if (((g1) b13.f83382a).k("android_news_hub_hf_pivot", "enabled", activate)) {
            GestaltText gestaltText = this.f48711b;
            gestaltText.setPaddingRelative(0, 0, 0, bs1.c.Z(gestaltText, eo1.c.space_400));
            gestaltText.setText(bs1.c.f2(gestaltText, zu1.e.thats_all_for_now));
            dl2.b.A2(gestaltText);
            j1.q1(gestaltText, eo1.c.font_size_400);
            a0.k0(this.f48712c);
            dl2.b.z(this.f48710a, b.f123235k);
            this.f48713d.d(new l(this, 1));
        }
    }

    @Override // com.pinterest.feature.todaytab.tab.view.c
    public final void a() {
        a aVar = this.f123237f;
        if (aVar != null) {
            aVar.m();
        }
    }

    public final void b(a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f123237f = listener;
    }
}
