package w80;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128378i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f128379j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f128380k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Function1 function1, g gVar, int i13) {
        super(0);
        this.f128378i = i13;
        this.f128379j = function1;
        this.f128380k = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        g gVar = this.f128380k;
        Function1 function1 = this.f128379j;
        int i13 = this.f128378i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        function1.invoke(Integer.valueOf(gVar.f128291d));
                        break;
                    default:
                        function1.invoke(Integer.valueOf(gVar.f128291d));
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        function1.invoke(Integer.valueOf(gVar.f128291d));
                        break;
                    default:
                        function1.invoke(Integer.valueOf(gVar.f128291d));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
