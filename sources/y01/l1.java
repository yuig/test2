package y01;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136432i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Navigation f136433j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i13, Navigation navigation) {
        super(1);
        this.f136432i = i13;
        this.f136433j = navigation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f136432i;
        Navigation navigation = this.f136433j;
        switch (i13) {
            case 0:
                h0 it = (h0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                Navigation it2 = (Navigation) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 2:
                ku1.k screenNavigator = (ku1.k) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
                        screenNavigator.M1(navigation);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
                        screenNavigator.F6(navigation);
                        break;
                }
                break;
            default:
                ku1.k screenNavigator2 = (ku1.k) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(screenNavigator2, "screenNavigator");
                        screenNavigator2.M1(navigation);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(screenNavigator2, "screenNavigator");
                        screenNavigator2.F6(navigation);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
