package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class a0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final a0 f125143f = new a0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125144g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125145h = (ScreenLocation) b4.f50561g.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125146i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private a0() {
        super(Integer.valueOf(c52.e.settings_main_analytics), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125146i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125144g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125145h;
    }
}
