package hh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import oi.u5;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69102a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f69103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f69104c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f69105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f69106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f69107f;

    public /* synthetic */ d(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z13, BroadcastReceiver.PendingResult pendingResult) {
        this.f69104c = firebaseInstanceIdReceiver;
        this.f69105d = intent;
        this.f69106e = context;
        this.f69103b = z13;
        this.f69107f = pendingResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce A[Catch: RuntimeException -> 0x0074, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0074, blocks: (B:5:0x0023, B:11:0x00ce, B:13:0x00f9, B:16:0x0106, B:18:0x010c, B:19:0x0123, B:20:0x012e, B:25:0x0136, B:29:0x0155, B:31:0x0169, B:33:0x015d, B:34:0x016d, B:36:0x0173, B:38:0x0179, B:40:0x017f, B:42:0x0185, B:44:0x018d, B:46:0x0195, B:48:0x019b, B:51:0x019f, B:54:0x0063, B:57:0x006b, B:60:0x0077, B:62:0x007d, B:64:0x0083, B:66:0x0089, B:68:0x0091, B:70:0x0099, B:73:0x00a3, B:75:0x00ab, B:76:0x00b5, B:78:0x00c3), top: B:4:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0136 A[Catch: RuntimeException -> 0x0074, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0074, blocks: (B:5:0x0023, B:11:0x00ce, B:13:0x00f9, B:16:0x0106, B:18:0x010c, B:19:0x0123, B:20:0x012e, B:25:0x0136, B:29:0x0155, B:31:0x0169, B:33:0x015d, B:34:0x016d, B:36:0x0173, B:38:0x0179, B:40:0x017f, B:42:0x0185, B:44:0x018d, B:46:0x0195, B:48:0x019b, B:51:0x019f, B:54:0x0063, B:57:0x006b, B:60:0x0077, B:62:0x007d, B:64:0x0083, B:66:0x0089, B:68:0x0091, B:70:0x0099, B:73:0x00a3, B:75:0x00ab, B:76:0x00b5, B:78:0x00c3), top: B:4:0x0023 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hh.d.run():void");
    }

    public d(AppMeasurementDynamiteService appMeasurementDynamiteService, u0 u0Var, String str, String str2, boolean z13) {
        this.f69107f = appMeasurementDynamiteService;
        this.f69104c = u0Var;
        this.f69105d = str;
        this.f69106e = str2;
        this.f69103b = z13;
    }

    public d(u5 u5Var, boolean z13, Uri uri, String str, String str2) {
        this.f69107f = u5Var;
        this.f69103b = z13;
        this.f69104c = uri;
        this.f69105d = str;
        this.f69106e = str2;
    }
}
