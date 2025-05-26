package do2;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t2 extends eo2.a implements y1, i, eo2.g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55956f = AtomicReferenceFieldUpdater.newUpdater(t2.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public int f55957e;

    public t2(Object obj) {
        this._state$volatile = obj;
    }

    @Override // eo2.g0
    public final i a(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        fi.b bVar = u2.f55967a;
        return (((i13 < 0 || i13 >= 2) && i13 != -2) || aVar != co2.a.DROP_OLDEST) ? g2.d(this, coroutineContext, i13, aVar) : this;
    }

    @Override // do2.x1
    public final boolean b(Object obj) {
        i(obj);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r6 = r6;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r11, r12) != false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0036, B:14:0x0095, B:16:0x009d, B:19:0x00a4, B:20:0x00a8, B:24:0x00ab, B:26:0x00cf, B:29:0x00df, B:32:0x00b1, B:35:0x00b8, B:43:0x0051, B:45:0x005c, B:46:0x0086), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0036, B:14:0x0095, B:16:0x009d, B:19:0x00a4, B:20:0x00a8, B:24:0x00ab, B:26:0x00cf, B:29:0x00df, B:32:0x00b1, B:35:0x00b8, B:43:0x0051, B:45:0x005c, B:46:0x0086), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [eo2.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [do2.v2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [eo2.a] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6, types: [do2.t2, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00de -> B:14:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f2 -> B:14:0x0095). Please report as a decompilation issue!!! */
    @Override // do2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(do2.j r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.t2.collect(do2.j, bl2.c):java.lang.Object");
    }

    @Override // eo2.a
    public final eo2.c d() {
        return new v2();
    }

    @Override // eo2.a
    public final eo2.c[] e() {
        return new v2[2];
    }

    @Override // do2.x1, do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        i(obj);
        return Unit.f80348a;
    }

    @Override // do2.r2
    public final Object getValue() {
        fi.b bVar = eo2.j0.f59783a;
        Object obj = f55956f.get(this);
        if (obj == bVar) {
            return null;
        }
        return obj;
    }

    public final boolean h(Object obj, Object obj2) {
        if (obj == null) {
            obj = eo2.j0.f59783a;
        }
        if (obj2 == null) {
            obj2 = eo2.j0.f59783a;
        }
        return j(obj, obj2);
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = eo2.j0.f59783a;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i13;
        eo2.c[] cVarArr;
        fi.b bVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55956f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.d(obj3, obj)) {
                return false;
            }
            if (Intrinsics.d(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i14 = this.f55957e;
            if ((i14 & 1) != 0) {
                this.f55957e = i14 + 2;
                return true;
            }
            int i15 = i14 + 1;
            this.f55957e = i15;
            eo2.c[] cVarArr2 = this.f59731a;
            Unit unit = Unit.f80348a;
            while (true) {
                v2[] v2VarArr = (v2[]) cVarArr2;
                if (v2VarArr != null) {
                    for (v2 v2Var : v2VarArr) {
                        if (v2Var != null) {
                            AtomicReference atomicReference = v2Var.f55983a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (bVar = u2.f55968b)) {
                                    fi.b bVar2 = u2.f55967a;
                                    if (obj4 != bVar2) {
                                        while (!atomicReference.compareAndSet(obj4, bVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        xk2.q qVar = xk2.s.f135225b;
                                        ((ao2.o) obj4).resumeWith(Unit.f80348a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, bVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i13 = this.f55957e;
                    if (i13 == i15) {
                        this.f55957e = i15 + 1;
                        return true;
                    }
                    cVarArr = this.f59731a;
                    Unit unit2 = Unit.f80348a;
                }
                cVarArr2 = cVarArr;
                i15 = i13;
            }
        }
    }

    @Override // do2.x1
    public final void l() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }
}
