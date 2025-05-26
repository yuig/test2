package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class b3 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24561i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f24562j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f24563k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(Function2 function2, int i13, int i14) {
        super(2);
        this.f24561i = i14;
        this.f24562j = function2;
        this.f24563k = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f24563k;
        Function2 function2 = this.f24562j;
        int i14 = this.f24561i;
        switch (i14) {
            case 0:
                i2.o oVar = (i2.o) obj;
                ((Number) obj2).intValue();
                switch (i14) {
                    case 0:
                        j1.f(function2, oVar, i2.u.p(i13 | 1));
                        break;
                    default:
                        o4.b(function2, oVar, i2.u.p(i13 | 1));
                        break;
                }
                break;
            default:
                i2.o oVar2 = (i2.o) obj;
                ((Number) obj2).intValue();
                switch (i14) {
                    case 0:
                        j1.f(function2, oVar2, i2.u.p(i13 | 1));
                        break;
                    default:
                        o4.b(function2, oVar2, i2.u.p(i13 | 1));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
