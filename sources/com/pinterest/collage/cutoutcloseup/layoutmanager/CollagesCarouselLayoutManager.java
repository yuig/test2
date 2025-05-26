package com.pinterest.collage.cutoutcloseup.layoutmanager;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.q;
import androidx.recyclerview.widget.r0;
import com.pinterest.ui.snappablecarousel.SnappableCarouselLayoutManager;
import cp.b;
import d90.a;
import fb2.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/collage/cutoutcloseup/layoutmanager/CollagesCarouselLayoutManager;", "Lcom/pinterest/ui/snappablecarousel/SnappableCarouselLayoutManager;", "cutoutCloseup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CollagesCarouselLayoutManager extends SnappableCarouselLayoutManager {
    public final a P;
    public final int Q;
    public final int R;
    public final int S;
    public float T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollagesCarouselLayoutManager(r0 debugTag, Context context, c itemScrolledToListener, int i13, a carouselType) {
        super(debugTag, context, itemScrolledToListener, i13, 48);
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemScrolledToListener, "itemScrolledToListener");
        Intrinsics.checkNotNullParameter(carouselType, "carouselType");
        this.P = carouselType;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.Q = bs1.c.U(a90.a.collages_bottom_sheet_carousel_item_width, resources);
        this.R = i13;
        this.S = i13;
        this.T = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[SYNTHETIC] */
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
            if (r3 >= r2) goto L87
            android.view.View r4 = r12.D(r3)
            boolean r5 = r4 instanceof k90.e
            if (r5 == 0) goto L18
            k90.e r4 = (k90.e) r4
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
            d90.a r10 = r12.P
            if (r9 <= 0) goto L42
            float r9 = r10.getRotation()
            float r9 = -r9
        L40:
            float r9 = r9 * r6
            goto L4c
        L42:
            int r9 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r9 >= 0) goto L4b
            float r9 = r10.getRotation()
            goto L40
        L4b:
            r9 = r8
        L4c:
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L51
            goto L70
        L51:
            float r5 = java.lang.Math.abs(r9)
            double r5 = (double) r5
            r10 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r5 = r5 * r10
            r8 = 180(0xb4, float:2.52E-43)
            double r10 = (double) r8
            double r5 = r5 / r10
            double r5 = java.lang.Math.sin(r5)
            int r8 = r4.getWidth()
            double r10 = (double) r8
            double r5 = r5 * r10
            double r10 = (double) r7
            double r5 = r5 / r10
            r8 = 2
            double r10 = (double) r8
            double r5 = r5 / r10
            float r8 = (float) r5
        L70:
            float r5 = r12.T
            float r5 = r5 * r7
            r4.setScaleX(r5)
            float r5 = r12.T
            float r5 = r5 * r7
            r4.setScaleY(r5)
            r4.setRotation(r9)
            r4.setTranslationY(r8)
            r4.f78748j = r7
            int r3 = r3 + 1
            goto Lb
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.collage.cutoutcloseup.layoutmanager.CollagesCarouselLayoutManager.I1():void");
    }

    @Override // androidx.recyclerview.widget.l2
    public final int V() {
        return (((this.f19506n / 2) - (this.Q / 2)) - (this.R / 2)) - (this.S / 2);
    }

    @Override // androidx.recyclerview.widget.l2
    public final int W() {
        return V();
    }

    public /* synthetic */ CollagesCarouselLayoutManager(b bVar, Context context, q qVar, int i13) {
        this(bVar, context, qVar, i13, a.CURVED);
    }
}
