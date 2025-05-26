package ar0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20394i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f20395j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20396k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(RecyclerView recyclerView, int i13, int i14) {
        super(1);
        this.f20394i = i14;
        this.f20395j = recyclerView;
        this.f20396k = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20396k;
        RecyclerView recyclerView = this.f20395j;
        int i14 = this.f20394i;
        switch (i14) {
            case 0:
                y notifyEventListeners = (y) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                        notifyEventListeners.g(recyclerView);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                        notifyEventListeners.d(recyclerView, i13);
                        break;
                }
                break;
            default:
                y notifyEventListeners2 = (y) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(notifyEventListeners2, "$this$notifyEventListeners");
                        notifyEventListeners2.g(recyclerView);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(notifyEventListeners2, "$this$notifyEventListeners");
                        notifyEventListeners2.d(recyclerView, i13);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
