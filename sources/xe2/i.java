package xe2;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f134840a = new HashSet();

    public final void a() {
        if (dl2.b.f55295d == null) {
            dl2.b.f55295d = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != dl2.b.f55295d) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.f134840a.iterator();
        if (it.hasNext()) {
            ep.b.A(it.next());
            throw null;
        }
    }
}
