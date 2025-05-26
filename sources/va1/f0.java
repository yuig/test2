package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class f0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final f0 f125171f = new f0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125172g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125173h = (ScreenLocation) b4.f50569o.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125174i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private f0() {
        super(Integer.valueOf(c52.e.settings_main_claimed_accounts), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125174i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125172g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125173h;
    }
}
