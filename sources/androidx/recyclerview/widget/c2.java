package androidx.recyclerview.widget;

import android.database.Observable;

/* loaded from: classes.dex */
public final class c2 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d2) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i13, int i14) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d2) ((Observable) this).mObservers.get(size)).e(i13, i14);
        }
    }

    public final void d(int i13, Object obj, int i14) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d2) ((Observable) this).mObservers.get(size)).c(i13, obj, i14);
        }
    }

    public final void e(int i13, int i14) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d2) ((Observable) this).mObservers.get(size)).d(i13, i14);
        }
    }

    public final void f(int i13, int i14) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d2) ((Observable) this).mObservers.get(size)).f(i13, i14);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d2) ((Observable) this).mObservers.get(size)).g();
        }
    }
}
