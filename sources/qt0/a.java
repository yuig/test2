package qt0;

import a7.i0;
import a7.t0;
import a7.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f105134a;

    public a(c cVar) {
        this.f105134a = cVar;
    }

    @Override // a7.t0
    public final void K6(boolean z13) {
        c cVar = this.f105134a;
        if (z13) {
            cVar.f105138c.postDelayed(new vs0.b(cVar, 1), 16L);
        } else {
            cVar.f105138c.removeCallbacksAndMessages(null);
            cVar.f105137b.y(false);
        }
    }

    @Override // a7.t0
    public final void N4(int i13, u0 oldPosition, u0 newPosition) {
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        c.a(this.f105134a);
    }

    @Override // a7.t0
    public final void o(i0 i0Var, int i13) {
        c.a(this.f105134a);
    }

    @Override // a7.t0
    public final void r0(int i13) {
        c cVar = this.f105134a;
        if (i13 == 3) {
            c.a(cVar);
        } else if (i13 == 4 && !cVar.f105137b.f109950b) {
            cVar.f105136a.w8();
        }
    }
}
