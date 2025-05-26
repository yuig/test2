package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class z0 extends f1 implements e1, d {

    /* renamed from: f, reason: collision with root package name */
    public static final z0 f125291f = new z0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125292g = c52.c.settings_social_permission;

    /* renamed from: h, reason: collision with root package name */
    public static final int f125293h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final ScreenLocation f125294i = (ScreenLocation) b4.C.getValue();

    /* renamed from: j, reason: collision with root package name */
    public static final int f125295j = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private z0() {
        super(Integer.valueOf(c52.e.settings_main_social_permissions), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125295j;
    }

    @Override // va1.d
    public final int getId() {
        return f125292g;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125293h;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125294i;
    }
}
