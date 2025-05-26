package lp;

import android.view.View;
import com.pinterest.activity.conversation.view.BoardInviteInboxContainer;
import kh2.k3;
import m60.t;
import m60.u;
import org.greenrobot.eventbus.ThreadMode;
import pk.a0;

/* loaded from: classes3.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BoardInviteInboxContainer f84206a;

    public b(BoardInviteInboxContainer boardInviteInboxContainer) {
        this.f84206a = boardInviteInboxContainer;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(pg0.a aVar) {
        String str = aVar.f100048a;
        int i13 = BoardInviteInboxContainer.f34855g;
        BoardInviteInboxContainer boardInviteInboxContainer = this.f84206a;
        int childCount = boardInviteInboxContainer.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = boardInviteInboxContainer.getChildAt(i14);
            if (a0.N(str, childAt.getTag().toString())) {
                k3.R1(childAt, aVar.f100049b);
                boardInviteInboxContainer.f34859d.h("PREF_NUM_BOARD_INVITES", boardInviteInboxContainer.getChildCount());
                u.f85943a.d(new hc.m(boardInviteInboxContainer.getChildCount() - 1, 0));
                return;
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(yo.b bVar) {
        int i13 = BoardInviteInboxContainer.f34855g;
        this.f84206a.a();
    }
}
