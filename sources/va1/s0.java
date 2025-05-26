package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class s0 extends f1 implements e1, d {

    /* renamed from: f, reason: collision with root package name */
    public static final s0 f125237f = new s0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125238g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125239h = (ScreenLocation) b4.E.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125240i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    /* renamed from: j, reason: collision with root package name */
    public static final int f125241j = m60.t0.settings_privacy_and_data;

    private s0() {
        super(Integer.valueOf(c52.e.settings_main_privacy_data), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125240i;
    }

    @Override // va1.d
    public final int getId() {
        return f125241j;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125238g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125239h;
    }
}
