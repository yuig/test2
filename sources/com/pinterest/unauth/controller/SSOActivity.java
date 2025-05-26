package com.pinterest.unauth.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import g92.g;
import h32.d4;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import mb2.a;
import mb2.e;
import me.o;
import nl1.d;
import nx.j1;
import qr1.d0;
import so.s8;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/unauth/controller/SSOActivity;", "Lmb2/a;", "Lnx/j1;", "<init>", "()V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SSOActivity extends a implements j1 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f52735g = 0;

    /* renamed from: c, reason: collision with root package name */
    public so1.a f52737c;

    /* renamed from: d, reason: collision with root package name */
    public d0 f52738d;

    /* renamed from: e, reason: collision with root package name */
    public g f52739e;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f52736b = d4.SSO;

    /* renamed from: f, reason: collision with root package name */
    public final d f52740f = super.getF52740f();

    @Override // cp1.p, nx.j1
    public final d4 d() {
        d dVar = this.f52740f;
        if (dVar != null) {
            return dVar.getF86877c0();
        }
        return null;
    }

    @Override // cp1.p, cp1.a
    /* renamed from: getActiveFragment, reason: from getter */
    public final d getF52740f() {
        return this.f52740f;
    }

    @Override // cp1.p, uo1.a
    public final so1.a getBaseActivityComponent() {
        so1.a aVar = this.f52737c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return getSupportFragmentManager().E(t0.fragment_container);
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF86877c0() {
        return this.f52736b;
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setupActivityComponent();
        inject();
        so1.a aVar = this.f52737c;
        if (aVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        setFragmentFactory((il1.a) ((s8) aVar).f114581z.get());
        g gVar = this.f52739e;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        gVar.b(this);
        super.onCreate(bundle);
        setContentView(v0.activity_sso);
        KeyEvent.Callback findViewById = findViewById(t0.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((GestaltToolbarImpl) ((fo1.a) findViewById)).U(new wq1.a(this, 28));
        if (!getIntent().hasExtra("com.pinterest.EXTRA_SSO_INFO")) {
            setResult(0, new Intent());
            finish();
            return;
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("com.pinterest.EXTRA_SSO_INFO");
        Intrinsics.g(serializableExtra, "null cannot be cast to non-null type com.pinterest.identity.core.model.SSOInfo");
        d0 d0Var = (d0) serializableExtra;
        this.f52738d = d0Var;
        if (d0Var.getExistingUser()) {
            x();
            return;
        }
        w0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.l(t0.fragment_container, new mb2.g(), null);
        aVar2.e(false);
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f52737c == null) {
            this.f52737c = (so1.a) o.a(this, so1.a.class);
        }
    }

    public final void x() {
        e eVar = new e();
        Bundle bundle = new Bundle();
        d0 d0Var = this.f52738d;
        if (d0Var == null) {
            Intrinsics.r("ssoInfo");
            throw null;
        }
        bundle.putSerializable("com.pinterest.EXTRA_SSO_INFO", d0Var);
        eVar.setArguments(bundle);
        w0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(t0.fragment_container, eVar, null);
        aVar.e(false);
    }
}
