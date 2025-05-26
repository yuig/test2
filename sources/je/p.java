package je;

import a.cb;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f75728a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f75729b = 0;

    public final void a() {
        this.f75729b += 1000;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = this.f75728a.iterator();
        while (it.hasNext()) {
            sb3.append((q) it.next());
            sb3.append(' ');
        }
        sb3.append('[');
        return cb.l(sb3, this.f75729b, ']');
    }
}
