package u31;

import android.content.Context;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import nx.f0;
import nx.j0;
import nx.m;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends p implements Function0 {
    public e(o31.a aVar) {
        super(0, aVar, o31.a.class, "navigateToPinCreate", "navigateToPinCreate()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r31.b bVar = (r31.b) ((o31.a) this.receiver);
        bVar.getPinalytics().F(g0.PROFILE_STORY_PIN_FEED, u0.CREATE_STORY_PIN_BUTTON);
        f fVar = (f) ((o31.b) bVar.getView());
        f0 f0Var = fVar.T0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        j0 a13 = ((m) f0Var).a(fVar);
        Context requireContext = fVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        el.a.l2(a13, requireContext, ou1.e.PROFILE_CREATED_TAB);
        return Unit.f80348a;
    }
}
