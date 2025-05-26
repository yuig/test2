package info.mqtt.android.service;

import a.a;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.appcompat.app.i0;
import ao2.m2;
import ao2.v0;
import dl2.b;
import do2.f2;
import do2.g2;
import gf2.w;
import hf2.h;
import hf2.i;
import hf2.m;
import hf2.r;
import ho2.c;
import ho2.q;
import info.mqtt.android.service.room.MqMessageDatabase;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import ko2.e;
import ko2.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.j;
import mp2.g;
import se.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Linfo/mqtt/android/service/MqttService;", "Landroid/app/Service;", "", "<init>", "()V", "gf2/w", "androidx/appcompat/app/i0", "serviceLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"Registered"})
/* loaded from: classes4.dex */
public final class MqttService extends Service {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f72891j = 0;

    /* renamed from: b, reason: collision with root package name */
    public MqMessageDatabase f72893b;

    /* renamed from: c, reason: collision with root package name */
    public String f72894c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f72895d;

    /* renamed from: e, reason: collision with root package name */
    public i0 f72896e;

    /* renamed from: f, reason: collision with root package name */
    public m f72897f;

    /* renamed from: g, reason: collision with root package name */
    public m2 f72898g;

    /* renamed from: h, reason: collision with root package name */
    public c f72899h;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f72892a = new ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final f2 f72900i = g2.b(0, 0, null, 7);

    public static boolean g(Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }

    public final void a(String clientHandle, String id3) {
        Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
        Intrinsics.checkNotNullParameter(id3, "id");
        MqMessageDatabase f13 = f();
        Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
        Intrinsics.checkNotNullParameter(id3, "id");
        f0 f0Var = new f0();
        f fVar = v0.f20219a;
        j.z(b.b(e.f80326c), null, null, new jf2.e(f0Var, f13, clientHandle, id3, null), 3);
        if (f0Var.f80424a) {
            r rVar = r.OK;
        } else {
            r rVar2 = r.OK;
        }
    }

