package ho2;

import ao2.m0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69770a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69771b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69772c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(l lVar, int i13) {
        while (true) {
            l d2 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69771b;
            if (d2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    d2 = (l) obj;
                    if (!d2.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d2);
                }
            }
            if (d2 instanceof j) {
                return (((j) d2).f69769d & i13) == 0 && d2.c(lVar, i13);
            }
            atomicReferenceFieldUpdater.set(lVar, d2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f69770a;
            atomicReferenceFieldUpdater2.set(lVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(d2, this, lVar)) {
                if (atomicReferenceFieldUpdater2.get(d2) != this) {
                    break;
                }
            }
            lVar.e(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((ho2.s) r6).f69786a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ho2.l d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = ho2.l.f69771b
            java.lang.Object r1 = r0.get(r9)
            ho2.l r1 = (ho2.l) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = ho2.l.f69770a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.g()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof ho2.s
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            ho2.s r6 = (ho2.s) r6
            ho2.l r6 = r6.f69786a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            ho2.l r3 = (ho2.l) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.g(r6, r4)
            r4 = r6
            ho2.l r4 = (ho2.l) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: ho2.l.d():ho2.l");
    }

    public final void e(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69771b;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (f69770a.get(this) != lVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                    break;
                }
            }
            if (g()) {
                lVar.d();
                return;
            }
            return;
        }
    }

    public final l f() {
        l lVar;
        Object obj = f69770a.get(this);
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null && (lVar = sVar.f69786a) != null) {
            return lVar;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (l) obj;
    }

    public boolean g() {
        return f69770a.get(this) instanceof s;
    }

    public String toString() {
        return new kotlin.jvm.internal.b0(this) { // from class: ho2.k
            @Override // rl2.r
            public final Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + m0.y(this);
    }
}
