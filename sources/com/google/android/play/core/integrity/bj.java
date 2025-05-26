package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
final class bj extends y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f33465a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j13) {
        super(str, j13);
        this.f33465a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        long j13;
        j13 = this.f33465a.f33468e;
        bundle.putLong("cloud.prj", j13);
        return this.f33465a.f33466c.c(activity, bundle);
    }
}
