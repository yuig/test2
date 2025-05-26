package uk2;

import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import uj2.v;

/* loaded from: classes2.dex */
public final class j extends AtomicReference implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f122419a;

    /* renamed from: b, reason: collision with root package name */
    public int f122420b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g f122421c;

    /* renamed from: d, reason: collision with root package name */
    public g f122422d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f122423e;

    public j() {
        ck2.i.c(20, "maxSize");
        this.f122419a = 20;
        g gVar = new g(null);
        this.f122422d = gVar;
        this.f122421c = gVar;
    }

    @Override // uk2.h
    public final void a(Object obj) {
        g gVar = new g(obj);
        g gVar2 = this.f122422d;
        this.f122422d = gVar;
        this.f122420b++;
        gVar2.lazySet(gVar);
        g gVar3 = this.f122421c;
        if (gVar3.f122414a != null) {
            g gVar4 = new g(null);
            gVar4.lazySet(gVar3.get());
            this.f122421c = gVar4;
        }
        this.f122423e = true;
    }

    @Override // uk2.h
    public final void add(Object obj) {
        g gVar = new g(obj);
        g gVar2 = this.f122422d;
        this.f122422d = gVar;
        this.f122420b++;
        gVar2.set(gVar);
        int i13 = this.f122420b;
        if (i13 > this.f122419a) {
            this.f122420b = i13 - 1;
            this.f122421c = (g) this.f122421c.get();
        }
    }

    @Override // uk2.h
    public final void b(i iVar) {
        if (iVar.getAndIncrement() != 0) {
            return;
        }
        v vVar = iVar.f122415a;
        g gVar = (g) iVar.f122417c;
        if (gVar == null) {
            gVar = this.f122421c;
        }
        int i13 = 1;
        while (!iVar.f122418d) {
            g gVar2 = (g) gVar.get();
            if (gVar2 != null) {
                Object obj = gVar2.f122414a;
                if (this.f122423e && gVar2.get() == null) {
                    if (pk2.l.isComplete(obj)) {
                        vVar.a();
                    } else {
                        vVar.onError(pk2.l.getError(obj));
                    }
                    iVar.f122417c = null;
                    iVar.f122418d = true;
                    return;
                }
                vVar.c(obj);
                gVar = gVar2;
            } else if (gVar.get() != null) {
                continue;
            } else {
                iVar.f122417c = gVar;
                i13 = iVar.addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            }
        }
        iVar.f122417c = null;
    }

    @Override // uk2.h
    public final Object[] c(Object[] objArr) {
        g gVar = this.f122421c;
        g gVar2 = this.f122421c;
        int i13 = 0;
        while (true) {
            if (i13 == Integer.MAX_VALUE) {
                break;
            }
            g gVar3 = (g) gVar2.get();
            if (gVar3 == null) {
                Object obj = gVar2.f122414a;
                if (pk2.l.isComplete(obj) || pk2.l.isError(obj)) {
                    i13--;
                }
            } else {
                i13++;
                gVar2 = gVar3;
            }
        }
        if (i13 != 0) {
            if (objArr.length < i13) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i13);
            }
            for (int i14 = 0; i14 != i13; i14++) {
                gVar = (g) gVar.get();
                objArr[i14] = gVar.f122414a;
            }
            if (objArr.length > i13) {
                objArr[i13] = null;
            }
        } else if (objArr.length != 0) {
            objArr[0] = null;
        }
        return objArr;
    }
}
