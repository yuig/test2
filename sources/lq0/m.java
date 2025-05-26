package lq0;

import com.pinterest.api.model.mv;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationMessageItemView f84360b;

    public /* synthetic */ m(ConversationMessageItemView conversationMessageItemView, int i13) {
        this.f84359a = i13;
        this.f84360b = conversationMessageItemView;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f84359a;
        ConversationMessageItemView this$0 = this.f84360b;
        switch (i13) {
            case 0:
                int i14 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    this$0.L0("inline_reply_button", true);
                    return;
                }
                return;
            default:
                int i15 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof rn1.h) {
                    mv mvVar = this$0.f45546c0;
                    if (mvVar != null) {
                        lp2.b.q(mvVar, this$0.f45552e0, this$0.l(), this$0.s(), this$0.B0(), this$0.L(), this$0.m(), this$0.z(), this$0.x(), Intrinsics.d(this$0.I0, c1.f84267a), this$0.F0, this$0.a0(), this$0.I0);
                        return;
                    } else {
                        Intrinsics.r("message");
                        throw null;
                    }
                }
                return;
        }
    }
}
