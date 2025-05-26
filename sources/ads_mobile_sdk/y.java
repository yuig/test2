package ads_mobile_sdk;

import a.zb;
import android.app.Application;
import android.content.Context;
import ao2.j0;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class y implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13902a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f13903b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f13904c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f13905d;

    /* renamed from: e, reason: collision with root package name */
    public final a.o8 f13906e;

    /* renamed from: f, reason: collision with root package name */
    public final a.o8 f13907f;

    public y(xv0 xv0Var, a.o8 o8Var, xv0 xv0Var2, a.o8 o8Var2, a.o8 o8Var3, a.o8 o8Var4) {
        this.f13902a = xv0Var;
        this.f13903b = o8Var;
        this.f13904c = xv0Var2;
        this.f13905d = o8Var2;
        this.f13906e = o8Var3;
        this.f13907f = o8Var4;
    }

    @Override // a.v7
    public final Object get() {
        return new x((Context) this.f13902a.get(), (Application) this.f13903b.get(), (WeakReference) this.f13904c.get(), (j0) this.f13905d.get(), (oh0) this.f13906e.get(), (zb) this.f13907f.get());
    }
}
