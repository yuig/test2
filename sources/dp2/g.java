package dp2;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g implements Iterable {

    /* renamed from: c, reason: collision with root package name */
    public int f56050c;

    /* renamed from: d, reason: collision with root package name */
    public int f56051d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f56052e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f56048a = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f56053f = true;

    /* renamed from: b, reason: collision with root package name */
    public final bk.f f56049b = new bk.f();

    public final void b(Object obj) {
        if (this.f56053f) {
            this.f56049b.getClass();
        }
        if (obj != null) {
            ArrayList arrayList = this.f56048a;
            if (arrayList.contains(obj)) {
                return;
            }
            arrayList.add(obj);
            this.f56051d++;
        }
    }

    public final void c() {
        ArrayList arrayList = this.f56048a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final boolean d(Object obj) {
        ArrayList arrayList;
        int indexOf;
        if (this.f56053f) {
            this.f56049b.getClass();
        }
        if (obj == null || (indexOf = (arrayList = this.f56048a).indexOf(obj)) == -1) {
            return false;
        }
        if (this.f56050c == 0) {
            arrayList.remove(indexOf);
        } else {
            this.f56052e = true;
            arrayList.set(indexOf, null);
        }
        this.f56051d--;
        return true;
    }

    public final boolean isEmpty() {
        if (this.f56053f) {
            this.f56049b.getClass();
        }
        return this.f56051d == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.f56053f) {
            this.f56049b.getClass();
        }
        return new f(this);
    }
}
