package tc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117339i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f117340j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f117341k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13, String str, Function1 function1) {
        super(0);
        this.f117339i = i13;
        this.f117340j = function1;
        this.f117341k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function1 function1 = this.f117340j;
        String str = this.f117341k;
        int i13 = this.f117339i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        function1.invoke(str);
                        break;
                    default:
                        function1.invoke(str);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        function1.invoke(str);
                        break;
                    default:
                        function1.invoke(str);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
