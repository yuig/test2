package u51;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.j1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f120600i = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Navigation navigation = (Navigation) obj;
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), (ScreenLocation) j1.f51007c.getValue()));
    }
}
