package hf2;

import android.os.Bundle;
import ao2.j0;
import do2.f2;
import info.mqtt.android.service.MqttService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f69046r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MqttService f69047s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f69048t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MqttService mqttService, Bundle bundle, bl2.c cVar) {
        super(2, cVar);
        this.f69047s = mqttService;
        this.f69048t = bundle;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f69047s, this.f69048t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f69046r;
        if (i13 == 0) {
            ue.c.H(obj);
            f2 f2Var = this.f69047s.f72900i;
            this.f69046r = 1;
            if (f2Var.emit(this.f69048t, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
