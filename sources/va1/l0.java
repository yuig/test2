package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class l0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f125204f;

    /* renamed from: g, reason: collision with root package name */
    public final ScreenLocation f125205g;

    /* renamed from: h, reason: collision with root package name */
    public final int f125206h;

    public l0(int i13) {
        super(Integer.valueOf(i13), null, 2, null);
        this.f125204f = 2;
        this.f125205g = (ScreenLocation) b4.f50560f.getValue();
        this.f125206h = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f125206h;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f125204f;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f125205g;
    }
}
