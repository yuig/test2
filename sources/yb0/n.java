package yb0;

import android.content.Context;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import kh2.b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.u;
import m60.w;
import nt.c2;
import pk.a0;
import rq.t0;
import t80.r;

/* loaded from: classes5.dex */
public class n extends ScrollView implements q {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f138503p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final w f138504a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f138505b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f138506c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f138507d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButtonGroup f138508e;

    /* renamed from: f, reason: collision with root package name */
    public final int f138509f;

    /* renamed from: g, reason: collision with root package name */
    public final int f138510g;

    /* renamed from: h, reason: collision with root package name */
    public final int f138511h;

    /* renamed from: i, reason: collision with root package name */
    public final int f138512i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnClickListener f138513j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnClickListener f138514k;

    /* renamed from: l, reason: collision with root package name */
    public Function0 f138515l;

    /* renamed from: m, reason: collision with root package name */
    public Function1 f138516m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f138517n;

    /* renamed from: o, reason: collision with root package name */
    public final int f138518o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context);
        w eventManager = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(eventManager, "getInstance(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f138504a = eventManager;
        this.f138512i = 3;
        int i13 = 1;
        this.f138517n = true;
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_600);
        this.f138518o = dimensionPixelSize;
        this.f138510g = -1;
        this.f138511h = -2;
        this.f138509f = 81;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.i(new r(20, gestaltText, this));
        gestaltText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        a0.h1(gestaltText, eo1.a.space_100);
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.f138505b = gestaltText;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText2 = new GestaltText(6, context3, (AttributeSet) null);
        gestaltText2.i(l.f138498m);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = gestaltText2.getResources().getDimensionPixelSize(eo1.c.space_200);
        gestaltText2.setLayoutParams(marginLayoutParams);
        a0.h1(gestaltText2, eo1.a.space_100);
        Intrinsics.checkNotNullParameter(gestaltText2, "<set-?>");
        this.f138506c = gestaltText2;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltButtonGroup gestaltButtonGroup = new GestaltButtonGroup(6, context4, (AttributeSet) null);
        gestaltButtonGroup.a(l.f138497l);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = gestaltButtonGroup.getResources().getDimensionPixelSize(eo1.c.space_800);
        gestaltButtonGroup.setLayoutParams(layoutParams);
        Intrinsics.checkNotNullParameter(gestaltButtonGroup, "<set-?>");
        this.f138508e = gestaltButtonGroup;
        LinearLayout linearLayout = new LinearLayout(getContext());
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.f138507d = linearLayout;
        i().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        i().setPaddingRelative(dimensionPixelSize, getResources().getDimensionPixelSize(eo1.c.space_800), dimensionPixelSize, getResources().getDimensionPixelSize(eo1.c.space_600));
        i().setOrientation(1);
        i().setBackgroundResource(eo1.d.lego_modal_bg);
        LinearLayout i14 = i();
        GestaltText gestaltText3 = this.f138505b;
        if (gestaltText3 == null) {
            Intrinsics.r("titleTv");
            throw null;
        }
        i14.addView(gestaltText3);
        i14.addView(j());
        i14.addView(h());
        addView(i());
        h().b(new b(this, i13));
    }

    @Override // yb0.q
    public final int a() {
        return this.f138509f;
    }

    @Override // yb0.q
    public final void b(d dismissReason) {
        Intrinsics.checkNotNullParameter(dismissReason, "dismissReason");
        Function1 function1 = this.f138516m;
        if (function1 != null) {
            function1.invoke(dismissReason);
        }
    }

    @Override // yb0.q
    public final CharSequence c() {
        return a0.R(j());
    }

    @Override // yb0.q
    public final boolean d() {
        return this.f138517n;
    }

    @Override // yb0.q
    public final int e() {
        return this.f138510g;
    }

    public final void f() {
        fm1.c cVar = h().d().f28012a.f139302c;
        fm1.c cVar2 = fm1.c.GONE;
        if (cVar == cVar2 || h().d().f28013b.f139302c == cVar2) {
            return;
        }
        h().measure(0, 0);
        int H0 = bs1.c.H0(h());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (H0 >= b0.o0(bs1.c.k0(context)) - (this.f138518o * 2)) {
            h().a(l.f138496k);
        }
    }

    public final void g(d dismissReason) {
        Intrinsics.checkNotNullParameter(dismissReason, "dismissReason");
        this.f138504a.d(new c(dismissReason));
    }

    @Override // yb0.q
    public final int getLayoutHeight() {
        return this.f138511h;
    }

    @Override // yb0.q
    public final CharSequence getTitle() {
        GestaltText gestaltText = this.f138505b;
        if (gestaltText != null) {
            return a0.R(gestaltText);
        }
        Intrinsics.r("titleTv");
        throw null;
    }

    public final GestaltButtonGroup h() {
        GestaltButtonGroup gestaltButtonGroup = this.f138508e;
        if (gestaltButtonGroup != null) {
            return gestaltButtonGroup;
        }
        Intrinsics.r("alertButtonGroup");
        throw null;
    }

    public final LinearLayout i() {
        LinearLayout linearLayout = this.f138507d;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("mainLayout");
        throw null;
    }

    public final GestaltText j() {
        GestaltText gestaltText = this.f138506c;
        if (gestaltText != null) {
            return gestaltText;
        }
        Intrinsics.r("subTitleTv");
        throw null;
    }

    public final void k(boolean z13) {
        this.f138517n = z13;
    }

    public final void l(View.OnClickListener onClickListener) {
        this.f138514k = onClickListener;
    }

    public final void m(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() <= 0) {
            kh2.r.t(h(), fm1.c.GONE);
        } else {
            kh2.r.s(h(), bs1.c.h2(value));
            f();
        }
    }

    public final void n(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f138514k = new t0(3, action);
    }

    public final void o(boolean z13) {
        kh2.r.t(h(), d7.b.Z(z13));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Function0 function0 = this.f138515l;
        if (function0 != null) {
            function0.invoke();
        }
        postDelayed(new c2(this, 7), 500L);
    }

    public final void p(View.OnClickListener onClickListener) {
        this.f138513j = onClickListener;
    }

    public final void q(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() <= 0) {
            kh2.r.r(h(), fm1.c.GONE);
        } else {
            kh2.r.q(h(), bs1.c.h2(value));
            f();
        }
    }

    public final void r(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f138513j = new t0(4, action);
    }

    public final void s(Function1 function1) {
        this.f138516m = function1;
    }

    public final void t(Function0 function0) {
        this.f138515l = function0;
    }

    public final void u(CharSequence charSequence) {
        GestaltText j13 = j();
        if (charSequence == null || charSequence.length() == 0) {
            a0.k0(j13);
            return;
        }
        if (StringsKt.E(charSequence, "<a href", false)) {
            charSequence = j1.a0(charSequence.toString());
        }
        j13.i(new ip.d(9, charSequence));
        Intrinsics.f(charSequence);
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence instanceof Spanned) {
            Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), URLSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            if (!(spans.length == 0)) {
                j13.i(l.f138499n);
            }
        }
    }

    public final void v(vn1.b textAlignment) {
        Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
        j().i(new m(textAlignment, 0));
    }

    public final void w(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        GestaltText gestaltText = this.f138505b;
        if (gestaltText != null) {
            a0.q(gestaltText, bs1.c.h2(value));
        } else {
            Intrinsics.r("titleTv");
            throw null;
        }
    }
}
