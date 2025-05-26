package q5;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class v1 extends u1 {
    public v1(@NonNull a2 a2Var, @NonNull WindowInsets windowInsets) {
        super(a2Var, windowInsets);
    }

    @Override // q5.y1
    @NonNull
    public a2 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f102509c.consumeDisplayCutout();
        return a2.i(null, consumeDisplayCutout);
    }

    @Override // q5.y1
    public i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f102509c.getDisplayCutout();
        return i.e(displayCutout);
    }

    @Override // q5.t1, q5.y1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return Objects.equals(this.f102509c, v1Var.f102509c) && Objects.equals(this.f102513g, v1Var.f102513g);
    }

    @Override // q5.y1
    public int hashCode() {
        return this.f102509c.hashCode();
    }
}
