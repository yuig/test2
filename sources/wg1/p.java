package wg1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.api.model.ih;
import com.pinterest.feature.style.spotlight.view.SpotlightBoardImmersiveHeaderView;
import com.pinterest.feature.style.spotlight.view.SpotlightBoardView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.e4;
import m60.r0;
import we1.a2;
import we1.n1;

/* loaded from: classes5.dex */
public final class p extends xa.a {

    /* renamed from: c, reason: collision with root package name */
    public final Context f129812c;

    /* renamed from: d, reason: collision with root package name */
    public final yk1.j f129813d;

    /* renamed from: e, reason: collision with root package name */
    public final tq0.a f129814e;

    /* renamed from: f, reason: collision with root package name */
    public final tq0.c f129815f;

    /* renamed from: g, reason: collision with root package name */
    public final tq0.j f129816g;

    /* renamed from: h, reason: collision with root package name */
    public final tq0.c f129817h;

    /* renamed from: i, reason: collision with root package name */
    public final ku1.l f129818i;

    /* renamed from: j, reason: collision with root package name */
    public final uk1.d f129819j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f129820k;

    /* renamed from: l, reason: collision with root package name */
    public final e4 f129821l;

    /* renamed from: m, reason: collision with root package name */
    public List f129822m;

    /* renamed from: n, reason: collision with root package name */
    public ih f129823n;

    /* renamed from: o, reason: collision with root package name */
    public String f129824o;

