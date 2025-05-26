package t3;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r4 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116182a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f116183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f116184c;

    public r4(View view, i2.o2 o2Var) {
        this.f116183b = view;
        this.f116184c = o2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f116182a) {
            case 0:
                break;
            default:
                View view2 = this.f116183b;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = q5.v0.f102521a;
                q5.k0.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f116182a) {
            case 0:
                this.f116183b.removeOnAttachStateChangeListener(this);
                ((i2.o2) this.f116184c).v();
                break;
        }
    }

    public r4(androidx.fragment.app.d1 d1Var, View view) {
        this.f116184c = d1Var;
        this.f116183b = view;
    }
}
