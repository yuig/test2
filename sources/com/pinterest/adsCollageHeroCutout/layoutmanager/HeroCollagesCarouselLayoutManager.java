package com.pinterest.adsCollageHeroCutout.layoutmanager;

import android.content.Context;
import android.content.res.Resources;
import bs1.c;
import com.pinterest.ui.snappablecarousel.SnappableCarouselLayoutManager;
import cr.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vv.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/adsCollageHeroCutout/layoutmanager/HeroCollagesCarouselLayoutManager;", "Lcom/pinterest/ui/snappablecarousel/SnappableCarouselLayoutManager;", "adsCollageHeroCutout_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeroCollagesCarouselLayoutManager extends SnappableCarouselLayoutManager {
    public final a P;
    public final int Q;
    public final int R;
    public final int S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroCollagesCarouselLayoutManager(d debugTag, Context context, sv.a itemScrolledToListener, int i13, a carouselType) {
        super(debugTag, context, itemScrolledToListener, i13, 48);
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemScrolledToListener, "itemScrolledToListener");
        Intrinsics.checkNotNullParameter(carouselType, "carouselType");
        this.P = carouselType;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.Q = c.U(qv.a.collages_hero_carousel_item_size, resources);
        this.R = i13;
        this.S = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    @Override // com.pinterest.ui.snappablecarousel.SnappableCarouselLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I1() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f19506n
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r17.E()
            r4 = 0
        Ld:
            if (r4 >= r3) goto L8a
            android.view.View r5 = r0.D(r4)
            boolean r6 = r5 instanceof uv.f
            if (r6 == 0) goto L1a
            uv.f r5 = (uv.f) r5
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r5 != 0) goto L1e
            return
        L1e:
            int r6 = androidx.recyclerview.widget.l2.K(r5)
            int r7 = androidx.recyclerview.widget.l2.N(r5)
            int r7 = r7 + r6
            float r6 = (float) r7
            float r6 = r6 / r2
            float r6 = r1 - r6
            float r7 = java.lang.Math.abs(r6)
            int r8 = r0.f19506n
            float r8 = (float) r8
            float r8 = r7 / r8
            r9 = 1
            float r9 = (float) r9
            r10 = 2
            float r10 = (float) r10
            float r10 = r8 / r10
            float r10 = r9 - r10
            r11 = 10
            float r11 = (float) r11
            float r11 = r8 / r11
            float r9 = r9 - r11
            r11 = 0
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            vv.a r13 = r0.P
            if (r12 <= 0) goto L50
            float r6 = r13.getRotation()
            float r6 = -r6
        L4e:
            float r6 = r6 * r8
            goto L5a
        L50:
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L59
            float r6 = r13.getRotation()
            goto L4e
        L59:
            r6 = r11
        L5a:
            double r13 = (double) r8
            r15 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 <= 0) goto L66
            r11 = -1073741824(0xffffffffc0000000, float:-2.0)
        L66:
            r8 = 4
            if (r12 <= 0) goto L6c
        L69:
            float r8 = (float) r8
            float r7 = r7 / r8
            goto L6e
        L6c:
            float r7 = -r7
            goto L69
        L6e:
            r5.setTranslationZ(r11)
            com.pinterest.adsCollageHeroCutout.item.HeroCollagesCarouselCutoutImageView r8 = r5.f123151e
            r8.setScaleX(r10)
            r8.setScaleY(r10)
            r8.setRotation(r6)
            r8.setTranslationX(r7)
            com.pinterest.adsCollageHeroCutout.item.HeroCollagesCarouselCutoutDetailsView r5 = r5.f123152f
            r5.setScaleX(r9)
            r5.setScaleY(r9)
            int r4 = r4 + 1
            goto Ld
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.adsCollageHeroCutout.layoutmanager.HeroCollagesCarouselLayoutManager.I1():void");
    }

    @Override // androidx.recyclerview.widget.l2
    public final int V() {
        return (((this.f19506n / 2) - (this.Q / 2)) - (this.R / 2)) - (this.S / 2);
    }

    @Override // androidx.recyclerview.widget.l2
    public final int W() {
        return V();
    }
}
