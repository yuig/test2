package zk0;

import com.pinterest.feature.board.detail.invite.view.lego.LegoBoardDetailInviteView;
import kl0.u;
import kl0.z;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes5.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f142086a;

    public c(e eVar) {
        this.f142086a = eVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = this.f142086a;
        if (eVar.isBound()) {
            if (event.f100049b) {
                ((LegoBoardDetailInviteView) ((yk0.b) eVar.getView())).g();
                return;
            }
            LegoBoardDetailInviteView legoBoardDetailInviteView = (LegoBoardDetailInviteView) ((yk0.b) eVar.getView());
            bs1.c.X0(legoBoardDetailInviteView.f45232f);
            u uVar = legoBoardDetailInviteView.f45233g;
            if (uVar != null) {
                LegoBoardDetailInviteView this_apply = uVar.f80117b;
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                z.k9(uVar.f80116a, this_apply, false);
            }
        }
    }
}
