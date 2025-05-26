package if2;

import info.mqtt.android.service.MqttService;
import kb.w0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f72237a;

    public a(MqttService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        w0 a13 = w0.f79048a.a(service);
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        this.f72237a = a13;
    }
}
