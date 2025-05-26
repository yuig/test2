package cy0;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import h32.d4;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import m60.x0;
import pk.a0;
import rq.n0;
import so.p0;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcy0/h;", "Lyk1/k;", "Lay0/c;", "<init>", "()V", "cy0/f", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends b implements ay0.c {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f53428u0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public iy0.a f53429j0;

    /* renamed from: k0, reason: collision with root package name */
    public ay0.b f53430k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltListAction f53431l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltButton f53432m0;

    /* renamed from: n0, reason: collision with root package name */
    public oc.c f53433n0;

    /* renamed from: o0, reason: collision with root package name */
    public p0 f53434o0;

    /* renamed from: p0, reason: collision with root package name */
    public wk2.a f53435p0;

    /* renamed from: q0, reason: collision with root package name */
    public uk1.e f53436q0;

    /* renamed from: r0, reason: collision with root package name */
    public r f53437r0;

    /* renamed from: s0, reason: collision with root package name */
    public final d4 f53438s0 = d4.ORIENTATION;

    /* renamed from: t0, reason: collision with root package name */
    public final a4 f53439t0 = a4.ORIENTATION_LOCALE_COUNTRY_STEP;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(jv1.h.whats_your_country);
        gestaltToolbarImpl.C();
        gestaltToolbarImpl.I();
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.E();
    }

    @Override // yk1.k
    public final m V7() {
        p0 p0Var = this.f53434o0;
        if (p0Var == null) {
            Intrinsics.r("countryStepPresenterFactory");
            throw null;
        }
        oc.c cVar = this.f53433n0;
        if (cVar == null) {
            Intrinsics.r("apolloClient");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = getContext();
        r rVar = this.f53437r0;
        if (rVar == null) {
            Intrinsics.r("prefsManagerUser");
            throw null;
        }
        f fVar = new f((ye2.m) context, rVar);
        uk1.e eVar = this.f53436q0;
        if (eVar != null) {
            return p0Var.a(cVar, requireContext, fVar, ((uk1.a) eVar).f(s7(), ""));
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    public final void b8(String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        iy0.a aVar = this.f53429j0;
        if (aVar != null) {
            aVar.updateIndicatorHeader(true);
        }
        GestaltListAction gestaltListAction = this.f53431l0;
        if (gestaltListAction != null) {
            kg.a.h(gestaltListAction, new zu0.c(country, 10));
        } else {
            Intrinsics.r("currentCountryListAction");
            throw null;
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF134484m0() {
        return this.f53439t0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF134483l0() {
        return this.f53438s0;
    }

    @Override // cy0.b, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ComponentCallbacks2 k03 = bs1.c.k0(context);
        if (k03 instanceof iy0.a) {
            this.f53429j0 = (iy0.a) k03;
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = jv1.f.fragment_modern_nux_country;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        View findViewById = v13.findViewById(jv1.d.country_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f53431l0 = (GestaltListAction) findViewById;
        View findViewById2 = v13.findViewById(jv1.d.country_next_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f53432m0 = (GestaltButton) findViewById2;
        View findViewById3 = v13.findViewById(jv1.d.disclaimer_textview);
        GestaltText gestaltText = (GestaltText) findViewById3;
        Intrinsics.f(gestaltText);
        final int i13 = 0;
        a0.o(gestaltText, x0.signup_nux_signal_value_prop, new Object[0]);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        super.onViewCreated(v13, bundle);
        GestaltListAction gestaltListAction = this.f53431l0;
        if (gestaltListAction == null) {
            Intrinsics.r("currentCountryListAction");
            throw null;
        }
        kg.a.h(gestaltListAction, g.f53425j);
        GestaltListAction gestaltListAction2 = this.f53431l0;
        if (gestaltListAction2 == null) {
            Intrinsics.r("currentCountryListAction");
            throw null;
        }
        gestaltListAction2.a0(new View.OnClickListener(this) { // from class: cy0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f53422b;

            {
                this.f53422b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                h this$0 = this.f53422b;
                switch (i14) {
                    case 0:
                        int i15 = h.f53428u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ay0.b bVar = this$0.f53430k0;
                        if (bVar != null) {
                            ((by0.b) bVar).r3();
                            break;
                        }
                        break;
                    default:
                        int i16 = h.f53428u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        b0.G1(this$0.getView());
                        ay0.b bVar2 = this$0.f53430k0;
                        if (bVar2 != null) {
                            ((by0.b) bVar2).q3();
                            break;
                        }
                        break;
                }
            }
        });
        gestaltListAction2.d0(new n0(this, 6));
        GestaltButton gestaltButton = this.f53432m0;
        if (gestaltButton == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        final int i14 = 1;
        gestaltButton.d(g.f53426k).g(new View.OnClickListener(this) { // from class: cy0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f53422b;

            {
                this.f53422b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                h this$0 = this.f53422b;
                switch (i142) {
                    case 0:
                        int i15 = h.f53428u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ay0.b bVar = this$0.f53430k0;
                        if (bVar != null) {
                            ((by0.b) bVar).r3();
                            break;
                        }
                        break;
                    default:
                        int i16 = h.f53428u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        b0.G1(this$0.getView());
                        ay0.b bVar2 = this$0.f53430k0;
                        if (bVar2 != null) {
                            ((by0.b) bVar2).q3();
                            break;
                        }
                        break;
                }
            }
        });
    }
}
