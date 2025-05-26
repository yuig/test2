package la0;

import bk1.a2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82423i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h32.u0 f82424j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(h32.u0 u0Var, int i13) {
        super(1);
        this.f82423i = i13;
        this.f82424j = u0Var;
    }

    public final void b(h32.h0 update) {
        int i13 = this.f82423i;
        h32.u0 u0Var = this.f82424j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                break;
            case 7:
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                update.f67045d = null;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f82423i) {
            case 0:
                b((h32.h0) obj);
                break;
            case 1:
                b((h32.h0) obj);
                break;
            case 2:
                b((h32.h0) obj);
                break;
            case 3:
                b((h32.h0) obj);
                break;
            case 4:
                b((h32.h0) obj);
                break;
            case 5:
                b((h32.h0) obj);
                break;
            case 6:
                b((h32.h0) obj);
                break;
            case 7:
                a2 it = (a2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 8:
                b((h32.h0) obj);
                break;
            case 9:
                b((h32.h0) obj);
                break;
            default:
                b((h32.h0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
