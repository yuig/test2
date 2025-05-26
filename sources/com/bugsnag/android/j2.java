package com.bugsnag.android;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class j2 implements n1, c0 {

    /* renamed from: a, reason: collision with root package name */
    public final File f29286a;

    /* renamed from: b, reason: collision with root package name */
    public final c2 f29287b;

    /* renamed from: c, reason: collision with root package name */
    public String f29288c;

    /* renamed from: d, reason: collision with root package name */
    public Date f29289d;

    /* renamed from: e, reason: collision with root package name */
    public final a4 f29290e;

    /* renamed from: f, reason: collision with root package name */
    public final u1 f29291f;

    /* renamed from: g, reason: collision with root package name */
    public e f29292g;

    /* renamed from: h, reason: collision with root package name */
    public h0 f29293h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f29294i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f29295j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f29296k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f29297l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f29298m;

    /* renamed from: n, reason: collision with root package name */
    public final String f29299n;

    public j2(String str, Date date, a4 a4Var, boolean z13, c2 c2Var, u1 u1Var, String str2) {
        this(null, c2Var, u1Var, str2);
        this.f29288c = str;
        this.f29289d = new Date(date.getTime());
        this.f29290e = a4Var;
        this.f29294i = z13;
        this.f29299n = str2;
    }

    public static j2 b(j2 j2Var) {
        j2 j2Var2 = new j2(j2Var.f29288c, j2Var.f29289d, j2Var.f29290e, j2Var.f29295j.get(), j2Var.f29296k.get(), j2Var.f29287b, j2Var.f29291f, j2Var.f29299n);
        j2Var2.f29297l.set(j2Var.f29297l.get());
        j2Var2.f29294i = j2Var.f29294i;
        return j2Var2;
    }

    @Override // com.bugsnag.android.c0
    public final byte[] a() {
        return hd.l.c(this);
    }

    public final boolean c() {
        File file = this.f29286a;
        return file == null || !(file.getName().endsWith("_v2.json") || file.getName().endsWith("_v3.json"));
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        c2 c2Var = this.f29287b;
        File file = this.f29286a;
        if (file != null) {
            if (!c()) {
                o1Var.L(file);
                return;
            }
            o1Var.d();
            o1Var.K("notifier");
            o1Var.M(c2Var);
            o1Var.K("app");
            o1Var.M(this.f29292g);
            o1Var.K("device");
            o1Var.M(this.f29293h);
            o1Var.K("sessions");
            o1Var.c();
            o1Var.L(file);
            o1Var.f();
            o1Var.g();
            return;
        }
        o1Var.d();
        o1Var.K("notifier");
        o1Var.M(c2Var);
        o1Var.K("app");
        o1Var.M(this.f29292g);
        o1Var.K("device");
        o1Var.M(this.f29293h);
        o1Var.K("sessions");
        o1Var.c();
        o1Var.d();
        o1Var.K("id");
        o1Var.z(this.f29288c);
        o1Var.K("startedAt");
        o1Var.M(this.f29289d);
        o1Var.K("user");
        o1Var.M(this.f29290e);
        o1Var.g();
        o1Var.f();
        o1Var.g();
    }

    public j2(String str, Date date, a4 a4Var, int i13, int i14, c2 c2Var, u1 u1Var, String str2) {
        this(str, date, a4Var, false, c2Var, u1Var, str2);
        this.f29295j.set(i13);
        this.f29296k.set(i14);
        this.f29297l.set(true);
        this.f29299n = str2;
    }

    public j2(File file, c2 c2Var, u1 u1Var, String str) {
        this.f29294i = false;
        this.f29295j = new AtomicInteger();
        this.f29296k = new AtomicInteger();
        this.f29297l = new AtomicBoolean(false);
        this.f29298m = new AtomicBoolean(false);
        this.f29286a = file;
        this.f29291f = u1Var;
        eb.d dVar = k2.f29318a;
        if (file != null && kotlin.text.z.h(file.getName(), "_v3.json", false)) {
            String name = file.getName();
            String d03 = StringsKt.d0('_', name, name);
            d03 = d03.length() == 0 ? null : d03;
            if (d03 != null) {
                str = d03;
            }
        }
        this.f29299n = str;
        if (c2Var != null) {
            c2 c2Var2 = new c2(c2Var.f29176a, c2Var.f29177b, c2Var.f29178c);
            c2Var2.f29179d = new ArrayList(c2Var.f29179d);
            this.f29287b = c2Var2;
            return;
        }
        this.f29287b = null;
    }
}
