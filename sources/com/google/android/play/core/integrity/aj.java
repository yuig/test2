package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import nk.a0;

/* loaded from: classes.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final nk.c f33409a;

    /* renamed from: b, reason: collision with root package name */
    private final nk.w f33410b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33411c;

    /* renamed from: d, reason: collision with root package name */
    private final at f33412d;

    /* renamed from: e, reason: collision with root package name */
    private final k f33413e;

    public aj(Context context, nk.w wVar, at atVar, k kVar) {
        this.f33411c = context.getPackageName();
        this.f33410b = wVar;
        this.f33412d = atVar;
        this.f33413e = kVar;
        nk.w wVar2 = nk.d.f91076a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                if (nk.d.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                    this.f33409a = new nk.c(context, wVar, "IntegrityService", ak.f33414a, new a0() { // from class: com.google.android.play.core.integrity.ae
                        @Override // nk.a0
                        public final Object a(IBinder iBinder) {
                            int i13 = nk.q.f91084g;
                            if (iBinder == null) {
                                return null;
                            }
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                            return queryLocalInterface instanceof nk.r ? (nk.r) queryLocalInterface : new nk.p(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", 3);
                        }
                    });
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        wVar.a("Phonesky is not installed.", new Object[0]);
        this.f33409a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l13, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f33411c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l13 != null) {
            bundle.putLong("cloud.prj", l13.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new nk.j(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(tb.f.t(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f33409a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i13 = bundle.getInt("dialog.intent.type");
        this.f33410b.c("requestAndShowDialog(%s, %s)", this.f33411c, Integer.valueOf(i13));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f33409a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i13), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f33409a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f33410b.c("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f33409a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e13) {
            return Tasks.forException(new IntegrityServiceException(-13, e13));
        }
    }
}
