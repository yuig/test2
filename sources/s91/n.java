package s91;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;
import va1.f1;

/* loaded from: classes5.dex */
public final class n extends f1 implements s {

    /* renamed from: f, reason: collision with root package name */
    public static final n f112097f = new n();

    /* renamed from: g, reason: collision with root package name */
    public static final int f112098g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f112099h = (ScreenLocation) b4.D.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f112100i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private n() {
        super(Integer.valueOf(c52.e.settings_main_personal_information), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f112100i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f112098g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f112099h;
    }
}
