package com.pinterest.engage;

import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kb.c0;
import kb.e0;
import kb.f0;
import kb.g;
import kb.q;
import kb.u0;
import kb.w0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ly1.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/engage/GoogleEngageBroadcastReceiver;", "Lly1/a;", "<init>", "()V", "engage_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GoogleEngageBroadcastReceiver extends a {
    @Override // ly1.a, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        c0 c0Var = c0.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c0 networkType = c0.CONNECTED;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        g gVar = new g(new ub.g(null), networkType, false, false, false, false, -1L, -1L, CollectionsKt.J0(linkedHashSet));
        Intrinsics.checkNotNullParameter(GoogleEngageWorker.class, "workerClass");
        f0 f0Var = (f0) ((e0) ((e0) ((e0) new e0(GoogleEngageWorker.class).a("google_engage_one_time_publish_job")).f(gVar)).e(kb.a.EXPONENTIAL, 30000L, TimeUnit.MILLISECONDS)).b();
        u0 u0Var = w0.f79048a;
        Context context2 = kb0.a.f79058b;
        u0Var.a(m60.f0.j0()).f("google_engage_one_time_publish_job", q.KEEP, f0Var);
    }
}
