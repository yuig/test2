package ia0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71955i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f71956j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f71957k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Function1 function1, q qVar, int i13) {
        super(0);
        this.f71955i = i13;
        this.f71956j = function1;
        this.f71957k = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q qVar = this.f71957k;
        Function1 function1 = this.f71956j;
        int i13 = this.f71955i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        function1.invoke(qVar.f71984a.f106911a);
                        break;
                    default:
                        function1.invoke(qVar.f71984a.f106911a);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        function1.invoke(qVar.f71984a.f106911a);
                        break;
                    default:
                        function1.invoke(qVar.f71984a.f106911a);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
