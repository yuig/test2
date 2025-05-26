package a8;

import android.os.Handler;
import java.io.Closeable;
import pk.a3;

/* loaded from: classes3.dex */
public final class l implements Runnable, Closeable {

    /* renamed from: a */
    public final Handler f1388a = d7.n0.n(null);

    /* renamed from: b */
    public final long f1389b;

    /* renamed from: c */
    public boolean f1390c;

    /* renamed from: d */
    public final /* synthetic */ p f1391d;

    public l(p pVar, long j13) {
        this.f1391d = pVar;
        this.f1389b = j13;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1390c = false;
        this.f1388a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f1391d;
        bn0.a aVar = pVar.f1432h;
        aVar.k(aVar.d(4, pVar.f1436l, a3.f100350g, pVar.f1433i));
        this.f1388a.postDelayed(this, this.f1389b);
    }
}
