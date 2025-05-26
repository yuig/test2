package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class h extends n.y {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f16577m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f16578n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, Context context, n.o oVar, l lVar) {
        super(i.a.actionOverflowMenuStyle, 0, context, lVar, oVar, true);
        this.f16578n = nVar;
        this.f88719g = 8388613;
        i iVar = nVar.f16662v;
        this.f88721i = iVar;
        n.w wVar = this.f88722j;
        if (wVar != null) {
            wVar.m(iVar);
        }
    }

    @Override // n.y
    public final void c() {
        int i13 = this.f16577m;
        n nVar = this.f16578n;
        switch (i13) {
            case 0:
                nVar.f16659s = null;
                nVar.f16663w = 0;
                super.c();
                break;
            default:
                n.o oVar = nVar.f88563c;
                if (oVar != null) {
                    oVar.d(true);
                }
                nVar.f16658r = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, Context context, n.g0 g0Var, View view) {
        super(i.a.actionOverflowMenuStyle, 0, context, view, g0Var, false);
        this.f16578n = nVar;
        if (!g0Var.A.f()) {
            View view2 = nVar.f16650j;
            this.f88718f = view2 == null ? (View) nVar.f88568h : view2;
        }
        i iVar = nVar.f16662v;
        this.f88721i = iVar;
        n.w wVar = this.f88722j;
        if (wVar != null) {
            wVar.m(iVar);
        }
    }
}
