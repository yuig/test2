package co2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u extends ho2.v {

    /* renamed from: e, reason: collision with root package name */
    public final m f28349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f28350f;

    public u(long j13, u uVar, m mVar, int i13) {
        super(j13, uVar, i13);
        this.f28349e = mVar;
        this.f28350f = new AtomicReferenceArray(o.f28326b * 2);
    }

    @Override // ho2.v
    public final int i() {
        return o.f28326b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005c, code lost:
    
        q(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005f, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0061, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        r7 = r4.f28322b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0066, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0068, code lost:
    
        kg.t.r(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // ho2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r7, kotlin.coroutines.CoroutineContext r8) {
        /*
            r6 = this;
            int r0 = co2.o.f28326b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f28350f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.o(r7)
            boolean r3 = r2 instanceof ao2.v2
            co2.m r4 = r6.f28349e
            r5 = 0
            if (r3 != 0) goto L6c
            boolean r3 = r2 instanceof co2.d0
            if (r3 == 0) goto L22
            goto L6c
        L22:
            fi.b r3 = co2.o.f28334j
            if (r2 == r3) goto L5c
            fi.b r3 = co2.o.f28335k
            if (r2 != r3) goto L2b
            goto L5c
        L2b:
            fi.b r3 = co2.o.f28331g
            if (r2 == r3) goto L12
            fi.b r3 = co2.o.f28330f
            if (r2 != r3) goto L34
            goto L12
        L34:
            fi.b r7 = co2.o.f28333i
            if (r2 == r7) goto L5b
            fi.b r7 = co2.o.f28328d
            if (r2 != r7) goto L3d
            goto L5b
        L3d:
            fi.b r7 = co2.o.f28336l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5b:
            return
        L5c:
            r6.q(r7, r5)
            if (r1 == 0) goto L6b
            kotlin.jvm.internal.Intrinsics.f(r4)
            kotlin.jvm.functions.Function1 r7 = r4.f28322b
            if (r7 == 0) goto L6b
            kg.t.r(r7, r0, r8)
        L6b:
            return
        L6c:
            if (r1 == 0) goto L71
            fi.b r3 = co2.o.f28334j
            goto L73
        L71:
            fi.b r3 = co2.o.f28335k
        L73:
            boolean r2 = r6.m(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.q(r7, r5)
            r2 = r1 ^ 1
            r6.p(r7, r2)
            if (r1 == 0) goto L8d
            kotlin.jvm.internal.Intrinsics.f(r4)
            kotlin.jvm.functions.Function1 r7 = r4.f28322b
            if (r7 == 0) goto L8d
            kg.t.r(r7, r0, r8)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.u.j(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean m(int i13, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f28350f;
        int i14 = (i13 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i14, obj, obj2)) {
            if (atomicReferenceArray.get(i14) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object n(int i13, fi.b bVar) {
        return this.f28350f.getAndSet((i13 * 2) + 1, bVar);
    }

    public final Object o(int i13) {
        return this.f28350f.get((i13 * 2) + 1);
    }

    public final void p(int i13, boolean z13) {
        if (z13) {
            m mVar = this.f28349e;
            Intrinsics.f(mVar);
            mVar.Y((this.f69789c * o.f28326b) + i13);
        }
        k();
    }

    public final void q(int i13, Object obj) {
        this.f28350f.set(i13 * 2, obj);
    }

    public final void r(int i13, fi.b bVar) {
        this.f28350f.set((i13 * 2) + 1, bVar);
    }
}
