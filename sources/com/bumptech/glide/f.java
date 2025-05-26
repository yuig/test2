package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import ja.c0;
import java.util.List;
import java.util.Map;
import pd.t;

/* loaded from: classes.dex */
public final class f extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f29766k = new a();

    /* renamed from: a, reason: collision with root package name */
    public final qd.i f29767a;

    /* renamed from: b, reason: collision with root package name */
    public final ih.g f29768b;

    /* renamed from: c, reason: collision with root package name */
    public final wc.j f29769c;

    /* renamed from: d, reason: collision with root package name */
    public final h1.b f29770d;

    /* renamed from: e, reason: collision with root package name */
    public final List f29771e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f29772f;

    /* renamed from: g, reason: collision with root package name */
    public final t f29773g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f29774h;

    /* renamed from: i, reason: collision with root package name */
    public final int f29775i;

    /* renamed from: j, reason: collision with root package name */
    public de.h f29776j;

    public f(Context context, qd.i iVar, m7.c cVar, wc.j jVar, h1.b bVar, g1.g gVar, List list, t tVar, c0 c0Var, int i13) {
        super(context.getApplicationContext());
        this.f29767a = iVar;
        this.f29769c = jVar;
        this.f29770d = bVar;
        this.f29771e = list;
        this.f29772f = gVar;
        this.f29773g = tVar;
        this.f29774h = c0Var;
        this.f29775i = i13;
        this.f29768b = new ih.g(cVar);
    }

    public final j a() {
        return (j) this.f29768b.get();
    }
}
