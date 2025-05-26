package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class f1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f31383e = null;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f31384f = null;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f31385g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f31386h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1 f31387i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(d1 d1Var, Context context, Bundle bundle) {
        super(d1Var, true);
        this.f31387i = d1Var;
        this.f31385g = context;
        this.f31386h = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        boolean z13;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        try {
            d1 d1Var = this.f31387i;
            String str6 = this.f31383e;
            String str7 = this.f31384f;
            d1Var.getClass();
            if (str7 != null && str6 != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, d1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    z13 = true;
                }
            }
            z13 = false;
            t0 t0Var = null;
            if (z13) {
                String str8 = this.f31384f;
                String str9 = this.f31383e;
                str5 = this.f31387i.f31349a;
                str3 = str8;
                str2 = str9;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            com.bumptech.glide.d.t(this.f31385g);
            d1 d1Var2 = this.f31387i;
            Context context = this.f31385g;
            d1Var2.getClass();
            try {
                t0Var = s0.asInterface(sh.d.c(context, sh.d.f112892c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule$LoadingException e13) {
                d1Var2.d(e13, true, false);
            }
            d1Var2.f31355g = t0Var;
            if (this.f31387i.f31355g == null) {
                str4 = this.f31387i.f31349a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a13 = sh.d.a(this.f31385g, ModuleDescriptor.MODULE_ID);
            zzdd zzddVar = new zzdd(82001L, Math.max(a13, r0), sh.d.d(this.f31385g, ModuleDescriptor.MODULE_ID, false) < a13, str, str2, str3, this.f31386h, tb.e.n(this.f31385g));
            t0 t0Var2 = this.f31387i.f31355g;
            com.bumptech.glide.d.t(t0Var2);
            t0Var2.initialize(new rh.b(this.f31385g), zzddVar, this.f31292a);
        } catch (Exception e14) {
            this.f31387i.d(e14, true, false);
        }
    }
}
