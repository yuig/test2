package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class y extends l3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16150b;

    public /* synthetic */ y(Object obj, int i13) {
        this.f16149a = i13;
        this.f16150b = obj;
    }

    @Override // l3.c, q5.e1
    public final void a() {
        int i13 = this.f16149a;
        Object obj = this.f16150b;
        switch (i13) {
            case 0:
                ((n0) ((z) obj).f16160b).f16102v.setVisibility(0);
                break;
            case 1:
                n0 n0Var = (n0) obj;
                n0Var.f16102v.setVisibility(0);
                if (n0Var.f16102v.getParent() instanceof View) {
                    View view = (View) n0Var.f16102v.getParent();
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    q5.k0.c(view);
                    break;
                }
                break;
        }
    }

    @Override // q5.e1
    public final void d(View view) {
        int i13 = this.f16149a;
        Object obj = this.f16150b;
        switch (i13) {
            case 0:
                z zVar = (z) obj;
                ((n0) zVar.f16160b).f16102v.setAlpha(1.0f);
                ((n0) zVar.f16160b).f16105y.e(null);
                ((n0) zVar.f16160b).f16105y = null;
                break;
            case 1:
                n0 n0Var = (n0) obj;
                n0Var.f16102v.setAlpha(1.0f);
                n0Var.f16105y.e(null);
                n0Var.f16105y = null;
                break;
            default:
                a0 a0Var = (a0) obj;
                a0Var.f15952b.f16102v.setVisibility(8);
                n0 n0Var2 = a0Var.f15952b;
                PopupWindow popupWindow = n0Var2.f16103w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (n0Var2.f16102v.getParent() instanceof View) {
                    View view2 = (View) n0Var2.f16102v.getParent();
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    q5.k0.c(view2);
                }
                n0Var2.f16102v.e();
                n0Var2.f16105y.e(null);
                n0Var2.f16105y = null;
                ViewGroup viewGroup = n0Var2.A;
                WeakHashMap weakHashMap2 = q5.v0.f102521a;
                q5.k0.c(viewGroup);
                break;
        }
    }
}
