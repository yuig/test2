package sr;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f115040i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f115041j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f115042k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f115043l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z13, boolean z14, d dVar, boolean z15) {
        super(1);
        this.f115040i = z13;
        this.f115041j = z14;
        this.f115042k = dVar;
        this.f115043l = z15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Navigation customNavigateToBoard = (Navigation) obj;
        Intrinsics.checkNotNullParameter(customNavigateToBoard, "$this$customNavigateToBoard");
        if (this.f115040i) {
            customNavigateToBoard.Y1("com.pinterest.EXTRA_IS_DEEPLINK", true);
        }
        if (this.f115041j) {
            customNavigateToBoard.Y1("com.pinterest.EXTRA_SHOULD_AUTO_SHOW_BOARD_COLLABORATOR_MODAL", true);
        }
        if (!this.f115042k.f115044a.i()) {
            customNavigateToBoard.Y1("com.pinterest.EXTRA_IS_FROM_URL", true);
        }
        if (this.f115043l) {
            customNavigateToBoard.Y1("com.pinterest.EXTRA_BOARD_IS_AUTO_MAGICAL", true);
        }
        return Unit.f80348a;
    }
}
