package we1;

import com.pinterest.api.model.v7;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129597i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f129598j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v7 f129599k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(int i13, v7 v7Var, String str) {
        super(1);
        this.f129597i = i13;
        this.f129598j = str;
        this.f129599k = v7Var;
    }

    public final void b(Navigation navigateToBoard) {
        int i13 = this.f129597i;
        v7 v7Var = this.f129599k;
        String str = this.f129598j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                if (str != null) {
                    navigateToBoard.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", str);
                }
                navigateToBoard.Y1("com.pinterest.EXTRA_BOARD_IS_AUTO_MAGICAL", kh2.d.B0(v7Var));
                break;
            default:
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                if (str != null) {
                    navigateToBoard.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", str);
                }
                navigateToBoard.Y1("com.pinterest.EXTRA_BOARD_IS_AUTO_MAGICAL", kh2.d.B0(v7Var));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f129597i) {
            case 0:
                b((Navigation) obj);
                break;
            default:
                b((Navigation) obj);
                break;
        }
        return Unit.f80348a;
    }
}
