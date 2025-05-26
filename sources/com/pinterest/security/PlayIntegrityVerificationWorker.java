package com.pinterest.security;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import i01.r0;
import kb.y;
import kb.z;
import kk2.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uj2.a0;
import uj2.b0;
import x02.e0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/security/PlayIntegrityVerificationWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lr42/g;", "playIntegrityVerificationHandler", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lr42/g;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PlayIntegrityVerificationWorker extends Worker {

    /* renamed from: e, reason: collision with root package name */
    public final r42.g f51736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayIntegrityVerificationWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull r42.g playIntegrityVerificationHandler) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(playIntegrityVerificationHandler, "playIntegrityVerificationHandler");
        this.f51736e = playIntegrityVerificationHandler;
    }

    @Override // androidx.work.Worker
    public final z i() {
        r42.g gVar = this.f51736e;
        b0<b20.a> b13 = ((b20.d) gVar.f106190a.f21278a).b();
        a0 a0Var = tk2.e.f118017c;
        new fk2.c(4, new m(b13.r(a0Var).l(a0Var), new b22.f(14, new b(gVar)), 0), new b22.f(15, new s12.a(gVar, 5))).i(new r0(20), new e0(25, c.f51739i));
        y a13 = z.a();
        Intrinsics.checkNotNullExpressionValue(a13, "success(...)");
        return a13;
    }
}