    public final void b(String clientHandle, r status, Bundle dataBundle) {
        Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Bundle bundle = new Bundle(dataBundle);
        bundle.putString(".clientHandle", clientHandle);
        bundle.putSerializable(".callbackStatus", status);
        c cVar = this.f72899h;
        if (cVar != null) {
            j.z(cVar, null, null, new hf2.j(this, bundle, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final cl2.a c(hf2.b r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof hf2.k
            if (r0 == 0) goto L13
            r0 = r7
            hf2.k r0 = (hf2.k) r0
            int r1 = r0.f69051t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69051t = r1
            goto L18
        L13:
            hf2.k r0 = new hf2.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f69049r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f69051t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            ue.c.H(r7)
            goto L46
        L2f:
            ue.c.H(r7)
            do2.f2 r7 = r5.f72900i
            hn0.b r2 = new hn0.b
            r4 = 2
            r2.<init>(r6, r4)
            r0.f69051t = r3
            r7.getClass()
            cl2.a r6 = do2.f2.j(r7, r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: info.mqtt.android.service.MqttService.c(hf2.b, bl2.c):cl2.a");
    }

    public final String d(String serverURI, String clientId, String contextId, mp2.f fVar) {
        Intrinsics.checkNotNullParameter(serverURI, "serverURI");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(contextId, "contextId");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(serverURI);
        String q13 = a.q(sb3, ":", clientId, ":", contextId);
        ConcurrentHashMap concurrentHashMap = this.f72892a;
        if (!concurrentHashMap.containsKey(q13)) {
            concurrentHashMap.put(q13, new i(this, serverURI, clientId, fVar, q13));
        }
        return q13;
    }

    public final i e(String str) {
        i iVar = (i) this.f72892a.get(str);
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException(a.k("Invalid ClientHandle >", str, "<"));
    }

    public final MqMessageDatabase f() {
        MqMessageDatabase mqMessageDatabase = this.f72893b;
        if (mqMessageDatabase != null) {
            return mqMessageDatabase;
        }
        Intrinsics.r("messageDatabase");
        throw null;
    }

    public final void h(String str, String str2) {
        String str3 = this.f72894c;
        if (str3 == null || !this.f72895d) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(".callbackAction", "trace");
        bundle.putString(".traceSeverity", str);
        bundle.putString(".errorMessage", str2);
        b(str3, r.ERROR, bundle);
    }

    public final void i(String str) {
        h("debug", str);
    }

    public final void j(String str) {
        h("error", str);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.getStringExtra(".activityToken");
        Intrinsics.f(this.f72897f);
        return this.f72897f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        MqMessageDatabase mqMessageDatabase;
        super.onCreate();
        m2 b13 = ue.c.b();
        this.f72898g = b13;
        f fVar = v0.f20219a;
        this.f72899h = b.b(q.f69782a.plus(b13));
        this.f72897f = new m(this);
        w wVar = MqMessageDatabase.f72902m;
        synchronized (wVar) {
            try {
                Intrinsics.checkNotNullParameter(this, "context");
                Intrinsics.checkNotNullParameter("messageMQ", "storageName");
                mqMessageDatabase = MqMessageDatabase.f72903n;
                if (mqMessageDatabase == null) {
                    synchronized (wVar) {
                        mqMessageDatabase = MqMessageDatabase.f72903n;
                        if (mqMessageDatabase == null) {
                            Context applicationContext = getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            Context applicationContext2 = applicationContext.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                            MqMessageDatabase mqMessageDatabase2 = (MqMessageDatabase) l.a(applicationContext2, MqMessageDatabase.class, "messageMQ").b();
                            MqMessageDatabase.f72903n = mqMessageDatabase2;
                            mqMessageDatabase = mqMessageDatabase2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Intrinsics.checkNotNullParameter(mqMessageDatabase, "<set-?>");
        this.f72893b = mqMessageDatabase;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        tq2.a.f119026a.getClass();
        t72.j.l(new Object[0]);
        for (i iVar : this.f72892a.values()) {
            iVar.f69033a.i("disconnect()");
            iVar.f69044l = true;
            Bundle bundle = new Bundle();
            bundle.putString(".activityToken", null);
            bundle.putString(".invocationContext", null);
            bundle.putString(".callbackAction", "disconnect");
            bundle.putString(".errorMessage", "not connected");
            iVar.f69033a.j("disconnect not connected");
            iVar.f69033a.b(iVar.f69037e, r.ERROR, bundle);
            g gVar = iVar.f69042j;
            if (gVar != null && gVar.f87938a) {
                f fVar = v0.f20219a;
                j.z(b.b(e.f80326c), null, null, new h(iVar, null), 3);
            }
            iVar.f();
        }
        m2 m2Var = this.f72898g;
        if (m2Var != null) {
            m2Var.cancel((CancellationException) null);
        }
        this.f72898g = null;
        this.f72899h = null;
        this.f72897f = null;
        i0 i0Var = this.f72896e;
        if (i0Var != null) {
            unregisterReceiver(i0Var);
            this.f72896e = null;
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.app.Service, android.content.Context, info.mqtt.android.service.MqttService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.Parcelable] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        Object obj;
        if (this.f72896e == null) {
            i0 i0Var = new i0(this, 11);
            this.f72896e = i0Var;
            registerReceiver(i0Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        int i15 = Build.VERSION.SDK_INT;
        if (intent != null) {
            if (i15 >= 33) {
                obj = intent.getParcelableExtra("MqttService.FOREGROUND_SERVICE_NOTIFICATION", Notification.class);
            } else {
                ?? parcelableExtra = intent.getParcelableExtra("MqttService.FOREGROUND_SERVICE_NOTIFICATION");
                obj = parcelableExtra instanceof Notification ? parcelableExtra : null;
            }
            r4 = (Notification) obj;
        }
        if (r4 != null) {
            startForeground(intent.getIntExtra("MqttService.FOREGROUND_SERVICE_NOTIFICATION_ID", 1), r4);
        }
        return 1;
    }
}
