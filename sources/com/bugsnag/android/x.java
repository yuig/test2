package com.bugsnag.android;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;

/* loaded from: classes3.dex */
public final class x extends id.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id.a f29681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f29684h;

    public x(u uVar, z zVar, id.d dVar, hd.c cVar) {
        this.f29680d = 1;
        this.f29682f = uVar;
        this.f29681e = zVar;
        this.f29683g = dVar;
        this.f29684h = cVar;
    }

    @Override // id.d
    public final Object c() {
        int i13 = this.f29680d;
        Object obj = this.f29684h;
        Object obj2 = this.f29683g;
        Object obj3 = this.f29682f;
        id.a aVar = this.f29681e;
        switch (i13) {
            case 0:
                z zVar = (z) aVar;
                Context context = (Context) zVar.f29712g;
                c1 c1Var = (c1) obj3;
                return new g(context, context.getPackageManager(), zVar.f29708c, (n2) c1Var.f29174d.get(), ((id.e) obj2).f72123d, (s1) c1Var.f29175e, (w1) obj);
            case 1:
                s sVar = (s) obj3;
                z zVar2 = (z) aVar;
                Context context2 = (Context) zVar2.f29712g;
                Resources resources = context2.getResources();
                w wVar = new w((id.c) obj2, 0);
                zVar2.f72116a.a(zVar2.f72117b, wVar);
                return new k0(sVar, context2, resources, wVar, (i0) zVar2.f29714i, (File) zVar2.f29715j, zVar2.f29710e, (hd.c) obj, (u1) zVar2.f29713h);
            default:
                c1 c1Var2 = (c1) aVar;
                hd.h hVar = c1Var2.f29173c;
                return new g1(hVar, hVar.f68826r, (c2) obj3, (hd.c) obj2, (m1) c1Var2.f29174d.a(), (m) obj);
        }
    }

    public /* synthetic */ x(id.a aVar, Object obj, Object obj2, Object obj3, int i13) {
        this.f29680d = i13;
        this.f29681e = aVar;
        this.f29682f = obj;
        this.f29683g = obj2;
        this.f29684h = obj3;
    }
}
