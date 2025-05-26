package rq;

import android.view.View;
import com.pinterest.gestalt.text.GestaltText;

/* loaded from: classes3.dex */
public final class t1 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f109552b;

    public /* synthetic */ t1(u1 u1Var, int i13) {
        this.f109551a = i13;
        this.f109552b = u1Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        int i24 = this.f109551a;
        u1 u1Var = this.f109552b;
        switch (i24) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                oq.j0 j0Var = u1Var.f109570c;
                GestaltText gestaltText = u1Var.f109576i;
                xk2.v vVar = sq.i.f114975a;
                boolean z13 = false;
                if (gestaltText != null && gestaltText.getLayout().getEllipsisCount(gestaltText.getLineCount() - 1) > 0) {
                    z13 = true;
                }
                ((oq.x0) j0Var).f97192u0 = z13;
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                u1Var.f109571d.w6(u1Var.getHeight());
                break;
        }
    }
}
