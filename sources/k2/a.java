package k2;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f78175a = new SparseArray(10);

    public final Object a(int i13) {
        return this.f78175a.get(i13);
    }

    public final void b(int i13, Object obj) {
        this.f78175a.put(i13, obj);
    }
}
