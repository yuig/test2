package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class v0 extends f1 implements e1, d {

    /* renamed from: f, reason: collision with root package name */
    public static final v0 f125251f = new v0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125252g = c52.c.settings_profile_visibility;

    /* renamed from: h, reason: collision with root package name */
    public static final int f125253h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final ScreenLocation f125254i = (ScreenLocation) b4.F.getValue();

    /* renamed from: j, reason: collision with root package name */
    public static final int f125255j = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private v0() {
        super(Integer.valueOf(c52.e.settings_main_profile_visibility), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125255j;
    }

    @Override // va1.d
    public final int getId() {
        return f125252g;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125253h;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125254i;
    }
}
