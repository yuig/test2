package com.pinterest.experiment;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c60.d;
import dh0.a;
import kb.w;
import kb.y;
import kb.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.f1;
import lh0.g1;
import oh0.g;
import org.jetbrains.annotations.NotNull;
import tb0.h;
import tb0.k;
import tk2.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/experiment/ExperimentsRefreshWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Llh0/g1;", "experimentsManager", "Ltb0/h;", "crashReporting", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Llh0/g1;Ltb0/h;)V", "experimentsManager_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ExperimentsRefreshWorker extends Worker {

    /* renamed from: e, reason: collision with root package name */
    public final g1 f45053e;

    /* renamed from: f, reason: collision with root package name */
    public final h f45054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsRefreshWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull g1 experimentsManager, @NotNull h crashReporting) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(experimentsManager, "experimentsManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f45053e = experimentsManager;
        this.f45054f = crashReporting;
    }

    @Override // androidx.work.Worker
    public final z i() {
        boolean b13 = this.f78963b.f19998b.b("shouldLog");
        h hVar = this.f45054f;
        hVar.h("Fetching Experiments in background");
        try {
            g1 g1Var = this.f45053e;
            g i13 = g1Var.i();
            i13.getClass();
            (d.b() ? i13.f94470a : i13.f94471b).b().r(e.f118017c).o(new a(8, new f1(g1Var, b13)), new a(9, new f1(b13, g1Var)));
            y a13 = z.a();
            Intrinsics.checkNotNullExpressionValue(a13, "success(...)");
            return a13;
        } catch (Exception throwable) {
            k kVar = new k();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            kVar.a(null, null, throwable);
            hVar.k("ExperimentsBgFetchFailed", kVar.f117102a);
            hVar.h("Failed to refresh experiments in the background. " + throwable.getMessage());
            w wVar = new w();
            Intrinsics.checkNotNullExpressionValue(wVar, "failure(...)");
            return wVar;
        }
    }
}
