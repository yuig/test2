package uk2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import uj2.v;

/* loaded from: classes4.dex */
public final class k extends AtomicReference implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f122424a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f122425b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f122426c;

    public k() {
        ck2.i.c(16, "capacityHint");
        this.f122424a = new ArrayList(16);
    }

    @Override // uk2.h
    public final void a(Object obj) {
        this.f122424a.add(obj);
        this.f122426c++;
        this.f122425b = true;
    }

    @Override // uk2.h
    public final void add(Object obj) {
        this.f122424a.add(obj);
        this.f122426c++;
    }

    @Override // uk2.h
    public final void b(i iVar) {
        int i13;
        int i14;
        if (iVar.getAndIncrement() != 0) {
            return;
        }
        ArrayList arrayList = this.f122424a;
        v vVar = iVar.f122415a;
        Integer num = (Integer) iVar.f122417c;
        if (num != null) {
            i13 = num.intValue();
        } else {
            i13 = 0;
            iVar.f122417c = 0;
        }
        int i15 = 1;
        while (!iVar.f122418d) {
            int i16 = this.f122426c;
            while (i16 != i13) {
                if (iVar.f122418d) {
                    iVar.f122417c = null;
                    return;
                }
                Object obj = arrayList.get(i13);
                if (this.f122425b && (i14 = i13 + 1) == i16 && i14 == (i16 = this.f122426c)) {
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
                i13++;
            }
            if (i13 == this.f122426c) {
                iVar.f122417c = Integer.valueOf(i13);
                i15 = iVar.addAndGet(-i15);
                if (i15 == 0) {
                    return;
                }
            }
        }
        iVar.f122417c = null;
    }

    @Override // uk2.h
    public final Object[] c(Object[] objArr) {
        int i13 = this.f122426c;
        if (i13 == 0) {
            if (objArr.length != 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        ArrayList arrayList = this.f122424a;
        Object obj = arrayList.get(i13 - 1);
        if ((pk2.l.isComplete(obj) || pk2.l.isError(obj)) && i13 - 1 == 0) {
            if (objArr.length != 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        if (objArr.length < i13) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = arrayList.get(i14);
        }
        if (objArr.length > i13) {
            objArr[i13] = null;
        }
        return objArr;
    }
}
