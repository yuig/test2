package px0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f101586j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f101587k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f101588l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f101589m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f101590n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f101591o = new d(5);

    /* renamed from: p, reason: collision with root package name */
    public static final d f101592p = new d(6);

    /* renamed from: q, reason: collision with root package name */
    public static final d f101593q = new d(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101594i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f101594i = i13;
    }

    public final void b(Throwable it) {
        switch (this.f101594i) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f101594i) {
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
            case 4:
                b((Throwable) obj);
                break;
            case 5:
                b((Throwable) obj);
                break;
            case 6:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
