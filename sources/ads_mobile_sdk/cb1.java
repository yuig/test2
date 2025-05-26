package ads_mobile_sdk;

import android.content.Context;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class cb1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3850a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f3851b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f3852c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f3853d;

    /* renamed from: e, reason: collision with root package name */
    public final a.o8 f3854e;

    /* renamed from: f, reason: collision with root package name */
    public final a.o8 f3855f;

    /* renamed from: g, reason: collision with root package name */
    public final a.o8 f3856g;

    /* renamed from: h, reason: collision with root package name */
    public final a.o8 f3857h;

    public cb1(xv0 xv0Var, xv0 xv0Var2, a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, a.o8 o8Var4, xv0 xv0Var3) {
        a.h hVar = a.l9.f81b;
        this.f3850a = xv0Var;
        this.f3851b = xv0Var2;
        this.f3852c = o8Var;
        this.f3853d = o8Var2;
        this.f3854e = o8Var3;
        this.f3855f = o8Var4;
        this.f3856g = xv0Var3;
        this.f3857h = hVar;
    }

    @Override // a.v7
    public final Object get() {
        Context context = (Context) this.f3850a.get();
        ExecutorService executorService = (ExecutorService) this.f3851b.get();
        a aVar = (a) this.f3852c.get();
        dl2 dl2Var = (dl2) this.f3853d.get();
        File file = (File) this.f3854e.get();
        bt2 bt2Var = (bt2) this.f3855f.get();
        i4 i4Var = (i4) this.f3856g.get();
        return new bb1(context, executorService, aVar, dl2Var, file, bt2Var, i4Var.E(), (Set) this.f3857h.get());
    }
}
