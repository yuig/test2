package mu0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f88289j = new e(1);

    /* renamed from: k, reason: collision with root package name */
    public static final e f88290k = new e(2);

    /* renamed from: l, reason: collision with root package name */
    public static final e f88291l = new e(3);

    /* renamed from: m, reason: collision with root package name */
    public static final e f88292m = new e(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88293i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f88293i = i13;
    }

    public final void b(Throwable it) {
        switch (this.f88293i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                it.getMessage();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f88293i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
