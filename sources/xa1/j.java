package xa1;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.settings.menu.view.SettingsProfilePreview;
import com.pinterest.feature.settings.menu.view.VerticalSpacer;
import com.pinterest.feature.settings.shared.view.SettingsSectionHeaderView;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134455i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f134456j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, int i13) {
        super(0);
        this.f134455i = i13;
        this.f134456j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f134455i;
        l lVar = this.f134456j;
        switch (i13) {
            case 0:
                return Float.valueOf(lVar.getResources().getDimension(c52.a.settings_header_elevation));
            case 1:
                m286invoke();
                return Unit.f80348a;
            case 2:
                return Integer.valueOf(bs1.c.C(lVar, eo1.b.color_background_default));
            case 3:
                Context requireContext = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SettingsSectionHeaderView(requireContext, null, 14);
            case 4:
                Context requireContext2 = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new o(requireContext2, new k(lVar, 0));
            case 5:
                Context requireContext3 = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                SettingsProfilePreview settingsProfilePreview = new SettingsProfilePreview(requireContext3);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                int W = bs1.c.W(settingsProfilePreview, eo1.c.space_400);
                Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
                com.bumptech.glide.c.a1(marginLayoutParams, W, W, W, W);
                settingsProfilePreview.setLayoutParams(marginLayoutParams);
                return settingsProfilePreview;
            case 6:
                Context context = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                VerticalSpacer verticalSpacer = new VerticalSpacer(context);
                verticalSpacer.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return verticalSpacer;
            case 7:
                Context requireContext4 = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return new q(requireContext4, new k(lVar, 1), new k(lVar, 2), new k(lVar, 3));
            default:
                m286invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m286invoke() {
        int i13 = this.f134455i;
        l lVar = this.f134456j;
        switch (i13) {
            case 1:
                lVar.s7().F(g0.NAVIGATION, u0.LOGOUT_BUTTON);
                d0 s73 = lVar.s7();
                f1 f1Var = f1.USER_LOGOUT_ATTEMPT;
                wy0 f13 = ((b60.d) lVar.getActiveUserManager()).f();
                String uid = f13 != null ? f13.getUid() : null;
                HashMap hashMap = new HashMap();
                hashMap.put("group_id", a60.a.b());
                hashMap.put("group_count", String.valueOf(a60.a.a(null).getAll().size()));
                s73.g(f1Var, uid, hashMap, false);
                mr1.a aVar = lVar.A0;
                if (aVar != null) {
                    FragmentActivity requireActivity = lVar.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    ((lb2.n) aVar).d(requireActivity, "user_initiated", "");
                    return;
                }
                Intrinsics.r("accountSwitcher");
                throw null;
            default:
                lVar.f7().d(new yb0.c(yb0.d.CANCEL_BUTTON_CLICK));
                return;
        }
    }
}
