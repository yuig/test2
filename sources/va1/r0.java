package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class r0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final r0 f125233f = new r0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125234g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125235h = (ScreenLocation) b4.A.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125236i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private r0() {
        super(Integer.valueOf(c52.e.settings_menu_notifications), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125236i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125234g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125235h;
    }
}
