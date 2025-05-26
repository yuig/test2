package lr;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f84492j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f84493k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f84494l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f84495m = new e(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84496i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f84496i = i13;
    }

    public final void b(Navigation navigateToBoard) {
        switch (this.f84496i) {
            case 0:
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.m0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE", "toast");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.m0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE", "toast");
                break;
            default:
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.m0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE", "toast");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f84496i) {
            case 0:
                b((Navigation) obj);
                break;
            case 1:
                b((Navigation) obj);
                break;
            case 2:
                break;
            default:
                b((Navigation) obj);
                break;
        }
        return Unit.f80348a;
    }
}
