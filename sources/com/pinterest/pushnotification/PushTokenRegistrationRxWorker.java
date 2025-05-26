package com.pinterest.pushnotification;

import android.content.Context;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import fk2.f0;
import io.reactivex.exceptions.UndeliverableException;
import java.net.SocketTimeoutException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kb.c0;
import kb.e0;
import kb.q;
import kb.u0;
import kb.w;
import kb.w0;
import kb.x;
import kb.z;
import kh2.r;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uj2.b0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/pushnotification/PushTokenRegistrationRxWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lgz1/b;", "goolePlayServices", "Lcom/pinterest/pushnotification/c;", "gcmRegistrar", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgz1/b;Lcom/pinterest/pushnotification/c;)V", "pushNotificationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PushTokenRegistrationRxWorker extends RxWorker {

    /* renamed from: f, reason: collision with root package name */
    public final WorkerParameters f50245f;

    /* renamed from: g, reason: collision with root package name */
    public final gz1.b f50246g;

    /* renamed from: h, reason: collision with root package name */
    public final c f50247h;

    /* renamed from: i, reason: collision with root package name */
    public final long f50248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushTokenRegistrationRxWorker(@NotNull Context appContext, @NotNull WorkerParameters params, @NotNull gz1.b goolePlayServices, @NotNull c gcmRegistrar) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(goolePlayServices, "goolePlayServices");
        Intrinsics.checkNotNullParameter(gcmRegistrar, "gcmRegistrar");
        this.f50245f = params;
        this.f50246g = goolePlayServices;
        this.f50247h = gcmRegistrar;
        this.f50248i = 120000L;
    }

    @Override // androidx.work.RxWorker
    public final b0 i() {
        if (!this.f50246g.c(null, false, 0)) {
            kk2.b j13 = b0.j(new w());
            Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
            return j13;
        }
        int i13 = at1.d.f20439o;
        nl.b.e().c();
        WorkerParameters workerParameters = this.f50245f;
        final String h10 = workerParameters.f19998b.h("FCMToken");
        final boolean b13 = workerParameters.f19998b.b("rescheduled");
        if (h10 != null) {
            return new f0(new kk2.b(new androidx.fragment.app.c(13, this, h10), 0), new ak2.f() { // from class: com.pinterest.pushnotification.j
                @Override // ak2.f
                public final Object apply(Object obj) {
                    Throwable throwable = (Throwable) obj;
                    PushTokenRegistrationRxWorker this$0 = PushTokenRegistrationRxWorker.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    boolean z13 = throwable instanceof UndeliverableException;
                    String str = h10;
                    boolean z14 = b13;
                    if (z13) {
                        String message = throwable.getMessage();
                        r.g("UndeliverableException", message != null ? message : "");
                        return this$0.j(str, z14);
                    }
                    if (throwable instanceof ApolloNetworkException) {
                        String message2 = throwable.getMessage();
                        r.g("ApolloNetworkException", message2 != null ? message2 : "");
                        return this$0.j(str, z14);
                    }
                    if (throwable instanceof SocketTimeoutException) {
                        String message3 = throwable.getMessage();
                        r.g("SocketTimeoutException", message3 != null ? message3 : "");
                        return this$0.j(str, z14);
                    }
                    String message4 = throwable.getMessage();
                    r.g("UnknownException", message4 != null ? message4 : "");
                    return new w();
                }
            }, null, 2);
        }
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Firebase registration id is null - it's likely that the id hasn't been generated yet. Retrying registration.");
        r.g("NullInputData", "Null data in job inputData: [" + workerParameters.f19998b + "]");
        return b0.j(new w());
    }

    public final z j(String str, boolean z13) {
        if (z13) {
            x xVar = new x();
            Intrinsics.checkNotNullExpressionValue(xVar, "retry(...)");
            return xVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullParameter("FCMToken", "key");
        linkedHashMap.put("FCMToken", str);
        Intrinsics.checkNotNullParameter("rescheduled", "key");
        linkedHashMap.put("rescheduled", Boolean.TRUE);
        kb.l lVar = new kb.l(linkedHashMap);
        bk.f.e0(lVar);
        c0 c0Var = c0.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c0 networkType = c0.CONNECTED;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        kb.g gVar = new kb.g(new ub.g(null), networkType, false, false, false, false, -1L, -1L, CollectionsKt.J0(linkedHashSet));
        Intrinsics.checkNotNullParameter(PushTokenRegistrationRxWorker.class, "workerClass");
        kb.f0 f0Var = (kb.f0) ((e0) ((e0) ((e0) ((e0) new e0(PushTokenRegistrationRxWorker.class).e(kb.a.EXPONENTIAL, this.f50248i, TimeUnit.MILLISECONDS)).a("push_token_registration_job")).f(gVar)).h(lVar)).b();
        u0 u0Var = w0.f79048a;
        Context context = kb0.a.f79058b;
        u0Var.a(m60.f0.j0()).f("push_token_registration_job", q.REPLACE, f0Var);
        w wVar = new w();
        Intrinsics.checkNotNullExpressionValue(wVar, "failure(...)");
        return wVar;
    }
}
