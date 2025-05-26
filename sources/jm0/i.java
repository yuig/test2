package jm0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76976i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f76977j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(RecyclerView recyclerView, int i13) {
        super(1);
        this.f76976i = i13;
        this.f76977j = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecyclerView recyclerView = this.f76977j;
        int i13 = this.f76976i;
        switch (i13) {
            case 0:
                break;
            case 1:
                ar0.x notifyEventListeners = (ar0.x) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                        notifyEventListeners.f(recyclerView);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                        notifyEventListeners.i(recyclerView);
                        break;
                }
                break;
            default:
                ar0.x notifyEventListeners2 = (ar0.x) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(notifyEventListeners2, "$this$notifyEventListeners");
                        notifyEventListeners2.f(recyclerView);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(notifyEventListeners2, "$this$notifyEventListeners");
                        notifyEventListeners2.i(recyclerView);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
