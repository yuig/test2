package wg1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes5.dex */
public final class e extends xi0.f implements tg1.g, af2.c {

    /* renamed from: m, reason: collision with root package name */
    public ye2.o f129765m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f129766n;

    /* renamed from: o, reason: collision with root package name */
    public final ku1.l f129767o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout f129768p;

    /* renamed from: q, reason: collision with root package name */
    public final LinearLayout f129769q;

    /* renamed from: r, reason: collision with root package name */
    public final GestaltText f129770r;

    /* renamed from: s, reason: collision with root package name */
    public final ProportionalImageView f129771s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f129766n) {
            this.f129766n = true;
            this.f129767o = (ku1.l) ((jb) ((f) generatedComponent())).f113485c.f114476s.get();
        }
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(d.f129737l);
        dl2.b.y2(gestaltText);
        this.f129770r = gestaltText;
        ProportionalImageView proportionalImageView = new ProportionalImageView(context);
        proportionalImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        proportionalImageView.setColorFilter(dl2.b.y0(proportionalImageView, eo1.a.color_background_dark_opacity_300));
        proportionalImageView.f52564p = new yv1.g(1);
        this.f129771s = proportionalImageView;
        t(getResources().getDimensionPixelSize(i82.b.article_spotlight_radius));
        this.f135012i.i(d.f129736k);
        setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(i82.b.article_spotlight_width), getResources().getDimensionPixelSize(i82.b.article_spotlight_height)));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getResources().getDimensionPixelSize(eo1.c.space_200), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        linearLayout.setGravity(17);
        setVisibility(8);
        linearLayout.addView(this.f135013j);
        linearLayout.addView(gestaltText);
        this.f129769q = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(81);
        int dimensionPixelSize = linearLayout2.getResources().getDimensionPixelSize(eo1.c.space_600);
        linearLayout2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        linearLayout2.addView(this.f135012i);
        linearLayout2.addView(linearLayout);
        this.f129768p = linearLayout2;
    }

    @Override // xi0.f
    public final ku1.l D() {
        ku1.l lVar = this.f129767o;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.r("uriNavigator");
        throw null;
    }

    @Override // xi0.f
    public final void L() {
        addView(this.f129771s);
        addView(this.f129768p);
    }

    @Override // xi0.f, vi0.b
    public final void U2(String str) {
        setContentDescription(getResources().getString(i82.f.content_description_shopping_idea_view, str));
    }

    @Override // vi0.b
    public final void c(String str) {
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129765m == null) {
            this.f129765m = new ye2.o(this);
        }
        return this.f129765m;
    }

    @Override // xi0.f, vi0.b
    public final void f() {
        this.f129769q.setVisibility(8);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129765m == null) {
            this.f129765m = new ye2.o(this);
        }
        return this.f129765m.generatedComponent();
    }

    @Override // xi0.f
    public final WebImageView x() {
        return this.f129771s;
    }
}
