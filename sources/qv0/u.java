package qv0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import rq.c2;
import so.jb;

/* loaded from: classes5.dex */
public final class u extends FrameLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f105206a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f105207b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f105208c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f105209d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f105210e;

    /* renamed from: f, reason: collision with root package name */
    public final WebImageView f105211f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageView f105212g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f105213h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, pv0.d boardStickerListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(boardStickerListener, "boardStickerListener");
        if (!this.f105207b) {
            this.f105207b = true;
            bf2.d dVar = ((jb) ((v) generatedComponent())).f113483a.f114036z8;
        }
        this.f105213h = xk2.m.b(new au0.a(this, 11));
        boolean Y0 = j1.Y0(context);
        View.inflate(context, aq1.f.idea_pin_creation_board_sticker_button, this);
        View findViewById = findViewById(aq1.d.idea_pin_board_sticker_button_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(aq1.d.images_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f105208c = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(aq1.d.board_sticker_background_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f105209d = (ImageView) findViewById3;
        View findViewById4 = findViewById(aq1.d.primary_image);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById4;
        this.f105210e = webImageView;
        View findViewById5 = findViewById(aq1.d.secondary_image_top);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        WebImageView webImageView2 = (WebImageView) findViewById5;
        this.f105211f = webImageView2;
        View findViewById6 = findViewById(aq1.d.secondary_image_bottom);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        WebImageView webImageView3 = (WebImageView) findViewById6;
        this.f105212g = webImageView3;
        View findViewById7 = findViewById(aq1.d.board_sticker_button_text);
        GestaltText gestaltText = (GestaltText) findViewById7;
        gestaltText.i(new c2(gestaltText, 10));
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        Context context2 = getContext();
        int i13 = eo1.b.color_gray_500;
        Object obj = d5.a.f53679a;
        int color = context2.getColor(i13);
        webImageView.setBackgroundColor(color);
        webImageView2.setBackgroundColor(color);
        webImageView3.setBackgroundColor(color);
        if (Y0) {
            webImageView.g2(0.0f, a(), 0.0f, a());
            webImageView2.g2(a(), 0.0f, 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, a(), 0.0f);
        } else {
            webImageView.g2(a(), 0.0f, a(), 0.0f);
            webImageView2.g2(0.0f, a(), 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, 0.0f, a());
        }
        boardStickerListener.getClass();
        Intrinsics.checkNotNullParameter(this, "boardStickerView");
        boardStickerListener.f101457p = this;
        boardStickerListener.w3();
    }

    public final float a() {
        return ((Number) this.f105213h.getValue()).floatValue();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f105206a == null) {
            this.f105206a = new ye2.o(this);
        }
        return this.f105206a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f105206a == null) {
            this.f105206a = new ye2.o(this);
        }
        return this.f105206a.generatedComponent();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }
}
