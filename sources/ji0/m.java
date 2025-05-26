package ji0;

import android.content.Context;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import lh0.y1;
import m60.u;
import pk.a0;
import xo.s;

/* loaded from: classes5.dex */
public final class m extends s {

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton f76275d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButton f76276e;

    /* renamed from: f, reason: collision with root package name */
    public gz1.b f76277f;

    /* renamed from: g, reason: collision with root package name */
    public y1 f76278g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f76279h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnClickListener f76280i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, String email) {
        super(context, 5);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(email, "email");
        View.inflate(context, vq1.c.trouble_logging_in, this);
        final int i13 = 1;
        setOrientation(1);
        View findViewById = findViewById(vq1.b.email_sent_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        View findViewById2 = findViewById(vq1.b.ok_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        View findViewById3 = findViewById(vq1.b.facebook);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById3;
        this.f76275d = gestaltButton2;
        View findViewById4 = findViewById(vq1.b.google);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton3 = (GestaltButton) findViewById4;
        this.f76276e = gestaltButton3;
        gz1.b bVar = this.f76277f;
        if (bVar == null) {
            Intrinsics.r("googlePlayServices");
            throw null;
        }
        final int i14 = 0;
        if (!bVar.c(null, false, 0)) {
            a0.l0(gestaltButton3);
            View findViewById5 = findViewById(vq1.b.trouble_logging_in_other_ways);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
            a0.o((GestaltText) findViewById5, vq1.d.trouble_logging_in_other_ways_facebook_only, new Object[0]);
        }
        String string = getResources().getString(vq1.d.trouble_logging_in_email_sent);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        f0.h.n(context, gestaltText, string, email);
        gestaltButton3.e(new gm1.a(this) { // from class: ji0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f76274b;

            {
                this.f76274b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                m this$0 = this.f76274b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        sh.f.a().X(u0.GPLUS_CONNECT);
                        View.OnClickListener onClickListener = this$0.f76280i;
                        if (onClickListener != null) {
                            onClickListener.onClick(this$0.f76276e);
                        }
                        a.c.y(u.f85943a);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        sh.f.a().X(u0.FACEBOOK_CONNECT);
                        View.OnClickListener onClickListener2 = this$0.f76279h;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(this$0.f76275d);
                        }
                        a.c.y(u.f85943a);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        a.c.y(u.f85943a);
                        break;
                }
            }
        });
        gestaltButton2.e(new gm1.a(this) { // from class: ji0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f76274b;

            {
                this.f76274b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i13;
                m this$0 = this.f76274b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        sh.f.a().X(u0.GPLUS_CONNECT);
                        View.OnClickListener onClickListener = this$0.f76280i;
                        if (onClickListener != null) {
                            onClickListener.onClick(this$0.f76276e);
                        }
                        a.c.y(u.f85943a);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        sh.f.a().X(u0.FACEBOOK_CONNECT);
                        View.OnClickListener onClickListener2 = this$0.f76279h;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(this$0.f76275d);
                        }
                        a.c.y(u.f85943a);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        a.c.y(u.f85943a);
                        break;
                }
            }
        });
        final int i15 = 2;
        gestaltButton.e(new gm1.a(this) { // from class: ji0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f76274b;

            {
                this.f76274b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                m this$0 = this.f76274b;
                switch (i152) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        sh.f.a().X(u0.GPLUS_CONNECT);
                        View.OnClickListener onClickListener = this$0.f76280i;
                        if (onClickListener != null) {
                            onClickListener.onClick(this$0.f76276e);
                        }
                        a.c.y(u.f85943a);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        sh.f.a().X(u0.FACEBOOK_CONNECT);
                        View.OnClickListener onClickListener2 = this$0.f76279h;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(this$0.f76275d);
                        }
                        a.c.y(u.f85943a);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        a.c.y(u.f85943a);
                        break;
                }
            }
        });
        y1 y1Var = this.f76278g;
        if (y1Var == null) {
            Intrinsics.r("identityExperiments");
            throw null;
        }
        if (!y1Var.f()) {
            gestaltButton2.d(f.f76258r);
            return;
        }
        gestaltButton2.d(f.f76257q);
        View findViewById6 = findViewById(vq1.b.trouble_logging_in_other_ways);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        a0.q((GestaltText) findViewById6, bs1.c.j2(new String[0], vq1.d.trouble_logging_in_other_ways_google_only));
    }
}
