package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import nk.a0;

/* loaded from: classes3.dex */
final class bn {

    /* renamed from: a, reason: collision with root package name */
    final nk.c f33472a;

    /* renamed from: b, reason: collision with root package name */
    private final nk.w f33473b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33474c;

    /* renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f33475d;

    /* renamed from: e, reason: collision with root package name */
    private final at f33476e;

    /* renamed from: f, reason: collision with root package name */
    private final k f33477f;

    public bn(Context context, nk.w wVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f33475d = taskCompletionSource;
        this.f33474c = context.getPackageName();
        this.f33473b = wVar;
        this.f33476e = atVar;
        this.f33477f = kVar;
        nk.c cVar = new nk.c(context, wVar, "ExpressIntegrityService", bo.f33478a, new a0() { // from class: com.google.android.play.core.integrity.bd
            @Override // nk.a0
            public final Object a(IBinder iBinder) {
                int i13 = nk.l.f91083g;
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return queryLocalInterface instanceof nk.m ? (nk.m) queryLocalInterface : new nk.k(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService", 3);
            }
        });
        this.f33472a = cVar;
        cVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, String str, long j13, long j14, int i13) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f33474c);
        bundle.putLong("cloud.prj", j13);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j14);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new nk.j(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(tb.f.t(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j13, int i13) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f33474c);
        bundle.putLong("cloud.prj", j13);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new nk.j(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(tb.f.t(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f33475d.getTask().isSuccessful() && ((Integer) bnVar.f33475d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i13 = bundle.getInt("dialog.intent.type");
        this.f33473b.c("requestAndShowDialog(%s)", Integer.valueOf(i13));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f33472a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i13), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j13, long j14, int i13) {
        this.f33473b.c("requestExpressIntegrityToken(%s)", Long.valueOf(j14));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f33472a.c(new bg(this, taskCompletionSource, 0, str, j13, j14, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j13, int i13) {
        this.f33473b.c("warmUpIntegrityToken(%s)", Long.valueOf(j13));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f33472a.c(new bf(this, taskCompletionSource, 0, j13, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
