package j11;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f74385j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f74386k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74387i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f74387i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f74387i;
        switch (i13) {
            case 0:
                Navigation navigateToBoard = (Navigation) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                        navigateToBoard.m0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE", "toast");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                        navigateToBoard.m0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE", "toast");
                        break;
                }
                break;
            default:
                Navigation navigateToBoard2 = (Navigation) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(navigateToBoard2, "$this$navigateToBoard");
                        navigateToBoard2.m0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE", "toast");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(navigateToBoard2, "$this$navigateToBoard");
                        navigateToBoard2.m0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE", "toast");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
