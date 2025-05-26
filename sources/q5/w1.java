package q5;

import android.graphics.Insets;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class w1 extends v1 {

    /* renamed from: n, reason: collision with root package name */
    public f5.e f102530n;

    /* renamed from: o, reason: collision with root package name */
    public f5.e f102531o;

    /* renamed from: p, reason: collision with root package name */
    public f5.e f102532p;

    public w1(@NonNull a2 a2Var, @NonNull WindowInsets windowInsets) {
        super(a2Var, windowInsets);
        this.f102530n = null;
        this.f102531o = null;
        this.f102532p = null;
    }

    @Override // q5.y1
    @NonNull
    public f5.e g() {
        Insets mandatorySystemGestureInsets;
        if (this.f102531o == null) {
            mandatorySystemGestureInsets = this.f102509c.getMandatorySystemGestureInsets();
            this.f102531o = f5.e.c(mandatorySystemGestureInsets);
        }
        return this.f102531o;
    }

    @Override // q5.y1
    @NonNull
    public f5.e i() {
        Insets systemGestureInsets;
        if (this.f102530n == null) {
            systemGestureInsets = this.f102509c.getSystemGestureInsets();
            this.f102530n = f5.e.c(systemGestureInsets);
        }
        return this.f102530n;
    }

    @Override // q5.y1
    @NonNull
    public f5.e k() {
        Insets tappableElementInsets;
        if (this.f102532p == null) {
            tappableElementInsets = this.f102509c.getTappableElementInsets();
            this.f102532p = f5.e.c(tappableElementInsets);
        }
        return this.f102532p;
    }

    @Override // q5.t1, q5.y1
    @NonNull
    public a2 l(int i13, int i14, int i15, int i16) {
        WindowInsets inset;
        inset = this.f102509c.inset(i13, i14, i15, i16);
        return a2.i(null, inset);
    }

    @Override // q5.u1, q5.y1
    public void r(f5.e eVar) {
    }
}
