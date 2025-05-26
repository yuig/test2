package l8;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w implements x {

    /* renamed from: d, reason: collision with root package name */
    public static final s f82094d = new s(0, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final s f82095e = new s(2, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final s f82096f = new s(3, -9223372036854775807L);

    /* renamed from: a, reason: collision with root package name */
    public final m8.a f82097a;

    /* renamed from: b, reason: collision with root package name */
    public t f82098b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f82099c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ExoPlayer:Loader:"
            java.lang.String r3 = a.a.j(r0, r3)
            int r0 = d7.n0.f53866a
            h6.a r0 = new h6.a
            r1 = 1
            r0.<init>(r3, r1)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            c3.e r0 = new c3.e
            r1 = 12
            r0.<init>(r1)
            m8.a r1 = new m8.a
            r1.<init>(r3, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.w.<init>(java.lang.String):void");
    }

    public final void a() {
        t tVar = this.f82098b;
        bf.b.w(tVar);
        tVar.a(false);
    }

    @Override // l8.x
    public final void b() {
        IOException iOException;
        IOException iOException2 = this.f82099c;
        if (iOException2 != null) {
            throw iOException2;
        }
        t tVar = this.f82098b;
        if (tVar != null && (iOException = tVar.f82088e) != null && tVar.f82089f > tVar.f82084a) {
            throw iOException;
        }
    }

    public final boolean c() {
        return this.f82099c != null;
    }

    public final boolean d() {
        return this.f82098b != null;
    }

    public final void e() {
        f(null);
    }

    public final void f(v vVar) {
        t tVar = this.f82098b;
        if (tVar != null) {
            tVar.a(true);
        }
        m8.a aVar = this.f82097a;
        if (vVar != null) {
            aVar.execute(new androidx.appcompat.app.v(vVar, 3));
        }
        aVar.f86525b.accept(aVar.f86524a);
    }

    public final void g(u uVar, r rVar, int i13) {
        Looper myLooper = Looper.myLooper();
        bf.b.w(myLooper);
        this.f82099c = null;
        t tVar = new t(this, myLooper, uVar, rVar, i13, SystemClock.elapsedRealtime());
        bf.b.t(this.f82098b == null);
        this.f82098b = tVar;
        tVar.b();
    }

    public w(m8.a aVar) {
        this.f82097a = aVar;
    }
}
