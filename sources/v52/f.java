package v52;

import h32.h0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f124182j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f124183k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f124184l = new f(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124185i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f124185i = i13;
    }

    public final void b(h0 update) {
        switch (this.f124185i) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.BACK_BUTTON;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.DONE_BUTTON;
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.EDIT_BUTTON;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f124185i) {
            case 0:
                b((h0) obj);
                break;
            case 1:
                b((h0) obj);
                break;
            default:
                b((h0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
