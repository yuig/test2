package r02;

import android.view.View;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.reportFlow.feature.ReportFlowScreenLocation;
import h32.a4;
import h32.d4;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f105768b;

    public /* synthetic */ k0(s0 s0Var, int i13) {
        this.f105767a = i13;
        this.f105768b = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f105767a;
        s0 this$0 = this.f105768b;
        switch (i13) {
            case 0:
                int i14 = s0.f105802t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P7();
                return;
            case 1:
                int i15 = s0.f105802t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                pe.i.R0(this$0.T);
                this$0.Y7(m0.Loading);
                return;
            case 2:
                int i16 = s0.f105802t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d7.g.s(Navigation.w1(ReportFlowScreenLocation.SETTINGS_RVC_SUBMIT_APPEAL), this$0.f7());
                return;
            case 3:
                int i17 = s0.f105802t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                l82.c e13 = ((s02.x) this$0.f105804d0.getValue()).f110363d.e();
                String str = this$0.f105816p0;
                if (str == null) {
                    Intrinsics.r("paramActionId");
                    throw null;
                }
                String str2 = this$0.f105817q0;
                GestaltTextField gestaltTextField = this$0.f105814n0;
                if (gestaltTextField == null) {
                    Intrinsics.r("gtSubmitTextarea");
                    throw null;
                }
                String valueOf = String.valueOf(gestaltTextField.z0());
                boolean z13 = this$0.f105815o0;
                e13.a(new s02.q(new h32.i0(d4.REPORTS_AND_VIOLATION_CENTER, z13 ? a4.RVC_YOUR_ACCOUNT_TAB : a4.RVC_YOUR_REPORTS_TAB, null, h32.g0.RVC_APPEAL_MODAL, null, u0.RVC_SUBMIT_APPEAL_BUTTON), str, str2, valueOf, this$0.f105807g0, this$0.f105818r0, z13));
                return;
            default:
                int i18 = s0.f105802t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Y7(m0.Default);
                return;
        }
    }
}
