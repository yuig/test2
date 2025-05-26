package com.pinterest.feature.closeup.qcm.drawer.carousel;

import android.content.Context;
import android.content.res.Resources;
import bs1.c;
import com.pinterest.ui.snappablecarousel.SnappableCarouselLayoutManager;
import cr.d;
import g4.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ps.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/closeup/qcm/drawer/carousel/QcmDrawerCarouselLayoutManager;", "Lcom/pinterest/ui/snappablecarousel/SnappableCarouselLayoutManager;", "lp2/b", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class QcmDrawerCarouselLayoutManager extends SnappableCarouselLayoutManager {
    public final int P;
    public final int Q;
    public final int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QcmDrawerCarouselLayoutManager(d debugTag, Context context, u itemScrolledToListener, int i13) {
        super(debugTag, context, itemScrolledToListener, i13, 48);
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemScrolledToListener, "itemScrolledToListener");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.P = c.U(n.ads_qcm_drawer_carousel_item_width, resources);
        this.Q = i13;
        this.R = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[SYNTHETIC] */
    @Override // com.pinterest.ui.snappablecarousel.SnappableCarouselLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I1() {
        /*
            r12 = this;
            int r0 = r12.f19506n
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r2 = r12.E()
            r3 = 0
        Lb:
            if (r3 >= r2) goto L78
            android.view.View r4 = r12.D(r3)
            boolean r5 = r4 instanceof kp0.c
            if (r5 == 0) goto L18
            kp0.c r4 = (kp0.c) r4
            goto L19
        L18:
            r4 = 0
        L19:
            if (r4 != 0) goto L1c
            return
        L1c:
            int r5 = androidx.recyclerview.widget.l2.K(r4)
            int r6 = androidx.recyclerview.widget.l2.N(r4)
            int r6 = r6 + r5
            float r5 = (float) r6
            float r5 = r5 / r1
            float r5 = r0 - r5
            float r6 = java.lang.Math.abs(r5)
            int r7 = r12.f19506n
            float r7 = (float) r7
            float r6 = r6 / r7
            r7 = 1
            float r7 = (float) r7
            float r7 = r7 - r6
            r8 = 0
            int r9 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r9 <= 0) goto L3d
            r9 = -1043857408(0xffffffffc1c80000, float:-25.0)
        L3b:
            float r6 = r6 * r9
            goto L45
        L3d:
            int r9 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r9 >= 0) goto L44
            r9 = 1103626240(0x41c80000, float:25.0)
            goto L3b
        L44:
            r6 = r8
        L45:
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L4a
            goto L69
        L4a:
            float r5 = java.lang.Math.abs(r6)
            double r8 = (double) r5
            r10 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r8 = r8 * r10
            r5 = 180(0xb4, float:2.52E-43)
            double r10 = (double) r5
            double r8 = r8 / r10
            double r8 = java.lang.Math.sin(r8)
            int r5 = r4.getWidth()
            double r10 = (double) r5
            double r8 = r8 * r10
            double r10 = (double) r7
            double r8 = r8 / r10
            r5 = 2
            double r10 = (double) r5
            double r8 = r8 / r10
            float r8 = (float) r8
        L69:
            r4.setScaleX(r7)
            r4.setScaleY(r7)
            r4.setRotation(r6)
            r4.setTranslationY(r8)
            int r3 = r3 + 1
            goto Lb
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.closeup.qcm.drawer.carousel.QcmDrawerCarouselLayoutManager.I1():void");
    }

    @Override // androidx.recyclerview.widget.l2
    public final int V() {
        return (((this.f19506n / 2) - (this.P / 2)) - (this.Q / 2)) - (this.R / 2);
    }

    @Override // androidx.recyclerview.widget.l2
    public final int W() {
        return V();
    }
}
