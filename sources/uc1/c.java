package uc1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.l4;
import va1.f1;

/* loaded from: classes5.dex */
public final class c extends f1 implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final c f121893f = new c();

    /* renamed from: g, reason: collision with root package name */
    public static final int f121894g = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f121895h = (ScreenLocation) l4.f51088c.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f121896i = 2;

    private c() {
        super(Integer.valueOf(l52.c.settings_security_login_options_title), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f121894g;
    }

    @Override // va1.f
    public final int getViewType() {
        return f121896i;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f121895h;
    }
}
