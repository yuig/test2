package ar0;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20392i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f20393j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(View view, int i13) {
        super(1);
        this.f20392i = i13;
        this.f20393j = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = this.f20393j;
        int i13 = this.f20392i;
        switch (i13) {
            case 0:
                r notifyEventListeners = (r) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                        notifyEventListeners.onViewAttachedToWindow(view);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                        notifyEventListeners.onViewDetachedFromWindow(view);
                        break;
                }
                break;
            default:
                r notifyEventListeners2 = (r) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(notifyEventListeners2, "$this$notifyEventListeners");
                        notifyEventListeners2.onViewAttachedToWindow(view);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(notifyEventListeners2, "$this$notifyEventListeners");
                        notifyEventListeners2.onViewDetachedFromWindow(view);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
