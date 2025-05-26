package lh0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83335i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f83336j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(g1 g1Var, int i13) {
        super(1);
        this.f83335i = i13;
        this.f83336j = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f83335i;
        g1 g1Var = this.f83336j;
        switch (i13) {
            case 0:
                nh0.a aVar = (nh0.a) obj;
                Intrinsics.f(aVar);
                g1.b(g1Var, aVar);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                g1.a(g1Var, th3);
                break;
        }
        return Unit.f80348a;
    }
}
