package androidx.appcompat.app;

import android.view.Window;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class x implements b, n.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f16146b;

    public /* synthetic */ x(n0 n0Var, int i13) {
        this.f16145a = i13;
        this.f16146b = n0Var;
    }

    @Override // n.z
    public final void b(n.o oVar, boolean z13) {
        m0 m0Var;
        int i13 = this.f16145a;
        n0 n0Var = this.f16146b;
        switch (i13) {
            case 2:
                n0Var.v(oVar);
                break;
            default:
                n.o l13 = oVar.l();
                int i14 = 0;
                boolean z14 = l13 != oVar;
                if (z14) {
                    oVar = l13;
                }
                m0[] m0VarArr = n0Var.L;
                int length = m0VarArr != null ? m0VarArr.length : 0;
                while (true) {
                    if (i14 >= length) {
                        m0Var = null;
                    } else {
                        m0Var = m0VarArr[i14];
                        if (m0Var == null || m0Var.f16070h != oVar) {
                            i14++;
                        }
                    }
                }
                if (m0Var != null) {
                    if (!z14) {
                        n0Var.x(m0Var, z13);
                        break;
                    } else {
                        n0Var.u(m0Var.f16063a, m0Var, l13);
                        n0Var.x(m0Var, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // n.z
    public final boolean c(n.o oVar) {
        Window.Callback callback;
        int i13 = this.f16145a;
        n0 n0Var = this.f16146b;
        switch (i13) {
            case 2:
                Window.Callback callback2 = n0Var.f16092l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, oVar);
                    break;
                }
                break;
            default:
                if (oVar == oVar.l() && n0Var.F && (callback = n0Var.f16092l.getCallback()) != null && !n0Var.Q) {
                    callback.onMenuOpened(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, oVar);
                    break;
                }
                break;
        }
        return true;
    }
}
