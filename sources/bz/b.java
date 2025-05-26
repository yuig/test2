package bz;

import a.cb;
import android.os.SystemClock;
import com.pinterest.api.model.wy0;
import h32.f1;
import h32.v0;
import h32.w0;
import nx.o0;
import nx.z0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public String f24167b;

    /* renamed from: d, reason: collision with root package name */
    public long f24169d;

    /* renamed from: f, reason: collision with root package name */
    public long f24171f;

    /* renamed from: g, reason: collision with root package name */
    public final String f24172g;

    /* renamed from: a, reason: collision with root package name */
    public final String f24166a = cb.g("toString(...)");

    /* renamed from: c, reason: collision with root package name */
    public final long f24168c = System.currentTimeMillis() * 1000000;

    /* renamed from: e, reason: collision with root package name */
    public final long f24170e = SystemClock.elapsedRealtimeNanos();

    public b() {
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        this.f24172g = f13 != null ? f13.getId() : null;
    }

    public abstract void a(z0 z0Var);

    public abstract void b(v0 v0Var);

    public final w0 c(v0 v0Var) {
        v0Var.f67286i = hf0.b.a();
        v0Var.f67297t = ((m60.d) m60.d.a()).f85891a.getContextEnum();
        v0Var.f67293p = vb0.b.f125448a.a();
        v0Var.D = this.f24166a;
        v0Var.G = this.f24167b;
        b(v0Var);
        z0 z0Var = new z0();
        a(z0Var);
        if (!z0Var.isEmpty()) {
            v0Var.f67282e = z0Var;
        }
        return v0Var.a();
    }

    public f1 d() {
        return f1.TIMED_PAIR_END;
    }

    public f1 e() {
        return f1.TIMED_PAIR_BEGIN;
    }

    public final void f() {
        o0 o0Var = o0.f92437i;
        v0 v0Var = new v0();
        v0Var.f67278a = Long.valueOf(this.f24168c);
        v0Var.f67279b = e();
        v0Var.f67294q = this.f24172g;
        o0Var.k(c(v0Var));
    }

    public final void g() {
        o0 o0Var = o0.f92437i;
        o0 o0Var2 = o0.f92437i;
        v0 v0Var = new v0();
        v0Var.f67278a = Long.valueOf(this.f24169d);
        v0Var.f67279b = d();
        v0Var.C = Long.valueOf(this.f24171f - this.f24170e);
        v0Var.f67294q = this.f24172g;
        o0Var2.k(c(v0Var));
    }

    public void h() {
        f();
    }
}
