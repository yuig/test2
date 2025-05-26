package du;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f56265i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Navigation customNavigateToBoard = (Navigation) obj;
        Intrinsics.checkNotNullParameter(customNavigateToBoard, "$this$customNavigateToBoard");
        customNavigateToBoard.Y1("com.pinterest.EXTRA_SHOW_TOOL_BAR", true);
        customNavigateToBoard.Y1("EXTRA_NAVBAR_HIDE", true);
        return Unit.f80348a;
    }
}
