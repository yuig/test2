package rh1;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends y92.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f108161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rp0.d f108162b;

    public i0(k0 k0Var, rp0.d dVar) {
        this.f108161a = k0Var;
        this.f108162b = dVar;
    }

    @Override // y92.b
    public final boolean a(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        k0 k0Var = this.f108161a;
        y92.c cVar = k0Var.W;
        if (cVar != null) {
            cVar.f138302q = false;
        }
        k0Var.f108222k.invoke(this.f108162b, x.Like);
        return true;
    }

    @Override // y92.b
    public final boolean b(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return true;
    }

    @Override // y92.b
    public final void g(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f108161a.f108222k.invoke(this.f108162b, x.Body);
    }

    @Override // y92.b
    public final boolean i(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return true;
    }
}
