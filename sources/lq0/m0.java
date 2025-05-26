package lq0;

import android.content.Context;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84361i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f84362j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(o0 o0Var, int i13) {
        super(0);
        this.f84361i = i13;
        this.f84362j = o0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List j13;
        int i13 = this.f84361i;
        o0 o0Var = this.f84362j;
        switch (i13) {
            case 0:
                Context context = o0Var.getContext();
                Intrinsics.g(context, "null cannot be cast to non-null type android.content.Context");
                return new ConversationMessageItemView((ye2.m) context);
            case 1:
                Context requireContext = o0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                h1 h1Var = new h1(requireContext);
                z40.n nVar = o0Var.V0;
                if (nVar != null && (j13 = kh2.d.j1(nVar)) != null && (!j13.isEmpty())) {
                    h1Var.a(j13);
                }
                o0Var.f84402y1 = h1Var;
                return h1Var;
            default:
                int i14 = o0.R1;
                o0Var.P7();
                return Unit.f80348a;
        }
    }
}
