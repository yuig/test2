package sw0;

import a.cb;
import ac2.e1;
import ac2.q1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.pu;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m60.w0;
import m60.x0;
import zp.y0;

/* loaded from: classes5.dex */
public final class j extends FrameLayout implements pw0.s, pw0.z {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f115455o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final r0 f115456a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f115457b;

    /* renamed from: c, reason: collision with root package name */
    public pw0.y f115458c;

    /* renamed from: d, reason: collision with root package name */
    public pw0.r f115459d;

    /* renamed from: e, reason: collision with root package name */
    public final int f115460e;

    /* renamed from: f, reason: collision with root package name */
    public final int f115461f;

    /* renamed from: g, reason: collision with root package name */
    public k01 f115462g;

    /* renamed from: h, reason: collision with root package name */
    public final WebImageView f115463h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f115464i;

    /* renamed from: j, reason: collision with root package name */
    public final FrameLayout f115465j;

    /* renamed from: k, reason: collision with root package name */
    public final View f115466k;

    /* renamed from: l, reason: collision with root package name */
    public final View f115467l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltText f115468m;

    /* renamed from: n, reason: collision with root package name */
    public final String f115469n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, r0 r0Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f115456a = r0Var;
        this.f115457b = true;
        this.f115460e = (int) (hf0.b.f69002b / 4);
        this.f115461f = 1;
        this.f115469n = cb.g("toString(...)");
        View.inflate(context, ct1.c.view_story_pin_media_cell, this);
        setBackgroundColor(bs1.c.B(this, m60.q0.story_pin_default_background));
        View findViewById = findViewById(ct1.b.story_pin_media_cell_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById;
        this.f115463h = webImageView;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        View findViewById2 = findViewById(ct1.b.story_pin_media_cell_duration);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f115464i = (GestaltText) findViewById2;
        View findViewById3 = findViewById(ct1.b.story_pin_media_cell_duration_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f115465j = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(ct1.b.story_pin_media_cell_selected_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f115466k = findViewById4;
        View findViewById5 = findViewById(ct1.b.story_pin_media_cell_disabled_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f115467l = findViewById5;
        View findViewById6 = findViewById(ct1.b.story_pin_media_cell_selection_order);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f115468m = (GestaltText) findViewById6;
        kh2.d.b1(webImageView, this, new i(this, 0), new i(this, 1));
    }

    @Override // pw0.z
    public final void B(pw0.y listener, pu mediaItem) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        this.f115458c = listener;
        b(listener, mediaItem);
        setOnClickListener(new y0(this, mediaItem, listener, 16));
    }

    @Override // pw0.z
    public final void R(long j13, String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        int i13 = (int) (j13 / 1000);
        setContentDescription(getResources().getQuantityString(w0.accessibility_video_cell_content_description_with_duration, i13, Integer.valueOf(i13), path));
    }

    @Override // pw0.s
    public final void W1(pw0.r listener, pu mediaItem) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        this.f115459d = listener;
        b(listener, mediaItem);
        setOnClickListener(new y0(this, mediaItem, listener, 15));
    }

    public final void a(pw0.u uVar, pu puVar) {
        int indexOf = ((qw0.j) uVar).f105294p.indexOf(puVar);
        if (indexOf == -1) {
            announceForAccessibility(getResources().getString(x0.deselected));
        } else {
            if (indexOf != 0) {
                return;
            }
            if (puVar instanceof k01) {
                announceForAccessibility(getResources().getString(ct1.e.cover_video_selected));
            } else {
                announceForAccessibility(getResources().getString(ct1.e.cover_image_selected));
            }
        }
    }

    public final void b(pw0.u uVar, pu puVar) {
        int indexOf = ((qw0.j) uVar).f105294p.indexOf(puVar);
        boolean z13 = indexOf != -1;
        setSelected(z13);
        bs1.c.R1(this.f115466k, z13);
        String valueOf = (this.f115457b && z13) ? String.valueOf(indexOf + this.f115461f) : null;
        GestaltText gestaltText = this.f115468m;
        if (valueOf != null) {
            gestaltText.i(new zu0.c(valueOf, 7));
        } else {
            gestaltText.i(b.f115405k);
        }
    }

    @Override // pw0.q
    public final void e1(boolean z13) {
        this.f115457b = z13;
    }

    @Override // pw0.z
    public final void g5(k01 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        r0 r0Var = this.f115456a;
        if (r0Var != null) {
            String uniqueId = this.f115469n;
            Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
            if (!r0Var.f115565d) {
                new oy.z(uniqueId, true).i();
            }
        }
        WebImageView webImageView = this.f115463h;
        webImageView.w1();
        webImageView.setBackgroundColor(bs1.c.B(webImageView, m60.q0.story_pin_default_background));
        Drawable background = webImageView.getBackground();
        if (background != null) {
            background.setAlpha(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        String b13 = ac2.d.b(item.f39242e, q1.VIDEO_HOME_FEED, e1.ROUND);
        Intrinsics.checkNotNullExpressionValue(b13, "formatTimeInMs(...)");
        pk.a0.p(this.f115464i, b13);
        bs1.c.U1(this.f115465j);
        Pair e03 = c0.d.e0(item, getWidth() != 0 ? getWidth() : this.f115460e);
        int intValue = ((Number) e03.f80346a).intValue();
        int intValue2 = ((Number) e03.f80347b).intValue();
        webImageView.setScaleX(fa2.c.j(item.e()) ? -1.0f : 1.0f);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f115462g = item;
        webImageView.P0(new File(item.e()), intValue, intValue2);
    }

    @Override // pw0.z
    public final void j5(boolean z13) {
        bs1.c.R1(this.f115467l, !z13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i13), 1073741824));
    }

    @Override // pw0.s
    public final void q5(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        setContentDescription(getResources().getString(x0.accessibility_photo_cell_content_description, path));
    }

    @Override // pw0.s
    public final void t4(d30 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        r0 r0Var = this.f115456a;
        if (r0Var != null) {
            String uniqueId = this.f115469n;
            Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
            if (!r0Var.f115565d) {
                new oy.z(uniqueId, false).i();
            }
        }
        WebImageView webImageView = this.f115463h;
        webImageView.w1();
        webImageView.setBackgroundColor(bs1.c.B(webImageView, m60.q0.story_pin_default_background));
        Drawable background = webImageView.getBackground();
        if (background != null) {
            background.setAlpha(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        bs1.c.X0(this.f115465j);
        Pair d03 = c0.d.d0(item, getWidth() != 0 ? getWidth() : this.f115460e);
        int intValue = ((Number) d03.f80346a).intValue();
        int intValue2 = ((Number) d03.f80347b).intValue();
        webImageView.setScaleX(fa2.c.j(item.e()) ? -1.0f : 1.0f);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.P0(new File(item.e()), intValue, intValue2);
    }
}
