package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k5 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24902i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f24903j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f24904k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5(long j13, Function2 function2, int i13) {
        super(2);
        this.f24902i = i13;
        this.f24903j = j13;
        this.f24904k = function2;
    }

    public final void b(i2.o oVar, int i13) {
        switch (this.f24902i) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                q5.b(this.f24903j, null, null, this.f24904k, oVar, 0, 6);
                break;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                q5.b(this.f24903j, null, null, this.f24904k, oVar, 0, 6);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24902i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
