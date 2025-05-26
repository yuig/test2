package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes3.dex */
final class as extends nk.u {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f33427a;

    /* renamed from: b, reason: collision with root package name */
    final nk.c f33428b;

    /* renamed from: c, reason: collision with root package name */
    private final nk.w f33429c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33430d;

    /* renamed from: e, reason: collision with root package name */
    private final k f33431e;

    /* renamed from: f, reason: collision with root package name */
    private final Activity f33432f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, nk.c cVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.f33429c = new nk.w("RequestDialogCallbackImpl");
        this.f33430d = context.getPackageName();
        this.f33431e = kVar;
        this.f33427a = taskCompletionSource;
        this.f33432f = activity;
        this.f33428b = cVar;
    }

    @Override // nk.v
    public final void b(Bundle bundle) {
        this.f33428b.d(this.f33427a);
        this.f33429c.c("onRequestDialog(%s)", this.f33430d);
        ApiException a13 = this.f33431e.a(bundle);
        if (a13 != null) {
            this.f33427a.trySetException(a13);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f33429c.a("onRequestDialog(%s): got null dialog intent", this.f33430d);
            this.f33427a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f33432f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f33428b.a()));
        nk.w wVar = this.f33429c;
        Object[] objArr = new Object[0];
        wVar.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", nk.w.e(wVar.f91085a, "Starting dialog intent...", objArr));
        }
        this.f33432f.startActivityForResult(intent, 0);
    }
}
