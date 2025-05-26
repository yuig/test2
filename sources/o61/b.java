package o61;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qm1.l;
import rm1.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f92942j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f92943k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f92944l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f92945m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92946i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f92946i = i13;
    }

    public final void b(l bind) {
        switch (this.f92946i) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(q.CHECK);
                break;
            case 1:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(q.PLAY);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(q.PAUSE);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f92946i) {
            case 0:
                b((l) obj);
                break;
            case 1:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                break;
            case 2:
                b((l) obj);
                break;
            default:
                b((l) obj);
                break;
        }
        return Unit.f80348a;
    }
}
