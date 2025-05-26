package com.pinterest.feature.profile.allpins.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageViewContainer;
import ga2.b;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.s0;
import org.jetbrains.annotations.NotNull;
import pb0.d;
import qb0.f;
import qc2.a;
import rq.a0;
import rq.c2;
import u50.f0;
import uq.w;
import vn1.e;
import y92.i;
import yk1.n;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/pinterest/feature/profile/allpins/view/ProfileAllPinsRep;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Ly92/i;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profileLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProfileAllPinsRep extends w implements n, i, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f47475v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f47476d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f47477e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f47478f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIconButton f47479g;

    /* renamed from: h, reason: collision with root package name */
    public final WebImageViewContainer f47480h;

    /* renamed from: i, reason: collision with root package name */
    public final WebImageViewContainer f47481i;

    /* renamed from: j, reason: collision with root package name */
    public final WebImageViewContainer f47482j;

    /* renamed from: k, reason: collision with root package name */
    public final WebImageViewContainer f47483k;

    /* renamed from: l, reason: collision with root package name */
    public final WebImageViewContainer f47484l;

    /* renamed from: m, reason: collision with root package name */
    public final float f47485m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f47486n;

    /* renamed from: o, reason: collision with root package name */
    public final oq.i f47487o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f47488p;

    /* renamed from: q, reason: collision with root package name */
    public int f47489q;

    /* renamed from: r, reason: collision with root package name */
    public d f47490r;

    /* renamed from: s, reason: collision with root package name */
    public f f47491s;

    /* renamed from: t, reason: collision with root package name */
    public a f47492t;

    /* renamed from: u, reason: collision with root package name */
    public Function0 f47493u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAllPinsRep(Context context) {
        super(context, 19);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47485m = getResources().getDimension(b.lego_board_rep_pin_preview_corner_radius);
        this.f47486n = c.f0(this, s0.rect_gray, null, null, 6);
        this.f47487o = new oq.i(this, 10);
        this.f47488p = new LinkedHashSet();
        View.inflate(getContext(), oz1.c.all_pins_rep, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPaddingRelative(0, 0, 0, getResources().getDimensionPixelOffset(eo1.c.space_400));
        View findViewById = findViewById(oz1.b.image_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47476d = (FrameLayout) findViewById;
        View findViewById2 = findViewById(oz1.b.lego_board_rep_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        this.f47477e = gestaltText.i(new c2(gestaltText, 22));
        View findViewById3 = findViewById(oz1.b.lego_board_rep_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47478f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(oz1.b.privacy_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47479g = (GestaltIconButton) findViewById4;
        this.f47480h = X();
        this.f47481i = X();
        this.f47482j = X();
        this.f47483k = X();
        this.f47484l = X();
    }

    public static void g0(WebImageViewContainer webImageViewContainer, int i13, int i14) {
        webImageViewContainer.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
    }

    public static void o0(ProfileAllPinsRep profileAllPinsRep, f0 f0Var, boolean z13) {
        profileAllPinsRep.getClass();
        profileAllPinsRep.f47478f.i(new a0(z13 ? e.REGULAR : e.BOLD, f0Var, Integer.MIN_VALUE, 7));
    }

    public final void L(boolean z13) {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        if (z13) {
            viewTreeObserver.addOnPreDrawListener(this);
        } else {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    public final void T() {
        if (Z(this)) {
            WebImageViewContainer[] webImageViewContainerArr = {this.f47480h, this.f47481i, this.f47482j, this.f47483k, this.f47484l};
            for (int i13 = 0; i13 < 5; i13++) {
                WebImageViewContainer webImageViewContainer = webImageViewContainerArr[i13];
                if (Z(webImageViewContainer) && this.f47488p.contains(webImageViewContainer) && webImageViewContainer.getC() == null && webImageViewContainer.getF52563o() != null) {
                    return;
                }
            }
            Function0 function0 = this.f47493u;
            if (function0 == null) {
                Intrinsics.r("onImagesLoadedCallback");
                throw null;
            }
            function0.invoke();
        }
    }

    public final WebImageViewContainer X() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WebImageViewContainer webImageViewContainer = new WebImageViewContainer(context);
        webImageViewContainer.setLayoutParams(new ConstraintLayout.LayoutParams(0, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        webImageViewContainer.b().setScaleType(scaleType);
        webImageViewContainer.b().setImageDrawable(this.f47486n);
        webImageViewContainer.b2(this.f47485m);
        webImageViewContainer.M1(c.Z(webImageViewContainer, r0.stroke));
        webImageViewContainer.o0(dl2.b.y0(webImageViewContainer, eo1.a.sema_color_background_default));
        webImageViewContainer.setElevation(webImageViewContainer.getResources().getDimension(eo1.c.space_200));
        webImageViewContainer.setClipChildren(false);
        webImageViewContainer.Y(this.f47487o);
        this.f47476d.addView(webImageViewContainer, 0);
        return webImageViewContainer;
    }

    public final boolean Z(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null || !c.o1(view)) {
            return false;
        }
        a aVar = this.f47492t;
        if (aVar != null) {
            return ((qc2.d) aVar).e(view, view2);
        }
        Intrinsics.r("visibilityCalculator");
        throw null;
    }

    public final void a0(WebImageViewContainer webImageViewContainer, int i13) {
        FrameLayout frameLayout = this.f47476d;
        int measuredWidth = frameLayout.getMeasuredWidth();
        int i14 = this.f47489q;
        int i15 = (i13 - 1) * ((measuredWidth - i14) / 4);
        webImageViewContainer.layout(i15, 0, i14 + i15, frameLayout.getMeasuredHeight());
    }

    public final void d0(vh vhVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List list = vhVar.M;
        WebImageViewContainer webImageViewContainer = this.f47484l;
        WebImageViewContainer webImageViewContainer2 = this.f47483k;
        WebImageViewContainer webImageViewContainer3 = this.f47482j;
        WebImageViewContainer webImageViewContainer4 = this.f47481i;
        WebImageViewContainer webImageViewContainer5 = this.f47480h;
        if (list != null && Intrinsics.d(webImageViewContainer5.getF52563o(), CollectionsKt.U(0, list)) && Intrinsics.d(webImageViewContainer4.getF52563o(), CollectionsKt.U(1, list)) && Intrinsics.d(webImageViewContainer3.getF52563o(), CollectionsKt.U(2, list)) && Intrinsics.d(webImageViewContainer2.getF52563o(), CollectionsKt.U(3, list)) && Intrinsics.d(webImageViewContainer.getF52563o(), CollectionsKt.U(4, list))) {
            return;
        }
        if (list != null && (str5 = (String) CollectionsKt.U(0, list)) != null) {
            webImageViewContainer5.loadUrl(str5);
            k0(webImageViewContainer5, str5);
        }
        if (list != null && (str4 = (String) CollectionsKt.U(1, list)) != null) {
            webImageViewContainer4.loadUrl(str4);
            k0(webImageViewContainer4, str4);
        }
        if (list != null && (str3 = (String) CollectionsKt.U(2, list)) != null) {
            webImageViewContainer3.loadUrl(str3);
            k0(webImageViewContainer3, str3);
        }
        if (list != null && (str2 = (String) CollectionsKt.U(3, list)) != null) {
            webImageViewContainer2.loadUrl(str2);
            k0(webImageViewContainer2, str2);
        }
        if (list == null || (str = (String) CollectionsKt.U(4, list)) == null) {
            return;
        }
        webImageViewContainer.loadUrl(str);
        k0(webImageViewContainer, str);
    }

    public final void k0(WebImageViewContainer webImageViewContainer, String str) {
        this.f47488p.add(webImageViewContainer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        L(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        L(false);
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        a0(this.f47480h, 1);
        a0(this.f47481i, 2);
        a0(this.f47482j, 3);
        a0(this.f47483k, 4);
        a0(this.f47484l, 5);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        FrameLayout frameLayout = this.f47476d;
        int measuredHeight = (frameLayout.getMeasuredHeight() * 3) / 4;
        this.f47489q = measuredHeight;
        g0(this.f47480h, measuredHeight, frameLayout.getMeasuredHeight());
        g0(this.f47481i, this.f47489q, frameLayout.getMeasuredHeight());
        g0(this.f47482j, this.f47489q, frameLayout.getMeasuredHeight());
        g0(this.f47483k, this.f47489q, frameLayout.getMeasuredHeight());
        g0(this.f47484l, this.f47489q, frameLayout.getMeasuredHeight());
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        L(false);
        T();
        return true;
    }

    @Override // y92.i
    public final void onViewRecycled() {
        this.f47480h.clear();
        this.f47481i.clear();
        this.f47482j.clear();
        this.f47483k.clear();
        this.f47484l.clear();
        this.f47488p.clear();
        pk.a0.p(this.f47477e, "");
        pk.a0.p(this.f47478f, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAllPinsRep(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs, 19);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f47485m = getResources().getDimension(b.lego_board_rep_pin_preview_corner_radius);
        this.f47486n = c.f0(this, s0.rect_gray, null, null, 6);
        this.f47487o = new oq.i(this, 10);
        this.f47488p = new LinkedHashSet();
        View.inflate(getContext(), oz1.c.all_pins_rep, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPaddingRelative(0, 0, 0, getResources().getDimensionPixelOffset(eo1.c.space_400));
        View findViewById = findViewById(oz1.b.image_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47476d = (FrameLayout) findViewById;
        View findViewById2 = findViewById(oz1.b.lego_board_rep_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        this.f47477e = gestaltText.i(new c2(gestaltText, 22));
        View findViewById3 = findViewById(oz1.b.lego_board_rep_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47478f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(oz1.b.privacy_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47479g = (GestaltIconButton) findViewById4;
        this.f47480h = X();
        this.f47481i = X();
        this.f47482j = X();
        this.f47483k = X();
        this.f47484l = X();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAllPinsRep(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13, 19, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f47485m = getResources().getDimension(b.lego_board_rep_pin_preview_corner_radius);
        this.f47486n = c.f0(this, s0.rect_gray, null, null, 6);
        this.f47487o = new oq.i(this, 10);
        this.f47488p = new LinkedHashSet();
        View.inflate(getContext(), oz1.c.all_pins_rep, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPaddingRelative(0, 0, 0, getResources().getDimensionPixelOffset(eo1.c.space_400));
        View findViewById = findViewById(oz1.b.image_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47476d = (FrameLayout) findViewById;
        View findViewById2 = findViewById(oz1.b.lego_board_rep_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        this.f47477e = gestaltText.i(new c2(gestaltText, 22));
        View findViewById3 = findViewById(oz1.b.lego_board_rep_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47478f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(oz1.b.privacy_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47479g = (GestaltIconButton) findViewById4;
        this.f47480h = X();
        this.f47481i = X();
        this.f47482j = X();
        this.f47483k = X();
        this.f47484l = X();
    }
}
