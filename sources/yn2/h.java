package yn2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f139560a;

    /* renamed from: b, reason: collision with root package name */
    public int f139561b = -1;

    /* renamed from: c, reason: collision with root package name */
    public Object f139562c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f139563d;

    public h(i iVar) {
        this.f139563d = iVar;
        this.f139560a = iVar.f139566a.iterator();
    }

    public final void b() {
        Object next;
        i iVar;
        do {
            Iterator it = this.f139560a;
            if (!it.hasNext()) {
                this.f139561b = 0;
                return;
            } else {
                next = it.next();
                iVar = this.f139563d;
            }
        } while (((Boolean) iVar.f139568c.invoke(next)).booleanValue() != iVar.f139567b);
        this.f139562c = next;
        this.f139561b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f139561b == -1) {
            b();
        }
        return this.f139561b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f139561b == -1) {
            b();
        }
        if (this.f139561b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f139562c;
        this.f139562c = null;
        this.f139561b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
