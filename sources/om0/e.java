package om0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96482i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f96483j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a f96484k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Function1 function1, a aVar, int i13) {
        super(0);
        this.f96482i = i13;
        this.f96483j = function1;
        this.f96484k = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a aVar = this.f96484k;
        Function1 function1 = this.f96483j;
        int i13 = this.f96482i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        function1.invoke(Integer.valueOf(aVar.f96458c));
                        break;
                    default:
                        function1.invoke(Integer.valueOf(aVar.f96458c));
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        function1.invoke(Integer.valueOf(aVar.f96458c));
                        break;
                    default:
                        function1.invoke(Integer.valueOf(aVar.f96458c));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
