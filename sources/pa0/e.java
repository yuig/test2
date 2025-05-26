package pa0;

import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import kotlin.jvm.internal.Intrinsics;
import r1.j0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f99382a;

    public e(f fVar) {
        this.f99382a = fVar;
    }

    public final void a(int i13) {
        c cVar = (c) ((a) this.f99382a.getView());
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
