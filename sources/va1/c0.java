package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class c0 extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f125157f;

    /* renamed from: g, reason: collision with root package name */
    public final ScreenLocation f125158g;

    /* renamed from: h, reason: collision with root package name */
    public final int f125159h;

    public c0(boolean z13) {
        super(Integer.valueOf(c52.e.settings_main_branded_content), null, 2, null);
        this.f125157f = 2;
        this.f125158g = z13 ? (ScreenLocation) b4.f50558d.getValue() : (ScreenLocation) b4.f50557c.getValue();
        this.f125159h = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f125159h;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f125157f;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f125158g;
    }
}
