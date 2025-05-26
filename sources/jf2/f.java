package jf2;

import ao2.j0;
import dl2.j;
import info.mqtt.android.service.room.MqMessageDatabase;
import ja.d0;
import ja.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class f extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MqMessageDatabase f75888r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kf2.a f75889s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MqMessageDatabase mqMessageDatabase, kf2.a aVar, bl2.c cVar) {
        super(2, cVar);
        this.f75888r = mqMessageDatabase;
        this.f75889s = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f75888r, this.f75889s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c t13 = this.f75888r.t();
        kf2.a aVar2 = this.f75889s;
        ((d0) t13.f75872a).b();
        ((d0) t13.f75872a).c();
        try {
            ((i) t13.f75873b).o(aVar2);
            ((d0) t13.f75872a).r();
            ((d0) t13.f75872a).m();
            return Unit.f80348a;
        } catch (Throwable th3) {
            ((d0) t13.f75872a).m();
            throw th3;
        }
    }
}
