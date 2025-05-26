package nm;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class m extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f91316b;

    public m(i0 i0Var, int i13) {
        this.f91315a = i13;
        this.f91316b = i0Var;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        int i13 = this.f91315a;
        i0 i0Var = this.f91316b;
        switch (i13) {
            case 0:
                return new AtomicLong(((Number) i0Var.c(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) i0Var.c(aVar)).longValue()));
                }
                aVar.f();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i14 = 0; i14 < size; i14++) {
                    atomicLongArray.set(i14, ((Long) arrayList.get(i14)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.K() != um.b.NULL) {
                    return i0Var.c(aVar);
                }
                aVar.B1();
                return null;
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        int i13 = this.f91315a;
        i0 i0Var = this.f91316b;
        switch (i13) {
            case 0:
                i0Var.e(cVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.c();
                int length = atomicLongArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    i0Var.e(cVar, Long.valueOf(atomicLongArray.get(i14)));
                }
                cVar.f();
                break;
            default:
                if (obj == null) {
                    cVar.m();
                    break;
                } else {
                    i0Var.e(cVar, obj);
                    break;
                }
        }
    }
}
