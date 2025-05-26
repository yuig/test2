package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes2.dex */
public final class d3 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f16540a;

    public d3(Toolbar toolbar) {
        this.f16540a = toolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        f3 f3Var = this.f16540a.M;
        n.q qVar = f3Var == null ? null : f3Var.f16562b;
        if (qVar != null) {
            qVar.collapseActionView();
        }
    }
}
