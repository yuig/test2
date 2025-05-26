package fw;

import ew.n;
import h32.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63030i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f63031j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(n nVar, int i13) {
        super(1);
        this.f63030i = i13;
        this.f63031j = nVar;
    }

    public final void b(h0 update) {
        int i13 = this.f63030i;
        n nVar = this.f63031j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67042a = nVar.getViewType();
                update.f67043b = nVar.getViewParam();
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (nVar != null) {
                    update.f67042a = nVar.getViewType();
                    update.f67043b = nVar.getViewParam();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f63030i) {
            case 0:
                b((h0) obj);
                break;
            default:
                b((h0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
