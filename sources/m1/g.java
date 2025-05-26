package m1;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    public final j1.o2 f85343b = j1.e.r(RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED, 0, new j1.y(0.25f, 0.1f, 0.25f, 1.0f), 2);

    @Override // m1.e
    public final float a(float f13, float f14, float f15) {
        float abs = Math.abs((f14 + f13) - f13);
        float f16 = (0.3f * f15) - (0.0f * abs);
        float f17 = f15 - f16;
        if ((abs <= f15) && f17 < abs) {
            f16 = f15 - abs;
        }
        return f13 - f16;
    }

    @Override // m1.e
    public final j1.n b() {
        return this.f85343b;
    }
}
