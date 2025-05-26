package z7;

import a.z0;
import a7.d0;
import a7.i0;
import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import d7.n0;
import h7.w;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f140956a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.i f140957b;

    /* renamed from: c, reason: collision with root package name */
    public final h7.e f140958c;

    /* renamed from: d, reason: collision with root package name */
    public final h7.l f140959d;

    /* renamed from: e, reason: collision with root package name */
    public k f140960e;

    /* renamed from: f, reason: collision with root package name */
    public volatile o f140961f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f140962g;

    public p(i0 i0Var, h7.d dVar, Executor executor) {
        executor.getClass();
        this.f140956a = executor;
        d0 d0Var = i0Var.f1073b;
        d0Var.getClass();
        Map emptyMap = Collections.emptyMap();
        Uri uri = d0Var.f969a;
        bf.b.x(uri, "The uri must be set.");
        g7.i iVar = new g7.i(uri, 0L, 1, null, emptyMap, 0L, -1L, d0Var.f973e, 4, null);
        this.f140957b = iVar;
        h7.e b13 = dVar.b();
        this.f140958c = b13;
        this.f140959d = new h7.l(b13, iVar, null, new z0(this, 29));
    }

    @Override // z7.l
    public final void a(k kVar) {
        this.f140960e = kVar;
        boolean z13 = false;
        while (!z13) {
            try {
                if (this.f140962g) {
                    break;
                }
                this.f140961f = new o(this);
                this.f140956a.execute(this.f140961f);
                try {
                    this.f140961f.get();
                    z13 = true;
                } catch (ExecutionException e13) {
                    Throwable cause = e13.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i13 = n0.f53866a;
                        throw cause;
                    }
                }
            } finally {
                o oVar = this.f140961f;
                oVar.getClass();
                oVar.a();
            }
        }
    }

    @Override // z7.l
    public final void cancel() {
        this.f140962g = true;
        o oVar = this.f140961f;
        if (oVar != null) {
            oVar.cancel(true);
        }
    }

    @Override // z7.l
    public final void remove() {
        h7.e eVar = this.f140958c;
        h7.a aVar = eVar.f67867a;
        w wVar = (w) aVar;
        wVar.o(((c3.e) eVar.f67871e).k(this.f140957b));
    }
}
