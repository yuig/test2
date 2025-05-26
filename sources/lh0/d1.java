package lh0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83325i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f83326j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(g1 g1Var, int i13) {
        super(1);
        this.f83325i = i13;
        this.f83326j = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g1 g1Var = this.f83326j;
        int i13 = this.f83325i;
        switch (i13) {
            case 0:
                nh0.a aVar = (nh0.a) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(aVar);
                        g1.b(g1Var, aVar);
                        break;
                    default:
                        Intrinsics.f(aVar);
                        g1.b(g1Var, aVar);
                        break;
                }
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th3);
                        g1.a(g1Var, th3);
                        break;
                    default:
                        Intrinsics.f(th3);
                        g1.a(g1Var, th3);
                        break;
                }
                break;
            case 2:
                nh0.a aVar2 = (nh0.a) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(aVar2);
                        g1.b(g1Var, aVar2);
                        break;
                    default:
                        Intrinsics.f(aVar2);
                        g1.b(g1Var, aVar2);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th4);
                        g1.a(g1Var, th4);
                        break;
                    default:
                        Intrinsics.f(th4);
                        g1.a(g1Var, th4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
