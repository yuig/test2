package com.bugsnag.android;

import java.io.File;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g1 extends l1 {

    /* renamed from: o, reason: collision with root package name */
    public static final v.j2 f29233o = new v.j2(20);

    /* renamed from: g, reason: collision with root package name */
    public final hd.h f29234g;

    /* renamed from: h, reason: collision with root package name */
    public final c2 f29235h;

    /* renamed from: i, reason: collision with root package name */
    public final hd.c f29236i;

    /* renamed from: j, reason: collision with root package name */
    public final m f29237j;

    /* renamed from: k, reason: collision with root package name */
    public final u1 f29238k;

    /* renamed from: l, reason: collision with root package name */
    public final p0 f29239l;

    /* renamed from: m, reason: collision with root package name */
    public final f1 f29240m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29241n;

    public g1(hd.h hVar, u1 u1Var, c2 c2Var, hd.c cVar, m1 m1Var, m mVar) {
        super(new File((File) hVar.f68833y.getValue(), "bugsnag/errors"), hVar.f68828t, u1Var, m1Var);
        this.f29234g = hVar;
        this.f29239l = p0.f29404l;
        this.f29240m = f1.f29215j;
        this.f29238k = u1Var;
        this.f29235h = c2Var;
        this.f29236i = cVar;
        this.f29237j = mVar;
    }

    @Override // com.bugsnag.android.l1
    public final String e(Object obj) {
        if (obj == null) {
            return "";
        }
        eb.d dVar = y0.f29694f;
        String a13 = eb.d.h(obj, null, this.f29234g).a();
        return a13 == null ? "" : a13;
    }

    @Override // com.bugsnag.android.l1
    public final u1 f() {
        return this.f29238k;
    }

    public final a1 i(File file, String str) {
        Intrinsics.f(str);
        u1 u1Var = this.f29238k;
        v1 v1Var = new v1(file, str, u1Var);
        try {
            m mVar = this.f29237j;
            if (!mVar.f29336d.isEmpty()) {
                v1Var.invoke();
                mVar.a(u1Var);
            }
        } catch (Exception e13) {
            u1Var.a("could not parse event payload", e13);
            v1Var.f29666d = null;
        }
        x0 x0Var = v1Var.f29666d;
        if (x0Var == null) {
            return new a1(str, null, file, this.f29235h, this.f29234g);
        }
        return new a1(x0Var.f29685a.f29723h, x0Var, null, this.f29235h, this.f29234g);
    }

    public final void j(File file, a1 a1Var) {
        hd.h hVar = this.f29234g;
        int i13 = e1.f29210a[hVar.f68822n.a(a1Var, hVar.a(a1Var)).ordinal()];
        u1 u1Var = this.f29238k;
        if (i13 == 1) {
            b(kotlin.collections.g1.b(file));
            u1Var.c("Deleting sent error file " + file + ".name");
            return;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                return;
            }
            RuntimeException runtimeException = new RuntimeException("Failed to deliver event payload");
            String message = runtimeException.getMessage();
            if (message == null) {
                message = "Failed to send event";
            }
            u1Var.b(message, runtimeException);
            b(kotlin.collections.g1.b(file));
            return;
        }
        if (file.length() > 1048576) {
            u1Var.f("Discarding over-sized event (" + file.length() + ") after failed delivery");
            this.f29240m.invoke(new a1(y0.f29694f.i(file, hVar).f29695a, null, file, this.f29235h, this.f29234g));
            b(kotlin.collections.g1.b(file));
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        eb.d dVar = y0.f29694f;
        if (dVar.g(file) >= calendar.getTimeInMillis()) {
            a(kotlin.collections.g1.b(file));
            u1Var.f("Could not send previously saved error(s) to Bugsnag, will try again later");
            return;
        }
        u1Var.f("Discarding historical event (from " + new Date(dVar.g(file)) + ") after failed delivery");
        this.f29240m.invoke(new a1(dVar.i(file, hVar).f29695a, null, file, this.f29235h, this.f29234g));
        b(kotlin.collections.g1.b(file));
    }

    public final void k() {
        try {
            this.f29236i.b(hd.n.ERROR_REQUEST, new d1(this, 1));
        } catch (RejectedExecutionException unused) {
            this.f29238k.f("Failed to flush all on-disk errors, retaining unsent errors for later.");
        }
    }

    public final void l(File file) {
        try {
            j(file, i(file, y0.f29694f.i(file, this.f29234g).f29695a));
        } catch (Exception e13) {
            String message = e13.getMessage();
            if (message == null) {
                message = "Failed to send event";
            }
            this.f29238k.b(message, e13);
            b(kotlin.collections.g1.b(file));
        }
    }

    public final void m(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.f29238k.c(a.a.e("Sending ", collection.size(), " saved error(s) to Bugsnag"));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            l((File) it.next());
        }
    }

    public final void n() {
        if (this.f29329f.isEmpty()) {
            String[] list = this.f29324a.list();
            if ((list == null || list.length == 0) && !this.f29241n) {
                this.f29239l.invoke();
                this.f29241n = true;
            }
        }
    }
}
