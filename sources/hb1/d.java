package hb1;

import com.pinterest.framework.screens.ScreenLocation;
import va1.h;

/* loaded from: classes5.dex */
public abstract class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f68529a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final int f68530b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68531c;

    /* renamed from: d, reason: collision with root package name */
    public final ScreenLocation f68532d;

    public d(int i13, int i14, ScreenLocation screenLocation) {
        this.f68530b = i13;
        this.f68531c = i14;
        this.f68532d = screenLocation;
    }

    @Override // va1.h
    public final int c() {
        return ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }
}
