package hf2;

import ao2.j0;
import info.mqtt.android.service.MqttService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f69013r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f69014s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f69014s = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f69014s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f69013r;
        if (i13 == 0) {
            ue.c.H(obj);
            MqttService mqttService = this.f69014s.f69024h;
            if (mqttService != null) {
                b bVar = new b(1, this.f69014s, e.class, "onReceive", "onReceive(Landroid/os/Bundle;)V", 0);
                this.f69013r = 1;
                if (mqttService.c(bVar, this) == aVar) {
                    return aVar;
                }
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
