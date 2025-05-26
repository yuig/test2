package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class e0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f125167f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125168g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f125169h;

    /* renamed from: i, reason: collision with root package name */
    public final int f125170i;

    public e0(int i13) {
        super(Integer.valueOf(c52.e.settings_main_claimed_accounts), null, 2, 0 == true ? 1 : 0);
        this.f125167f = i13;
        this.f125168g = 23;
        this.f125169h = (ScreenLocation) b4.f50571q.getValue();
        this.f125170i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f125170i;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f125168g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f125169h;
    }
}
