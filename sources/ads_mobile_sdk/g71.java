package ads_mobile_sdk;

import android.view.WindowManager;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g71 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowManager f5466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym0 f5467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WindowManager.LayoutParams f5468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(WindowManager windowManager, ym0 ym0Var, WindowManager.LayoutParams layoutParams, bl2.c cVar) {
        super(2, cVar);
        this.f5466a = windowManager;
        this.f5467b = ym0Var;
        this.f5468c = layoutParams;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g71(this.f5466a, this.f5467b, this.f5468c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g71) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f5466a.updateViewLayout(this.f5467b, this.f5468c);
        return Unit.f80348a;
    }
}
