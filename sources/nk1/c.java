package nk1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91106i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f91107j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(1);
        this.f91106i = i13;
        this.f91107j = fVar;
    }

    public final void b(dl1.s sVar) {
        int i13 = this.f91106i;
        f fVar = this.f91107j;
        switch (i13) {
            case 0:
                Intrinsics.f(sVar);
                fVar.f91112a = sVar;
                fVar.f91115d.invoke(sVar, Boolean.valueOf(c0.d.d2(sVar)));
                break;
            case 1:
            default:
                Intrinsics.f(sVar);
                fVar.f91112a = sVar;
                fVar.f91115d.invoke(sVar, Boolean.valueOf(c0.d.d2(sVar)));
                break;
            case 2:
                Intrinsics.f(sVar);
                boolean d2 = c0.d.d2(sVar);
                boolean z13 = !((Boolean) fVar.f91119h.invoke(sVar, Boolean.TRUE)).booleanValue();
                fVar.f91112a = sVar;
                fVar.f91123l.c(kh2.d.s(z13, d2));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91106i) {
            case 0:
                b((dl1.s) obj);
                break;
            case 1:
                dl1.s model = (dl1.s) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 2:
                b((dl1.s) obj);
                break;
            default:
                b((dl1.s) obj);
                break;
        }
        return Unit.f80348a;
    }
}
