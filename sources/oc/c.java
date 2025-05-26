package oc;

import bd.e;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.f0;
import pc.j0;
import pc.u0;
import pc.v;
import qc.g;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final dd.a f94016a;

    /* renamed from: b, reason: collision with root package name */
    public final v f94017b;

    /* renamed from: c, reason: collision with root package name */
    public final dd.a f94018c;

    /* renamed from: d, reason: collision with root package name */
    public final List f94019d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f94020e;

    /* renamed from: f, reason: collision with root package name */
    public final g f94021f;

    /* renamed from: g, reason: collision with root package name */
    public final List f94022g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f94023h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f94024i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f94025j;

    /* renamed from: k, reason: collision with root package name */
    public final b f94026k;

    /* renamed from: l, reason: collision with root package name */
    public final d f94027l;

    /* renamed from: m, reason: collision with root package name */
    public final ad.c f94028m;

    public c(dd.a aVar, v vVar, dd.a aVar2, ArrayList arrayList, f0 f0Var, ao2.f0 f0Var2, g gVar, List list, Boolean bool, Boolean bool2, Boolean bool3, b bVar) {
        this.f94016a = aVar;
        this.f94017b = vVar;
        this.f94018c = aVar2;
        this.f94019d = arrayList;
        this.f94020e = f0Var;
        this.f94021f = gVar;
        this.f94022g = list;
        this.f94023h = bool;
        this.f94024i = bool2;
        this.f94025j = bool3;
        this.f94026k = bVar;
        f0Var2 = f0Var2 == null ? e.f22692a : f0Var2;
        this.f94027l = new d(f0Var2, dl2.b.b(f0Var2));
        this.f94028m = new ad.c(aVar, aVar2, f0Var2);
    }

    public final a a(j0 mutation) {
        Intrinsics.checkNotNullParameter(mutation, "mutation");
        return new a(this, mutation);
    }

    public final a c(u0 query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new a(this, query);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dl2.b.E(this.f94027l.f94031c, null);
        this.f94016a.dispose();
        this.f94018c.dispose();
    }
}
