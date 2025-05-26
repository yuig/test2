package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class c0 extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33765b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final rd.j f33766a;

    public c0(rd.j jVar) {
        this.f33766a = jVar;
    }

    public final void a(d0 d0Var) {
        Task b13;
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        b13 = ((g) this.f33766a.f107506b).b(d0Var.f33769a);
        b13.addOnCompleteListener(new o.a(10), new a0(d0Var, 1));
    }
}
