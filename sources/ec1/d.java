package ec1;

import android.content.Context;
import i92.k;
import m60.f0;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends hb0.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f58393d;

    public d(j jVar) {
        this.f58393d = jVar;
    }

    @Override // hb0.c
    public final void c() {
        Context context = kb0.a.f79058b;
        lb0.g.b(f0.W().getCacheDir());
    }

    @Override // hb0.d
    public final void e() {
        j jVar = this.f58393d;
        k kVar = jVar.f58424b;
        v vVar = jVar.f58425c;
        kVar.m(((yk1.a) vVar).f139224a.getString(i52.c.cache_cleared));
        ep.b.C(null, jVar.f58423a);
    }
}
