package com.pinterest.feature.search.visual.cropper;

import android.graphics.RectF;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/pinterest/feature/search/visual/cropper/FlashlightCropperDrawable$SlopRectF", "Landroid/graphics/RectF;", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class FlashlightCropperDrawable$SlopRectF extends RectF {
    public final boolean a(float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19 = ((RectF) this).left;
        float f23 = ((RectF) this).right;
        if (f19 < f23) {
            float f24 = ((RectF) this).top;
            float f25 = ((RectF) this).bottom;
            if (f24 < f25 && f13 >= f19 - f15 && f13 < f23 + f17 && f14 >= f24 - f16 && f14 < f25 + f18) {
                return true;
            }
        }
        return false;
    }
}
