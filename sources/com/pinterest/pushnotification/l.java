package com.pinterest.pushnotification;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import dl1.b0;
import hk1.t;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kb.c0;
import kb.e0;
import kb.f0;
import kb.q;
import kb.u0;
import kb.w0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.v2;
import lh0.z3;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final v2 f50293a;

    public l(v2 pushNotificationLibraryExperiments) {
        Intrinsics.checkNotNullParameter(pushNotificationLibraryExperiments, "pushNotificationLibraryExperiments");
        this.f50293a = pushNotificationLibraryExperiments;
    }

    public static void a(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullParameter("FCMToken", "key");
        linkedHashMap.put("FCMToken", str);
        kb.l lVar = new kb.l(linkedHashMap);
        bk.f.e0(lVar);
        c0 c0Var = c0.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c0 networkType = c0.CONNECTED;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        kb.g gVar = new kb.g(new ub.g(null), networkType, false, false, false, false, -1L, -1L, CollectionsKt.J0(linkedHashSet));
        Intrinsics.checkNotNullParameter(PushTokenRegistrationRxWorker.class, "workerClass");
        f0 f0Var = (f0) ((e0) ((e0) ((e0) ((e0) new e0(PushTokenRegistrationRxWorker.class).a("push_token_registration_job")).f(gVar)).h(lVar)).e(kb.a.EXPONENTIAL, 30000L, TimeUnit.MILLISECONDS)).b();
        u0 u0Var = w0.f79048a;
        Context context = kb0.a.f79058b;
        u0Var.a(m60.f0.j0()).f("push_token_registration_job", q.KEEP, f0Var);
    }

    public final void b(String str) {
        if (str != null) {
            a(str);
            return;
        }
        int i13 = at1.d.f20439o;
        nl.b.e().c();
        FirebaseMessaging c13 = FirebaseMessaging.c();
        c13.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c13.f33735f.execute(new e5.k(23, c13, taskCompletionSource));
        taskCompletionSource.getTask().addOnSuccessListener(new b0(2, new t(this, 27))).addOnFailureListener(new fl.q(24));
        z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        v2 v2Var = this.f50293a;
        v2Var.getClass();
        Intrinsics.checkNotNullParameter("enabled_employees", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        if (((g1) v2Var.f83492a).k("firebase_admin_for_android_push_delivery_2", "enabled_employees", activate)) {
            FirebaseMessaging.c().getClass();
            FirebaseMessaging.f();
        }
    }
}
