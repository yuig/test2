package rq;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.jvm.internal.Intrinsics;
import so.db;
import so.oa;
import so.w8;

/* loaded from: classes3.dex */
public final class u extends i {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f109562l = 0;

    /* renamed from: h, reason: collision with root package name */
    public db f109563h;

    /* renamed from: i, reason: collision with root package name */
    public final er0.d f109564i;

    /* renamed from: j, reason: collision with root package name */
    public final int f109565j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f109566k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, pb0.d dateFormatter) {
        super(context, dateFormatter);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        inject();
        db dbVar = this.f109563h;
        if (dbVar == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) getPresenterPinalyticsFactory()).g();
        cr0.k kVar = new cr0.k(2);
        w8 w8Var = dbVar.f113391a;
        lh0.a0 j53 = w8Var.f114690c.j5();
        oa oaVar = w8Var.f114689b;
        uj2.q qVar = (uj2.q) oaVar.f113947u9.get();
        this.f109564i = new er0.d((b60.b) oaVar.f113850p0.get(), (m60.w) oaVar.f113885r0.get(), j53, g13, qVar, kVar);
        this.f109565j = n80.d.video_closeup_creator_analytics_module_lego;
    }

    @Override // rq.b
    public final int b() {
        return this.f109565j;
    }

    @Override // rq.b
    public final er0.d e() {
        return this.f109564i;
    }

    @Override // rq.b
    public final void g(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(root, "root");
        KeyEvent.Callback findViewById = root.findViewById(n80.c.video_view_count);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f109265d = (cr0.i) findViewById;
        KeyEvent.Callback findViewById2 = root.findViewById(n80.c.avg_time_watched);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f109266e = (cr0.i) findViewById2;
        KeyEvent.Callback findViewById3 = root.findViewById(n80.c.save_stats);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f109267f = (cr0.i) findViewById3;
        View findViewById4 = root.findViewById(n80.c.analytics_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) root.findViewById(n80.c.analytics_module_linear_layout);
        Intrinsics.f(linearLayout);
        maybeUpdateLayoutForTabletPortrait(linearLayout);
        View findViewById5 = root.findViewById(n80.c.analytics_module_visibility_tooltip_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f109566k = (FrameLayout) findViewById5;
        View findViewById6 = root.findViewById(n80.c.analytics_module_visibility_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById6;
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new xo.k(this, 7));
        } else {
            Intrinsics.r("visibilityIndicator");
            throw null;
        }
    }
}
