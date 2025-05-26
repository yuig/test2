package androidx.appcompat.app;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.Profile;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.internal.measurement.ia;
import com.google.firebase.messaging.FirebaseMessaging;
import h32.f1;
import info.mqtt.android.service.MqttService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oi.o4;
import oi.u4;
import oi.y3;

/* loaded from: classes2.dex */
public final class i0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16052a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16053b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(c8.d dVar) {
        this(dVar, 2);
        this.f16052a = 2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((com.google.firebase.messaging.t) this.f16053b).f33814c.f33731b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String a13;
        i91.h hVar;
        String str;
        f1 f1Var;
        switch (this.f16052a) {
            case 0:
                ((j0) this.f16053b).u();
                return;
            case 1:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f16053b);
                throw null;
            case 2:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                ((c8.d) this.f16053b).a();
                return;
            case 3:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f16053b);
                throw null;
            case 4:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (Intrinsics.d("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
                    int i13 = le.h.f83049d;
                    le.v vVar = le.v.f83104a;
                    LoginButton loginButton = ((mf.b) ((le.h) this.f16053b)).f87066e;
                    loginButton.n();
                    loginButton.l();
                    return;
                }
                return;
            case 5:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                ((CustomTabActivity) this.f16053b).finish();
                return;
            case 6:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intent intent2 = new Intent((CustomTabMainActivity) this.f16053b, (Class<?>) CustomTabMainActivity.class);
                intent2.setAction(CustomTabMainActivity.f29894h);
                String str2 = CustomTabMainActivity.f29892f;
                intent2.putExtra(str2, intent.getStringExtra(str2));
                intent2.addFlags(603979776);
                ((CustomTabMainActivity) this.f16053b).startActivity(intent2);
                return;
            case 7:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (Intrinsics.d("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED", intent.getAction())) {
                    ((le.k0) this.f16053b).a((Profile) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE"));
                    return;
                }
                return;
            case 8:
                if (intent == null) {
                    y3 y3Var = ((u4) this.f16053b).f95205i;
                    u4.d(y3Var);
                    y3Var.f95271i.c("App receiver called with null intent");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    y3 y3Var2 = ((u4) this.f16053b).f95205i;
                    u4.d(y3Var2);
                    y3Var2.f95271i.c("App receiver called with null action");
                    return;
                }
                if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    y3 y3Var3 = ((u4) this.f16053b).f95205i;
                    u4.d(y3Var3);
                    y3Var3.f95271i.c("App receiver called with unknown action");
                    return;
                }
                u4 u4Var = (u4) this.f16053b;
                ia.a();
                if (u4Var.f95203g.x(null, oi.s.D0)) {
                    y3 y3Var4 = u4Var.f95205i;
                    u4.d(y3Var4);
                    y3Var4.f95276n.c("App receiver notified triggers are available");
                    o4 o4Var = u4Var.f95206j;
                    u4.d(o4Var);
                    o4Var.y(new z(u4Var, 26));
                    return;
                }
                return;
            case 9:
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f16053b;
                if (tVar != null && tVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) this.f16053b;
                    tVar2.f33814c.getClass();
                    FirebaseMessaging.b(tVar2, 0L);
                    ((com.google.firebase.messaging.t) this.f16053b).f33814c.f33731b.unregisterReceiver(this);
                    this.f16053b = null;
                    return;
                }
                return;
            case 10:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (((i91.n) this.f16053b).f71877g == null || !Intrinsics.d("android.intent.action.DOWNLOAD_COMPLETE", intent.getAction())) {
                    return;
                }
                i91.n nVar = (i91.n) this.f16053b;
                i91.h hVar2 = nVar.f71877g;
                if (hVar2 != null) {
                    int i14 = i91.i.f71839a[hVar2.f71835b.ordinal()];
                    if (i14 == 1) {
                        f1Var = f1.SHARE_SHEET_DOWNLOAD_EXPORT_SUCCESS;
                    } else if (i14 == 2) {
                        f1Var = f1.SHARE_SHEET_IG_STORIES_EXPORT_SUCCESS;
                    } else {
                        if (i14 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f1Var = f1.SHARE_SHEET_FB_STORIES_EXPORT_SUCCESS;
                    }
                    nx.d0.v(nVar.f71878h, f1Var, hVar2.f71834a, false, 12);
                }
                i91.h hVar3 = nVar.f71877g;
                i91.o oVar = hVar3 != null ? hVar3.f71835b : null;
                int i15 = oVar == null ? -1 : i91.i.f71839a[oVar.ordinal()];
                if (i15 == 1) {
                    i91.h hVar4 = nVar.f71877g;
                    if (hVar4 != null && (a13 = hVar4.a()) != null && (hVar = nVar.f71877g) != null && (str = hVar.f71834a) != null) {
                        nVar.f71871a.c(new lr.b(str, a13, 1));
                    }
                } else if (i15 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("source_application", context.getString(m60.x0.facebook_app_id));
                    nVar.i(context, "com.instagram.android", bundle);
                } else if (i15 == 3) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("com.facebook.platform.extra.APPLICATION_ID", context.getString(m60.x0.facebook_app_id));
                    nVar.i(context, "com.facebook.katana", bundle2);
                }
                nVar.d(context, false);
                return;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                ((MqttService) this.f16053b).i("Internal network status receive.");
                Object systemService = ((MqttService) this.f16053b).getSystemService("power");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "MQTT:tag");
                newWakeLock.acquire(600000L);
                ((MqttService) this.f16053b).i("Reconnect for Network recovery.");
                ((MqttService) this.f16053b).getClass();
                if (MqttService.g(context)) {
                    ((MqttService) this.f16053b).i("Online,reconnect.");
                    MqttService mqttService = (MqttService) this.f16053b;
                    mqttService.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    mqttService.i("Reconnect to server, client size=" + mqttService.f72892a.size());
                    for (hf2.i iVar : mqttService.f72892a.values()) {
                        mqttService.i("Reconnect Client:" + iVar.f69035c + "/" + iVar.f69034b);
                        if (MqttService.g(context)) {
                            synchronized (iVar) {
                                Intrinsics.checkNotNullParameter(context, "context");
                                iVar.f69033a.j("Reconnect myClient = null. Will not do reconnect");
                            }
                        }
                    }
                } else {
                    for (hf2.i iVar2 : ((MqttService) this.f16053b).f72892a.values()) {
                        if (!iVar2.f69044l && !iVar2.f69045m) {
                            iVar2.a(new Exception("Android offline"));
                        }
                    }
                }
                newWakeLock.release();
                return;
        }
    }

    public /* synthetic */ i0(Object obj, int i13) {
        this.f16052a = i13;
        this.f16053b = obj;
    }

    public /* synthetic */ i0(Object obj, int i13, int i14) {
        this.f16052a = i13;
        this.f16053b = obj;
    }

    public i0(le.k0 this$0) {
        this.f16052a = 7;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f16053b = this$0;
    }

    public i0(mf.b this$0) {
        this.f16052a = 4;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f16053b = this$0;
    }
}
