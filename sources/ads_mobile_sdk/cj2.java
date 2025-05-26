package ads_mobile_sdk;

import a.pd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class cj2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.d0 f3937a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3938b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f3939c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3940d;

    /* renamed from: e, reason: collision with root package name */
    public final pd f3941e;

    /* renamed from: f, reason: collision with root package name */
    public final a.m f3942f;

    /* renamed from: g, reason: collision with root package name */
    public final bt2 f3943g;

    public cj2(com.google.common.util.concurrent.d0 d0Var, a aVar, a.m mVar, zm2 zm2Var, String str, pd pdVar, a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, bt2 bt2Var) {
        this.f3937a = d0Var;
        this.f3938b = aVar;
        this.f3940d = str;
        this.f3942f = mVar;
        this.f3941e = pdVar;
        this.f3943g = bt2Var;
        int ordinal = zm2Var.ordinal();
        if (ordinal == 0) {
            this.f3939c = (Set) o8Var.get();
        } else if (ordinal == 1) {
            this.f3939c = (Set) o8Var2.get();
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException();
            }
            this.f3939c = (Set) o8Var3.get();
        }
    }

    public final String a() {
        bt2 bt2Var = this.f3943g;
        xb0 xb0Var = xb0.EVENT_ID_ENCRYPTION;
        a.a1 a1Var = new a.a1(this, 2);
        bs2 bs2Var = new bs2(xb0Var, bt2Var.f3596b, bt2Var.f3595a);
        try {
            bs2Var.b();
            Object call = a1Var.call();
            bs2Var.a();
            return (String) call;
        } finally {
        }
    }

    public final com.google.common.util.concurrent.c0 b() {
        boolean z13;
        a aVar = this.f3938b;
        synchronized (aVar) {
            z13 = aVar.f2124d;
        }
        if (!z13) {
            String num = Integer.toString(7);
            return num == null ? com.google.common.util.concurrent.y.f33586b : new com.google.common.util.concurrent.y(num);
        }
        if (!((bb1) this.f3942f).b()) {
            return dl2.b.M2(this.f3937a, new a.a1(this, 0));
        }
        ArrayList arrayList = new ArrayList(this.f3939c.size());
        Iterator it = this.f3939c.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f3937a.submit((Callable) it.next()));
        }
        pk.c1 r13 = pk.c1.r(arrayList);
        a.a1 a1Var = new a.a1(this, 1);
        com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
        com.google.common.util.concurrent.q qVar = new com.google.common.util.concurrent.q(r13, false, false);
        qVar.f33584k = new com.google.common.util.concurrent.p(qVar, a1Var, rVar);
        qVar.J();
        return qVar;
    }

    public final /* synthetic */ String c() {
        return this.f3938b.a((wb) this.f3941e.a(), this.f3940d);
    }

    public final /* synthetic */ String d() {
        return this.f3938b.a(lb.PSN_INITIALIZATION_FAIL, this.f3940d);
    }
}
