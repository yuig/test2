package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class o0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f125219f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125220g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f125221h;

    /* renamed from: i, reason: collision with root package name */
    public final int f125222i;

    public o0(int i13) {
        super(Integer.valueOf(c52.e.settings_main_claimed_accounts), null, 2, 0 == true ? 1 : 0);
        this.f125219f = i13;
        this.f125220g = 23;
        this.f125221h = (ScreenLocation) b4.f50579y.getValue();
        this.f125222i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f125222i;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f125220g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f125221h;
    }
}
