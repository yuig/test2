package qa1;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import lb2.n;

/* loaded from: classes5.dex */
public final /* synthetic */ class b extends p implements Function1 {
    public b(Object obj) {
        super(1, obj, e.class, "onPostDeactivateAccount", "onPostDeactivateAccount(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 onDeactivateAccount = (Function1) obj;
        Intrinsics.checkNotNullParameter(onDeactivateAccount, "p0");
        e eVar = (e) this.receiver;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(onDeactivateAccount, "onDeactivateAccount");
        mr1.a aVar = eVar.B0;
        if (aVar == null) {
            Intrinsics.r("accountSwitcher");
            throw null;
        }
        FragmentActivity requireActivity = eVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((n) aVar).e(requireActivity, "user_account_deactivated", "", onDeactivateAccount);
        return Unit.f80348a;
    }
}
