package q5;

import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class q1 extends s1 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f102501c;

    public q1() {
        this.f102501c = n5.i.f();
    }

    @Override // q5.s1
    @NonNull
    public a2 b() {
        WindowInsets build;
        a();
        build = this.f102501c.build();
        a2 i13 = a2.i(null, build);
        i13.f102400a.p(this.f102503b);
        return i13;
    }

    @Override // q5.s1
    public void d(@NonNull f5.e eVar) {
        this.f102501c.setMandatorySystemGestureInsets(eVar.d());
    }

    @Override // q5.s1
    public void e(@NonNull f5.e eVar) {
        this.f102501c.setStableInsets(eVar.d());
    }

    @Override // q5.s1
    public void f(@NonNull f5.e eVar) {
        this.f102501c.setSystemGestureInsets(eVar.d());
    }

    @Override // q5.s1
    public void g(@NonNull f5.e eVar) {
        this.f102501c.setSystemWindowInsets(eVar.d());
    }

    @Override // q5.s1
    public void h(@NonNull f5.e eVar) {
        this.f102501c.setTappableElementInsets(eVar.d());
    }

    public q1(@NonNull a2 a2Var) {
        super(a2Var);
        WindowInsets.Builder f13;
        WindowInsets h10 = a2Var.h();
        if (h10 != null) {
            f13 = n5.i.g(h10);
        } else {
            f13 = n5.i.f();
        }
        this.f102501c = f13;
    }
}
