package m9;

import a8.v;
import d7.n0;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public abstract class i implements l9.e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f86608a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f86609b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f86610c;

    /* renamed from: d, reason: collision with root package name */
    public g f86611d;

    /* renamed from: e, reason: collision with root package name */
    public long f86612e;

    /* renamed from: f, reason: collision with root package name */
    public long f86613f;

    /* renamed from: g, reason: collision with root package name */
    public long f86614g;

    public i() {
        for (int i13 = 0; i13 < 10; i13++) {
            this.f86608a.add(new g(1));
        }
        this.f86609b = new ArrayDeque();
        for (int i14 = 0; i14 < 2; i14++) {
            ArrayDeque arrayDeque = this.f86609b;
            v vVar = new v(this, 6);
            h hVar = new h();
            hVar.f86607g = vVar;
            arrayDeque.add(hVar);
        }
        this.f86610c = new ArrayDeque();
        this.f86614g = -9223372036854775807L;
    }

    @Override // k7.d
    public void a() {
    }

    @Override // l9.e
    public final void b(long j13) {
        this.f86612e = j13;
    }

    @Override // k7.d
    public final void d(long j13) {
        this.f86614g = j13;
    }

    @Override // k7.d
    public final void e(l9.h hVar) {
        bf.b.i(hVar == this.f86611d);
        g gVar = (g) hVar;
        if (!gVar.i(4)) {
            long j13 = gVar.f78456g;
            if (j13 != Long.MIN_VALUE) {
                long j14 = this.f86614g;
                if (j14 != -9223372036854775807L && j13 < j14) {
                    gVar.n();
                    this.f86608a.add(gVar);
                    this.f86611d = null;
                }
            }
        }
        long j15 = this.f86613f;
        this.f86613f = 1 + j15;
        gVar.f86606l = j15;
        this.f86610c.add(gVar);
        this.f86611d = null;
    }

    @Override // k7.d
    public final Object f() {
        bf.b.t(this.f86611d == null);
        ArrayDeque arrayDeque = this.f86608a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f86611d = gVar;
        return gVar;
    }

    @Override // k7.d
    public void flush() {
        ArrayDeque arrayDeque;
        this.f86613f = 0L;
        this.f86612e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f86610c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f86608a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            int i13 = n0.f53866a;
            gVar.n();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f86611d;
        if (gVar2 != null) {
            gVar2.n();
            arrayDeque.add(gVar2);
            this.f86611d = null;
        }
    }

    public abstract j g();

    public abstract void h(g gVar);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return null;
     */
    @Override // k7.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l9.i c() {
        /*
            r7 = this;
            java.util.ArrayDeque r0 = r7.f86609b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.ArrayDeque r1 = r7.f86610c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6a
            java.lang.Object r3 = r1.peek()
            m9.g r3 = (m9.g) r3
            int r4 = d7.n0.f53866a
            long r3 = r3.f78456g
            long r5 = r7.f86612e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6a
            java.lang.Object r1 = r1.poll()
            m9.g r1 = (m9.g) r1
            r3 = 4
            boolean r4 = r1.i(r3)
            java.util.ArrayDeque r5 = r7.f86608a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            l9.i r0 = (l9.i) r0
            r0.e(r3)
            r1.n()
            r5.add(r1)
            return r0
        L41:
            r7.h(r1)
            boolean r3 = r7.j()
            if (r3 == 0) goto L63
            m9.j r2 = r7.g()
            java.lang.Object r0 = r0.pollFirst()
            l9.i r0 = (l9.i) r0
            long r3 = r1.f78456g
            r0.f78460c = r3
            r0.f82316e = r2
            r0.f82317f = r3
            r1.n()
            r5.add(r1)
            return r0
        L63:
            r1.n()
            r5.add(r1)
            goto La
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.i.c():l9.i");
    }

    public abstract boolean j();
}
