package com.bugsnag.android;

import android.content.Context;
import android.os.Build;
import android.os.Environment;

/* loaded from: classes3.dex */
public final class z extends id.a {

    /* renamed from: c, reason: collision with root package name */
    public final hd.h f29708c;

    /* renamed from: d, reason: collision with root package name */
    public final id.d f29709d;

    /* renamed from: e, reason: collision with root package name */
    public final y f29710e;

    /* renamed from: f, reason: collision with root package name */
    public final id.d f29711f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f29712g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f29713h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f29714i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f29715j;

    public z(id.b bVar, id.b bVar2, id.e eVar, c1 c1Var, hd.c cVar, u uVar, id.d dVar, w1 w1Var) {
        super(cVar);
        this.f29712g = (Context) bVar.f72118c;
        hd.h hVar = (hd.h) bVar2.f72118c;
        this.f29708c = hVar;
        this.f29713h = hVar.f68826r;
        int i13 = Build.VERSION.SDK_INT;
        this.f29714i = new i0(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(i13), Build.DISPLAY, Build.FINGERPRINT, Build.TAGS, Build.BRAND, Build.SUPPORTED_ABIS);
        this.f29715j = Environment.getDataDirectory();
        hd.n nVar = this.f72117b;
        x xVar = new x(this, c1Var, eVar, w1Var, 0);
        cVar.a(nVar, xVar);
        this.f29709d = xVar;
        hd.n nVar2 = this.f72117b;
        y yVar = new y(this, 0);
        cVar.a(nVar2, yVar);
        this.f29710e = yVar;
        hd.n nVar3 = this.f72117b;
        x xVar2 = new x(uVar, this, dVar, cVar);
        cVar.a(nVar3, xVar2);
        this.f29711f = xVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(android.content.Context r4, hd.h r5, hd.c r6) {
        /*
            r3 = this;
            hd.n r0 = hd.n.IO
            r3.<init>(r6, r0)
            r3.f29708c = r5
            com.bugsnag.android.l3 r5 = new com.bugsnag.android.l3
            r1 = 0
            r5.<init>(r3, r1)
            r6.a(r0, r5)
            r3.f29709d = r5
            com.bugsnag.android.y r5 = new com.bugsnag.android.y
            r1 = 1
            r5.<init>(r4, r1)
            r6.a(r0, r5)
            r3.f29710e = r5
            com.bugsnag.android.k3 r5 = new com.bugsnag.android.k3
            r5.<init>(r3, r4, r1)
            r6.a(r0, r5)
            r3.f29711f = r5
            com.bugsnag.android.l3 r4 = new com.bugsnag.android.l3
            r4.<init>(r3, r1)
            r6.a(r0, r4)
            r3.f29712g = r4
            com.bugsnag.android.l3 r4 = new com.bugsnag.android.l3
            r5 = 2
            r4.<init>(r3, r5)
            r6.a(r0, r4)
            r3.f29713h = r4
            com.bugsnag.android.l3 r5 = new com.bugsnag.android.l3
            r2 = 3
            r5.<init>(r3, r2)
            r6.a(r0, r5)
            r3.f29714i = r5
            com.bugsnag.android.w r5 = new com.bugsnag.android.w
            r5.<init>(r4, r1)
            r6.a(r0, r5)
            r3.f29715j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.z.<init>(android.content.Context, hd.h, hd.c):void");
    }
}
