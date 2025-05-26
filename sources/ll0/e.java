package ll0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f83799j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f83800k = new e(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83801i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f83801i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f83801i;
        switch (i13) {
            case 0:
                Throwable it = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                break;
            default:
                Throwable it2 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
