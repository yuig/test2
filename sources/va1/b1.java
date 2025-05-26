package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class b1 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final b1 f125153f = new b1();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125154g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125155h = (ScreenLocation) b4.f50566l.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125156i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private b1() {
        super(Integer.valueOf(m60.x0.setting_screen_switch_account), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125156i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125154g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125155h;
    }
}
