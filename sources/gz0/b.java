package gz0;

import h32.h0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f66361j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f66362k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66363i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f66363i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f66363i;
        switch (i13) {
            case 0:
                h0 update = (h0) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        update.f67047f = u0.PEAR_ANSWER_BUTTON;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        update.f67047f = u0.BACK_BUTTON;
                        break;
                }
                break;
            default:
                h0 update2 = (h0) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        update2.f67047f = u0.PEAR_ANSWER_BUTTON;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        update2.f67047f = u0.BACK_BUTTON;
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
