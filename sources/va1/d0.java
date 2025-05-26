package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class d0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f125161f = new d0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125162g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125163h = (ScreenLocation) b4.f50571q.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125164i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private d0() {
        super(Integer.valueOf(c52.e.settings_main_claimed_accounts), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125164i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125162g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125163h;
    }
}
