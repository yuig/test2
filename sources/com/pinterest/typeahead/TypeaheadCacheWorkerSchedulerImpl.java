package com.pinterest.typeahead;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kb.c0;
import kb.e0;
import kb.f0;
import kb.g;
import kb.q;
import kb.u0;
import kb.w0;
import kb0.a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0004\u0010\u0003J\u000f\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/typeahead/TypeaheadCacheWorkerSchedulerImpl;", "", "scheduleClientCacheDownload", "()V", "<init>", "serviceLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TypeaheadCacheWorkerSchedulerImpl {
    public void scheduleClientCacheDownload() {
        Intrinsics.checkNotNullParameter(ClientCacheWorker.class, "workerClass");
        e0 e0Var = (e0) new e0(ClientCacheWorker.class).g(8000L, TimeUnit.MILLISECONDS);
        c0 c0Var = c0.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c0 networkType = c0.CONNECTED;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        f0 f0Var = (f0) ((e0) e0Var.f(new g(new ub.g(null), networkType, false, false, false, false, -1L, -1L, CollectionsKt.J0(linkedHashSet)))).b();
        u0 u0Var = w0.f79048a;
        Context context = a.f79058b;
        u0Var.a(m60.f0.j0()).f("CLIENT_CACHE_DOWNLOAD_WORK", q.REPLACE, f0Var);
    }
}
