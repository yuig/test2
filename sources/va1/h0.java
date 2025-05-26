package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class h0 extends f1 implements e1, d {

    /* renamed from: f, reason: collision with root package name */
    public static final h0 f125180f = new h0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125181g = c52.c.settings_content_permission;

    /* renamed from: h, reason: collision with root package name */
    public static final int f125182h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final ScreenLocation f125183i = (ScreenLocation) b4.f50573s.getValue();

    /* renamed from: j, reason: collision with root package name */
    public static final int f125184j = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private h0() {
        super(Integer.valueOf(c52.e.settings_main_content_permissions), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125184j;
    }

    @Override // va1.d
    public final int getId() {
        return f125181g;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125182h;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125183i;
    }
}
