package q0;

import androidx.annotation.NonNull;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import c0.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class b implements y, l {

    /* renamed from: b, reason: collision with root package name */
    public final z f101748b;

    /* renamed from: c, reason: collision with root package name */
    public final h0.f f101749c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f101747a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f101750d = false;

    public b(nl1.d dVar, h0.f fVar) {
        this.f101748b = dVar;
        this.f101749c = fVar;
        if (((b0) dVar.getLifecycle()).f18588d.isAtLeast(r.STARTED)) {
            fVar.c();
        } else {
            fVar.r();
        }
        dVar.getLifecycle().a(this);
    }

    @Override // c0.l
    public final c0.r a() {
        return this.f101749c.f66397q;
    }

    public final List b() {
        List unmodifiableList;
        synchronized (this.f101747a) {
            unmodifiableList = Collections.unmodifiableList(this.f101749c.v());
        }
        return unmodifiableList;
    }

    public final void h() {
        synchronized (this.f101747a) {
            try {
                if (this.f101750d) {
                    return;
                }
                onStop(this.f101748b);
                this.f101750d = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void o() {
        synchronized (this.f101747a) {
            try {
                if (this.f101750d) {
                    this.f101750d = false;
                    if (((b0) this.f101748b.getLifecycle()).f18588d.isAtLeast(r.STARTED)) {
                        onStart(this.f101748b);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @n0(q.ON_DESTROY)
    public void onDestroy(@NonNull z zVar) {
        synchronized (this.f101747a) {
            h0.f fVar = this.f101749c;
            fVar.y((ArrayList) fVar.v());
        }
    }

    @n0(q.ON_PAUSE)
    public void onPause(@NonNull z zVar) {
        this.f101749c.f66381a.f(false);
    }

    @n0(q.ON_RESUME)
    public void onResume(@NonNull z zVar) {
        this.f101749c.f66381a.f(true);
    }

    @n0(q.ON_START)
    public void onStart(@NonNull z zVar) {
        synchronized (this.f101747a) {
            try {
                if (!this.f101750d) {
                    this.f101749c.c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @n0(q.ON_STOP)
    public void onStop(@NonNull z zVar) {
        synchronized (this.f101747a) {
            try {
                if (!this.f101750d) {
                    this.f101749c.r();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
