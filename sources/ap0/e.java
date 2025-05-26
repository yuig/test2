package ap0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes5.dex */
public final class e extends xa.a {

    /* renamed from: c, reason: collision with root package name */
    public final List f20299c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f20300d;

    /* renamed from: e, reason: collision with root package name */
    public final View.OnClickListener f20301e;

    /* renamed from: f, reason: collision with root package name */
    public final View.OnClickListener f20302f;

    /* renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f20303g;

    /* renamed from: h, reason: collision with root package name */
    public final gm1.a f20304h;

    public e(List onboardingItems, Context context, g createAdButtonListener, g createPinButtonListener, g exploreProfileButtonListener, bp.j nextButtonListener) {
        Intrinsics.checkNotNullParameter(onboardingItems, "onboardingItems");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(createAdButtonListener, "createAdButtonListener");
        Intrinsics.checkNotNullParameter(createPinButtonListener, "createPinButtonListener");
        Intrinsics.checkNotNullParameter(exploreProfileButtonListener, "exploreProfileButtonListener");
        Intrinsics.checkNotNullParameter(nextButtonListener, "nextButtonListener");
        this.f20299c = onboardingItems;
        this.f20300d = context;
        this.f20301e = createAdButtonListener;
        this.f20302f = createPinButtonListener;
        this.f20303g = exploreProfileButtonListener;
        this.f20304h = nextButtonListener;
    }

    @Override // xa.a
    public final void a(ViewGroup container, int i13, Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        container.removeView((View) object);
    }

    @Override // xa.a
    public final int b() {
        return this.f20299c.size();
    }

    @Override // xa.a
    public final Object e(ViewGroup container, int i13) {
        View view;
        Intrinsics.checkNotNullParameter(container, "container");
        LayoutInflater from = LayoutInflater.from(this.f20300d);
        List list = this.f20299c;
        final int i14 = 0;
        if (((cp0.a) list.get(i13)).f52991d == f.LAST) {
            view = from.inflate(vq1.c.business_onboarding_last_page, container, false);
            final GestaltButton gestaltButton = (GestaltButton) view.findViewById(vq1.b.onboarding_create_pin_button);
            gestaltButton.d(d.f20295j).e(new gm1.a(this) { // from class: ap0.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f20293b;

                {
                    this.f20293b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i14;
                    GestaltButton gestaltButton2 = gestaltButton;
                    e this$0 = this.f20293b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f20302f.onClick(gestaltButton2);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f20301e.onClick(gestaltButton2);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f20303g.onClick(gestaltButton2);
                            break;
                    }
                }
            });
            final GestaltButton gestaltButton2 = (GestaltButton) view.findViewById(vq1.b.onboarding_create_ad_button);
            final int i15 = 1;
            gestaltButton2.d(d.f20296k).e(new gm1.a(this) { // from class: ap0.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f20293b;

                {
                    this.f20293b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i152 = i15;
                    GestaltButton gestaltButton22 = gestaltButton2;
                    e this$0 = this.f20293b;
                    switch (i152) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f20302f.onClick(gestaltButton22);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f20301e.onClick(gestaltButton22);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f20303g.onClick(gestaltButton22);
                            break;
                    }
                }
            });
            final GestaltButton gestaltButton3 = (GestaltButton) view.findViewById(vq1.b.onboarding_profile_button);
            final int i16 = 2;
            gestaltButton3.d(d.f20297l).e(new gm1.a(this) { // from class: ap0.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f20293b;

                {
                    this.f20293b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i152 = i16;
                    GestaltButton gestaltButton22 = gestaltButton3;
                    e this$0 = this.f20293b;
                    switch (i152) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f20302f.onClick(gestaltButton22);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f20301e.onClick(gestaltButton22);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f20303g.onClick(gestaltButton22);
                            break;
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(view, "apply(...)");
        } else {
            View inflate = from.inflate(vq1.c.business_onboarding_page, container, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            View findViewById = inflate.findViewById(vq1.b.onboarding_page_title);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            a0.p((GestaltText) findViewById, String.valueOf(((cp0.a) list.get(i13)).f52989b));
            View findViewById2 = inflate.findViewById(vq1.b.onboarding_page_description);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            a0.p((GestaltText) findViewById2, String.valueOf(((cp0.a) list.get(i13)).f52990c));
            ((GestaltButton) inflate.findViewById(vq1.b.onboarding_next_button)).e(this.f20304h);
            ((WebImageView) inflate.findViewById(vq1.b.onboarding_page_image)).loadUrl(((cp0.a) list.get(i13)).f52988a);
            view = inflate;
        }
        container.addView(view);
        return view;
    }

    @Override // xa.a
    public final boolean f(View view, Object object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "object");
        return Intrinsics.d(view, object);
    }
}
