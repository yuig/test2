package lq0;

import android.view.View;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.v7;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationMessageItemView f84346b;

    public /* synthetic */ k(ConversationMessageItemView conversationMessageItemView, int i13) {
        this.f84345a = i13;
        this.f84346b = conversationMessageItemView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f84345a;
        ConversationMessageItemView this$0 = this.f84346b;
        switch (i13) {
            case 0:
                int i14 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                mv mvVar = this$0.f45546c0;
                if (mvVar != null) {
                    lp2.b.q(mvVar, this$0.f45552e0, this$0.l(), this$0.s(), this$0.B0(), this$0.L(), this$0.m(), this$0.z(), this$0.x(), Intrinsics.d(this$0.I0, c1.f84267a), this$0.F0, this$0.a0(), this$0.I0);
                    return;
                } else {
                    Intrinsics.r("message");
                    throw null;
                }
            case 1:
                int i15 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                mv mvVar2 = this$0.f45546c0;
                if (mvVar2 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                v7 D = mvVar2.D();
                if (D != null) {
                    this$0.K0(D);
                    return;
                }
                return;
            case 2:
                int i16 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                mv mvVar3 = this$0.f45546c0;
                if (mvVar3 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                v7 D2 = mvVar3.D();
                if (D2 != null) {
                    this$0.K0(D2);
                    return;
                }
                return;
            case 3:
                int i17 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                mv mvVar4 = this$0.f45546c0;
                if (mvVar4 != null) {
                    lp2.b.p(mvVar4, this$0.f45552e0, this$0.l(), this$0.s(), this$0.B0(), this$0.L(), this$0.m(), this$0.z(), this$0.F0, this$0.x(), this$0.a0(), this$0.I0);
                    return;
                } else {
                    Intrinsics.r("message");
                    throw null;
                }
            case 4:
                int i18 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                mv mvVar5 = this$0.f45546c0;
                if (mvVar5 != null) {
                    lp2.b.p(mvVar5, this$0.f45552e0, this$0.l(), this$0.s(), this$0.B0(), this$0.L(), this$0.m(), this$0.z(), this$0.F0, this$0.x(), this$0.a0(), this$0.I0);
                    return;
                } else {
                    Intrinsics.r("message");
                    throw null;
                }
            case 5:
                int i19 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.L0("thread_reply_count_tap", false);
                return;
            case 6:
                int i23 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.L0("thread_anchor_preview_tap", false);
                return;
            case 7:
                int i24 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                v7 v7Var = this$0.f45556g0;
                if (v7Var != null) {
                    this$0.K0(v7Var);
                    return;
                }
                return;
            default:
                int i25 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.L0("thread_message_tap", false);
                return;
        }
    }
}
