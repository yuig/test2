package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class y0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f125283f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125284g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f125285h;

    /* renamed from: i, reason: collision with root package name */
    public final int f125286i;

    public y0(int i13, boolean z13) {
        super(Integer.valueOf(i13), null, 2, null);
        this.f125283f = z13;
        this.f125284g = 2;
        this.f125285h = (ScreenLocation) b4.H.getValue();
        this.f125286i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f125286i;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f125284g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f125285h;
    }
}
