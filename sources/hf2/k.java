package hf2;

import info.mqtt.android.service.MqttService;

/* loaded from: classes4.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f69049r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MqttService f69050s;

    /* renamed from: t, reason: collision with root package name */
    public int f69051t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MqttService mqttService, bl2.c cVar) {
        super(cVar);
        this.f69050s = mqttService;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f69049r = obj;
        this.f69051t |= Integer.MIN_VALUE;
        return this.f69050s.c(null, this);
    }
}
