package com.bugsnag.android;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final File f29453a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f29454b;

    /* renamed from: c, reason: collision with root package name */
    public final File f29455c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f29456d;

    /* renamed from: e, reason: collision with root package name */
    public final id.c f29457e;

    /* renamed from: f, reason: collision with root package name */
    public final u1 f29458f;

    /* renamed from: g, reason: collision with root package name */
    public o0 f29459g;

    /* renamed from: h, reason: collision with root package name */
    public o0 f29460h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f29461i;

    /* renamed from: j, reason: collision with root package name */
    public q0 f29462j;

    public r0(Context context, id.d dVar, hd.h hVar, u1 u1Var) {
        File file = new File(context.getFilesDir(), "device-id");
        p0 p0Var = p0.f29402j;
        File file2 = new File(context.getFilesDir(), "internal-device-id");
        p0 p0Var2 = p0.f29403k;
        this.f29453a = file;
        this.f29454b = p0Var;
        this.f29455c = file2;
        this.f29456d = p0Var2;
        this.f29457e = dVar;
        this.f29458f = u1Var;
        this.f29461i = hVar.A;
    }

    public final q0 a() {
        String a13;
        q0 q0Var = this.f29462j;
        if (q0Var != null) {
            return q0Var;
        }
        File file = this.f29453a;
        Function0 function0 = this.f29454b;
        u1 u1Var = this.f29458f;
        this.f29459g = new o0(file, function0, u1Var);
        this.f29460h = new o0(this.f29455c, this.f29456d, u1Var);
        String str = null;
        boolean z13 = this.f29461i;
        if (z13) {
            o0 o0Var = this.f29459g;
            if (o0Var == null) {
                Intrinsics.r("persistence");
                throw null;
            }
            a13 = o0Var.a(false);
            if (a13 == null && (a13 = ((q2) this.f29457e.get()).a(false)) == null) {
                o0 o0Var2 = this.f29459g;
                if (o0Var2 == null) {
                    Intrinsics.r("persistence");
                    throw null;
                }
                a13 = o0Var2.a(true);
            }
        } else {
            a13 = null;
        }
        if (z13) {
            o0 o0Var3 = this.f29460h;
            if (o0Var3 == null) {
                Intrinsics.r("internalPersistence");
                throw null;
            }
            str = o0Var3.a(true);
        }
        if (a13 != null || str != null) {
            this.f29462j = new q0(a13, str);
        }
        return this.f29462j;
    }
}
