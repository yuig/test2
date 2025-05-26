package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class w0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final w0 f125270f = new w0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125271g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125272h = (ScreenLocation) b4.G.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125273i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private w0() {
        super(Integer.valueOf(c52.e.settings_main_reports_and_violations_center), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125273i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125271g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125272h;
    }
}
