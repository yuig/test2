package y90;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f138246j = new u(2);

    /* renamed from: k, reason: collision with root package name */
    public static final u f138247k = new u(3);

    /* renamed from: l, reason: collision with root package name */
    public static final u f138248l = new u(4);

    /* renamed from: m, reason: collision with root package name */
    public static final u f138249m = new u(5);

    /* renamed from: n, reason: collision with root package name */
    public static final u f138250n = new u(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138251i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(1);
        this.f138251i = i13;
    }

    public final void b(ek.e it) {
        switch (this.f138251i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 3:
            default:
                Intrinsics.checkNotNullParameter(it, "tab");
                d0.Z7(it, false);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "tab");
                d0.Z7(it, true);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f138251i) {
            case 0:
                b((ek.e) obj);
                return Unit.f80348a;
            case 1:
                b((ek.e) obj);
                return Unit.f80348a;
            case 2:
                b((ek.e) obj);
                return Unit.f80348a;
            case 3:
                Intrinsics.checkNotNullParameter((r72.w0) obj, "it");
                return Unit.f80348a;
            case 4:
                b((ek.e) obj);
                return Unit.f80348a;
            case 5:
                b((ek.e) obj);
                return Unit.f80348a;
            default:
                d it = (d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, null, 7);
        }
    }
}
