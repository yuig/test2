package com.pinterest.service;

import af2.c;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Intent;
import ap.o;
import c5.i0;
import c5.m;
import com.pinterest.activity.task.activity.MainActivity;
import java.util.HashMap;
import so.d9;
import u20.d;
import y42.a;
import ye2.l;

/* loaded from: classes2.dex */
public class DelayedStartupService extends i0 implements c {

    /* renamed from: e, reason: collision with root package name */
    public volatile l f51763e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f51764f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public boolean f51765g = false;

    /* renamed from: h, reason: collision with root package name */
    public d f51766h;

    /* renamed from: i, reason: collision with root package name */
    public o f51767i;

    public static void e(MainActivity mainActivity, String str) {
        Intent intent = new Intent(str, null, mainActivity, DelayedStartupService.class);
        ComponentName componentName = new ComponentName(mainActivity, (Class<?>) DelayedStartupService.class);
        synchronized (i0.f25808c) {
            HashMap hashMap = i0.f25809d;
            m mVar = (m) hashMap.get(componentName);
            if (mVar == null) {
                mVar = new c5.l(mainActivity, componentName);
                hashMap.put(componentName, mVar);
            }
            mVar.a();
            c5.l lVar = (c5.l) mVar;
            lVar.f25818d.enqueue(lVar.f25817c, new JobWorkItem(intent));
        }
    }

    @Override // af2.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final l componentManager() {
        if (this.f51763e == null) {
            synchronized (this.f51764f) {
                try {
                    if (this.f51763e == null) {
                        this.f51763e = new l(this);
                    }
                } finally {
                }
            }
        }
        return this.f51763e;
    }

    @Override // android.app.Service
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void onCreate() {
        if (!this.f51765g) {
            this.f51765g = true;
            d9 d9Var = (d9) ((a) generatedComponent());
            this.f51766h = (d) d9Var.f113387a.Y5.get();
            this.f51767i = (o) d9Var.f113388b.get();
        }
        c();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }
}
