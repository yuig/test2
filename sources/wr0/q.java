package wr0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.m1;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130909i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f130910j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f30 f130911k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f130912l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(g gVar, f30 f30Var, r rVar, int i13) {
        super(0);
        this.f130909i = i13;
        this.f130910j = gVar;
        this.f130911k = f30Var;
        this.f130912l = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f130909i) {
            case 0:
                m282invoke();
                break;
            default:
                m282invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m282invoke() {
        int i13 = this.f130909i;
        r rVar = this.f130912l;
        g gVar = this.f130910j;
        f30 pin = this.f130911k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullExpressionValue(pin, "$pin");
                j jVar = (j) gVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                q11.a aVar = jVar.f130896m1;
                if (aVar != null) {
                    aVar.a(pin, false);
                    nx.d0 pinalytics = rVar.getPinalytics();
                    u0 u0Var = u0.PIN_EDIT_BUTTON;
                    HashMap hashMap = new HashMap();
                    hashMap.put("pin_id", pin.getUid());
                    Unit unit = Unit.f80348a;
                    pinalytics.Z(u0Var, hashMap);
                    return;
                }
                Intrinsics.r("editPinLauncher");
                throw null;
            default:
                Intrinsics.checkNotNullExpressionValue(pin, "$pin");
                j jVar2 = (j) gVar;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                jVar2.f7().d(Navigation.z0(m1.b(), pin.getUid()));
                rVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : g0.PIN_CLOSEUP, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return;
        }
    }
}
