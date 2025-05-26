package com.pinterest.engage;

import android.content.Context;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import b60.b;
import com.google.firebase.messaging.a0;
import fk2.f0;
import i2.i;
import kk2.m;
import kk2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oc.c;
import org.jetbrains.annotations.NotNull;
import rd.j;
import tk2.e;
import uj2.b0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/engage/GoogleEngageWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Loc/c;", "unAuthApolloClient", "apolloClient", "Lb60/b;", "activeUserManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Loc/c;Loc/c;Lb60/b;)V", "engage_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GoogleEngageWorker extends RxWorker {

    /* renamed from: f, reason: collision with root package name */
    public final Context f45038f;

    /* renamed from: g, reason: collision with root package name */
    public final c f45039g;

    /* renamed from: h, reason: collision with root package name */
    public final c f45040h;

    /* renamed from: i, reason: collision with root package name */
    public final b f45041i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleEngageWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull c unAuthApolloClient, @NotNull c apolloClient, @NotNull b activeUserManager) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(unAuthApolloClient, "unAuthApolloClient");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f45038f = context;
        this.f45039g = unAuthApolloClient;
        this.f45040h = apolloClient;
        this.f45041i = activeUserManager;
    }

    @Override // androidx.work.RxWorker
    public final b0 i() {
        j jVar = new j(this.f45038f);
        kk2.b bVar = new kk2.b(new a0(jVar, 16), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        t r13 = new f0(new m(bVar, new ir.j(13, new i(16, this, jVar)), 0), new a0(this, 1), null, 2).r(e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        return r13;
    }
}
