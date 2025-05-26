package ar0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20390i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f20391j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(RecyclerView recyclerView, int i13) {
        super(1);
        this.f20390i = i13;
        this.f20391j = recyclerView;
    }

    public final void b(x notifyEventListeners) {
        int i13 = this.f20390i;
        RecyclerView recyclerView = this.f20391j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                notifyEventListeners.h(recyclerView);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                notifyEventListeners.a(recyclerView);
                break;
            default:
                Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                notifyEventListeners.b(recyclerView);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f20390i) {
            case 0:
                b((x) obj);
                break;
            case 1:
                b((x) obj);
                break;
            default:
                b((x) obj);
                break;
        }
        return Unit.f80348a;
    }
}
