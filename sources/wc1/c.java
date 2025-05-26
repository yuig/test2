package wc1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import va1.f1;
import va1.r;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129105i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f129106j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f129105i = i13;
        this.f129106j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f129105i;
        e eVar = this.f129106j;
        switch (i13) {
            case 0:
                f1 item = (f1) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                tc1.a aVar = eVar.D0;
                if (aVar != null) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    ((vc1.d) aVar).f125603c.d(Navigation.L(item.j(), "", item.c()));
                }
                break;
            case 1:
                r item2 = (r) obj;
                Intrinsics.checkNotNullParameter(item2, "item");
                int i14 = e.I0;
                eVar.getClass();
                if (item2 instanceof uc1.d) {
                    eVar.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : u0.BACKUP_CODE, (r18 & 4) != 0 ? null : g0.MULTI_FACTOR_AUTHENTICATION, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                tc1.a aVar2 = eVar.D0;
                if (aVar2 != null) {
                    ((vc1.d) aVar2).v3(item2);
                }
                break;
            case 2:
                int i15 = e.I0;
                eVar.U8().k(l52.c.settings_mfa_email_verification_modal_email_sent);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                eVar.V8(th3);
                break;
        }
        return Unit.f80348a;
    }
}
