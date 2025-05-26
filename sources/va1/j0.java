package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class j0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f125190f = new j0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125191g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125192h = (ScreenLocation) b4.f50577w.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125193i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private j0() {
        super(Integer.valueOf(c52.e.settings_main_edit_profile), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125193i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125191g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125192h;
    }
}
