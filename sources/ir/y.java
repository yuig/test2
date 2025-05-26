package ir;

import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import h32.d4;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73489i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73490j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y42.d f73491k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(MainActivity mainActivity, y42.d dVar, int i13) {
        super(1);
        this.f73489i = i13;
        this.f73490j = mainActivity;
        this.f73491k = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73489i;
        MainActivity mainActivity = this.f73490j;
        y42.d dVar = this.f73491k;
        switch (i13) {
            case 0:
                Pair pair = (Pair) obj;
                String s53 = ((f30) pair.f80346a).s5();
                if (s53 == null || !StringsKt.E(s53, "instagram.com", false) || ((wy0) pair.f80347b).C2().booleanValue()) {
                    String uid = dVar.f137710a.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    MainActivity.B(mainActivity, uid, dVar.f137711b, dVar.f137712c);
                } else {
                    mainActivity.getPinalytics().T(d4.POST_CREATE_UPSELL_MODAL, null);
                    se2.a aVar = mainActivity.f35194p0;
                    if (aVar == null) {
                        Intrinsics.r("persistedPreferencesManager");
                        throw null;
                    }
                    ((lb0.b) ((lb0.o) ((bf2.b) aVar).get())).o("SEEN_POST_CREATE_DIALOG", true);
                    mainActivity.getEventManager().d(new jc0.v(new zp.t(new db.m(mainActivity, 26)), false, 0L, 30));
                }
                return Unit.f80348a;
            default:
                String uid2 = dVar.f137710a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                MainActivity.B(mainActivity, uid2, dVar.f137711b, dVar.f137712c);
                return Unit.f80348a;
        }
    }
}
