package com.pinterest.feature.home.viewpager.tabs;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import bs1.c;
import c50.ma;
import com.google.firebase.messaging.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import gm1.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lt0.a;
import ol2.f;
import org.jetbrains.annotations.NotNull;
import ql2.s;
import u50.o;
import wp1.d;
import wp1.e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/home/viewpager/tabs/HomeFeedTabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Llt0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homeFeed_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class HomeFeedTabView extends ConstraintLayout implements b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f45884h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final q f45885a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f45886b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f45887c;

    /* renamed from: d, reason: collision with root package name */
    public WebImageView f45888d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f45889e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f45890f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f45891g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFeedTabView(Context context, lt0.b initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f45885a = new q(this, initialDisplayState);
        X();
    }

    public static float T() {
        List j13 = f0.j(-1, 1);
        return ((Number) CollectionsKt.o0(j13, f.f96454a)).intValue() * j1.O(2);
    }

    public final lt0.b L() {
        return (lt0.b) ((o) this.f45885a.f33803a);
    }

    public final void X() {
        View.inflate(getContext(), e.home_feed_tab_view, this);
        View findViewById = findViewById(d.tab_text);
        TextView textView = (TextView) findViewById;
        textView.setMaxWidth(j1.O(80));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f45886b = textView;
        View findViewById2 = findViewById(d.tab_icon_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45887c = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(d.tab_icon);
        WebImageView webImageView = (WebImageView) findViewById3;
        Intrinsics.f(webImageView);
        float W = c.W(webImageView, wp1.b.home_feed_tab_icon_corner_radius);
        webImageView.g2(W, W, W, W);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f45888d = webImageView;
        View findViewById4 = findViewById(d.icon_background_squares);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45889e = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(d.icon_background_square_1);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45890f = (ImageView) findViewById5;
        View findViewById6 = findViewById(d.icon_background_square_2);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45891g = (ImageView) findViewById6;
        Z(null, L());
    }

    public final void Z(lt0.b bVar, lt0.b bVar2) {
        int b13;
        j1.v(bVar, bVar2, a.f84764k, new lt0.c(this, bVar2, 1));
        if (j1.w(bVar2, bVar, a.f84765l) || j1.w(bVar2, bVar, a.f84766m)) {
            if (L().h()) {
                ViewGroup viewGroup = this.f45887c;
                if (viewGroup == null) {
                    Intrinsics.r("iconContainer");
                    throw null;
                }
                viewGroup.setVisibility(0);
                if (L().f() != null) {
                    WebImageView webImageView = this.f45888d;
                    if (webImageView == null) {
                        Intrinsics.r("icon");
                        throw null;
                    }
                    webImageView.loadUrl(L().f());
                    ViewGroup viewGroup2 = this.f45889e;
                    if (viewGroup2 == null) {
                        Intrinsics.r("iconBackgroundSquares");
                        throw null;
                    }
                    viewGroup2.setVisibility(0);
                    Pair pair = (Pair) lt0.d.a().get(L().g() % 6);
                    ImageView imageView = this.f45890f;
                    if (imageView == null) {
                        Intrinsics.r("iconBackgroundSquare1");
                        throw null;
                    }
                    imageView.setRotation(((Number) pair.f80346a).floatValue());
                    ImageView imageView2 = this.f45891g;
                    if (imageView2 == null) {
                        Intrinsics.r("iconBackgroundSquare2");
                        throw null;
                    }
                    imageView2.setRotation(((Number) pair.f80347b).floatValue());
                    String e13 = L().e();
                    if (e13 != null) {
                        int i13 = m60.o.f85933a;
                        b13 = ma.b(0, e13);
                        float[] fArr = new float[3];
                        Color.colorToHSV(b13, fArr);
                        df0.c cVar = df0.c.SATURATION;
                        fArr[cVar.getIndex()] = s.f(fArr[cVar.getIndex()] * 3.0f, 0.15f, 1.0f);
                        df0.c cVar2 = df0.c.BRIGHTNESS;
                        fArr[cVar2.getIndex()] = s.c(fArr[cVar2.getIndex()] * 1.6f, 1.0f);
                        int c13 = f5.c.c(c.B(this, eo1.b.color_themed_background_default), 0.8f, Color.HSVToColor(fArr));
                        ImageView imageView3 = this.f45890f;
                        if (imageView3 == null) {
                            Intrinsics.r("iconBackgroundSquare1");
                            throw null;
                        }
                        imageView3.getBackground().setTint(c13);
                        ImageView imageView4 = this.f45891g;
                        if (imageView4 == null) {
                            Intrinsics.r("iconBackgroundSquare2");
                            throw null;
                        }
                        imageView4.getBackground().setTint(c13);
                        ImageView imageView5 = this.f45891g;
                        if (imageView5 == null) {
                            Intrinsics.r("iconBackgroundSquare2");
                            throw null;
                        }
                        imageView5.getBackground().setAlpha(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    }
                    ImageView imageView6 = this.f45890f;
                    if (imageView6 == null) {
                        Intrinsics.r("iconBackgroundSquare1");
                        throw null;
                    }
                    imageView6.setTranslationX(T());
                    imageView6.setTranslationY(T());
                    ImageView imageView7 = this.f45891g;
                    if (imageView7 == null) {
                        Intrinsics.r("iconBackgroundSquare2");
                        throw null;
                    }
                    imageView7.setTranslationX(T());
                    imageView7.setTranslationY(T());
                } else {
                    WebImageView webImageView2 = this.f45888d;
                    if (webImageView2 == null) {
                        Intrinsics.r("icon");
                        throw null;
                    }
                    Context context = getContext();
                    int i14 = wp1.c.home_feed_tab_icon;
                    Object obj = d5.a.f53679a;
                    webImageView2.setImageDrawable(context.getDrawable(i14));
                    ViewGroup viewGroup3 = this.f45889e;
                    if (viewGroup3 == null) {
                        Intrinsics.r("iconBackgroundSquares");
                        throw null;
                    }
                    viewGroup3.setVisibility(8);
                }
                p pVar = new p();
                pVar.j(this);
                TextView textView = this.f45886b;
                if (textView == null) {
                    Intrinsics.r("text");
                    throw null;
                }
                int id3 = textView.getId();
                ViewGroup viewGroup4 = this.f45887c;
                if (viewGroup4 == null) {
                    Intrinsics.r("iconContainer");
                    throw null;
                }
                pVar.l(id3, 3, viewGroup4.getId(), 4);
                pVar.b(this);
                setPaddingRelative(0, 0, 0, c.W(this, eo1.c.sema_space_100));
            } else {
                ViewGroup viewGroup5 = this.f45887c;
                if (viewGroup5 == null) {
                    Intrinsics.r("iconContainer");
                    throw null;
                }
                viewGroup5.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, dl2.b.G0(this, eo1.a.comp_tabs_height));
                int G0 = dl2.b.G0(this, eo1.a.comp_tabs_horizontal_padding);
                int G02 = dl2.b.G0(this, eo1.a.comp_tabs_horizontal_padding);
                int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                layoutParams.setMarginStart(G0);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i15;
                layoutParams.setMarginEnd(G02);
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i16;
                setLayoutParams(layoutParams);
                p pVar2 = new p();
                pVar2.j(this);
                TextView textView2 = this.f45886b;
                if (textView2 == null) {
                    Intrinsics.r("text");
                    throw null;
                }
                pVar2.h(textView2.getId(), 3);
                pVar2.b(this);
                setPaddingRelative(0, 0, 0, dl2.b.G0(this, eo1.a.comp_tabs_bottom_padding));
            }
        }
        j1.v(bVar, bVar2, a.f84767n, new lt0.c(this, bVar2, 2));
        if (L().getId() != Integer.MIN_VALUE) {
            j1.v(bVar, bVar2, a.f84768o, new lt0.c(this, bVar2, 3));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeFeedTabView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFeedTabView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45885a = new q(this, attributeSet, i13, new int[0], a.f84763j);
        X();
    }
}
