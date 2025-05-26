package com.pinterest.activity.create;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import e02.b;
import e02.c;
import g92.g;
import h32.d4;
import l11.j;
import m60.u;
import me.o;
import nl1.d;
import np.k;
import np.t;
import so1.a;

/* loaded from: classes.dex */
public class RepinActivity extends k {

    /* renamed from: b, reason: collision with root package name */
    public j f34931b;

    /* renamed from: c, reason: collision with root package name */
    public a f34932c;

    /* renamed from: d, reason: collision with root package name */
    public wk2.a f34933d;

    /* renamed from: e, reason: collision with root package name */
    public g f34934e;

    /* renamed from: f, reason: collision with root package name */
    public final t f34935f = new t(this);

    @Override // cp1.p, cp1.a
    /* renamed from: getActiveFragment */
    public final d getF34938d() {
        return this.f34931b;
    }

    @Override // cp1.p, uo1.a
    public final a getBaseActivityComponent() {
        return this.f34932c;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return getSupportFragmentManager().E(b.fragment_wrapper);
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF53238r0() {
        return d4.PIN_CREATE_REPIN;
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (this.f34931b == fragment || !(fragment instanceof j)) {
            return;
        }
        this.f34931b = (j) fragment;
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        inject();
        this.f34934e.b(this);
        super.onCreate(bundle);
        setContentView(c.activity_create_repin);
        if (bundle == null) {
            ensureResources(1);
        }
        u.f85943a.h(this.f34935f);
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        u.f85943a.j(this.f34935f);
        super.onDestroy();
    }

    @Override // cp1.p, at1.h
    public final void onResourcesReady(int i13) {
        w0 supportFragmentManager = getSupportFragmentManager();
        int i14 = b.fragment_wrapper;
        this.f34931b = (j) this.f34933d.get();
        NavigationImpl w13 = Navigation.w1(m3.b());
        w13.m0("com.pinterest.EXTRA_PIN_ID", getIntent().getStringExtra("com.pinterest.EXTRA_PIN_ID"));
        this.f34931b.R7(w13);
        mo1.c.b(supportFragmentManager, i14, this.f34931b, false, mo1.a.NONE, "");
        mo1.c.d(this, Integer.valueOf(b.fragment_wrapper));
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f34932c == null) {
            this.f34932c = (a) o.a(this, a.class);
        }
    }
}
