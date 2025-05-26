package f5;

import android.graphics.Typeface;
import kh2.a1;

/* loaded from: classes3.dex */
public final class i extends a1 {

    /* renamed from: c, reason: collision with root package name */
    public final ue.c f61090c;

    public i(ue.c cVar) {
        this.f61090c = cVar;
    }

    @Override // kh2.a1
    public final void l0(int i13) {
        ue.c cVar = this.f61090c;
        if (cVar != null) {
            cVar.C(i13);
        }
    }

    @Override // kh2.a1
    public final void m0(Typeface typeface) {
        ue.c cVar = this.f61090c;
        if (cVar != null) {
            cVar.D(typeface);
        }
    }
}
