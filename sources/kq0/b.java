package kq0;

import android.util.Log;
import g4.u;
import info.mqtt.android.service.MqttService;
import kotlin.jvm.internal.Intrinsics;
import tb0.p;

/* loaded from: classes5.dex */
public final class b implements mp2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf2.e f80645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f80646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f80647c;

    public b(hf2.e eVar, d dVar, String str, String str2) {
        this.f80645a = eVar;
        this.f80646b = dVar;
        this.f80647c = str;
    }

    @Override // mp2.a
    public final void a(mp2.c asyncActionToken) {
        d dVar = this.f80646b;
        Intrinsics.checkNotNullParameter(asyncActionToken, "asyncActionToken");
        try {
            hf2.e eVar = this.f80645a;
            u bufferOpts = dVar.f80652c;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(bufferOpts, "bufferOpts");
            MqttService mqttService = eVar.f69024h;
            Intrinsics.f(mqttService);
            String clientHandle = eVar.f69025i;
            Intrinsics.f(clientHandle);
            Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
            mqttService.e(clientHandle);
            Intrinsics.f(null);
            throw null;
        } catch (IllegalArgumentException e13) {
            dVar.f80650a.q(e13, "invalid MQTT client handler", p.MESSAGING);
        }
    }

    @Override // mp2.a
    public final void b(mp2.c asyncActionToken, Throwable exception) {
        Intrinsics.checkNotNullParameter(asyncActionToken, "asyncActionToken");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Log.e("MQTTManager", "Exception on connect", exception);
        this.f80646b.a(this.f80647c, "Exception on connect");
    }
}
