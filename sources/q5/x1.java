package q5;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class x1 extends w1 {

    /* renamed from: q, reason: collision with root package name */
    public static final a2 f102539q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f102539q = a2.i(null, windowInsets);
    }

    public x1(@NonNull a2 a2Var, @NonNull WindowInsets windowInsets) {
        super(a2Var, windowInsets);
    }

    @Override // q5.t1, q5.y1
    public final void d(@NonNull View view) {
    }

    @Override // q5.t1, q5.y1
    @NonNull
    public f5.e f(int i13) {
        Insets insets;
        insets = this.f102509c.getInsets(z1.a(i13));
        return f5.e.c(insets);
    }

    @Override // q5.t1, q5.y1
    public boolean o(int i13) {
        boolean isVisible;
        isVisible = this.f102509c.isVisible(z1.a(i13));
        return isVisible;
    }
}
