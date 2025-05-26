package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final Feature[] f30864a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30865b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30866c;

    public r(Feature[] featureArr, boolean z13, int i13) {
        this.f30864a = featureArr;
        boolean z14 = false;
        if (featureArr != null && z13) {
            z14 = true;
        }
        this.f30865b = z14;
        this.f30866c = i13;
    }

    public static q a() {
        q qVar = new q();
        qVar.f30858b = true;
        qVar.f30857a = 0;
        return qVar;
    }

    public abstract void b(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource);
}
