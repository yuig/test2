package com.pinterest.feature.pincarouselads.view;

import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47411b;

    public /* synthetic */ o(Object obj, int i13) {
        this.f47410a = i13;
        this.f47411b = obj;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        i0 startOrRestartViewModel$lambda$8;
        int i13 = this.f47410a;
        Object obj = this.f47411b;
        switch (i13) {
            case 0:
                startOrRestartViewModel$lambda$8 = SingleColumnCarouselPinView.startOrRestartViewModel$lambda$8((SingleColumnCarouselPinView) obj);
                return startOrRestartViewModel$lambda$8;
            case 1:
                uk1.d presenterPinalytics = (uk1.d) obj;
                Intrinsics.checkNotNullParameter(presenterPinalytics, "$presenterPinalytics");
                return presenterPinalytics.f122379a.p();
            default:
                PinVideoGridCell this$0 = (PinVideoGridCell) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.getPinalytics().p();
        }
    }
}
