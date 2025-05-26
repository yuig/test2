package l8;

import android.net.Uri;
import d7.n0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class z implements u {

    /* renamed from: a, reason: collision with root package name */
    public final long f82100a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.i f82101b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82102c;

    /* renamed from: d, reason: collision with root package name */
    public final g7.y f82103d;

    /* renamed from: e, reason: collision with root package name */
    public final y f82104e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f82105f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(g7.f r16, android.net.Uri r17, l8.y r18) {
        /*
            r15 = this;
            java.util.Map r6 = java.util.Collections.emptyMap()
            java.lang.String r0 = "The uri must be set."
            r1 = r17
            bf.b.x(r1, r0)
            g7.i r14 = new g7.i
            r12 = 1
            r13 = 0
            r2 = 0
            r4 = 1
            r5 = 0
            r7 = 0
            r9 = -1
            r11 = 0
            r0 = r14
            r1 = r17
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r11, r12, r13)
            r0 = 5
            r1 = r15
            r2 = r16
            r3 = r18
            r15.<init>(r0, r2, r14, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.z.<init>(g7.f, android.net.Uri, l8.y):void");
    }

    public final long a() {
        return this.f82103d.f63852b;
    }

    public final Map b() {
        return this.f82103d.f63854d;
    }

    public final Object c() {
        return this.f82105f;
    }

    public final Uri d() {
        return this.f82103d.f63853c;
    }

    @Override // l8.u
    public final void h() {
        this.f82103d.f63852b = 0L;
        g7.g gVar = new g7.g(this.f82103d, this.f82101b);
        try {
            gVar.a();
            Uri r13 = this.f82103d.f63851a.r();
            r13.getClass();
            this.f82105f = this.f82104e.k(r13, gVar);
        } finally {
            n0.g(gVar);
        }
    }

    @Override // l8.u
    public final void o() {
    }

    public z(int i13, g7.f fVar, g7.i iVar, y yVar) {
        this.f82103d = new g7.y(fVar);
        this.f82101b = iVar;
        this.f82102c = i13;
        this.f82104e = yVar;
        this.f82100a = g8.v.f64440d.getAndIncrement();
    }
}
