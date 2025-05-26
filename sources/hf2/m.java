package hf2;

import android.os.Binder;
import info.mqtt.android.service.MqttService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final MqttService f69055a;

    public m(MqttService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f69055a = service;
    }
}
