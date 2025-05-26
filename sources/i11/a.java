package i11;

import com.pinterest.api.model.f30;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f70955j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f70956k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f70957l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f70958m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f70959n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f70960o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f70961p = new a(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70962i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f70962i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13 = true;
        switch (this.f70962i) {
            case 0:
                Navigation navigateToBoard = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.Y1("com.pinterest.EXTRA_SHOULD_AUTO_SHOW_BOARD_COLLABORATOR_MODAL", true);
                navigateToBoard.d0(150L, "com.pinterest.EXTRA_BOARD_COLLABORATOR_MODAL_DELAY_MS");
                return Unit.f80348a;
            case 1:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean[] zArr = it.f37485h3;
                if ((zArr.length <= 145 || !zArr[145]) && (zArr.length <= 146 || !zArr[146])) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 2:
                return Unit.f80348a;
            case 3:
                return Unit.f80348a;
            case 4:
                return Unit.f80348a;
            case 5:
                Boolean upsellShown = (Boolean) obj;
                Intrinsics.checkNotNullParameter(upsellShown, "upsellShown");
                return upsellShown;
            default:
                return Unit.f80348a;
        }
    }
}
