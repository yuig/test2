package wg1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes5.dex */
public final class d0 extends xi0.f implements tg1.h, af2.c {

    /* renamed from: m, reason: collision with root package name */
    public ye2.o f129753m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f129754n;

    /* renamed from: o, reason: collision with root package name */
    public final ku1.l f129755o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout f129756p;

    /* renamed from: q, reason: collision with root package name */
    public final LinearLayout f129757q;

    /* renamed from: r, reason: collision with root package name */
    public final GestaltAvatarGroup f129758r;

    /* renamed from: s, reason: collision with root package name */
    public final GestaltText f129759s;

    /* renamed from: t, reason: collision with root package name */
    public final GestaltText f129760t;

    /* renamed from: u, reason: collision with root package name */
    public final WebImageView f129761u;

    /* renamed from: v, reason: collision with root package name */
    public final WebImageView f129762v;

    /* renamed from: w, reason: collision with root package name */
    public final WebImageView f129763w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f129764x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f129754n) {
            this.f129754n = true;
            this.f129755o = (ku1.l) ((jb) ((e0) generatedComponent())).f113485c.f114476s.get();
        }
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(y.f129869u);
        gestaltText.setPaddingRelative(gestaltText.getResources().getDimensionPixelSize(eo1.c.space_200), 0, 0, 0);
        this.f129759s = gestaltText;
        WebImageView X = X();
        this.f129761u = X;
        this.f129762v = X();
        this.f129763w = X();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.addView(X);
        this.f129764x = linearLayout;
        setElevation(getResources().getDimension(eo1.c.space_100));
        t(getResources().getDimensionPixelSize(i82.b.article_spotlight_radius));
        this.f135012i.i(new q0.d(context, 18));
        setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(i82.b.article_spotlight_width), getResources().getDimensionPixelSize(i82.b.article_spotlight_height)));
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(y.f129867s);
        this.f129760t = gestaltText2;
        GestaltAvatarGroup a13 = new GestaltAvatarGroup(6, context, (AttributeSet) null).a(y.f129868t);
        this.f129758r = a13;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        setVisibility(8);
        linearLayout2.addView(a13);
        linearLayout2.addView(gestaltText);
        this.f129757q = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(81);
        int dimensionPixelSize = linearLayout3.getResources().getDimensionPixelSize(eo1.c.space_300);
        linearLayout3.setPaddingRelative(dimensionPixelSize, linearLayout3.getPaddingTop(), dimensionPixelSize, linearLayout3.getResources().getDimensionPixelSize(eo1.c.space_600));
        linearLayout3.addView(gestaltText2);
        linearLayout3.addView(this.f135012i);
        linearLayout3.addView(linearLayout2);
        this.f129756p = linearLayout3;
    }

    @Override // xi0.f
    public final ku1.l D() {
        ku1.l lVar = this.f129755o;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.r("uriNavigator");
        throw null;
    }

    @Override // xi0.f
    public final void L() {
        addView(this.f129764x);
        addView(this.f129756p);
    }

    @Override // tg1.h
    public final void O(String str) {
        this.f129759s.i(new qf1.z(str, 10));
    }

    @Override // xi0.f, vi0.b
    public final void U2(String str) {
        setContentDescription(getResources().getString(i82.f.content_description_today_article_view, str));
    }

    public final WebImageView X() {
        WebImageView webImageView = new WebImageView(getContext());
        webImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.f52564p = new yv1.g(1);
        return webImageView;
    }

    @Override // vi0.b
    public final void c(String str) {
        this.f129760t.i(new qf1.z(str, 11));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129753m == null) {
            this.f129753m = new ye2.o(this);
        }
        return this.f129753m;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129753m == null) {
            this.f129753m = new ye2.o(this);
        }
        return this.f129753m.generatedComponent();
    }

    @Override // xi0.f, vi0.b
    public final void j1(vi0.c viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        GestaltText gestaltText = this.f135012i;
        pk.a0.p(gestaltText, viewModel.f125870h);
        WebImageView webImageView = this.f129761u;
        List list = viewModel.f125871i;
        webImageView.loadUrl((String) CollectionsKt.firstOrNull(list));
        int size = list.size();
        LinearLayout linearLayout = this.f129757q;
        LinearLayout linearLayout2 = this.f129764x;
        WebImageView webImageView2 = this.f129763w;
        WebImageView webImageView3 = this.f129762v;
        GestaltText gestaltText2 = this.f129759s;
        GestaltText gestaltText3 = this.f129760t;
        if (size > 1) {
            String str = (String) CollectionsKt.U(1, list);
            if (str != null) {
                webImageView3.loadUrl(str);
                linearLayout2.addView(webImageView3);
            }
            String str2 = (String) CollectionsKt.U(2, list);
            if (str2 != null) {
                webImageView2.loadUrl(str2);
                linearLayout2.addView(webImageView2);
            }
            gestaltText.i(y.A);
            gestaltText3.i(y.B);
            gestaltText2.i(y.C);
            yn2.h hVar = new yn2.h(yn2.c0.j(d7.b.O(linearLayout2), y.f129874z));
            while (hVar.hasNext()) {
                ((WebImageView) hVar.next()).setColorFilter(dl2.b.y0(this, eo1.a.color_background_dark_opacity_200));
            }
            linearLayout2.getLayoutParams().height = getResources().getDimensionPixelSize(i82.b.article_spotlight_height) / 2;
            linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), getResources().getDimensionPixelSize(eo1.c.ignore), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        } else {
            Intrinsics.g(webImageView3, "null cannot be cast to non-null type android.view.View");
            if (linearLayout2.indexOfChild(webImageView3) != -1) {
                linearLayout2.removeView(webImageView3);
            }
            Intrinsics.g(webImageView2, "null cannot be cast to non-null type android.view.View");
            if (linearLayout2.indexOfChild(webImageView2) != -1) {
                linearLayout2.removeView(webImageView2);
            }
            gestaltText.i(y.f129871w);
            gestaltText3.i(y.f129872x);
            gestaltText2.i(y.f129873y);
            yn2.h hVar2 = new yn2.h(yn2.c0.j(d7.b.O(linearLayout2), y.f129870v));
            while (hVar2.hasNext()) {
                ((WebImageView) hVar2.next()).setColorFilter(dl2.b.y0(this, eo1.a.color_background_dark_opacity_300));
            }
            linearLayout2.getLayoutParams().height = getResources().getDimensionPixelSize(i82.b.article_spotlight_height);
            linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), getResources().getDimensionPixelSize(eo1.c.space_400), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        }
        Context context = webImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        webImageView.setBackgroundColor(((Number) viewModel.f125872j.a(context)).intValue());
        T(viewModel.f125873k);
    }

    @Override // tg1.h
    public final void v(List avatarList) {
        Intrinsics.checkNotNullParameter(avatarList, "avatarList");
        this.f129758r.a(new w1.g(avatarList, 22));
        bs1.c.R1(this.f129757q, !avatarList.isEmpty());
    }

    @Override // xi0.f
    public final WebImageView x() {
        return this.f129761u;
    }
}
