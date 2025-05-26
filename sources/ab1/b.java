package ab1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1699i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f1700j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(1);
        this.f1699i = i13;
        this.f1700j = cVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f1699i;
        c cVar = this.f1700j;
        switch (i13) {
            case 0:
                Intrinsics.f(th3);
                c.p3(cVar, th3);
                break;
            case 1:
            default:
                Intrinsics.f(th3);
                c.p3(cVar, th3);
                break;
            case 2:
                Intrinsics.f(th3);
                c.p3(cVar, th3);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c cVar = this.f1700j;
        int i13 = this.f1699i;
        switch (i13) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                switch (i13) {
                    case 1:
                        ((bb1.i) ((ya1.a) cVar.getView())).b8(true);
                        break;
                    default:
                        ((bb1.i) ((ya1.a) cVar.getView())).b8(true);
                        break;
                }
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                switch (i13) {
                    case 1:
                        ((bb1.i) ((ya1.a) cVar.getView())).b8(true);
                        break;
                    default:
                        ((bb1.i) ((ya1.a) cVar.getView())).b8(true);
                        break;
                }
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
