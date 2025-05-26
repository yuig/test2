package ads_mobile_sdk;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class gf0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.pf f5552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym0 f5553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(a.pf pfVar, ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f5552a = pfVar;
        this.f5553b = ym0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new gf0(this.f5552a, this.f5553b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new gf0(this.f5552a, this.f5553b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        FrameLayout d2 = ((yh1) this.f5552a).d();
        if (d2 != null) {
            d2.removeView(this.f5553b);
        }
        return Unit.f80348a;
    }
}
