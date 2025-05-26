package lu;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class h0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f84901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f84902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f84903c;

    public h0(int i13, e0 e0Var, i0 i0Var) {
        this.f84901a = e0Var;
        this.f84902b = i0Var;
        this.f84903c = i13;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e0 e0Var = this.f84901a;
        e0Var.f84881u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        vt.e eVar = this.f84902b.f84906d;
        int measuredHeight = e0Var.f84881u.getMeasuredHeight();
        int[] iArr = eVar.f126587n;
        int length = iArr != null ? iArr.length : 0;
        int i13 = this.f84903c;
        if (i13 < length) {
            if (iArr != null) {
                iArr[i13] = measuredHeight;
            }
            if (iArr != null) {
                eVar.f126588o.c(iArr);
            }
        }
    }
}
