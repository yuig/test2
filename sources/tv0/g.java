package tv0;

import com.pinterest.navigation.Navigation;
import com.pinterest.screens.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f119523j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f119524k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f119525l = new g(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119526i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f119526i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f119526i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return Unit.f80348a;
            default:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), d2.m()));
        }
    }
}
