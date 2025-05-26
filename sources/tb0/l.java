package tb0;

import androidx.fragment.app.Fragment;
import df.j1;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class l extends gh0.b {
    @Override // gh0.b
    public final void j0(Fragment fragment) {
        String simpleName = fragment.getClass().getSimpleName();
        HashMap o13 = ep.b.o("FragmentLifecycleCallback", "onFragmentCreated()");
        h hVar = g.f117075a;
        Object[] objArr = {o13, c.NAVIGATION};
        hVar.getClass();
        hVar.h(j1.T(simpleName, objArr));
    }
}
