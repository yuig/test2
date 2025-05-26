package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.facebook.login.z;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30761a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30762b;

    /* renamed from: c, reason: collision with root package name */
    public final x92.b f30763c;

    /* renamed from: d, reason: collision with root package name */
    public final b f30764d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.a f30765e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f30766f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30767g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f30768h;

    /* renamed from: i, reason: collision with root package name */
    public final z f30769i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.f f30770j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.app.Activity r9, x92.b r10, com.google.android.gms.common.api.a r11, com.facebook.login.z r12) {
        /*
            r8 = this;
            tb.e r0 = new tb.e
            r1 = 9
            r0.<init>(r1)
            r0.f116963a = r12
            android.os.Looper r12 = r9.getMainLooper()
            java.lang.String r1 = "Looper must not be null."
            com.bumptech.glide.d.u(r12, r1)
            r0.f116964b = r12
            com.google.android.gms.common.api.e r7 = r0.a()
            r2 = r8
            r3 = r9
            r4 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.f.<init>(android.app.Activity, x92.b, com.google.android.gms.common.api.a, com.facebook.login.z):void");
    }

    public final rg.a b() {
        rg.a aVar = new rg.a(1);
        aVar.f107929a = null;
        Set emptySet = Collections.emptySet();
        if (((g1.h) aVar.f107930b) == null) {
            aVar.f107930b = new g1.h();
        }
        ((g1.h) aVar.f107930b).addAll(emptySet);
        Context context = this.f30761a;
        aVar.f107932d = context.getClass().getName();
        aVar.f107931c = context.getPackageName();
        return aVar;
    }

    public final l0 c(Context context, bi.f fVar) {
        return new l0(context, fVar, b().a());
    }

    public final Task d(int i13, r rVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.f fVar = this.f30770j;
        fVar.getClass();
        fVar.j(taskCompletionSource, rVar.f30866c, this);
        i0 i0Var = new i0(new q0(i13, rVar, taskCompletionSource, this.f30769i), fVar.f30814i.get(), this);
        bi.f fVar2 = fVar.f30819n;
        fVar2.sendMessage(fVar2.obtainMessage(4, i0Var));
        return taskCompletionSource.getTask();
    }

    public f(Context context, Activity activity, x92.b bVar, b bVar2, e eVar) {
        com.bumptech.glide.d.u(context, "Null context is not permitted.");
        com.bumptech.glide.d.u(bVar, "Api must not be null.");
        com.bumptech.glide.d.u(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        com.bumptech.glide.d.u(applicationContext, "The provided context did not have an application context.");
        this.f30761a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f30762b = attributionTag;
        this.f30763c = bVar;
        this.f30764d = bVar2;
        this.f30766f = eVar.f30760b;
        com.google.android.gms.common.api.internal.a aVar = new com.google.android.gms.common.api.internal.a(bVar, bVar2, attributionTag);
        this.f30765e = aVar;
        this.f30768h = new c0(this);
        com.google.android.gms.common.api.internal.f l13 = com.google.android.gms.common.api.internal.f.l(applicationContext);
        this.f30770j = l13;
        this.f30767g = l13.f30813h.getAndIncrement();
        this.f30769i = eVar.f30759a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.i fragment = LifecycleCallback.getFragment(activity);
            u uVar = (u) fragment.L0(u.class, "ConnectionlessLifecycleHelper");
            if (uVar == null) {
                Object obj = ih.c.f72256c;
                uVar = new u(fragment, l13);
            }
            uVar.f30881e.add(aVar);
            l13.b(uVar);
        }
        bi.f fVar = l13.f30819n;
        fVar.sendMessage(fVar.obtainMessage(7, this));
    }
}
