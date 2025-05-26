package bk2;

import bp1.h;
import ck2.i;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import mk2.w;

/* loaded from: classes2.dex */
public final class e implements xj2.c, b {

    /* renamed from: a, reason: collision with root package name */
    public LinkedList f23394a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f23395b;

    @Override // bk2.b
    public final boolean a(xj2.c cVar) {
        if (!this.f23395b) {
            synchronized (this) {
                try {
                    if (!this.f23395b) {
                        LinkedList linkedList = this.f23394a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f23394a = linkedList;
                        }
                        linkedList.add(cVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        cVar.dispose();
        return false;
    }

    @Override // bk2.b
    public final boolean b(xj2.c cVar) {
        if (!c(cVar)) {
            return false;
        }
        ((w) cVar).dispose();
        return true;
    }

    @Override // bk2.b
    public final boolean c(xj2.c cVar) {
        i.b(cVar, "Disposable item is null");
        if (this.f23395b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f23395b) {
                    return false;
                }
                LinkedList linkedList = this.f23394a;
                if (linkedList != null && linkedList.remove(cVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f23395b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f23395b) {
                    return;
                }
                this.f23395b = true;
                LinkedList linkedList = this.f23394a;
                ArrayList arrayList = null;
                this.f23394a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((xj2.c) it.next()).dispose();
                    } catch (Throwable th3) {
                        h.H(th3);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th3);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw pk2.h.d((Throwable) arrayList.get(0));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f23395b;
    }
}
