package g1;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 extends l0 implements ll2.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f63262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var) {
        super(g0Var);
        this.f63262b = g0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f63262b.d(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f63262b.e(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f63262b.f();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e0(this.f63262b);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f63262b.l(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean removeAll(java.util.Collection r19) {
        /*
            r18 = this;
            java.lang.String r0 = "elements"
            r1 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = r18
            g1.g0 r2 = r0.f63262b
            int r3 = r2.f63288d
            java.util.Iterator r1 = r19.iterator()
        L11:
            boolean r4 = r1.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La2
            java.lang.Object r4 = r1.next()
            if (r4 == 0) goto L27
            r2.getClass()
            int r7 = r4.hashCode()
            goto L28
        L27:
            r7 = r6
        L28:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f63287c
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L36:
            long[] r10 = r2.f63285a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L62:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L86
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            java.lang.Object[] r12 = r2.f63286b
            r12 = r12[r14]
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r4)
            if (r12 == 0) goto L7b
            goto L95
        L7b:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L62
        L86:
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r10
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9c
            r14 = -1
        L95:
            if (r14 < 0) goto L11
            r2.m(r14)
            goto L11
        L9c:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = 1
            goto L36
        La2:
            int r1 = r2.f63288d
            if (r3 == r1) goto La8
            r5 = 1
            goto La9
        La8:
            r5 = r6
        La9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f0.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g0 g0Var = this.f63262b;
        long[] jArr = g0Var.f63285a;
        int length = jArr.length - 2;
        boolean z13 = false;
        if (length >= 0) {
            int i13 = 0;
            boolean z14 = false;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            int i16 = (i13 << 3) + i15;
                            if (!elements.contains(g0Var.f63286b[i16])) {
                                g0Var.m(i16);
                                z14 = true;
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        return z14;
                    }
                }
                if (i13 == length) {
                    z13 = z14;
                    break;
                }
                i13++;
            }
        }
        return z13;
    }
}
