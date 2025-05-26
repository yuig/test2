package pk;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class h implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100407a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f100408b;

    /* renamed from: c, reason: collision with root package name */
    public Object f100409c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f100410d;

    public h(q qVar) {
        this.f100410d = qVar;
        Collection collection = qVar.f100469b;
        this.f100409c = collection;
        this.f100408b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final void b() {
        Object obj = this.f100410d;
        ((q) obj).c();
        if (((q) obj).f100469b != ((Collection) this.f100409c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f100407a;
        Iterator it = this.f100408b;
        switch (i13) {
            case 0:
                break;
            case 1:
                break;
            default:
                b();
                break;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f100407a;
        Iterator it = this.f100408b;
        switch (i13) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.f100409c = (Collection) entry.getValue();
                return ((i) this.f100410d).c(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.f100409c = entry2;
                return entry2.getKey();
            default:
                b();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i13 = this.f100407a;
        Object obj = this.f100410d;
        Iterator it = this.f100408b;
        switch (i13) {
            case 0:
                bf.b.u("no calls to next() since the last call to remove()", ((Collection) this.f100409c) != null);
                it.remove();
                ((i) obj).f100417d.f100376e -= ((Collection) this.f100409c).size();
                ((Collection) this.f100409c).clear();
                this.f100409c = null;
                break;
            case 1:
                bf.b.u("no calls to next() since the last call to remove()", ((Map.Entry) this.f100409c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f100409c).getValue();
                it.remove();
                ((k) obj).f100439c.f100376e -= collection.size();
                collection.clear();
                this.f100409c = null;
                break;
            default:
                it.remove();
                q qVar = (q) obj;
                qVar.f100472e.f100376e--;
                qVar.d();
                break;
        }
    }

    public h(q qVar, ListIterator listIterator) {
        this.f100410d = qVar;
        this.f100409c = qVar.f100469b;
        this.f100408b = listIterator;
    }

    public h(k kVar, Iterator it) {
        this.f100408b = it;
        this.f100410d = kVar;
    }

    public h(i iVar) {
        this.f100410d = iVar;
        this.f100408b = iVar.f100416c.entrySet().iterator();
    }
}
