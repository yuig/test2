package u81;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.design.brio.widget.voice.PinterestToolTip;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;
import rq.m1;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f120989a;

    /* renamed from: b, reason: collision with root package name */
    public final i92.k f120990b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f120991c;

    /* renamed from: d, reason: collision with root package name */
    public final x f120992d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltIconButton f120993e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltIconButton f120994f;

    /* renamed from: g, reason: collision with root package name */
    public PinterestToolTip f120995g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f120996h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f120997i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f120998j;

    /* renamed from: k, reason: collision with root package name */
    public ViewGroup f120999k;

    /* renamed from: l, reason: collision with root package name */
    public nx.d0 f121000l;

    public b0(b60.b activeUserManager, i92.k toastUtils, m60.w eventManager, x roomRepaintActionSheet) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(roomRepaintActionSheet, "roomRepaintActionSheet");
        this.f120989a = activeUserManager;
        this.f120990b = toastUtils;
        this.f120991c = eventManager;
        this.f120992d = roomRepaintActionSheet;
        this.f120998j = xk2.m.b(new a0(this, 0));
    }

    public final GestaltIconButton a(rm1.q qVar, u0 u0Var, a0 a0Var) {
        ViewGroup viewGroup = this.f120999k;
        if (viewGroup == null) {
            Intrinsics.r("imagePreviewContainer");
            throw null;
        }
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
        gestaltIconButton.t(new g(qVar, 2));
        gestaltIconButton.u(new m1(this, u0Var, a0Var, 10));
        Drawable background = gestaltIconButton.getBackground();
        Context context2 = gestaltIconButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        background.setColorFilter(new PorterDuffColorFilter(dl2.b.x0(context2, eo1.a.sema_color_background_wash_dark), PorterDuff.Mode.SRC_IN));
        gestaltIconButton.setBackground(background);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
        layoutParams.setMarginEnd(bs1.c.W(gestaltIconButton, r0.margin));
        gestaltIconButton.setLayoutParams(layoutParams);
        ViewGroup viewGroup2 = this.f120999k;
        if (viewGroup2 != null) {
            viewGroup2.addView(gestaltIconButton);
            return gestaltIconButton;
        }
        Intrinsics.r("imagePreviewContainer");
        throw null;
    }

    public final void b(FrameLayout imagePreviewContainer, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(imagePreviewContainer, "imagePreviewContainer");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f120999k = imagePreviewContainer;
        this.f121000l = pinalytics;
    }

    public final void c(Bitmap bitmap) {
        Bitmap.Config config;
        ViewGroup viewGroup = this.f120999k;
        if (viewGroup == null) {
            Intrinsics.r("imagePreviewContainer");
            throw null;
        }
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        nx.d0 pinalytics = this.f121000l;
        if (pinalytics == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        x xVar = this.f120992d;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        xVar.f121110f = context;
        xVar.f121111g = (bitmap == null || (config = bitmap.getConfig()) == null) ? null : bitmap.copy(config, true);
        xVar.f121112h = pinalytics;
        z listener = new z(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        xVar.f121113i = listener;
        xVar.f121105a.d(new jc0.v(new fw1.b(new ha2.a(kotlin.collections.e0.b(new ha2.z(new ha2.x(x0.more_options, null, null, null, null, 30), kotlin.collections.f0.j(new ha2.a0(x0.share, 0, null, null, null, null, null, null, null, 1020), new ha2.a0(uc2.h.download_image, 1, null, null, null, null, null, null, null, 1020), new ha2.a0(uc2.h.report_image, 2, null, null, null, null, null, null, null, 1020), new ha2.a0(uc2.h.private_policy, 3, null, null, null, null, null, null, null, 1020)), new c0(xVar, 2))), false, (Integer) null, 14)), false, 0L, 30));
    }

    public final void d() {
        boolean z13 = this.f120996h;
        i92.k kVar = this.f120990b;
        if (z13) {
            kVar.k(kk1.d.product_feedback_thank_you);
            this.f120996h = false;
        }
        if (this.f120997i) {
            kVar.m("Thanks! We’ll use your feedback to improve the quality of the images we show you.");
            this.f120997i = false;
        }
    }

    public final void e(boolean z13) {
        int i13 = 1;
        if (z13) {
            GestaltIconButton gestaltIconButton = this.f120993e;
            if (gestaltIconButton == null || this.f120994f == null) {
                this.f120993e = a(rm1.q.THUMBS_UP, u0.ROOM_REPAINT_RESULT_THUMBUP, new a0(this, i13));
                this.f120994f = a(rm1.q.THUMBS_DOWN, u0.ROOM_REPAINT_RESULT_THUMBDOWN, new a0(this, 2));
            } else {
                bs1.c.U1(gestaltIconButton);
                bs1.c.U1(this.f120994f);
            }
        } else {
            bs1.c.X0(this.f120993e);
            bs1.c.X0(this.f120994f);
        }
        lb0.p pVar = lb0.n.f82725d;
        if (((lb0.b) pVar.a()).e("room_repaint_feedback_tooltip", false)) {
            return;
        }
        ViewGroup viewGroup = this.f120999k;
        AttributeSet attributeSet = null;
        if (viewGroup == null) {
            Intrinsics.r("imagePreviewContainer");
            throw null;
        }
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PinterestToolTip pinterestToolTip = new PinterestToolTip(6, context, attributeSet);
        pinterestToolTip.n("This image was AI-generated. Were you satisfied with the image?");
        pinterestToolTip.g(ve0.b.BOTTOM_RIGHT);
        pinterestToolTip.setLayoutParams(new FrameLayout.LayoutParams(bs1.c.W(pinterestToolTip, uc2.b.room_repaint_feedback_tooltip_width), -2));
        pinterestToolTip.setOnClickListener(new x61.e(pinterestToolTip, 19));
        bs1.c.X0(pinterestToolTip);
        ViewGroup viewGroup2 = this.f120999k;
        if (viewGroup2 == null) {
            Intrinsics.r("imagePreviewContainer");
            throw null;
        }
        viewGroup2.addView(pinterestToolTip);
        this.f120995g = pinterestToolTip;
        lb0.m c13 = ((lb0.b) pVar.a()).c();
        c13.putBoolean("room_repaint_feedback_tooltip", true);
        c13.apply();
    }

    public final void f(float f13) {
        GestaltIconButton button = this.f120993e;
        if (button != null) {
            float T = f13 - bs1.c.T(uc2.b.room_repaint_thumb_up_margin);
            ViewGroup viewGroup = this.f120999k;
            if (viewGroup == null) {
                Intrinsics.r("imagePreviewContainer");
                throw null;
            }
            Resources resources = viewGroup.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(resources, "resources");
            if (button.getVisibility() == 0) {
                button.post(new po.c(button, T, resources));
            }
        }
        GestaltIconButton button2 = this.f120994f;
        if (button2 != null) {
            float T2 = f13 - bs1.c.T(uc2.b.room_repaint_thumb_down_margin);
            ViewGroup viewGroup2 = this.f120999k;
            if (viewGroup2 == null) {
                Intrinsics.r("imagePreviewContainer");
                throw null;
            }
            Resources resources2 = viewGroup2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            Intrinsics.checkNotNullParameter(button2, "button");
            Intrinsics.checkNotNullParameter(resources2, "resources");
            if (button2.getVisibility() == 0) {
                button2.post(new po.c(button2, T2, resources2));
            }
        }
        PinterestToolTip pinterestToolTip = this.f120995g;
        if (pinterestToolTip != null) {
            bs1.c.X0(pinterestToolTip);
        }
        this.f120995g = null;
    }

    public final void g(float f13) {
        GestaltIconButton gestaltIconButton;
        GestaltIconButton button = this.f120993e;
        if (button != null) {
            float T = f13 - bs1.c.T(uc2.b.room_repaint_thumb_up_margin);
            ViewGroup viewGroup = this.f120999k;
            if (viewGroup == null) {
                Intrinsics.r("imagePreviewContainer");
                throw null;
            }
            Resources resources = viewGroup.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(resources, "resources");
            if (button.getVisibility() == 0) {
                button.post(new po.c(button, T, resources));
            }
        }
        GestaltIconButton button2 = this.f120994f;
        if (button2 != null) {
            float T2 = f13 - bs1.c.T(uc2.b.room_repaint_thumb_down_margin);
            ViewGroup viewGroup2 = this.f120999k;
            if (viewGroup2 == null) {
                Intrinsics.r("imagePreviewContainer");
                throw null;
            }
            Resources resources2 = viewGroup2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            Intrinsics.checkNotNullParameter(button2, "button");
            Intrinsics.checkNotNullParameter(resources2, "resources");
            if (button2.getVisibility() == 0) {
                button2.post(new po.c(button2, T2, resources2));
            }
        }
        PinterestToolTip pinterestToolTip = this.f120995g;
        if (pinterestToolTip == null || (gestaltIconButton = this.f120993e) == null) {
            return;
        }
        gestaltIconButton.getLocationOnScreen(new int[2]);
        pinterestToolTip.setTranslationX((r1[0] - pinterestToolTip.getWidth()) + gestaltIconButton.getWidth());
        pinterestToolTip.setTranslationY((r1[1] - pinterestToolTip.getHeight()) - bs1.c.T(eo1.c.space_200));
        pinterestToolTip.postInvalidate();
        bs1.c.U1(pinterestToolTip);
    }
}
