package uv1;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class o extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123220i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f123221j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, int i13) {
        super(0);
        this.f123220i = i13;
        this.f123221j = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f123220i;
        q qVar = this.f123221j;
        switch (i13) {
            case 0:
                return qVar.generateLoggingContext();
            case 1:
                ca2.e eVar = new ca2.e(true, null, 0, 0, null, 0, null, new bh.b(qVar.s7(), new o(qVar, 0)), false, false, 894);
                eVar.f27252k = new q01.o(qVar, 2);
                return eVar;
            default:
                Context requireContext = qVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                if (dl2.b.T1(requireContext)) {
                    Context requireContext2 = qVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    return new yv1.d(requireContext2);
                }
                Context requireContext3 = qVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new yv1.j(requireContext3);
        }
    }
}
