package yn2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.IndexedValue;

/* loaded from: classes4.dex */
public final class d implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139541a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f139542b;

    /* renamed from: c, reason: collision with root package name */
    public int f139543c;

    public d(n nVar) {
        this.f139542b = nVar.f139583b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f139541a;
        Iterator it = this.f139542b;
        switch (i13) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                return this.f139543c > 0 && it.hasNext();
        }
        while (this.f139543c > 0 && it.hasNext()) {
            it.next();
            this.f139543c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f139541a;
        Iterator it = this.f139542b;
        switch (i13) {
            case 0:
                break;
            case 1:
                int i14 = this.f139543c;
                this.f139543c = i14 + 1;
                if (i14 >= 0) {
                    return new IndexedValue(i14, it.next());
                }
                kotlin.collections.f0.p();
                throw null;
            default:
                int i15 = this.f139543c;
                if (i15 == 0) {
                    throw new NoSuchElementException();
                }
                this.f139543c = i15 - 1;
                return it.next();
        }
        while (this.f139543c > 0 && it.hasNext()) {
            it.next();
            this.f139543c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f139541a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(e eVar, int i13) {
        this.f139543c = eVar.f139549c;
        this.f139542b = eVar.f139548b.iterator();
    }

    public d(e eVar) {
        this.f139542b = eVar.f139548b.iterator();
        this.f139543c = eVar.f139549c;
    }
}
