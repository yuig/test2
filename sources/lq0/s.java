package lq0;

import com.pinterest.api.model.mv;
import com.pinterest.api.model.v7;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84419i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ConversationMessageItemView f84420j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(ConversationMessageItemView conversationMessageItemView, int i13) {
        super(0);
        this.f84419i = i13;
        this.f84420j = conversationMessageItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f84419i) {
            case 0:
                lh0.p0 p0Var = this.f84420j.Q0;
                if (p0Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83297a;
                lh0.g1 g1Var = (lh0.g1) p0Var.f83455a;
                return Boolean.valueOf(g1Var.o("sg_android_message_deletion", "enabled", z3Var) || g1Var.l("sg_android_message_deletion"));
            case 1:
                m182invoke();
                return Unit.f80348a;
            default:
                m182invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m182invoke() {
        int i13 = this.f84419i;
        ConversationMessageItemView conversationMessageItemView = this.f84420j;
        switch (i13) {
            case 1:
                mv mvVar = conversationMessageItemView.f45546c0;
                if (mvVar != null) {
                    lp2.b.q(mvVar, conversationMessageItemView.f45552e0, conversationMessageItemView.l(), conversationMessageItemView.s(), conversationMessageItemView.B0(), conversationMessageItemView.L(), conversationMessageItemView.m(), conversationMessageItemView.z(), conversationMessageItemView.x(), Intrinsics.d(conversationMessageItemView.I0, c1.f84267a), conversationMessageItemView.F0, conversationMessageItemView.a0(), conversationMessageItemView.I0);
                    return;
                } else {
                    Intrinsics.r("message");
                    throw null;
                }
            default:
                v7 v7Var = conversationMessageItemView.f45556g0;
                if (v7Var != null) {
                    conversationMessageItemView.K0(v7Var);
                    return;
                }
                return;
        }
    }
}
