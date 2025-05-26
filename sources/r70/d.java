package r70;

import com.pinterest.framework.screens.NoneLocation;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f106360j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f106361k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f106362l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f106363m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f106364n = new d(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106365i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(0);
        this.f106365i = i13;
    }

    public final NavigationImpl b() {
        switch (this.f106365i) {
            case 0:
                NavigationImpl w13 = Navigation.w1(NoneLocation.NONE);
                Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                return w13;
            case 1:
                NavigationImpl w14 = Navigation.w1((ScreenLocation) a0.f50490a.getValue());
                Intrinsics.checkNotNullExpressionValue(w14, "create(...)");
                return w14;
            default:
                NavigationImpl w15 = Navigation.w1((ScreenLocation) a0.f50491b.getValue());
                Intrinsics.checkNotNullExpressionValue(w15, "create(...)");
                return w15;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f106365i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return Boolean.FALSE;
            default:
                return Unit.f80348a;
        }
    }
}
