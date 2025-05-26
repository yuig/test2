package k1;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78044i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f78045j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f78046k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f78047l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(Object obj, int i13, int i14, int i15) {
        super(1);
        this.f78044i = i15;
        this.f78047l = obj;
        this.f78045j = i13;
        this.f78046k = i14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f78046k;
        int i14 = this.f78045j;
        int i15 = this.f78044i;
        Object obj2 = this.f78047l;
        switch (i15) {
            case 0:
                q3.b1.g((q3.b1) obj, (q3.c1) obj2, i14, i13);
                break;
            default:
                ar0.y notifyEventListeners = (ar0.y) obj;
                Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                notifyEventListeners.c((RecyclerView) obj2, i14, i13);
                break;
        }
        return Unit.f80348a;
    }
}
