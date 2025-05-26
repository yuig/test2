package hf2;

import android.os.Bundle;
import android.util.Log;
import ao2.v0;
import info.mqtt.android.service.MqttService;
import info.mqtt.android.service.ParcelableMqttMessage;
import info.mqtt.android.service.ping.PingWorker;
import info.mqtt.android.service.room.MqMessageDatabase;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kb.e0;
import kb.f0;
import kotlin.jvm.internal.Intrinsics;
import org.eclipse.paho.client.mqttv3.MqttException;

/* loaded from: classes4.dex */
public final class i implements mp2.e {

    /* renamed from: a, reason: collision with root package name */
    public final MqttService f69033a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69034b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69035c;

    /* renamed from: d, reason: collision with root package name */
    public mp2.f f69036d;

    /* renamed from: e, reason: collision with root package name */
    public final String f69037e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f69038f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f69039g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f69040h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f69041i;

    /* renamed from: j, reason: collision with root package name */
    public mp2.g f69042j;

    /* renamed from: k, reason: collision with root package name */
    public if2.a f69043k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f69044l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f69045m;

    public i(MqttService service, String serverURI, String clientId, mp2.f fVar, String clientHandle) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(serverURI, "serverURI");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
        this.f69033a = service;
        this.f69034b = serverURI;
        this.f69035c = clientId;
        this.f69036d = fVar;
        this.f69037e = clientHandle;
        this.f69038f = new HashMap();
        this.f69039g = new HashMap();
        this.f69040h = new HashMap();
        this.f69041i = new HashMap();
        String simpleName = i.class.getSimpleName();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(simpleName);
        sb3.append(" ");
        sb3.append(clientId);
        sb3.append(" on host ");
        sb3.append(serverURI);
        this.f69044l = true;
        this.f69045m = true;
    }

    public static Bundle e(String str, String str2, mp2.i original) {
        Bundle bundle = new Bundle();
        bundle.putString("messageId", str);
        bundle.putString("destinationName", str2);
        Intrinsics.checkNotNullParameter(original, "original");
        ParcelableMqttMessage parcelableMqttMessage = new ParcelableMqttMessage(original.f87941a);
        int i13 = original.f87942b;
        if (i13 < 0 || i13 > 2) {
            throw new IllegalArgumentException();
        }
        parcelableMqttMessage.f87942b = i13;
        parcelableMqttMessage.f87943c = original.f87943c;
        parcelableMqttMessage.f87944d = original.f87944d;
        bundle.putParcelable(".PARCEL", parcelableMqttMessage);
        return bundle;
    }

    @Override // mp2.e
    public final void a(Exception exc) {
        mp2.g gVar;
        if (exc != null) {
            this.f69033a.i("connectionLost(" + exc.getMessage() + ")");
        } else {
            this.f69033a.i("connectionLost(NO_REASON)");
        }
        this.f69044l = true;
        try {
            gVar = this.f69042j;
            Intrinsics.f(gVar);
        } catch (Exception unused) {
        }
        if (!gVar.f87940c) {
            Intrinsics.f(null);
            throw null;
        }
        if2.a aVar = this.f69043k;
        Intrinsics.f(aVar);
        t72.j jVar = tq2.a.f119026a;
        System.currentTimeMillis();
        jVar.getClass();
        t72.j.g(new Object[0]);
        kb.q qVar = kb.q.REPLACE;
        Intrinsics.checkNotNullParameter(PingWorker.class, "workerClass");
        aVar.f72237a.f("PING_JOB", qVar, (f0) ((e0) new e0(PingWorker.class).g(100L, TimeUnit.MILLISECONDS)).b());
        Bundle a13 = n60.o.a(".callbackAction", "onConnectionLost");
        if (exc != null) {
            a13.putString(".errorMessage", exc.getMessage());
            if (exc instanceof MqttException) {
                a13.putSerializable(".exception", exc);
            }
            a13.putString(".exceptionStack", Log.getStackTraceString(exc));
        }
        this.f69033a.b(this.f69037e, r.OK, a13);
        f();
    }

    @Override // mp2.e
    public final void b(String topic, ParcelableMqttMessage message) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(message, "message");
        MqttService mqttService = this.f69033a;
        mqttService.i("messageArrived(" + topic + ",{" + message + "})");
        MqMessageDatabase f13 = mqttService.f();
        String clientHandle = this.f69037e;
        Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(message, "message");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        mp2.i iVar = new mp2.i(message.f87941a);
        p pVar = q.Companion;
        int i13 = message.f87942b;
        pVar.getClass();
        kf2.a aVar = new kf2.a(uuid, clientHandle, topic, iVar, (q) q.getEntries().get(i13), message.f87943c, message.f87944d, System.currentTimeMillis());
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(dl2.b.b(ko2.e.f80326c), null, null, new jf2.f(f13, aVar, null), 3);
        Bundle e13 = e(uuid, topic, message);
        e13.putString(".callbackAction", "messageArrived");
        e13.putString("messageId", uuid);
        mqttService.b(this.f69037e, r.OK, e13);
    }

    @Override // mp2.e
    public final void c(String serverURI, boolean z13) {
        Intrinsics.checkNotNullParameter(serverURI, "serverURI");
        Bundle bundle = new Bundle();
        bundle.putString(".callbackAction", "connectExtended");
        bundle.putBoolean(".reconnect", z13);
        bundle.putString(".serverURI", serverURI);
        this.f69033a.b(this.f69037e, r.OK, bundle);
    }

    @Override // mp2.e
    public final void d(mp2.h messageToken) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(messageToken, "messageToken");
        this.f69033a.i("deliveryComplete(" + messageToken + ")");
        synchronized (this) {
            mp2.i iVar = (mp2.i) this.f69039g.remove(messageToken);
            bundle = null;
            if (iVar != null) {
                String str = (String) this.f69038f.remove(messageToken);
                String str2 = (String) this.f69040h.remove(messageToken);
                String str3 = (String) this.f69041i.remove(messageToken);
                bundle = e(null, str, iVar);
                if (str2 != null) {
                    bundle.putString(".callbackAction", "send");
                    bundle.putString(".activityToken", str2);
                    bundle.putString(".invocationContext", str3);
                }
            }
        }
        if (bundle != null) {
            if (Intrinsics.d("send", bundle.getString(".callbackAction"))) {
                this.f69033a.b(this.f69037e, r.OK, bundle);
            }
            bundle.putString(".callbackAction", "messageDelivered");
            this.f69033a.b(this.f69037e, r.OK, bundle);
        }
    }

    public final void f() {
    }
}
