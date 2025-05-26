package lb;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f82695r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f82696s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, bl2.c cVar) {
        super(2, cVar);
        this.f82696s = context;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        z zVar = new z(this.f82696s, cVar);
        zVar.f82695r = ((Boolean) obj).booleanValue();
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((z) create(bool, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ub.h.a(this.f82696s, RescheduleReceiver.class, this.f82695r);
        return Unit.f80348a;
    }
}
