package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class z extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final z f125287f = new z();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125288g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125289h = (ScreenLocation) b4.f50567m.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125290i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private z() {
        super(Integer.valueOf(m60.x0.setting_screen_add_account), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125290i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125288g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125289h;
    }
}
