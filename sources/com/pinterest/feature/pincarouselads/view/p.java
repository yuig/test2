package com.pinterest.feature.pincarouselads.view;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public int f47412a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SingleColumnCarouselPinView f47414c;

    public p(SingleColumnCarouselPinView singleColumnCarouselPinView) {
        this.f47414c = singleColumnCarouselPinView;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f47412a = i13;
        if (i13 == 1) {
            SingleColumnCarouselPinView singleColumnCarouselPinView = this.f47414c;
            if (singleColumnCarouselPinView.getIsDraggable()) {
                this.f47413b = true;
                singleColumnCarouselPinView.restartJob();
                singleColumnCarouselPinView.stopAutoScroll();
                return;
            }
        }
        if (this.f47412a == 0) {
            this.f47413b = false;
        }
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f47414c.updateCurrentIndex(i13, this.f47412a, this.f47413b);
    }
}
