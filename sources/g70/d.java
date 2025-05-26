package g70;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f63861j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f63862k = new d(2);

    /* renamed from: l, reason: collision with root package name */
    public static final d f63863l = new d(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63864i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f63864i = i13;
    }

    public final void b(Navigation navigation) {
        switch (this.f63864i) {
            case 0:
                Intrinsics.checkNotNullParameter(navigation, "$this$null");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(navigation, "$this$null");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(navigation, "$this$null");
                break;
            default:
                Intrinsics.checkNotNullParameter(navigation, "$this$null");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f63864i) {
            case 0:
                b((Navigation) obj);
                break;
            case 1:
                b((Navigation) obj);
                break;
            case 2:
                b((Navigation) obj);
                break;
            default:
                b((Navigation) obj);
                break;
        }
        return Unit.f80348a;
    }
}
