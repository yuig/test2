package q4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102307i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f102308j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(t tVar, int i13) {
        super(1);
        this.f102307i = i13;
        this.f102308j = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f102307i;
        t tVar = this.f102308j;
        switch (i13) {
            case 0:
                tVar.show();
                return new e.b(tVar, 6);
            default:
                tVar.f102357e.getClass();
                tVar.f102356d.invoke();
                return Unit.f80348a;
        }
    }
}
