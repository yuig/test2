package va1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;

/* loaded from: classes5.dex */
public final class x extends f1 implements e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final x f125274f = new x();

    /* renamed from: g, reason: collision with root package name */
    public static final int f125275g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final ScreenLocation f125276h = (ScreenLocation) b4.f50568n.getValue();

    /* renamed from: i, reason: collision with root package name */
    public static final int f125277i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();

    private x() {
        super(Integer.valueOf(c52.e.about), null, 2, null);
    }

    @Override // va1.h
    public final int c() {
        return f125277i;
    }

    @Override // va1.f
    public final int getViewType() {
        return f125275g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return f125276h;
    }
}
