package s51;

import com.pinterest.api.model.wy0;
import i92.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import nk1.l;
import u51.z;
import yk1.v;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111150i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f111151j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i13) {
        super(1);
        this.f111150i = i13;
        this.f111151j = eVar;
    }

    public final void b(wy0 user) {
        int i13 = this.f111150i;
        e eVar = this.f111151j;
        switch (i13) {
            case 0:
                Intrinsics.f(user);
                e.q3(eVar, user, x0.block_user_sent);
                return;
            case 1:
                Intrinsics.f(user);
                e.q3(eVar, user, x0.unblock_user_sent);
                return;
            default:
                q51.b bVar = (q51.b) eVar.getView();
                Intrinsics.f(user);
                z zVar = (z) bVar;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                l lVar = zVar.f120654t;
                if (lVar == null) {
                    Intrinsics.r("userFollowConfirmationProvider");
                    throw null;
                }
                lVar.a(false).invoke(user, Boolean.FALSE);
                ((z) ((q51.b) eVar.getView())).dismiss();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f111150i) {
            case 0:
                b((wy0) obj);
                return Unit.f80348a;
            case 1:
                b((wy0) obj);
                return Unit.f80348a;
            case 2:
                e eVar = this.f111151j;
                v vVar = eVar.f111158b;
                String message = ((yk1.a) vVar).f139224a.getString(w02.b.unfollow_board_fail);
                z zVar = (z) ((q51.b) eVar.getView());
                zVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                k kVar = zVar.f120653s;
                if (kVar != null) {
                    kVar.i(message);
                    return Unit.f80348a;
                }
                Intrinsics.r("toastUtils");
                throw null;
            default:
                b((wy0) obj);
                return Unit.f80348a;
        }
    }
}
