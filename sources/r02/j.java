package r02;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.reportFlow.feature.ReportFlowScreenLocation;
import h32.a4;
import h32.d4;
import h32.u0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr02/j;", "Lmm1/l;", "<init>", "()V", "gi2/b", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j extends b {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f105759l0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public mo1.d f105760g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f105761h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f105762i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f105763j0;

    /* renamed from: k0, reason: collision with root package name */
    public final d4 f105764k0 = d4.REPORTS_AND_VIOLATION_CENTER;

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(h02.d.more_actions_sheet, true, 0, 0, false, false, new yv1.i(this, 12), 764);
    }

    public final void d8(View view, int i13, final int i14, final boolean z13) {
        ((GestaltIcon) view.findViewById(i13)).setOnClickListener(new View.OnClickListener() { // from class: r02.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = j.f105759l0;
                j this$0 = j.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.e8();
                mo1.d dVar = this$0.f105760g0;
                if (dVar == null) {
                    Intrinsics.r("intentHelper");
                    throw null;
                }
                Context requireContext = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String string = this$0.getString(i14);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                dVar.b(requireContext, string);
                if (z13) {
                    nx.t0 t73 = this$0.t7();
                    h32.i0 i0Var = new h32.i0(this$0.f105764k0, this$0.f105763j0 ? a4.RVC_YOUR_ACCOUNT_TAB : a4.RVC_YOUR_REPORTS_TAB, null, h32.g0.RVC_ENFORCEMENT_ACTION_ROW, null, u0.RVC_SELF_HARM_RESOURCES_OPTION);
                    String str = this$0.f105762i0;
                    if (str == null) {
                        Intrinsics.r("paramObjectId");
                        throw null;
                    }
                    HashMap hashMap = new HashMap();
                    String str2 = this$0.f105761h0;
                    if (str2 == null) {
                        Intrinsics.r("paramActionId");
                        throw null;
                    }
                    hashMap.put("enforcement_action_id", str2);
                    Unit unit = Unit.f80348a;
                    nx.t0.a(t73, i0Var, str, hashMap);
                }
            }
        });
    }

    public final void e8() {
        d7.g.s(Navigation.w1(ReportFlowScreenLocation.SETTINGS_RVC_MORE_ACTIONS_SHEET), f7());
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF50136o() {
        return this.f105764k0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        a8(f.f105730k);
        String Z = com.bumptech.glide.d.Z(this, "EXTRA_PARAM_ACTION_ID", "");
        Intrinsics.checkNotNullParameter(Z, "<set-?>");
        this.f105761h0 = Z;
        String Z2 = com.bumptech.glide.d.Z(this, "EXTRA_PARAM_OBJECT_ID", "");
        Intrinsics.checkNotNullParameter(Z2, "<set-?>");
        this.f105762i0 = Z2;
        String Z3 = com.bumptech.glide.d.Z(this, "EXTRA_PARAM_LEGAL_REQUEST_ID", "");
        this.f105763j0 = com.bumptech.glide.d.G(this, "EXTRA_PARAM_IS_YOUR_ACCOUNT_TAB", false);
        GestaltText gestaltText = (GestaltText) v13.findViewById(h02.c.gt_appeal_decision);
        gestaltText.i(new ex1.n(this, 21));
        gestaltText.j(new ez1.b(3, this, Z3));
        ((Group) v13.findViewById(h02.c.gp_self_harm)).setVisibility(com.bumptech.glide.d.G(this, "EXTRA_SHOW_SELF_HARM_ITEM", false) ? 0 : 8);
        d8(v13, h02.c.gi_review_guidelines, h02.e.rvc_community_guidelines_url, false);
        d8(v13, h02.c.gi_visit_help_center, h02.e.url_reports_violations_center, false);
        d8(v13, h02.c.gi_self_harm, h02.e.url_self_harm_resources, true);
    }
}
