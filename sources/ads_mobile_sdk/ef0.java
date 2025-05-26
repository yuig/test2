package ads_mobile_sdk;

import android.view.WindowManager;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ef0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowManager f4834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym0 f4835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WindowManager.LayoutParams f4836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef0(WindowManager windowManager, ym0 ym0Var, WindowManager.LayoutParams layoutParams, bl2.c cVar) {
        super(2, cVar);
        this.f4834a = windowManager;
        this.f4835b = ym0Var;
        this.f4836c = layoutParams;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ef0(this.f4834a, this.f4835b, this.f4836c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ef0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f4834a.addView(this.f4835b, this.f4836c);
        return Unit.f80348a;
    }
}
