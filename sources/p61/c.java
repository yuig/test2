package p61;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.u3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f98908i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Navigation navigation = (Navigation) obj;
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), (ScreenLocation) u3.f51431b.getValue()));
    }
}
