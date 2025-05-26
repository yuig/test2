package q5;

import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class u1 extends t1 {

    /* renamed from: m, reason: collision with root package name */
    public f5.e f102520m;

    public u1(@NonNull a2 a2Var, @NonNull WindowInsets windowInsets) {
        super(a2Var, windowInsets);
        this.f102520m = null;
    }

    @Override // q5.y1
    @NonNull
    public a2 b() {
        return a2.i(null, this.f102509c.consumeStableInsets());
    }

    @Override // q5.y1
    @NonNull
    public a2 c() {
        return a2.i(null, this.f102509c.consumeSystemWindowInsets());
    }

    @Override // q5.y1
    @NonNull
    public final f5.e h() {
        if (this.f102520m == null) {
            WindowInsets windowInsets = this.f102509c;
            this.f102520m = f5.e.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f102520m;
    }

    @Override // q5.y1
    public boolean m() {
        return this.f102509c.isConsumed();
    }

    @Override // q5.y1
    public void r(f5.e eVar) {
        this.f102520m = eVar;
    }
}
