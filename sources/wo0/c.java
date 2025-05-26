package wo0;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.gridlayout.widget.GridLayout;
import ck2.i;
import com.pinterest.api.model.hk0;
import com.pinterest.api.model.xk;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kh2.g3;
import kl2.l;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import m60.r0;
import m60.s0;
import m60.t0;
import rq.o2;
import uj2.q;
import x02.x2;
import xo0.x;
import yk1.n;
import yk1.r;
import z32.n1;

/* loaded from: classes5.dex */
public final class c extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f130624a;

    /* renamed from: b, reason: collision with root package name */
    public final String f130625b;

    /* renamed from: c, reason: collision with root package name */
    public final j f130626c;

    /* renamed from: d, reason: collision with root package name */
    public final pb0.g f130627d;

    /* renamed from: e, reason: collision with root package name */
    public final l f130628e;

    /* renamed from: f, reason: collision with root package name */
    public final c91.f f130629f;

    /* renamed from: g, reason: collision with root package name */
    public final g0 f130630g;

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f130631h;

    /* renamed from: i, reason: collision with root package name */
    public List f130632i;

    /* renamed from: j, reason: collision with root package name */
    public String f130633j;

    /* renamed from: k, reason: collision with root package name */
    public String f130634k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f130635l;

    /* renamed from: m, reason: collision with root package name */
    public String f130636m;

    /* renamed from: n, reason: collision with root package name */
    public HashMap f130637n;

    /* renamed from: o, reason: collision with root package name */
    public n1 f130638o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f130639p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f130640q;

    /* renamed from: r, reason: collision with root package name */
    public String f130641r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uk1.d pinalytics, q networkStateStream, x2 userRepository, String defaultReferrerSource, l lVar, c91.f fVar, g0 g0Var, Function1 function1) {
        super(pinalytics, networkStateStream);
        j storyImpressionHelper = new j(16, 0);
        pb0.g clock = new pb0.g();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(defaultReferrerSource, "defaultReferrerSource");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f130624a = userRepository;
        this.f130625b = defaultReferrerSource;
        this.f130626c = storyImpressionHelper;
        this.f130627d = clock;
        this.f130628e = lVar;
        this.f130629f = fVar;
        this.f130630g = g0Var;
        this.f130631h = function1;
        this.f130632i = q0.f80391a;
        this.f130633j = "";
        this.f130635l = new LinkedHashSet();
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        xo0.h view = (xo0.h) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((xo0.g) view).B = this;
        q3();
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        this.f130635l.clear();
        super.onUnbind();
    }

    public final void q3() {
        if (isBound()) {
            ((xo0.g) ((xo0.h) getView())).removeAllViewsInLayout();
            xo0.h hVar = (xo0.h) getView();
            String str = this.f130634k;
            n1 n1Var = this.f130638o;
            xo0.g gVar = (xo0.g) hVar;
            gVar.getClass();
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.f18555b = GridLayout.q(Integer.MIN_VALUE, gVar.getResources().getInteger(c80.c.bubble_container_col), gVar.A, 0.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = gVar.getResources().getDimensionPixelOffset(r0.margin_half);
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = gVar.getResources().getDimensionPixelOffset(r0.margin_quarter);
            Context context = gVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rm1.q qVar = null;
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            gestaltText.i(new kl0.c(str, 11));
            int i13 = n1Var == null ? -1 : xo0.f.f135591a[n1Var.ordinal()];
            if (i13 == 1) {
                qVar = rm1.q.TAG;
            } else if (i13 == 2) {
                qVar = rm1.q.SHOPPING_BAG;
            }
            if (qVar != null) {
                gestaltText.i(new o2(qVar, 5));
            }
            gestaltText.setLayoutParams(layoutParams);
            gestaltText.setPaddingRelative(gestaltText.getResources().getDimensionPixelOffset(r0.margin_three_quarter), gestaltText.getPaddingTop(), gestaltText.getResources().getDimensionPixelOffset(r0.margin_three_quarter), gestaltText.getResources().getDimensionPixelOffset(r0.margin_quarter));
            gVar.addView(gestaltText, 0);
            int size = this.f130632i.size();
            for (int i14 = 0; i14 < size; i14++) {
                xk xkVar = (xk) this.f130632i.get(i14);
                xo0.g gVar2 = (xo0.g) ((xo0.h) getView());
                gVar2.getClass();
                Context context2 = gVar2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                x xVar = new x(context2);
                GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams();
                layoutParams2.f18555b = GridLayout.q(Integer.MIN_VALUE, 1, GridLayout.f18532z, 1.0f);
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                xVar.setLayoutParams(layoutParams2);
                int i15 = gVar2.C;
                xVar.setPaddingRelative(i15, i15, i15, i15);
                gVar2.addView(xVar);
                Integer j13 = xkVar.j();
                xVar.setId(j13.intValue() == hk0.TRENDING.getValue() ? t0.trending_bubble : j13.intValue() == hk0.BUBBLE_ANNOTATION.getValue() ? t0.autocomplete_bubble : -1);
                a listener = new a(this, xkVar, i14, xVar);
                Intrinsics.checkNotNullParameter(listener, "listener");
                xVar.f135631j = listener;
                String b13 = n10.b.b(xkVar);
                uo0.g.f122925a.getClass();
                xVar.k(b13, n10.b.d(xkVar, uo0.f.f122924b));
                String n13 = xkVar.n();
                Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
                xVar.l(n13, true);
                n1 k13 = xkVar.k();
                Context context3 = xVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                BitmapDrawable j03 = g3.j0(context3, k13);
                ImageView imageView = xVar.f135633l;
                imageView.setImageDrawable(j03);
                bs1.c.R1(imageView, j03 != null);
                String str2 = xkVar.f43721m;
                if (str2 == null || str2.length() == 0) {
                    xVar.f();
                } else {
                    String str3 = xkVar.f43721m;
                    Intrinsics.checkNotNullExpressionValue(str3, "getCuratorUid(...)");
                    xj2.c F = this.f130624a.L(str3).F(new go0.j(17, new b(xVar, 0)), new go0.j(18, new b(xVar, 1)), i.f27923c, i.f27924d);
                    Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                    addDisposable(F);
                }
                if (this.f130639p) {
                    xVar.f();
                    Context context4 = xVar.getContext();
                    int i16 = s0.ic_try_on_grid_nonpds;
                    Object obj = d5.a.f53679a;
                    Drawable drawable = context4.getDrawable(i16);
                    imageView.setImageDrawable(drawable);
                    bs1.c.R1(imageView, drawable != null);
                }
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        xo0.h view = (xo0.h) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((xo0.g) view).B = this;
        q3();
    }
}
