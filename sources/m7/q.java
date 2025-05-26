package m7;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f86357a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.b0 f86358b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86359c = 5000;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.messaging.k f86360d = x7.q.f134101fp;

    /* renamed from: e, reason: collision with root package name */
    public final long f86361e = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86362f;

    public q(Context context) {
        this.f86357a = context;
        this.f86358b = new d7.b0(context, 1);
    }

    public final h[] a(Handler handler, i0 i0Var, i0 i0Var2, i0 i0Var3, i0 i0Var4) {
        ArrayList arrayList = new ArrayList();
        com.google.firebase.messaging.k kVar = this.f86360d;
        Context context = this.f86357a;
        n8.g gVar = new n8.g(context);
        d7.b0 b0Var = this.f86358b;
        gVar.f89799d = b0Var;
        gVar.f89798c = kVar;
        gVar.f89800e = this.f86359c;
        gVar.f89801f = false;
        gVar.f89802g = handler;
        gVar.f89803h = i0Var;
        gVar.f89804i = 1;
        gVar.f89806k = false;
        gVar.f89807l = this.f86361e;
        gVar.f89808m = false;
        gVar.f89809n = this.f86362f;
        bf.b.t(!gVar.f89797b);
        Handler handler2 = gVar.f89802g;
        bf.b.t((handler2 == null && gVar.f89803h == null) || !(handler2 == null || gVar.f89803h == null));
        gVar.f89797b = true;
        arrayList.add(new n8.i(gVar));
        o7.x xVar = new o7.x(context);
        xVar.f93201d = false;
        xVar.f93202e = false;
        bf.b.t(!xVar.f93203f);
        xVar.f93203f = true;
        if (xVar.f93200c == null) {
            xVar.f93200c = new x92.b(new b7.f[0]);
        }
        if (xVar.f93206i == null) {
            xVar.f93206i = new o7.s(context);
        }
        o7.h0 h0Var = new o7.h0(this.f86357a, b0Var, kVar, handler, i0Var2, new o7.f0(xVar));
        h0Var.C0 = this.f86362f;
        arrayList.add(h0Var);
        arrayList.add(new j8.f(i0Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new y7.b(i0Var4, looper));
        arrayList.add(new y7.b(i0Var4, looper));
        arrayList.add(new o8.b());
        arrayList.add(new w7.g(w7.c.f128138cp));
        return (h[]) arrayList.toArray(new h[0]);
    }
}
