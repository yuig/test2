package m2;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h extends a {

    /* renamed from: c, reason: collision with root package name */
    public final f f85682c;

    /* renamed from: d, reason: collision with root package name */
    public int f85683d;

    /* renamed from: e, reason: collision with root package name */
    public k f85684e;

    /* renamed from: f, reason: collision with root package name */
    public int f85685f;

    public h(f fVar, int i13) {
        super(i13, fVar.b());
        this.f85682c = fVar;
        this.f85683d = fVar.f();
        this.f85685f = -1;
        c();
    }

    @Override // m2.a, java.util.ListIterator
    public final void add(Object obj) {
        b();
        int i13 = this.f85663a;
        f fVar = this.f85682c;
        fVar.add(i13, obj);
        this.f85663a++;
        this.f85664b = fVar.b();
        this.f85683d = fVar.f();
        this.f85685f = -1;
        c();
    }

    public final void b() {
        if (this.f85683d != this.f85682c.f()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c() {
        f fVar = this.f85682c;
        Object[] objArr = fVar.f85677f;
        if (objArr == null) {
            this.f85684e = null;
            return;
        }
        int i13 = (fVar.f85679h - 1) & (-32);
        int i14 = this.f85663a;
        if (i14 > i13) {
            i14 = i13;
        }
        int i15 = (fVar.f85675d / 5) + 1;
        k kVar = this.f85684e;
        if (kVar == null) {
            this.f85684e = new k(objArr, i14, i13, i15);
            return;
        }
        kVar.f85663a = i14;
        kVar.f85664b = i13;
        kVar.f85689c = i15;
        if (kVar.f85690d.length < i15) {
            kVar.f85690d = new Object[i15];
        }
        kVar.f85690d[0] = objArr;
        ?? r63 = i14 == i13 ? 1 : 0;
        kVar.f85691e = r63;
        kVar.c(i14 - r63, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f85663a;
        this.f85685f = i13;
        k kVar = this.f85684e;
        f fVar = this.f85682c;
        if (kVar == null) {
            Object[] objArr = fVar.f85678g;
            this.f85663a = i13 + 1;
            return objArr[i13];
        }
        if (kVar.hasNext()) {
            this.f85663a++;
            return kVar.next();
        }
        Object[] objArr2 = fVar.f85678g;
        int i14 = this.f85663a;
        this.f85663a = i14 + 1;
        return objArr2[i14 - kVar.f85664b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f85663a;
        this.f85685f = i13 - 1;
        k kVar = this.f85684e;
        f fVar = this.f85682c;
        if (kVar == null) {
            Object[] objArr = fVar.f85678g;
            int i14 = i13 - 1;
            this.f85663a = i14;
            return objArr[i14];
        }
        int i15 = kVar.f85664b;
        if (i13 <= i15) {
            this.f85663a = i13 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = fVar.f85678g;
        int i16 = i13 - 1;
        this.f85663a = i16;
        return objArr2[i16 - i15];
    }

    @Override // m2.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i13 = this.f85685f;
        if (i13 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f85682c;
        fVar.c(i13);
        int i14 = this.f85685f;
        if (i14 < this.f85663a) {
            this.f85663a = i14;
        }
        this.f85664b = fVar.b();
        this.f85683d = fVar.f();
        this.f85685f = -1;
        c();
    }

    @Override // m2.a, java.util.ListIterator
    public final void set(Object obj) {
        b();
        int i13 = this.f85685f;
        if (i13 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f85682c;
        fVar.set(i13, obj);
        this.f85683d = fVar.f();
        c();
    }
}
