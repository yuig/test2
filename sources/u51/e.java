package u51;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.cd0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.d4;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import x02.p1;
import x02.p2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu51/e;", "Lyk1/k;", "", "<init>", "()V", "didit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends yk1.k implements yk1.n {

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f120601z0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public cd0 f120602e0;

    /* renamed from: f0, reason: collision with root package name */
    public String f120603f0;

    /* renamed from: g0, reason: collision with root package name */
    public String f120604g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f120605h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f120606i0;

    /* renamed from: j0, reason: collision with root package name */
    public LinearLayout f120607j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltText f120608k0;

    /* renamed from: l0, reason: collision with root package name */
    public LinearLayout f120609l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f120610m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltText f120611n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f120612o0;

    /* renamed from: p0, reason: collision with root package name */
    public rp0.d f120613p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f120614q0;

    /* renamed from: r0, reason: collision with root package name */
    public uk1.e f120615r0;

    /* renamed from: s0, reason: collision with root package name */
    public a12.d f120616s0;

    /* renamed from: t0, reason: collision with root package name */
    public x02.u f120617t0;

    /* renamed from: u0, reason: collision with root package name */
    public p1 f120618u0;

    /* renamed from: v0, reason: collision with root package name */
    public p2 f120619v0;

    /* renamed from: w0, reason: collision with root package name */
    public qh1.e f120620w0;

    /* renamed from: x0, reason: collision with root package name */
    public i92.k f120621x0;

    /* renamed from: y0, reason: collision with root package name */
    public final d4 f120622y0 = d4.PIN_COMMENTS;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        GestaltToolbarImpl toolbar2 = (GestaltToolbarImpl) toolbar;
        Context context = toolbar2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = toolbar2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int drawableRes = qVar.drawableRes(context, dl2.b.f1(context2));
        toolbar2.o();
        Drawable e03 = bs1.c.e0(this, drawableRes, Integer.valueOf(eo1.b.color_themed_text_default), Integer.valueOf(eo1.c.space_600));
        String string = getString(x0.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        toolbar2.T(e03, string);
        Intrinsics.checkNotNullParameter(toolbar2, "toolbar");
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        vb0.j.f125466a.N(f49940b, "a valid AggregatedComment id must be passed through the navigation object", new Object[0]);
        uk1.e eVar = this.f120615r0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        Resources resources = requireContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        uj2.q p73 = p7();
        a12.d dVar = this.f120616s0;
        if (dVar != null) {
            Intrinsics.f(f49940b);
            return new nd0.a(g13, resources, p73, dVar, f49940b);
        }
        Intrinsics.r("aggregatedCommentService");
        throw null;
    }

    public final void Y7(LinearLayout linearLayout, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int C = bs1.c.C(this, eo1.b.color_themed_text_default);
            int X = bs1.c.X(this, eo1.c.margin_half);
            int X2 = bs1.c.X(this, wy1.b.story_pin_basics_list_bullet_radius);
            boolean z13 = Build.VERSION.SDK_INT >= 28;
            SpannableString spannableString = new SpannableString(str);
            if (z13) {
                spannableString.setSpan(o5.d.m(X, C, X2), 0, str.length(), 33);
            } else {
                spannableString.setSpan(new BulletSpan(X, C), 0, str.length(), 33);
            }
            Context context = getContext();
            if (context != null) {
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                pk.a0.q(gestaltText, bs1.c.p2(spannableString));
                linearLayout.addView(gestaltText);
            }
        }
    }

    public final i92.k Z7() {
        i92.k kVar = this.f120621x0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    public final void a8(rp0.d dVar) {
        uj2.b a03;
        String str = this.f120603f0;
        if (str == null) {
            Intrinsics.r("unifiedCommentModelType");
            throw null;
        }
        if (Intrinsics.d(str, "aggregatedcomment")) {
            a12.d dVar2 = this.f120616s0;
            if (dVar2 == null) {
                Intrinsics.r("aggregatedCommentService");
                throw null;
            }
            String str2 = this.f120604g0;
            if (str2 == null) {
                Intrinsics.r("unifiedCommentUid");
                throw null;
            }
            cd0 cd0Var = this.f120602e0;
            if (cd0Var == null) {
                Intrinsics.r("reportReason");
                throw null;
            }
            String F = cd0Var.F();
            Intrinsics.checkNotNullExpressionValue(F, "getKey(...)");
            a03 = dVar2.o(str2, F, null);
        } else {
            p2 p2Var = this.f120619v0;
            if (p2Var == null) {
                Intrinsics.r("userDidItRepository");
                throw null;
            }
            String str3 = this.f120604g0;
            if (str3 == null) {
                Intrinsics.r("unifiedCommentUid");
                throw null;
            }
            rp0.d dVar3 = this.f120613p0;
            Intrinsics.g(dVar3, "null cannot be cast to non-null type com.pinterest.feature.comment.unifiedcomments.model.UnifiedComment.UnifiedUserDidIt");
            az0 z13 = ((rp0.c) dVar3).z();
            cd0 cd0Var2 = this.f120602e0;
            if (cd0Var2 == null) {
                Intrinsics.r("reportReason");
                throw null;
            }
            a03 = p2Var.a0(str3, z13, cd0Var2.F(), null);
        }
        ek2.f i13 = a03.l(tk2.e.f118017c).h(wj2.c.a()).i(new fp.a(23, this, dVar), new b(3, new c(this, 3)));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        R6(i13);
        this.f120614q0 = false;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF120622y0() {
        return this.f120622y0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = qf0.b.fragment_report_aggregated_comment_item_details;
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        nm.o oVar = new nm.o();
        cd0 cd0Var = this.f120602e0;
        if (cd0Var == null) {
            Intrinsics.r("reportReason");
            throw null;
        }
        outState.putString("com.pinterest.EXTRA_COMMENT_REPORT_REASON", oVar.k(cd0Var));
        String str = this.f120606i0;
        if (str == null) {
            Intrinsics.r("pinId");
            throw null;
        }
        outState.putString("com.pinterest.EXTRA_PIN_ID", str);
        String str2 = this.f120605h0;
        if (str2 == null) {
            Intrinsics.r("aggregatedPinId");
            throw null;
        }
        outState.putString("com.pinterest.EXTRA_AGGREGATED_UID", str2);
        String str3 = this.f120612o0;
        if (str3 != null) {
            outState.putString("com.pinterest.EXTRA_USERNAME", str3);
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        dl1.l lVar;
        Intrinsics.checkNotNullParameter(v13, "v");
        Navigation navigation = this.I;
        if (navigation == null) {
            throw new IllegalArgumentException("Null navigation in ReportAggregatedCommentFragment");
        }
        super.onViewCreated(v13, bundle);
        String v03 = navigation.v0("com.pinterest.EXTRA_COMMENT_TYPE");
        Intrinsics.checkNotNullExpressionValue(v03, "getStringParcelable(...)");
        this.f120603f0 = v03;
        String f49940b = navigation.getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        this.f120604g0 = f49940b;
        if (bundle == null) {
            Object i03 = navigation.i0("com.pinterest.EXTRA_COMMENT_REPORT_REASON");
            Intrinsics.g(i03, "null cannot be cast to non-null type com.pinterest.api.model.ReportReason");
            this.f120602e0 = (cd0) i03;
            Object i04 = navigation.i0("com.pinterest.EXTRA_PIN_ID");
            Intrinsics.g(i04, "null cannot be cast to non-null type kotlin.String");
            this.f120606i0 = (String) i04;
            Object i05 = navigation.i0("com.pinterest.EXTRA_AGGREGATED_UID");
            Intrinsics.g(i05, "null cannot be cast to non-null type kotlin.String");
            this.f120605h0 = (String) i05;
            Object i06 = navigation.i0("com.pinterest.EXTRA_USERNAME");
            Intrinsics.g(i06, "null cannot be cast to non-null type kotlin.String");
            this.f120612o0 = (String) i06;
        } else {
            Object b13 = new nm.o().b(cd0.class, bundle.getString("com.pinterest.EXTRA_COMMENT_REPORT_REASON"));
            Intrinsics.checkNotNullExpressionValue(b13, "fromJson(...)");
            this.f120602e0 = (cd0) b13;
            String string = bundle.getString("com.pinterest.EXTRA_PIN_ID", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.f120606i0 = string;
            String string2 = bundle.getString("com.pinterest.EXTRA_AGGREGATED_UID", "");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.f120605h0 = string2;
            this.f120612o0 = bundle.getString("com.pinterest.EXTRA_USERNAME", "");
        }
        View findViewById = v13.findViewById(qf0.a.report_item_header);
        GestaltText gestaltText = (GestaltText) findViewById;
        Intrinsics.f(gestaltText);
        cd0 cd0Var = this.f120602e0;
        if (cd0Var == null) {
            Intrinsics.r("reportReason");
            throw null;
        }
        String A = cd0Var.A();
        if (A == null) {
            A = "";
        }
        pk.a0.p(gestaltText, A);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = v13.findViewById(qf0.a.report_item_removal_examples_header);
        GestaltText gestaltText2 = (GestaltText) findViewById2;
        Intrinsics.f(gestaltText2);
        cd0 cd0Var2 = this.f120602e0;
        if (cd0Var2 == null) {
            Intrinsics.r("reportReason");
            throw null;
        }
        String D = cd0Var2.D();
        pk.a0.p(gestaltText2, D != null ? D : "");
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = v13.findViewById(qf0.a.report_item_removal_non_examples_header);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f120608k0 = (GestaltText) findViewById3;
        View findViewById4 = v13.findViewById(qf0.a.report_item_removal_examples);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f120607j0 = (LinearLayout) findViewById4;
        View findViewById5 = v13.findViewById(qf0.a.report_item_removal_non_examples);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f120609l0 = (LinearLayout) findViewById5;
        View findViewById6 = v13.findViewById(qf0.a.block_user_header);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f120610m0 = (GestaltText) findViewById6;
        View findViewById7 = v13.findViewById(qf0.a.block_user_description);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f120611n0 = (GestaltText) findViewById7;
        View findViewById8 = v13.findViewById(qf0.a.block_user_toggle_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        pe.i.i((GestaltSwitch) findViewById8, new c(this, 1));
        View findViewById9 = v13.findViewById(qf0.a.report_comment_button);
        ((GestaltButton) findViewById9).e(new l11.p(this, 8));
        Intrinsics.checkNotNullExpressionValue(findViewById9, "apply(...)");
        LinearLayout linearLayout = this.f120607j0;
        if (linearLayout == null) {
            Intrinsics.r("removalExamplesContainer");
            throw null;
        }
        cd0 cd0Var3 = this.f120602e0;
        if (cd0Var3 == null) {
            Intrinsics.r("reportReason");
            throw null;
        }
        List E = cd0Var3.E();
        Intrinsics.checkNotNullExpressionValue(E, "getDetailPageRemovalExamples(...)");
        Y7(linearLayout, E);
        cd0 cd0Var4 = this.f120602e0;
        if (cd0Var4 == null) {
            Intrinsics.r("reportReason");
            throw null;
        }
        if (cd0Var4.C().size() > 0) {
            GestaltText gestaltText3 = this.f120608k0;
            if (gestaltText3 == null) {
                Intrinsics.r("removalNonExamplesHeader");
                throw null;
            }
            gestaltText3.i(new c(this, 2));
            LinearLayout linearLayout2 = this.f120609l0;
            if (linearLayout2 == null) {
                Intrinsics.r("removalNonExamplesContainer");
                throw null;
            }
            bs1.c.R1(linearLayout2, true);
            LinearLayout linearLayout3 = this.f120609l0;
            if (linearLayout3 == null) {
                Intrinsics.r("removalNonExamplesContainer");
                throw null;
            }
            cd0 cd0Var5 = this.f120602e0;
            if (cd0Var5 == null) {
                Intrinsics.r("reportReason");
                throw null;
            }
            List C = cd0Var5.C();
            Intrinsics.checkNotNullExpressionValue(C, "getDetailPageNonRemovalExamples(...)");
            Y7(linearLayout3, C);
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.D(requireActivity);
        String str = this.f120603f0;
        if (str == null) {
            Intrinsics.r("unifiedCommentModelType");
            throw null;
        }
        String str2 = this.f120604g0;
        if (str2 == null) {
            Intrinsics.r("unifiedCommentUid");
            throw null;
        }
        if (Intrinsics.d(str, "aggregatedcomment")) {
            lVar = this.f120617t0;
            if (lVar == null) {
                Intrinsics.r("aggregatedCommentRepository");
                throw null;
            }
        } else {
            lVar = this.f120618u0;
            if (lVar == null) {
                Intrinsics.r("didItRepository");
                throw null;
            }
        }
        xj2.c F = lVar.P(str2).H(tk2.e.f118017c).A(wj2.c.a()).F(new g51.g(29, new c(this, 4)), new b(0, new c(this, 5)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        R6(F);
    }
}
