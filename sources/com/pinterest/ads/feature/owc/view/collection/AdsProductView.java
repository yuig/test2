package com.pinterest.ads.feature.owc.view.collection;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import ba.q;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import eu.l;
import eu.m;
import gs0.k;
import java.util.Map;
import jo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.x;
import m60.r0;
import m60.w;
import n.e;
import org.jetbrains.annotations.NotNull;
import ps.p;
import rl2.u;
import rq.n0;
import tq.j;
import xk2.v;
import xo.s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/collection/AdsProductView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsProductView extends s {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ u[] f35340s = {k0.f80436a.e(new x(AdsProductView.class, "product", "getProduct$ads_release()Lcom/pinterest/api/model/Pin;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public w f35341d;

    /* renamed from: e, reason: collision with root package name */
    public c f35342e;

    /* renamed from: f, reason: collision with root package name */
    public k f35343f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageView f35344g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f35345h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f35346i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f35347j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35348k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35349l;

    /* renamed from: m, reason: collision with root package name */
    public final v f35350m;

    /* renamed from: n, reason: collision with root package name */
    public final v f35351n;

    /* renamed from: o, reason: collision with root package name */
    public int f35352o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35353p;

    /* renamed from: q, reason: collision with root package name */
    public final m f35354q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35355r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsProductView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final f30 i() {
        return (f30) this.f35354q.c(this, f35340s[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f35349l) {
            return;
        }
        this.f35349l = true;
        w wVar = this.f35341d;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.d(new eu.v(i()));
        getViewTreeObserver().removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) this.f35351n.getValue());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        sr srVar;
        int size = View.MeasureSpec.getSize(i13);
        Map A4 = i().A4();
        if (A4 != null && (srVar = (sr) A4.get("345x")) != null) {
            double doubleValue = srVar.h().doubleValue();
            Double k13 = srVar.k();
            Intrinsics.checkNotNullExpressionValue(k13, "getWidth(...)");
            double doubleValue2 = doubleValue / k13.doubleValue();
            WebImageView webImageView = this.f35344g;
            ViewGroup.LayoutParams layoutParams = webImageView.getLayoutParams();
            layoutParams.height = (int) (size * doubleValue2);
            layoutParams.width = size;
            webImageView.loadUrl(srVar.j());
        }
        super.onMeasure(i13, i14);
    }

    public /* synthetic */ AdsProductView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsProductView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35347j = new Rect();
        this.f35350m = xk2.m.b(new q(context, 11));
        e eVar = new e(this, 7);
        this.f35351n = xk2.m.b(new lr.v(this, 10));
        f30 a13 = f30.r3().a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        this.f35354q = new m(0, a13, this);
        View.inflate(context, ps.q.ads_collection_product_view, this);
        View findViewById = findViewById(p.product_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById;
        this.f35344g = webImageView;
        View findViewById2 = findViewById(p.product_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        this.f35345h = gestaltText;
        View findViewById3 = findViewById(p.product_price);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f35346i = (GestaltText) findViewById3;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        setPaddingRelative(0, 0, 0, (int) getResources().getDimension(r0.pin_grid_padding_bottom));
        webImageView.Y(new l(webImageView, 0));
        float dimension = webImageView.getResources().getDimension(eo1.c.image_corner_radius_double);
        webImageView.g2(dimension, dimension, dimension, dimension);
        setOnClickListener(new j(this, 9));
        setOnLongClickListener(new n0(this, 2));
        if (gestaltText != null) {
            gestaltText.j(new xo.k(this, 20));
            getViewTreeObserver().addOnGlobalLayoutListener(eVar);
        } else {
            Intrinsics.r("productTitle");
            throw null;
        }
    }
}
