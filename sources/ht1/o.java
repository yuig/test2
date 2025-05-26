package ht1;

/* loaded from: classes4.dex */
public final class o implements mt1.a {

    /* renamed from: a, reason: collision with root package name */
    public jt1.d f70294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f70295b;

    public o(q qVar) {
        this.f70295b = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1.b(), r15.b()) == false) goto L82;
     */
    @Override // mt1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ht1.o.a(java.lang.Object):void");
    }

    @Override // mt1.a
    public final void g() {
        q qVar = this.f70295b;
        qVar.f70317m = true;
        if (qVar.f70307c.f73677d != 0 || qVar.f70318n) {
            return;
        }
        qVar.f70318n = true;
        qVar.f70322r.f();
        qVar.f70320p.f();
    }

    public final String toString() {
        return "Queue Audio: last packet's time span [" + this.f70294a + "]";
    }
}
