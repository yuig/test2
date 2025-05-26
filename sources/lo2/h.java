package lo2;

import ao2.m;
import ao2.v2;
import ho2.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements ao2.l, i, v2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f84187f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "state$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f84188a;

    /* renamed from: c, reason: collision with root package name */
    public Object f84190c;
    private volatile /* synthetic */ Object state$volatile = k.f84194a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f84189b = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public int f84191d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f84192e = k.f84197d;

    public h(CoroutineContext coroutineContext) {
        this.f84188a = coroutineContext;
    }

    @Override // ao2.v2
    public final void a(v vVar, int i13) {
        this.f84190c = vVar;
        this.f84191d = i13;
    }

    @Override // ao2.l
    public final void b(Throwable th3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f84187f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == k.f84195b) {
                return;
            }
            fi.b bVar = k.f84196c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f84189b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a();
            }
            this.f84192e = k.f84197d;
            this.f84189b = null;
            return;
        }
    }

    public final Object c(bl2.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f84187f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        f fVar = (f) obj;
        Object obj2 = this.f84192e;
        ArrayList arrayList = this.f84189b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (fVar2 != fVar) {
                    fVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, k.f84195b);
            this.f84192e = k.f84197d;
            this.f84189b = null;
        }
        return fVar.b(fVar.f84176c.invoke(fVar.f84174a, fVar.f84177d, obj2), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d9 A[PHI: r10
      0x00d9: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:17:0x00d6, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(bl2.c r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.h.d(bl2.c):java.lang.Object");
    }

    public final f e(Object obj) {
        ArrayList arrayList = this.f84189b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((f) next).f84174a == obj) {
                obj2 = next;
                break;
            }
        }
        f fVar = (f) obj2;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final CoroutineContext f() {
        return this.f84188a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(d dVar, Function2 function2) {
        e eVar = (e) dVar;
        Object obj = eVar.f84170a;
        kl2.l lVar = eVar.f84171b;
        kl2.l lVar2 = eVar.f84173d;
        h(new f(this, obj, lVar, eVar.f84172c, null, (dl2.j) function2, lVar2), false);
    }

    public final void h(f fVar, boolean z13) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f84187f;
        if (atomicReferenceFieldUpdater.get(this) instanceof f) {
            return;
        }
        Object obj = fVar.f84174a;
        if (!z13) {
            ArrayList arrayList = this.f84189b;
            Intrinsics.f(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((f) it.next()).f84174a == obj) {
                        throw new IllegalStateException(a.a.i("Cannot use select clauses on the same object: ", obj).toString());
                    }
                }
            }
        }
        fVar.f84175b.invoke(obj, this, fVar.f84177d);
        if (this.f84192e != k.f84197d) {
            atomicReferenceFieldUpdater.set(this, fVar);
            return;
        }
        if (!z13) {
            ArrayList arrayList2 = this.f84189b;
            Intrinsics.f(arrayList2);
            arrayList2.add(fVar);
        }
        fVar.f84180g = this.f84190c;
        fVar.f84181h = this.f84191d;
        this.f84190c = null;
        this.f84191d = -1;
    }

    public final boolean i(Object obj, Object obj2) {
        return k(obj, obj2) == 0;
    }

    public final l j(Object obj, Unit unit) {
        int k13 = k(obj, unit);
        fi.b bVar = k.f84194a;
        if (k13 == 0) {
            return l.SUCCESSFUL;
        }
        if (k13 == 1) {
            return l.REREGISTER;
        }
        if (k13 == 2) {
            return l.CANCELLED;
        }
        if (k13 == 3) {
            return l.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + k13).toString());
    }

    public final int k(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f84187f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof m)) {
                if (Intrinsics.d(obj3, k.f84195b) || (obj3 instanceof f)) {
                    return 3;
                }
                if (Intrinsics.d(obj3, k.f84196c)) {
                    return 2;
                }
                if (Intrinsics.d(obj3, k.f84194a)) {
                    List b13 = e0.b(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, b13)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList m03 = CollectionsKt.m0(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, m03)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            f e13 = e(obj);
            if (e13 != null) {
                kl2.l lVar = e13.f84179f;
                kl2.l lVar2 = lVar != null ? (kl2.l) lVar.invoke(this, e13.f84177d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, e13)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                m mVar = (m) obj3;
                this.f84192e = obj2;
                fi.b bVar = k.f84194a;
                fi.b j13 = mVar.j(Unit.f80348a, lVar2);
                if (j13 == null) {
                    this.f84192e = k.f84197d;
                    return 2;
                }
                mVar.x(j13);
                return 0;
            }
            continue;
        }
    }
}
