package yn2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends p implements Iterator, bl2.c, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public int f139584a;

    /* renamed from: b, reason: collision with root package name */
    public Object f139585b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f139586c;

    /* renamed from: d, reason: collision with root package name */
    public bl2.c f139587d;

    @Override // yn2.p
    public final cl2.a b(Object obj, bl2.c frame) {
        this.f139585b = obj;
        this.f139584a = 3;
        this.f139587d = frame;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar;
    }

    @Override // yn2.p
    public final Object c(Iterator it, bl2.c frame) {
        if (!it.hasNext()) {
            return Unit.f80348a;
        }
        this.f139586c = it;
        this.f139584a = 2;
        this.f139587d = frame;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar;
    }

    public final RuntimeException d() {
        int i13 = this.f139584a;
        if (i13 == 4) {
            return new NoSuchElementException();
        }
        if (i13 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f139584a);
    }

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return kotlin.coroutines.j.f80412a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i13 = this.f139584a;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2 || i13 == 3) {
                        return true;
                    }
                    if (i13 == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator it = this.f139586c;
                Intrinsics.f(it);
                if (it.hasNext()) {
                    this.f139584a = 2;
                    return true;
                }
                this.f139586c = null;
            }
            this.f139584a = 5;
            bl2.c cVar = this.f139587d;
            Intrinsics.f(cVar);
            this.f139587d = null;
            xk2.q qVar = xk2.s.f135225b;
            cVar.resumeWith(Unit.f80348a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f139584a;
        if (i13 == 0 || i13 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i13 == 2) {
            this.f139584a = 1;
            Iterator it = this.f139586c;
            Intrinsics.f(it);
            return it.next();
        }
        if (i13 != 3) {
            throw d();
        }
        this.f139584a = 0;
        Object obj = this.f139585b;
        this.f139585b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // bl2.c
    public final void resumeWith(Object obj) {
        ue.c.H(obj);
        this.f139584a = 4;
    }
}
