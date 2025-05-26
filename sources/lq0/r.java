package lq0;

import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class r implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConversationMessageItemView f84411a;

    public r(ConversationMessageItemView conversationMessageItemView) {
        this.f84411a = conversationMessageItemView;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.e e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ConversationMessageItemView conversationMessageItemView = this.f84411a;
        conversationMessageItemView.B0 = false;
        conversationMessageItemView.t1();
    }
}
