package com.pinterest.feature.sharesheet.view.previewcarousel;

import android.widget.FrameLayout;
import i91.c0;
import i91.w;
import i91.y;
import kotlin.jvm.internal.Intrinsics;
import so.f5;

/* loaded from: classes5.dex */
public final class e extends i {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f48431u;

    /* renamed from: v, reason: collision with root package name */
    public final o f48432v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FrameLayout itemView, o pinView, int i13) {
        super(itemView);
        this.f48431u = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(pinView, "pinView");
            this.f48432v = pinView;
            return;
        }
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(pinView, "pinView");
        super(itemView);
        this.f48432v = pinView;
    }

    @Override // com.pinterest.feature.sharesheet.view.previewcarousel.i
    public final void k0(c0 shareConfig, yk1.j mvpBinder, f5 shareBoardPreviewPresenterFactory) {
        switch (this.f48431u) {
            case 0:
                Intrinsics.checkNotNullParameter(shareConfig, "shareConfig");
                Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
                Intrinsics.checkNotNullParameter(shareBoardPreviewPresenterFactory, "shareBoardPreviewPresenterFactory");
                w wVar = shareConfig instanceof w ? (w) shareConfig : null;
                o oVar = this.f48432v;
                if (wVar != null) {
                    int i13 = o.f48448i;
                    oVar.a(((w) shareConfig).f71905a, false, false);
                }
                if ((shareConfig instanceof y ? (y) shareConfig : null) != null) {
                    y yVar = (y) shareConfig;
                    boolean z13 = yVar.f71916b;
                    oVar.a(yVar.f71915a, z13, !z13);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(shareConfig, "shareConfig");
                Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
                Intrinsics.checkNotNullParameter(shareBoardPreviewPresenterFactory, "shareBoardPreviewPresenterFactory");
                break;
        }
    }
}
