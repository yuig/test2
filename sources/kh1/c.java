package kh1;

import ao2.j0;
import i92.k;
import kk2.m;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import mo1.d;
import pb1.o;
import pb1.s;
import tk2.e;
import u50.r;
import we1.n1;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final cr1.a f79412a;

    /* renamed from: b, reason: collision with root package name */
    public final n82.b f79413b;

    /* renamed from: c, reason: collision with root package name */
    public final mr1.a f79414c;

    /* renamed from: d, reason: collision with root package name */
    public final d f79415d;

    /* renamed from: e, reason: collision with root package name */
    public final k f79416e;

    /* renamed from: f, reason: collision with root package name */
    public lu1.b f79417f;

    public c(cr1.a accountService, n82.b currentActivityProvider, mr1.a accountSwitcher, d intentHelper, k toastUtils) {
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(currentActivityProvider, "currentActivityProvider");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        Intrinsics.checkNotNullParameter(intentHelper, "intentHelper");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f79412a = accountService;
        this.f79413b = currentActivityProvider;
        this.f79414c = accountSwitcher;
        this.f79415d = intentHelper;
        this.f79416e = toastUtils;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        s request = (s) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof o) {
            o oVar = (o) request;
            int i13 = 23;
            new kk2.g(new m(this.f79412a.u(oVar.f99474a).r(e.f118017c).l(wj2.c.a()), new ic1.a(22, new n1(this, i13)), 0).k(new ic1.a(i13, a.f79409i)), new dh1.b(3, new ed1.m(eventIntake, oVar, this, 13)), 3).o(new dh1.b(4, new ic1.c(26, scope, this)), new dh1.b(5, new fa1.g(eventIntake, 18)));
        }
    }
}
