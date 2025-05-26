package gk2;

/* loaded from: classes2.dex */
public final class b2 extends z1 {

    /* renamed from: d, reason: collision with root package name */
    public final xp2.b f65338d;

    public b2(xp2.b bVar, int i13, int i14) {
        super(i13, i14);
        this.f65338d = bVar;
    }

    @Override // gk2.z1
    public final void a() {
        int i13 = this.f65714a;
        xp2.b bVar = this.f65338d;
        for (int i14 = this.f65715b; i14 != i13; i14++) {
            if (this.f65716c) {
                return;
            }
            bVar.c(Integer.valueOf(i14));
        }
        if (this.f65716c) {
            return;
        }
        bVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r9.f65715b = r1;
        r10 = addAndGet(-r5);
     */
    @Override // gk2.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r10) {
        /*
            r9 = this;
            int r0 = r9.f65714a
            int r1 = r9.f65715b
            xp2.b r2 = r9.f65338d
            r3 = 0
        L8:
            r5 = r3
        L9:
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 == 0) goto L21
            if (r1 == r0) goto L21
            boolean r7 = r9.f65716c
            if (r7 == 0) goto L14
            return
        L14:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r2.c(r7)
            r7 = 1
            long r5 = r5 + r7
            int r1 = r1 + 1
            goto L9
        L21:
            if (r1 != r0) goto L2b
            boolean r10 = r9.f65716c
            if (r10 != 0) goto L2a
            r2.a()
        L2a:
            return
        L2b:
            long r10 = r9.get()
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 != 0) goto L9
            r9.f65715b = r1
            long r10 = -r5
            long r10 = r9.addAndGet(r10)
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 != 0) goto L8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gk2.b2.b(long):void");
    }
}
