package gi;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte f65120a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f65121b;

    public u1(int i13) {
        this.f65120a = (byte) (i13 & RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
        this.f65121b = (byte) (i13 & 31);
    }
}
