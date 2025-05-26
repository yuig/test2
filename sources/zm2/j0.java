package zm2;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f142228a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f142229b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f142230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f142231d;

    public j0(e0 e0Var) {
        this.f142231d = e0Var;
    }

    public final Iterator b() {
        if (this.f142230c == null) {
            this.f142230c = this.f142231d.f142198c.entrySet().iterator();
        }
        return this.f142230c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f142228a + 1 < this.f142231d.f142197b.size() || b().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f142229b = true;
        int i13 = this.f142228a + 1;
        this.f142228a = i13;
        e0 e0Var = this.f142231d;
        return i13 < e0Var.f142197b.size() ? (Map.Entry) e0Var.f142197b.get(this.f142228a) : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f142229b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f142229b = false;
        int i13 = e0.f142195f;
        e0 e0Var = this.f142231d;
        e0Var.b();
        if (this.f142228a >= e0Var.f142197b.size()) {
            b().remove();
            return;
        }
        int i14 = this.f142228a;
        this.f142228a = i14 - 1;
        e0Var.k(i14);
    }
}
