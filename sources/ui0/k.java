package ui0;

import a.m2;
import ac2.a1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import nx.d0;
import pk.a0;
import yk1.n;

/* loaded from: classes5.dex */
public final class k extends RoundedCornersLayout implements yk1.d, n {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f122276n = 0;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f122277f;

    /* renamed from: g, reason: collision with root package name */
    public final PinterestVideoView f122278g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f122279h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f122280i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltButton f122281j;

    /* renamed from: k, reason: collision with root package name */
    public final WebImageView f122282k;

    /* renamed from: l, reason: collision with root package name */
    public final q5.j f122283l;

    /* renamed from: m, reason: collision with root package name */
    public ti0.a f122284m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View.inflate(context, pz.b.announcement_modal_item_view, this);
        int W = bs1.c.W(this, eo1.c.lego_corner_radius_large);
        g(W, W, W, W);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(pz.a.announcement_modal_root);
        int i13 = eo1.d.lego_card_rounded_top;
        Object obj = d5.a.f53679a;
        constraintLayout.setBackground(context.getDrawable(i13));
        constraintLayout.setBackgroundTintList(d5.a.b(context, a0.q0(context) ? eo1.b.color_black_900 : eo1.b.color_white_0));
        setBackgroundColor(bs1.c.B(this, eo1.b.sema_color_background_transparent));
        View findViewById = findViewById(pz.a.announcement_modal_video_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.f122277f = frameLayout;
        Integer[] numArr = PinterestVideoView.f52749c1;
        PinterestVideoView z13 = bk.f.z(context, pinalytics, v0.video_view_simple_with_mute, 8);
        z13.D0 = g0.FLOWED_PIN;
        z13.G0 = false;
        z13.z(3);
        z13.g0(nc2.j.AUTOPLAY_BY_STATE);
        z13.O(true);
        z13.R(true);
        z13.A(true);
        frameLayout.addView(z13, -1, -1);
        ((GestaltIcon) z13.findViewById(a1.player_mute)).g2(g.f122261j);
        this.f122278g = z13;
        h value = new h(z13, this);
        Intrinsics.checkNotNullParameter(value, "value");
        z13.f52751a1 = value;
        z13.S();
        this.f122283l = new q5.j(context, new i(this, (FrameLayout) z13.findViewById(t0.mute_toggle_button), z13, 0));
        FrameLayout frameLayout2 = (FrameLayout) z13.findViewById(t0.exo_overlay_touch_interceptor);
        if (frameLayout2 != null) {
            frameLayout2.setOnTouchListener(new m2(this, 7));
        }
        z13.r();
        View findViewById2 = findViewById(pz.a.announcement_modal_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f122279h = (GestaltText) findViewById2;
        View findViewById3 = findViewById(pz.a.announcement_modal_description);
        GestaltText gestaltText = (GestaltText) findViewById3;
        gestaltText.i(g.f122262k);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f122280i = gestaltText;
        View findViewById4 = findViewById(pz.a.announcement_modal_cta);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f122281j = (GestaltButton) findViewById4;
        View findViewById5 = findViewById(pz.a.announcement_modal_icon_image);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f122282k = (WebImageView) findViewById5;
    }
}
