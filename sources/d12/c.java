package d12;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import vb0.j;

/* loaded from: classes2.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f53621j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f53622k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f53623l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f53624m = new c(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53625i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f53625i = i13;
    }

    public final void b(Throwable th3) {
        switch (this.f53625i) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                Intrinsics.f(th3);
                j.f125466a.E("Failed to wait for cold start completion to store models", th3);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f53625i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
