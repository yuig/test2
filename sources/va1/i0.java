package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class i0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final i0 f125185f = new i0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125186g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125187h = (ScreenLocation) b4.f50559e.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125188i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private i0() {
        super(Integer.valueOf(c52.e.settings_main_creator_hub), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125188i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125186g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125187h;
    }
}
