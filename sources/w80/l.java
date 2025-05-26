package w80;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128339i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f128340j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f128341k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Function1 function1, e eVar, int i13) {
        super(0);
        this.f128339i = i13;
        this.f128340j = function1;
        this.f128341k = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e eVar = this.f128341k;
        Function1 function1 = this.f128340j;
        int i13 = this.f128339i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        function1.invoke(Integer.valueOf(eVar.f128277d));
                        break;
                    default:
                        function1.invoke(Integer.valueOf(eVar.f128277d));
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        function1.invoke(Integer.valueOf(eVar.f128277d));
                        break;
                    default:
                        function1.invoke(Integer.valueOf(eVar.f128277d));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
