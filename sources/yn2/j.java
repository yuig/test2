package yn2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f139569a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f139570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f139571c;

    public j(k kVar) {
        this.f139571c = kVar;
        this.f139569a = kVar.f139572a.iterator();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r4 = this;
            java.util.Iterator r0 = r4.f139570b
            if (r0 == 0) goto Ld
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld
            r0 = 0
            r4.f139570b = r0
        Ld:
            java.util.Iterator r0 = r4.f139570b
            r1 = 1
            if (r0 != 0) goto L38
            java.util.Iterator r0 = r4.f139569a
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            java.lang.Object r0 = r0.next()
            yn2.k r2 = r4.f139571c
            kotlin.jvm.functions.Function1 r3 = r2.f139574c
            kotlin.jvm.functions.Function1 r2 = r2.f139573b
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Object r0 = r3.invoke(r0)
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld
            r4.f139570b = r0
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.j.b():boolean");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.f139570b;
        Intrinsics.f(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
