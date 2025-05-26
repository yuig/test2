package e7;

import d7.d0;
import d7.n0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final v f57605a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f57606b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f57607c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final PriorityQueue f57608d = new PriorityQueue();

    /* renamed from: e, reason: collision with root package name */
    public int f57609e = -1;

    /* renamed from: f, reason: collision with root package name */
    public u f57610f;

    public w(v vVar) {
        this.f57605a = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r8 < r0.f57604b) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r8, d7.d0 r10) {
        /*
            r7 = this;
            int r0 = r7.f57609e
            if (r0 == 0) goto L7d
            java.util.PriorityQueue r1 = r7.f57608d
            r2 = -1
            if (r0 == r2) goto L20
            int r0 = r1.size()
            int r3 = r7.f57609e
            if (r0 < r3) goto L20
            java.lang.Object r0 = r1.peek()
            e7.u r0 = (e7.u) r0
            int r3 = d7.n0.f53866a
            long r3 = r0.f57604b
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L20
            goto L7d
        L20:
            java.util.ArrayDeque r0 = r7.f57606b
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2e
            d7.d0 r0 = new d7.d0
            r0.<init>()
            goto L34
        L2e:
            java.lang.Object r0 = r0.pop()
            d7.d0 r0 = (d7.d0) r0
        L34:
            int r3 = r10.a()
            r0.H(r3)
            byte[] r3 = r10.f53806a
            int r10 = r10.f53807b
            byte[] r4 = r0.f53806a
            r5 = 0
            int r6 = r0.a()
            java.lang.System.arraycopy(r3, r10, r4, r5, r6)
            e7.u r10 = r7.f57610f
            if (r10 == 0) goto L59
            long r3 = r10.f57604b
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L59
            java.util.ArrayList r8 = r10.f57603a
            r8.add(r0)
            return
        L59:
            java.util.ArrayDeque r10 = r7.f57607c
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L67
            e7.u r10 = new e7.u
            r10.<init>()
            goto L6d
        L67:
            java.lang.Object r10 = r10.pop()
            e7.u r10 = (e7.u) r10
        L6d:
            r10.a(r8, r0)
            r1.add(r10)
            r7.f57610f = r10
            int r8 = r7.f57609e
            if (r8 == r2) goto L7c
            r7.b(r8)
        L7c:
            return
        L7d:
            e7.v r0 = r7.f57605a
            r0.a(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.w.a(long, d7.d0):void");
    }

    public final void b(int i13) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.f57608d;
            if (priorityQueue.size() <= i13) {
                return;
            }
            u uVar = (u) priorityQueue.poll();
            int i14 = n0.f53866a;
            int i15 = 0;
            while (true) {
                int size = uVar.f57603a.size();
                arrayList = uVar.f57603a;
                if (i15 >= size) {
                    break;
                }
                this.f57605a.a(uVar.f57604b, (d0) arrayList.get(i15));
                this.f57606b.push((d0) arrayList.get(i15));
                i15++;
            }
            arrayList.clear();
            u uVar2 = this.f57610f;
            if (uVar2 != null && uVar2.f57604b == uVar.f57604b) {
                this.f57610f = null;
            }
            this.f57607c.push(uVar);
        }
    }

    public final int c() {
        return this.f57609e;
    }

    public final void d(int i13) {
        bf.b.t(i13 >= 0);
        this.f57609e = i13;
        b(i13);
    }
}
