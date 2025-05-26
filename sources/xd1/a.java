package xd1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* loaded from: classes5.dex */
public interface a extends xt1.d {
    @Override // xt1.d
    default void afterParseResponse(bl1.a aVar) {
        vd0.c cVar;
        vd0.c m13;
        if (!getShouldParseDynamicHeights() || aVar == null || (cVar = aVar.f23479b) == null || (m13 = cVar.m("grid_layout")) == null) {
            return;
        }
        String o13 = m13.o("w_h_ratio", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        Float e13 = y.e(o13);
        if (e13 != null) {
            updateFixedHeightImageSpec(new bb2.e(e13.floatValue(), (bb2.f) null, 6));
        }
    }

    @Override // xt1.d
    default void beforeParseResponse(vd0.c cVar) {
    }

    /* renamed from: getShouldParseResponse */
    boolean getShouldParseDynamicHeights();

    void updateFixedHeightImageSpec(bb2.e eVar);
}
