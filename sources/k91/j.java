package k91;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.x;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import rm1.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk91/j;", "Lyk1/k;", "Ll91/e;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j extends o implements l91.e {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f78836s0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f78837j0;

    /* renamed from: k0, reason: collision with root package name */
    public lu1.b f78838k0;

    /* renamed from: l0, reason: collision with root package name */
    public x f78839l0;

    /* renamed from: m0, reason: collision with root package name */
    public p91.j f78840m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltText f78841n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltButton f78842o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f78843p0;

    /* renamed from: q0, reason: collision with root package name */
    public final d4 f78844q0 = d4.ADD_ACCOUNT;

    /* renamed from: r0, reason: collision with root package name */
    public final a4 f78845r0 = a4.ADD_BUSINESS_ACCOUNT;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        q qVar = q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        int i13 = eo1.b.color_themed_text_default;
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context.getDrawable(drawableRes);
        Intrinsics.checkNotNullParameter(context, "context");
        if (drawable2 != null) {
            drawable = sh.f.d(i13 == 0 ? context.getColor(df0.a.f54892a) : context.getColor(i13), context, drawable2);
        } else {
            drawable = null;
        }
        String string = getString(x0.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.T(drawable, string);
        gestaltToolbarImpl.Y(b52.c.business_landing_toolbar_title);
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f78837j0;
        if (eVar != null) {
            return new p91.j(((uk1.a) eVar).f(s7(), ""), p7(), f7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF15520d1() {
        return this.f78845r0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF15519c1() {
        return this.f78844q0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_create_business_account_landing;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(b52.a.business_landing_signup);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f78842o0 = (GestaltButton) findViewById;
        View findViewById2 = onCreateView.findViewById(b52.a.business_landing_login);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f78843p0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(b52.a.business_landing_disclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f78841n0 = (GestaltText) findViewById3;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        x xVar = this.f78839l0;
        if (xVar == null) {
            Intrinsics.r("termsAndPrivacyHelper");
            throw null;
        }
        GestaltText gestaltText = this.f78841n0;
        if (gestaltText == null) {
            Intrinsics.r("termsAndPolicyView");
            throw null;
        }
        final int i13 = 1;
        xVar.r(gestaltText, vq1.h.BUSINESS, true);
        GestaltText gestaltText2 = this.f78843p0;
        if (gestaltText2 == null) {
            Intrinsics.r("standaloneBusinessLoginButton");
            throw null;
        }
        final int i14 = 0;
        gestaltText2.j(new gm1.a(this) { // from class: k91.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f78835b;

            {
                this.f78835b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                j this$0 = this.f78835b;
                switch (i15) {
                    case 0:
                        int i16 = j.f78836s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        p91.j jVar = this$0.f78840m0;
                        if (jVar != null) {
                            jVar.p3();
                            break;
                        }
                        break;
                    default:
                        int i17 = j.f78836s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        p91.j jVar2 = this$0.f78840m0;
                        if (jVar2 != null) {
                            jVar2.q3();
                            break;
                        }
                        break;
                }
            }
        });
        GestaltButton gestaltButton = this.f78842o0;
        if (gestaltButton != null) {
            gestaltButton.d(b.f78806k).e(new gm1.a(this) { // from class: k91.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f78835b;

                {
                    this.f78835b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i13;
                    j this$0 = this.f78835b;
                    switch (i15) {
                        case 0:
                            int i16 = j.f78836s0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            p91.j jVar = this$0.f78840m0;
                            if (jVar != null) {
                                jVar.p3();
                                break;
                            }
                            break;
                        default:
                            int i17 = j.f78836s0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            p91.j jVar2 = this$0.f78840m0;
                            if (jVar2 != null) {
                                jVar2.q3();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            Intrinsics.r("standaloneBusinessSignupButton");
            throw null;
        }
    }
}
