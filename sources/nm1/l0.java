package nm1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91444i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f91445j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(q qVar, int i13) {
        super(1);
        this.f91444i = i13;
        this.f91445j = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f91444i;
        q qVar = this.f91445j;
        switch (i13) {
            case 0:
                u50.i0 placeholderText = (u50.i0) obj;
                Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
                qVar.f91467a.a0(new fx.e(10, placeholderText));
                break;
            default:
                qVar.f91467a.a0(new ql1.k((y) obj, 19));
                break;
        }
        return Unit.f80348a;
    }
}
