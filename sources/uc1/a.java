package uc1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.l4;
import va1.f1;

/* loaded from: classes5.dex */
public final class a extends f1 implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final a f121887f = new a();

    /* renamed from: g, reason: collision with root package name */
    public static final int f121888g = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f121889h = (ScreenLocation) l4.f51087b.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f121890i = 2;

    private a() {
        super(Integer.valueOf(l52.c.settings_security_connected_devices_title), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f121888g;
    }

    @Override // va1.f
    public final int getViewType() {
        return f121890i;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f121889h;
    }
}
