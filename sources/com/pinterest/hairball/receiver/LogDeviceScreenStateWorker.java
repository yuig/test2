package com.pinterest.hairball.receiver;

import android.content.Context;
import android.os.Build;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import com.pinterest.pushnotification.d;
import jp1.a;
import kb.z;
import kk2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oc.c;
import org.jetbrains.annotations.NotNull;
import tk2.e;
import uj2.b0;
import x40.se;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/hairball/receiver/LogDeviceScreenStateWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Loc/c;", "apolloClient", "Lcom/pinterest/pushnotification/d;", "gcmRegistrationPreferences", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Loc/c;Lcom/pinterest/pushnotification/d;)V", "org/chromium/net/y", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LogDeviceScreenStateWorker extends RxWorker {

    /* renamed from: f, reason: collision with root package name */
    public final c f49724f;

    /* renamed from: g, reason: collision with root package name */
    public final d f49725g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogDeviceScreenStateWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull c apolloClient, @NotNull d gcmRegistrationPreferences) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(gcmRegistrationPreferences, "gcmRegistrationPreferences");
        this.f49724f = apolloClient;
        this.f49725g = gcmRegistrationPreferences;
    }

    @Override // androidx.work.RxWorker
    public final b0 i() {
        String h10 = this.f78963b.f19998b.h("intent_action");
        if (h10 == null) {
            h10 = "";
        }
        com.bumptech.glide.d.u0(this.f49724f.a(new se(h10, ((b20.c) this.f49725g).n(), String.valueOf(Build.VERSION.SDK_INT)))).r(e.f118017c).o(new dl1.c(27, a.f77283j), new dl1.c(28, a.f77284k));
        b j13 = b0.j(z.a());
        Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
        return j13;
    }
}
