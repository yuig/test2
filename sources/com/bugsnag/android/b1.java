package com.bugsnag.android;

import android.content.Context;
import android.os.storage.StorageManager;

/* loaded from: classes3.dex */
public final class b1 extends id.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f29160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id.b f29161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id.e f29162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f29163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c1 f29164h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c2 f29165i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hd.c f29166j;

    public b1(c1 c1Var, id.b bVar, id.e eVar, z zVar, c1 c1Var2, c2 c2Var, hd.c cVar) {
        this.f29160d = c1Var;
        this.f29161e = bVar;
        this.f29162f = eVar;
        this.f29163g = zVar;
        this.f29164h = c1Var2;
        this.f29165i = c2Var;
        this.f29166j = cVar;
    }

    @Override // id.d
    public final Object c() {
        c1 c1Var = this.f29160d;
        if (!c1Var.f29173c.f68817i.contains(p3.INTERNAL_ERRORS)) {
            return null;
        }
        Context context = (Context) this.f29161e.f72118c;
        hd.h hVar = c1Var.f29173c;
        u1 u1Var = hVar.f68826r;
        StorageManager storageManager = this.f29162f.f72122c;
        z zVar = this.f29163g;
        g gVar = (g) zVar.f29709d.get();
        return new m1(context, u1Var, hVar, storageManager, gVar, zVar.f29711f, this.f29165i, this.f29166j);
    }
}
