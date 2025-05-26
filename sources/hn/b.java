package hn;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final b f69593d = new b();

    @Override // hn.e
    public final void a(boolean z13) {
        Iterator it = Collections.unmodifiableCollection(c.f69594c.f69595a).iterator();
        while (it.hasNext()) {
            ((fn.i) it.next()).d().f(z13);
        }
    }

    @Override // hn.e
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(c.f69594c.f69596b).iterator();
        while (it.hasNext()) {
            View a13 = ((fn.i) it.next()).a();
            if (a13 != null && a13.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
