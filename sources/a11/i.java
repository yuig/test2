package a11;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f284i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f285j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Navigation f286k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(n nVar, Navigation navigation, int i13) {
        super(1);
        this.f284i = i13;
        this.f285j = nVar;
        this.f286k = navigation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n nVar = this.f285j;
        Navigation navigation = this.f286k;
        int i13 = this.f284i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        nVar.f321b.d(navigation);
                        break;
                    default:
                        nVar.f321b.d(navigation);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        nVar.f321b.d(navigation);
                        break;
                    default:
                        nVar.f321b.d(navigation);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
