package ho0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.m3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f69682j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f69683k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f69684l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f69685m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69686i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f69686i = i13;
    }

    public final Boolean b(Navigation navigation) {
        boolean z13 = true;
        switch (this.f69686i) {
            case 0:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                if (!Intrinsics.d(navigation.getF49939a(), m3.f()) && !Intrinsics.d(navigation.getF49939a(), m3.h())) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 1:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                if (!Intrinsics.d(navigation.getF49939a(), m3.f()) && !Intrinsics.d(navigation.getF49939a(), m3.b())) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 2:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), (ScreenLocation) m3.f51134l.getValue()));
            default:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                if (!Intrinsics.d(navigation.getF49939a(), m3.d()) && !Intrinsics.d(navigation.getF49939a(), m3.h()) && !Intrinsics.d(navigation.getF49939a(), m3.b())) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f69686i) {
        }
        return b((Navigation) obj);
    }
}
