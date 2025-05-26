package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class up extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wp f12144b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(wp wpVar, bl2.c cVar) {
        super(2, cVar);
        this.f12144b = wpVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new up(this.f12144b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new up(this.f12144b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12143a;
        if (i13 == 0) {
            ue.c.H(obj);
            wp wpVar = this.f12144b;
            this.f12143a = 1;
            if (kotlin.jvm.internal.j.M(this, wpVar.f13137d, new rp(wpVar, true, null, null)) == aVar) {
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
