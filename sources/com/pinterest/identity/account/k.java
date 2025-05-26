package com.pinterest.identity.account;

import com.pinterest.gestalt.button.view.GestaltButton;
import kk2.m;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import yk1.n;

/* loaded from: classes2.dex */
public final class k extends yk1.b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final lb2.d f49800a;

    /* renamed from: b, reason: collision with root package name */
    public final mr1.a f49801b;

    /* renamed from: c, reason: collision with root package name */
    public String f49802c;

    /* renamed from: d, reason: collision with root package name */
    public String f49803d;

    /* renamed from: e, reason: collision with root package name */
    public String f49804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lb2.d accountManager, mr1.a accountSwitcher) {
        super(0);
        Intrinsics.checkNotNullParameter(accountManager, "accountManager");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        this.f49800a = accountManager;
        this.f49801b = accountSwitcher;
        this.f49802c = "";
        this.f49803d = "";
        this.f49804e = "";
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        d view = (d) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        h hVar = (h) ((d) getView());
        hVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        hVar.F0 = this;
    }

    public final void p3(String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        this.f49804e = password;
        u3();
    }

    public final void q3(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f49802c = email;
        u3();
    }

    public final void r3(String email, vr1.b passwordInput) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(passwordInput, "passwordInput");
        this.f49802c = email;
        String str = passwordInput.f126457a;
        this.f49803d = str;
        this.f49804e = str;
        d dVar = (d) getView();
        boolean z13 = (z.j(email) ^ true) && tr1.b.c(email) && passwordInput.f126458b;
        GestaltButton gestaltButton = ((h) dVar).A0;
        if (gestaltButton != null) {
            gestaltButton.d(new mm1.i(z13, 5));
        } else {
            Intrinsics.r("unlinkButton");
            throw null;
        }
    }

    public final void s3(String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        this.f49803d = password;
        u3();
    }

    public final void t3(androidx.appcompat.app.n hostActivity, String userName, String expiration, String token) {
        Intrinsics.checkNotNullParameter(hostActivity, "hostActivity");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        Intrinsics.checkNotNullParameter(token, "token");
        String email = this.f49802c;
        String password = this.f49803d;
        String passwordConfirmation = this.f49804e;
        lb2.d dVar = this.f49800a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(passwordConfirmation, "passwordConfirmation");
        m mVar = new m(dVar.f82746a.l(z0.g(new Pair("username", userName), new Pair("token", token), new Pair("expiration", expiration), new Pair("email", email), new Pair("password", password), new Pair("password_confirmation", passwordConfirmation))).r(tk2.e.f118017c).l(wj2.c.a()), new b22.f(21, new lb2.a(dVar, 4)), 2);
        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
        new fk2.c(4, mVar, new oo1.d(4, new j(this, 1))).i(new g51.h(this, 16), new tp1.c(11, new xm1.k(20, this, hostActivity)));
    }

    public final void u3() {
        boolean z13 = this.f49802c.length() > 0 && this.f49803d.length() > 0 && this.f49804e.length() > 0 && tr1.b.c(this.f49802c) && Intrinsics.d(this.f49803d, this.f49804e);
        GestaltButton gestaltButton = ((h) ((d) getView())).A0;
        if (gestaltButton != null) {
            gestaltButton.d(new mm1.i(z13, 5));
        } else {
            Intrinsics.r("unlinkButton");
            throw null;
        }
    }
}
