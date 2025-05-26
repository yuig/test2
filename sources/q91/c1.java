package q91;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103079i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f103080j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(d1 d1Var, int i13) {
        super(1);
        this.f103079i = i13;
        this.f103080j = d1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d1 d1Var = this.f103080j;
        int i13 = this.f103079i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(th3);
                        d1.Y7(d1Var, th3);
                        break;
                    default:
                        Intrinsics.f(th3);
                        d1.Y7(d1Var, th3);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(th4);
                        d1.Y7(d1Var, th4);
                        break;
                    default:
                        Intrinsics.f(th4);
                        d1.Y7(d1Var, th4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
