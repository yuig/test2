package jc0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import rq.l2;

/* loaded from: classes5.dex */
public final class n extends g {
    public Function0 A;

    /* renamed from: n, reason: collision with root package name */
    public m60.w f75422n;

    /* renamed from: o, reason: collision with root package name */
    public f0 f75423o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout f75424p;

    /* renamed from: q, reason: collision with root package name */
    public final LinearLayout f75425q;

    /* renamed from: r, reason: collision with root package name */
    public final ViewGroup f75426r;

    /* renamed from: s, reason: collision with root package name */
    public final ScrollView f75427s;

    /* renamed from: t, reason: collision with root package name */
    public final ScrollView f75428t;

    /* renamed from: u, reason: collision with root package name */
    public final ViewGroup f75429u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltButton f75430v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltButton f75431w;

    /* renamed from: x, reason: collision with root package name */
    public Function0 f75432x;

    /* renamed from: y, reason: collision with root package name */
    public final GestaltButton f75433y;

    /* renamed from: z, reason: collision with root package name */
    public final GestaltButton f75434z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        this(context, false);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final f0 C() {
        f0 f0Var = this.f75423o;
        if (f0Var != null) {
            return f0Var;
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }

    public final void D(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        pk.a0.v1(this.f75430v);
        GestaltButton gestaltButton = this.f75431w;
        if (gestaltButton != null) {
            pk.a0.v1(gestaltButton);
        }
        this.f75432x = action;
        bs1.c.R1(this.f75426r, true);
    }

    public final void L(int i13) {
        String closeButtonLabel = getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(closeButtonLabel, "getString(...)");
        Intrinsics.checkNotNullParameter(closeButtonLabel, "closeButtonLabel");
        this.f75430v.d(new l2(closeButtonLabel, 29));
        GestaltButton gestaltButton = this.f75431w;
        if (gestaltButton != null) {
            gestaltButton.d(new l(closeButtonLabel, 0));
        }
    }

    public final void T(boolean z13) {
        this.f75430v.d(new cp.t(z13, 27));
        bs1.c.R1(this.f75426r, z13);
    }

    public final void X(int i13) {
        String confirmText = getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(confirmText, "getString(...)");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        this.f75433y.d(new l(confirmText, 1));
        GestaltButton gestaltButton = this.f75434z;
        if (gestaltButton != null) {
            gestaltButton.d(new l(confirmText, 2));
        }
    }

    public final void Y(boolean z13) {
        this.f75433y.d(new cp.t(z13, 28));
    }

    public final void Z(int i13, int i14, int i15, int i16) {
        LinearLayout linearLayout = this.f75424p;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i13);
        marginLayoutParams.topMargin = i14;
        marginLayoutParams.setMarginEnd(i15);
        marginLayoutParams.bottomMargin = i16;
        linearLayout.setLayoutParams(marginLayoutParams);
    }

    public final void a0() {
        GestaltButton gestaltButton = this.f75431w;
        boolean z13 = true;
        if (gestaltButton != null) {
            gestaltButton.d(new cp.t(z13, 29));
        }
        bs1.c.R1(this.f75429u, true);
        ScrollView scrollView = this.f75428t;
        if (scrollView != null) {
            scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        }
    }

    public final void d0(boolean z13) {
        GestaltButton gestaltButton = this.f75434z;
        if (gestaltButton != null) {
            gestaltButton.d(new m(z13, 0));
        }
    }

    public final void x(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f75425q.addView(view);
    }

    public final m60.w z() {
        m60.w wVar = this.f75422n;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, boolean z13) {
        super(context, 0);
        GestaltButton d2;
        GestaltButton d13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 0;
        this.f75432x = j.f75408j;
        this.A = j.f75409k;
        gm1.a aVar = new gm1.a(this) { // from class: jc0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f75407b;

            {
                this.f75407b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i14 = i13;
                n this$0 = this.f75407b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        int j13 = event.j();
                        if (j13 != ga2.d.close_button && j13 != ga2.d.close_button_sticky) {
                            if (j13 == ga2.d.confirm_button || j13 == ga2.d.confirm_button_sticky) {
                                this$0.A.invoke();
                                break;
                            }
                        } else {
                            this$0.f75432x.invoke();
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        a.c.y(this$0.z());
                        break;
                }
            }
        };
        if (!z13) {
            q(false);
        } else {
            ViewGroup viewGroup = this.f44753e;
            if (viewGroup != null) {
                viewGroup.setBackgroundResource(eo1.d.lego_modal_bg);
            }
        }
        int i14 = eo1.d.lego_modal_bg;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i14));
        View findViewById = findViewById(ga2.d.lego_modal_container);
        LinearLayout linearLayout = (LinearLayout) findViewById;
        linearLayout.setVisibility(0);
        View findViewById2 = linearLayout.findViewById(ga2.d.lego_modal_content_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f75425q = (LinearLayout) findViewById2;
        View findViewById3 = linearLayout.findViewById(ga2.d.close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        this.f75430v = gestaltButton;
        View findViewById4 = linearLayout.findViewById(ga2.d.confirm_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById4;
        this.f75433y = gestaltButton2;
        View findViewById5 = linearLayout.findViewById(ga2.d.lego_close_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f75426r = (ViewGroup) findViewById5;
        linearLayout.setClipToOutline(true);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f75424p = linearLayout;
        View findViewById6 = findViewById(ga2.d.modal_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f75427s = (ScrollView) findViewById6;
        this.f75428t = (ScrollView) findViewById(ga2.d.lego_modal_scroll_view);
        GestaltButton gestaltButton3 = (GestaltButton) findViewById(ga2.d.close_button_sticky);
        this.f75431w = gestaltButton3;
        GestaltButton gestaltButton4 = (GestaltButton) findViewById(ga2.d.confirm_button_sticky);
        this.f75434z = gestaltButton4;
        this.f75429u = (ViewGroup) findViewById(ga2.d.lego_close_container_sticky);
        this.f44755g = (ViewGroup) findViewById(ga2.d.modal_list_container);
        this.f75432x = new lp.j(this, 1);
        gestaltButton.d(k.f75412k).e(aVar);
        if (gestaltButton3 != null && (d13 = gestaltButton3.d(k.f75413l)) != null) {
            d13.e(aVar);
        }
        gestaltButton2.d(k.f75414m).e(aVar);
        if (gestaltButton4 == null || (d2 = gestaltButton4.d(k.f75415n)) == null) {
            return;
        }
        d2.e(aVar);
    }
}
