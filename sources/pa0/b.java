package pa0;

import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import kotlin.jvm.internal.Intrinsics;
import r1.j0;
import xa.k;

/* loaded from: classes5.dex */
public final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f99374a;

    public b(c cVar) {
        this.f99374a = cVar;
    }

    @Override // xa.k, xa.i
    public final void A5(int i13) {
        e eVar = this.f99374a.f99379u0;
        if (eVar != null) {
            c cVar = (c) ((a) eVar.f99382a.getView());
            cVar.b8().w(i13, true);
            GestaltHeaderBar gestaltHeaderBar = cVar.f99378t0;
            if (gestaltHeaderBar != null) {
                gestaltHeaderBar.g0(new j0(i13, 13));
            } else {
                Intrinsics.r("tabHeaderBar");
                throw null;
            }
        }
    }
}