    /* renamed from: p, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.q f129825p;

    public p(Context context, yk1.j mvpBinder, tq0.a articleImpressionLogger, tq0.c todayArticleImpressionLogger, tq0.j pinImpressionLogger, tq0.c boardImpressionLogger, ku1.l uriNavigator, uk1.d presenterPinalytics, boolean z13, e4 experiments) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(articleImpressionLogger, "articleImpressionLogger");
        Intrinsics.checkNotNullParameter(todayArticleImpressionLogger, "todayArticleImpressionLogger");
        Intrinsics.checkNotNullParameter(pinImpressionLogger, "pinImpressionLogger");
        Intrinsics.checkNotNullParameter(boardImpressionLogger, "boardImpressionLogger");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f129812c = context;
        this.f129813d = mvpBinder;
        this.f129814e = articleImpressionLogger;
        this.f129815f = todayArticleImpressionLogger;
        this.f129816g = pinImpressionLogger;
        this.f129817h = boardImpressionLogger;
        this.f129818i = uriNavigator;
        this.f129819j = presenterPinalytics;
        this.f129820k = z13;
        this.f129821l = experiments;
        this.f129822m = new ArrayList();
        this.f129825p = new com.google.android.gms.common.api.internal.q(context.getResources().getIntArray(i82.a.spotlight_brand_palette), true);
    }

    @Override // xa.a
    public final void a(ViewGroup container, int i13, Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        container.removeView((View) object);
    }

    @Override // xa.a
    public final int b() {
        return this.f129822m.size() + (this.f129823n == null ? 0 : 1);
    }

    @Override // xa.a
    public final Object e(ViewGroup container, int i13) {
        View view;
        Intrinsics.checkNotNullParameter(container, "container");
        int size = this.f129822m.size();
        int i14 = 8;
        int i15 = 6;
        AttributeSet attributeSet = null;
        Context context = this.f129812c;
        if (i13 == size) {
            LinearLayout linearLayout = new LinearLayout(context);
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GestaltButton.LargeSecondaryButton largeSecondaryButton = new GestaltButton.LargeSecondaryButton(6, context2, (AttributeSet) null);
            largeSecondaryButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            largeSecondaryButton.d(new n1(this, 13));
            linearLayout.addView(largeSecondaryButton.e(new la1.k(i14, linearLayout, this)));
            linearLayout.setGravity(17);
            container.addView(linearLayout);
            return linearLayout;
        }
        boolean z13 = this.f129820k;
        if (z13 && (this.f129822m.get(i13) instanceof ug1.m)) {
            b0 b0Var = new b0(context);
            view = b0Var;
            if (hf0.b.q()) {
                int dimensionPixelSize = b0Var.getResources().getDimensionPixelSize(r0.margin_one_and_a_half) + b0Var.getResources().getDimensionPixelSize(ga2.b.lego_search_bar_height);
                LinearLayout linearLayout2 = b0Var.f129724k;
                linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(linearLayout2.getResources().getDimensionPixelSize(i82.b.article_immersive_header_height_large), -1));
                PinterestVideoView pinterestVideoView = b0Var.f129725l;
                ViewGroup.LayoutParams layoutParams = pinterestVideoView.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = dimensionPixelSize;
                marginLayoutParams.bottomMargin = pinterestVideoView.getResources().getDimensionPixelSize(ga2.b.lego_search_bar_height);
                marginLayoutParams.setMarginStart(pinterestVideoView.getResources().getDimensionPixelSize(i82.b.article_immersive_header_margin));
                pinterestVideoView.M(pinterestVideoView.getResources().getDimensionPixelSize(eo1.c.space_800));
                ViewGroup.LayoutParams layoutParams2 = b0Var.f129726m.getLayoutParams();
                Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = dimensionPixelSize;
                boolean m13 = hf0.b.m();
                GestaltText gestaltText = b0Var.f129728o;
                if (m13) {
                    gestaltText.i(y.f129864p);
                }
                Integer num = b0Var.f129730q;
                view = b0Var;
                if (num != null) {
                    int intValue = num.intValue();
                    Context context3 = b0Var.getContext();
                    int i16 = eo1.b.color_white_0;
                    Object obj = d5.a.f53679a;
                    view = b0Var;
                    if (f5.c.d(intValue, context3.getColor(i16)) < 4.5d) {
                        b0Var.f129727n.i(y.f129865q);
                        gestaltText.i(y.f129866r);
                        view = b0Var;
                    }
                }
            }
        } else if (z13 && (this.f129822m.get(i13) instanceof ug1.k)) {
            nx.d0 d0Var = this.f129819j.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            view = new z(context, d0Var, this.f129821l);
        } else {
            com.google.android.gms.common.api.internal.q qVar = this.f129825p;
            if (z13 && (this.f129822m.get(i13) instanceof ug1.e)) {
                View spotlightBoardImmersiveHeaderView = new SpotlightBoardImmersiveHeaderView(i15, context, attributeSet);
                spotlightBoardImmersiveHeaderView.setBackgroundColor(qVar.b());
                Object obj2 = this.f129822m.get(i13);
                Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.feature.style.spotlight.presenter.SpotlightBoardPresenter");
                ug1.e listener = (ug1.e) obj2;
                Intrinsics.checkNotNullParameter(listener, "listener");
                spotlightBoardImmersiveHeaderView.setOnClickListener(new a2(listener, i14));
                view = spotlightBoardImmersiveHeaderView;
            } else if (this.f129822m.get(i13) instanceof ug1.e) {
                View spotlightBoardView = new SpotlightBoardView(i15, context, attributeSet);
                Object obj3 = this.f129822m.get(i13);
                Intrinsics.g(obj3, "null cannot be cast to non-null type com.pinterest.feature.style.spotlight.presenter.SpotlightBoardPresenter");
                ug1.e listener2 = (ug1.e) obj3;
                Intrinsics.checkNotNullParameter(listener2, "listener");
                spotlightBoardView.setOnClickListener(new a2(listener2, i14));
                view = spotlightBoardView;
            } else {
                view = (z13 && (this.f129822m.get(i13) instanceof ug1.l)) ? new k(context, qVar) : (z13 && hf0.b.q()) ? new n(context, qVar) : z13 ? new k(context, qVar) : this.f129822m.get(i13) instanceof ug1.n ? new d0(context) : new e(context);
            }
        }
        view.setVisibility(0);
        if (z13 && (this.f129822m.get(i13) instanceof ug1.k)) {
            Object obj4 = this.f129822m.get(i13);
            Intrinsics.g(obj4, "null cannot be cast to non-null type com.pinterest.feature.style.spotlight.presenter.SpotlightPinCellPresenter");
            ug1.k kVar = (ug1.k) obj4;
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            kVar.f122216t = measuredHeight;
            kVar.f122215s = measuredWidth;
        }
        this.f129813d.d(view, (yk1.m) this.f129822m.get(i13));
        container.addView(view);
        return view;
    }

    @Override // xa.a
    public final boolean f(View view, Object object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "object");
        return Intrinsics.d(view, object);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r35) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.p.k(int):void");
    }

    public final boolean l(int i13) {
        yk1.m mVar = (yk1.m) CollectionsKt.U(i13, this.f129822m);
        return (mVar instanceof ug1.k) && ((ug1.k) mVar).q3();
    }

    public final void m(int i13) {
        int i14 = i13 - 1;
        int i15 = i13 + 1;
        if (i14 > i15) {
            return;
        }
        while (true) {
            if (i14 >= 0 && i14 < b()) {
                k(i14);
            }
            if (i14 == i15) {
                return;
            } else {
                i14++;
            }
        }
    }

    public final void n(int i13, int i14) {
        int b13 = b();
        for (int i15 = 0; i15 < b13; i15++) {
            if (i15 > i13 + i14 || i15 < i13 - i14) {
                k(i15);
            } else {
                o(i15);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        if (r1.f122209m != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r33) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.p.o(int):void");
    }
}
