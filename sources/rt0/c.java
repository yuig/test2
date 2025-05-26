package rt0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f109960j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f109961k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f109962l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f109963m = new c(4);

    /* renamed from: n, reason: collision with root package name */
    public static final c f109964n = new c(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109965i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f109965i = i13;
    }

    public final void b(b it) {
        switch (this.f109965i) {
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
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f109965i) {
            case 0:
                b((b) obj);
                break;
            case 1:
                b((b) obj);
                break;
            case 2:
                b((b) obj);
                break;
            case 3:
                b((b) obj);
                break;
            case 4:
                b((b) obj);
                break;
            default:
                b((b) obj);
                break;
        }
        return Unit.f80348a;
    }
}
