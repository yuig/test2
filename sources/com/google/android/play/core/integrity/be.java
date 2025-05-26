package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class be extends nk.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f33448a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f33449b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f33449b = bnVar;
        this.f33448a = context;
    }

    @Override // nk.x
    public final void b() {
        TaskCompletionSource taskCompletionSource;
        int i13;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Context context = this.f33448a;
        taskCompletionSource = this.f33449b.f33475d;
        nk.w wVar = nk.d.f91076a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            applicationInfo = packageInfo.applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo != null && applicationInfo.enabled && nk.d.a(packageInfo.signatures)) {
            i13 = packageInfo.versionCode;
            taskCompletionSource.trySetResult(Integer.valueOf(i13));
        }
        i13 = 0;
        taskCompletionSource.trySetResult(Integer.valueOf(i13));
    }
}
