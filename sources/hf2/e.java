package hf2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import ao2.m2;
import ao2.v0;
import info.mqtt.android.service.MqttService;
import ja.v;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.eclipse.paho.client.mqttv3.MqttException;

/* loaded from: classes4.dex */
public final class e implements mp2.b {

    /* renamed from: o, reason: collision with root package name */
    public static final String f69016o = MqttService.class.getName();

    /* renamed from: a, reason: collision with root package name */
    public final Context f69017a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69018b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69019c;

    /* renamed from: d, reason: collision with root package name */
    public final mp2.f f69020d;

    /* renamed from: e, reason: collision with root package name */
    public final v f69021e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f69022f;

    /* renamed from: g, reason: collision with root package name */
    public final a f69023g;

    /* renamed from: h, reason: collision with root package name */
    public MqttService f69024h;

    /* renamed from: i, reason: collision with root package name */
    public String f69025i;

    /* renamed from: j, reason: collision with root package name */
    public int f69026j;

    /* renamed from: k, reason: collision with root package name */
    public mp2.g f69027k;

    /* renamed from: l, reason: collision with root package name */
    public n f69028l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f69029m;

    /* renamed from: n, reason: collision with root package name */
    public volatile AtomicBoolean f69030n;

    public e(Context context, String serverURI, String clientId) {
        a ackType = a.AUTO_ACK;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serverURI, "serverURI");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(ackType, "ackType");
        this.f69017a = context;
        this.f69018b = serverURI;
        this.f69019c = clientId;
        this.f69020d = null;
        this.f69021e = new v(this, 2);
        this.f69022f = new SparseArray();
        this.f69023g = ackType;
        this.f69029m = new ArrayList();
        this.f69030n = new AtomicBoolean(false);
    }

    public static final void a(e eVar) {
        if (eVar.f69024h == null) {
            return;
        }
        m2 b13 = ue.c.b();
        ko2.f fVar = v0.f20219a;
        ho2.c b14 = dl2.b.b(ko2.e.f80326c.plus(b13));
        eVar.getClass();
        kotlin.jvm.internal.j.z(b14, null, null, new c(eVar, null), 3);
        eVar.f69030n.set(true);
    }

    public static final void c(e eVar) {
        if (eVar.f69025i == null) {
            MqttService mqttService = eVar.f69024h;
            Intrinsics.f(mqttService);
            String packageName = eVar.f69017a.getApplicationInfo().packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            eVar.f69025i = mqttService.d(eVar.f69018b, eVar.f69019c, packageName, eVar.f69020d);
        }
        MqttService mqttService2 = eVar.f69024h;
        Intrinsics.f(mqttService2);
        mqttService2.f72895d = false;
        MqttService mqttService3 = eVar.f69024h;
        Intrinsics.f(mqttService3);
        mqttService3.f72894c = eVar.f69025i;
        String g13 = eVar.g(eVar.f69028l);
        try {
            MqttService mqttService4 = eVar.f69024h;
            Intrinsics.f(mqttService4);
            String clientHandle = eVar.f69025i;
            Intrinsics.f(clientHandle);
            mp2.g gVar = eVar.f69027k;
            Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
            i e13 = mqttService4.e(clientHandle);
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(dl2.b.b(ko2.e.f80326c), null, null, new l(e13, gVar, g13, null), 3);
        } catch (Exception e14) {
            n nVar = eVar.f69028l;
            Intrinsics.f(nVar);
            mp2.a aVar = nVar.f69058c;
            if (aVar != null) {
                aVar.b(eVar.f69028l, e14);
            }
        }
    }

    @Override // mp2.b
    public final mp2.c K0(String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(topic, "topic");
        n nVar = new n(this, null);
        String activityToken = g(nVar);
        MqttService mqttService = this.f69024h;
        Intrinsics.f(mqttService);
        String clientHandle = this.f69025i;
        Intrinsics.f(clientHandle);
        Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(activityToken, "activityToken");
        i e13 = mqttService.e(clientHandle);
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(activityToken, "activityToken");
        String q13 = a.a.q(new StringBuilder("unsubscribe({"), topic, "},{null}, {", activityToken, "})");
        MqttService mqttService2 = e13.f69033a;
        mqttService2.i(q13);
        Bundle bundle = new Bundle();
        bundle.putString(".callbackAction", "unsubscribe");
        bundle.putString(".activityToken", activityToken);
        bundle.putString(".invocationContext", null);
        bundle.putString(".errorMessage", "not connected");
        mqttService2.j("subscribe not connected");
        mqttService2.b(e13.f69037e, r.ERROR, bundle);
        return nVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        MqttService mqttService = this.f69024h;
        if (mqttService != null) {
            if (this.f69025i == null) {
                String packageName = this.f69017a.getApplicationInfo().packageName;
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                this.f69025i = mqttService.d(this.f69018b, this.f69019c, packageName, this.f69020d);
            }
            String clientHandle = this.f69025i;
            Intrinsics.f(clientHandle);
            Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
            mqttService.e(clientHandle).f69033a.i("close()");
        }
    }

    public final mp2.c d(mp2.g options, mp2.a aVar) {
        mp2.a aVar2;
        Intrinsics.checkNotNullParameter(options, "options");
        n nVar = new n(this, (kq0.b) aVar);
        this.f69027k = options;
        this.f69028l = nVar;
        ComponentName componentName = null;
        if (this.f69024h == null) {
            Intent intent = new Intent();
            String str = f69016o;
            Context context = this.f69017a;
            intent.setClassName(context, str);
            try {
                componentName = context.startService(intent);
            } catch (IllegalStateException e13) {
                mp2.a aVar3 = nVar.f69058c;
                if (aVar3 != null) {
                    aVar3.b(nVar, e13);
                }
            }
            if (componentName == null && (aVar2 = nVar.f69058c) != null) {
                aVar2.b(nVar, new RuntimeException("cannot start service ".concat(str)));
            }
            context.bindService(intent, this.f69021e, 1);
        } else {
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(dl2.b.b(ko2.e.f80326c), null, null, new d(this, null), 3);
        }
        return nVar;
    }

    public final synchronized mp2.c e(Bundle bundle) {
        Intrinsics.f(bundle);
        String string = bundle.getString(".activityToken");
        if (string == null) {
            return null;
        }
        int parseInt = Integer.parseInt(string);
        mp2.c cVar = (mp2.c) this.f69022f.get(parseInt);
        this.f69022f.delete(parseInt);
        return cVar;
    }

    public final void f(mp2.c cVar, Bundle bundle) {
        Object obj;
        Object obj2;
        Object obj3;
        if (cVar == null) {
            MqttService mqttService = this.f69024h;
            Intrinsics.f(mqttService);
            mqttService.j("simpleAction : token is null");
            return;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            obj = bundle.getSerializable(".callbackStatus", r.class);
        } else {
            Object serializable = bundle.getSerializable(".callbackStatus");
            if (!(serializable instanceof r)) {
                serializable = null;
            }
            obj = (r) serializable;
        }
        if (((r) obj) == r.OK) {
            ((n) cVar).b();
            return;
        }
        if (i13 >= 33) {
            obj2 = bundle.getSerializable(".errorMessage", String.class);
        } else {
            Object serializable2 = bundle.getSerializable(".errorMessage");
            if (!(serializable2 instanceof String)) {
                serializable2 = null;
            }
            obj2 = (String) serializable2;
        }
        String str = (String) obj2;
        if (i13 >= 33) {
            obj3 = bundle.getSerializable(".exception", Throwable.class);
        } else {
            Object serializable3 = bundle.getSerializable(".exception");
            obj3 = (Throwable) (serializable3 instanceof Throwable ? serializable3 : null);
        }
        Throwable throwable = (Throwable) obj3;
        if (throwable == null && str != null) {
            throwable = new Throwable(str);
        } else if (throwable == null) {
            Set<String> keySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
            throwable = new Throwable(a.a.j("No Throwable given\n", CollectionsKt.Z(keySet, ", ", "{", "}", 0, null, new z9.v(4, bundle), 24)));
        }
        n nVar = (n) cVar;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        synchronized (nVar.f69059d) {
            try {
                nVar.f69059d.notifyAll();
                if (throwable instanceof MqttException) {
                }
                mp2.a aVar = nVar.f69058c;
                if (aVar != null) {
                    aVar.b(nVar, throwable);
                    Unit unit = Unit.f80348a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized String g(n nVar) {
        int i13;
        this.f69022f.put(this.f69026j, nVar);
        i13 = this.f69026j;
        this.f69026j = i13 + 1;
        return String.valueOf(i13);
    }

    @Override // mp2.b
    public final boolean isConnected() {
        MqttService mqttService;
        if (this.f69025i == null || (mqttService = this.f69024h) == null) {
            return false;
        }
        Intrinsics.f(mqttService);
        String clientHandle = this.f69025i;
        Intrinsics.f(clientHandle);
        Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
        mqttService.e(clientHandle);
        return false;
    }
}
