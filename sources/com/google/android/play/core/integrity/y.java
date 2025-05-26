package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f33517b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33518c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33520e;

    /* renamed from: a, reason: collision with root package name */
    private final nk.w f33516a = new nk.w("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f33519d = new Object();

    public y(String str, long j13) {
        this.f33517b = str;
        this.f33518c = j13;
    }

    public final Task a(Activity activity, int i13) {
        synchronized (this.f33519d) {
            try {
                if (this.f33520e) {
                    return Tasks.forResult(0);
                }
                this.f33520e = true;
                nk.w wVar = this.f33516a;
                Object[] objArr = {Integer.valueOf(i13)};
                wVar.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", nk.w.e(wVar.f91085a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i13);
                bundle.putString("package.name", this.f33517b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f33518c);
                return b(activity, bundle);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
