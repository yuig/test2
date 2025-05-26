package xr1;

import h32.g0;
import h32.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f135677j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f135678k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f135679l = new a(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135680i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f135680i = i13;
    }

    public final void b(h0 update) {
        switch (this.f135680i) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = g0.RECOVER_ACCOUNT_VIEW;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = g0.RECOVER_ACCOUNT_VIEW;
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = g0.RECOVER_ACCOUNT_VIEW;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f135680i) {
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
