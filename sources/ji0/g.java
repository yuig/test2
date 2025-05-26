package ji0;

import android.content.Context;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import lh0.y1;
import m60.u;
import nx.d0;
import pk.a0;
import xo.s;

/* loaded from: classes5.dex */
public final class g extends s {

    /* renamed from: d, reason: collision with root package name */
    public final String f76260d;

    /* renamed from: e, reason: collision with root package name */
    public d0 f76261e;

    /* renamed from: f, reason: collision with root package name */
    public lb2.d f76262f;

    /* renamed from: g, reason: collision with root package name */
    public y1 f76263g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltButton f76264h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltButton f76265i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnClickListener f76266j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnClickListener f76267k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String emailAddress) {
        super(context, 4);
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        this.f76260d = emailAddress;
        View.inflate(getContext(), vq1.c.safe_mode_modal, this);
        final int i13 = 1;
        setOrientation(1);
        final int i14 = 0;
        ((GestaltButton) findViewById(vq1.b.ok_button)).d(f.f76251k).e(new gm1.a(this) { // from class: ji0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f76249b;

            {
                this.f76249b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                g this$0 = this.f76249b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        a.c.y(u.f85943a);
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        lb2.d dVar = this$0.f76262f;
                        if (dVar == null) {
                            Intrinsics.r("accountManager");
                            throw null;
                        }
                        Context context2 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        lb2.d.b(dVar, context2, this$0.f76260d, false, 4);
                        a.c.y(u.f85943a);
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d0 d0Var = this$0.f76261e;
                        if (d0Var == null) {
                            Intrinsics.r("pinalytics");
                            throw null;
                        }
                        d0Var.X(u0.GPLUS_CONNECT);
                        View.OnClickListener onClickListener = this$0.f76267k;
                        if (onClickListener != null) {
                            onClickListener.onClick(this$0.f76264h);
                        }
                        a.c.y(u.f85943a);
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d0 d0Var2 = this$0.f76261e;
                        if (d0Var2 == null) {
                            Intrinsics.r("pinalytics");
                            throw null;
                        }
                        d0Var2.X(u0.FACEBOOK_CONNECT);
                        View.OnClickListener onClickListener2 = this$0.f76266j;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(this$0.f76265i);
                        }
                        a.c.y(u.f85943a);
                        return;
                }
            }
        });
        ((GestaltButton) findViewById(vq1.b.reset_button)).d(f.f76252l).e(new gm1.a(this) { // from class: ji0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f76249b;

            {
                this.f76249b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i13;
                g this$0 = this.f76249b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        a.c.y(u.f85943a);
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        lb2.d dVar = this$0.f76262f;
                        if (dVar == null) {
                            Intrinsics.r("accountManager");
                            throw null;
                        }
                        Context context2 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        lb2.d.b(dVar, context2, this$0.f76260d, false, 4);
                        a.c.y(u.f85943a);
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d0 d0Var = this$0.f76261e;
                        if (d0Var == null) {
                            Intrinsics.r("pinalytics");
                            throw null;
                        }
                        d0Var.X(u0.GPLUS_CONNECT);
                        View.OnClickListener onClickListener = this$0.f76267k;
                        if (onClickListener != null) {
                            onClickListener.onClick(this$0.f76264h);
                        }
                        a.c.y(u.f85943a);
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d0 d0Var2 = this$0.f76261e;
                        if (d0Var2 == null) {
                            Intrinsics.r("pinalytics");
                            throw null;
                        }
                        d0Var2.X(u0.FACEBOOK_CONNECT);
                        View.OnClickListener onClickListener2 = this$0.f76266j;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(this$0.f76265i);
                        }
                        a.c.y(u.f85943a);
                        return;
                }
            }
        });
        final int i15 = 2;
        this.f76264h = ((GestaltButton) findViewById(vq1.b.g_button)).d(f.f76253m).e(new gm1.a(this) { // from class: ji0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f76249b;

            {
                this.f76249b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                g this$0 = this.f76249b;
                switch (i152) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        a.c.y(u.f85943a);
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        lb2.d dVar = this$0.f76262f;
                        if (dVar == null) {
                            Intrinsics.r("accountManager");
                            throw null;
                        }
                        Context context2 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        lb2.d.b(dVar, context2, this$0.f76260d, false, 4);
                        a.c.y(u.f85943a);
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d0 d0Var = this$0.f76261e;
                        if (d0Var == null) {
                            Intrinsics.r("pinalytics");
                            throw null;
                        }
                        d0Var.X(u0.GPLUS_CONNECT);
                        View.OnClickListener onClickListener = this$0.f76267k;
                        if (onClickListener != null) {
                            onClickListener.onClick(this$0.f76264h);
                        }
                        a.c.y(u.f85943a);
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d0 d0Var2 = this$0.f76261e;
                        if (d0Var2 == null) {
                            Intrinsics.r("pinalytics");
                            throw null;
                        }
                        d0Var2.X(u0.FACEBOOK_CONNECT);
                        View.OnClickListener onClickListener2 = this$0.f76266j;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(this$0.f76265i);
                        }
                        a.c.y(u.f85943a);
                        return;
                }
            }
        });
        final int i16 = 3;
        GestaltButton e13 = ((GestaltButton) findViewById(vq1.b.fb_button)).d(f.f76254n).e(new gm1.a(this) { // from class: ji0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f76249b;

            {
                this.f76249b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i16;
                g this$0 = this.f76249b;
                switch (i152) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        a.c.y(u.f85943a);
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        lb2.d dVar = this$0.f76262f;
                        if (dVar == null) {
                            Intrinsics.r("accountManager");
                            throw null;
                        }
                        Context context2 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        lb2.d.b(dVar, context2, this$0.f76260d, false, 4);
                        a.c.y(u.f85943a);
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d0 d0Var = this$0.f76261e;
                        if (d0Var == null) {
                            Intrinsics.r("pinalytics");
                            throw null;
                        }
                        d0Var.X(u0.GPLUS_CONNECT);
                        View.OnClickListener onClickListener = this$0.f76267k;
                        if (onClickListener != null) {
                            onClickListener.onClick(this$0.f76264h);
                        }
                        a.c.y(u.f85943a);
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d0 d0Var2 = this$0.f76261e;
                        if (d0Var2 == null) {
                            Intrinsics.r("pinalytics");
                            throw null;
                        }
                        d0Var2.X(u0.FACEBOOK_CONNECT);
                        View.OnClickListener onClickListener2 = this$0.f76266j;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(this$0.f76265i);
                        }
                        a.c.y(u.f85943a);
                        return;
                }
            }
        });
        this.f76265i = e13;
        y1 y1Var = this.f76263g;
        if (y1Var == null) {
            Intrinsics.r("identityExperiments");
            throw null;
        }
        if (!y1Var.f()) {
            e13.d(f.f76250j);
            return;
        }
        View findViewById = findViewById(vq1.b.alternate_login_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        a0.q((GestaltText) findViewById, bs1.c.j2(new String[0], vq1.d.safe_mode_alternate_login_text_google_only));
        e13.d(f.f76255o);
    }
}
