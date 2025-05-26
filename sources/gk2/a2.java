package gk2;

/* loaded from: classes4.dex */
public final class a2 extends z1 {

    /* renamed from: d, reason: collision with root package name */
    public final dk2.a f65330d;

    public a2(dk2.a aVar, int i13, int i14) {
        super(i13, i14);
        this.f65330d = aVar;
    }

    @Override // gk2.z1
    public final void a() {
        int i13 = this.f65714a;
        dk2.a aVar = this.f65330d;
        for (int i14 = this.f65715b; i14 != i13; i14++) {
            if (this.f65716c) {
                return;
            }
            aVar.f(Integer.valueOf(i14));
        }
        if (this.f65716c) {
            return;
        }
        aVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
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
            dk2.a r2 = r9.f65330d
            r3 = 0
        L8:
            r5 = r3
        L9:
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 == 0) goto L24
            if (r1 == r0) goto L24
            boolean r7 = r9.f65716c
            if (r7 == 0) goto L14
            return
        L14:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            boolean r7 = r2.f(r7)
            if (r7 == 0) goto L21
            r7 = 1
            long r5 = r5 + r7
        L21:
            int r1 = r1 + 1
            goto L9
        L24:
            if (r1 != r0) goto L2e
            boolean r10 = r9.f65716c
            if (r10 != 0) goto L2d
            r2.a()
        L2d:
            return
        L2e:
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
        throw new UnsupportedOperationException("Method not decompiled: gk2.a2.b(long):void");
    }
}
