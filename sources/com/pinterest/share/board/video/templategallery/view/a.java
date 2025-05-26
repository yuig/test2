package com.pinterest.share.board.video.templategallery.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.n1;
import androidx.recyclerview.widget.o2;
import com.pinterest.share.board.video.templategallery.view.BoardPreviewCarousel;
import kh2.j;
import kotlin.jvm.internal.Intrinsics;
import u52.b;
import u52.l;
import u52.n0;

/* loaded from: classes4.dex */
public final class a extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BoardPreviewCarousel f51857a;

    public a(BoardPreviewCarousel boardPreviewCarousel) {
        this.f51857a = boardPreviewCarousel;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i13 == 0) {
            BoardPreviewCarousel boardPreviewCarousel = this.f51857a;
            n1 n1Var = boardPreviewCarousel.f51850d;
            BoardPreviewCarousel.CenterZoomLayoutManager centerZoomLayoutManager = boardPreviewCarousel.f51851e;
            View h10 = n1Var.h(centerZoomLayoutManager);
            if (h10 != null) {
                centerZoomLayoutManager.getClass();
                int Z = l2.Z(h10);
                b bVar = boardPreviewCarousel.f51847a;
                if (bVar != null) {
                    int i14 = l.f120709l0;
                    j.x2(bVar.f120660a.d8(), new n0(Z));
                }
            }
        }
    }
}
