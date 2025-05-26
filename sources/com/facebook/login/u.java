package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f30043a;

    public u(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f30043a = activity;
    }

    @Override // com.facebook.login.k0
    public final Activity a() {
        return this.f30043a;
    }

    @Override // com.facebook.login.k0
    public final void startActivityForResult(Intent intent, int i13) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f30043a.startActivityForResult(intent, i13);
    }
}
