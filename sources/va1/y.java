package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class y extends f1 implements e1, d {

    /* renamed from: f, reason: collision with root package name */
    public static final y f125278f = new y();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125279g = c52.c.settings_account_management;

    /* renamed from: h, reason: collision with root package name */
    public static final int f125280h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final ScreenLocation f125281i = (ScreenLocation) b4.f50565k.getValue();

    /* renamed from: j, reason: collision with root package name */
    public static final int f125282j = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private y() {
        super(Integer.valueOf(c52.e.settings_main_account_management), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125282j;
    }

    @Override // va1.d
    public final int getId() {
        return f125279g;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125280h;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125281i;
    }
}
