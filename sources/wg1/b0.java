package wg1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.ideaPinCreation.closeup.view.e1;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;
import we1.a2;

/* loaded from: classes5.dex */
public final class b0 extends c implements tg1.l {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f129722s = 0;

    /* renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f129723j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f129724k;

    /* renamed from: l, reason: collision with root package name */
    public final PinterestVideoView f129725l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f129726m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f129727n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f129728o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f129729p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f129730q;

    /* renamed from: r, reason: collision with root package name */
    public ug1.m f129731r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = 1;
        if (!this.f129733i) {
            this.f129733i = true;
            ((c0) generatedComponent()).getClass();
        }
        boolean q13 = hf0.b.q();
        this.f129729p = q13;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        setElevation(getResources().getDimension(eo1.c.space_100));
        t(getResources().getDimensionPixelSize(eo1.c.ignore));
        View inflate = LayoutInflater.from(context).inflate(q13 ? i82.e.view_spotlight_today_article_pin_cell_tablet : i82.e.view_spotlight_today_article_pin_cell, (ViewGroup) null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        this.f129723j = constraintLayout;
        constraintLayout.setOnClickListener(new a2(this, 9));
        Intrinsics.checkNotNullExpressionValue(constraintLayout.findViewById(i82.c.spotlight_today_article_pin_overlay_container), "findViewById(...)");
        View findViewById = constraintLayout.findViewById(i82.c.spotlight_today_article_video_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f129724k = (LinearLayout) findViewById;
        View findViewById2 = constraintLayout.findViewById(i82.c.spotlight_today_article_pin_content_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f129726m = (LinearLayout) findViewById2;
        View findViewById3 = constraintLayout.findViewById(i82.c.spotlight_today_article_pin_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f129727n = (GestaltText) findViewById3;
        View findViewById4 = constraintLayout.findViewById(i82.c.spotlight_today_article_pin_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f129728o = (GestaltText) findViewById4;
        View findViewById5 = constraintLayout.findViewById(i82.c.spotlight_today_article_immersive_video);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        PinterestVideoView pinterestVideoView = (PinterestVideoView) findViewById5;
        this.f129725l = pinterestVideoView;
        pinterestVideoView.A(false);
        pinterestVideoView.P(true);
        pinterestVideoView.O(false);
        pinterestVideoView.g0(nc2.j.AUTOPLAY_BY_STATE_WITH_NETWORK);
        pinterestVideoView.u0(new e1(this, 5));
        pinterestVideoView.getViewTreeObserver().addOnGlobalLayoutListener(new w(pinterestVideoView, i13));
        addView(constraintLayout);
    }
}
