package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final nk.g f33433a;

    /* renamed from: b, reason: collision with root package name */
    private final nk.g f33434b;

    public at(nk.g gVar, nk.g gVar2) {
        this.f33433a = gVar;
        this.f33434b = gVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, nk.c cVar) {
        Object a13 = this.f33433a.a();
        a13.getClass();
        k kVar = (k) this.f33434b.a();
        kVar.getClass();
        activity.getClass();
        cVar.getClass();
        return new as((Context) a13, kVar, activity, taskCompletionSource, cVar);
    }
}
