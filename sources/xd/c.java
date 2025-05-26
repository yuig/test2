package xd;

import android.graphics.drawable.Drawable;
import pd.c0;
import pd.g0;

/* loaded from: classes3.dex */
public abstract class c implements g0, c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f134592a;

    public c(Drawable drawable) {
        d7.b.p(drawable, "Argument must not be null");
        this.f134592a = drawable;
    }

    @Override // pd.g0
    public final Object get() {
        Drawable drawable = this.f134592a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
