package ads_mobile_sdk;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jd1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kd1 f6760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k92 f6762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f6763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Window f6764f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd1(kd1 kd1Var, ViewGroup viewGroup, k92 k92Var, Activity activity, Window window, bl2.c cVar) {
        super(2, cVar);
        this.f6760b = kd1Var;
        this.f6761c = viewGroup;
        this.f6762d = k92Var;
        this.f6763e = activity;
        this.f6764f = window;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new jd1(this.f6760b, this.f6761c, this.f6762d, this.f6763e, this.f6764f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jd1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6759a;
        if (i13 == 0) {
            ue.c.H(obj);
            kd1 kd1Var = this.f6760b;
            ViewGroup viewGroup = this.f6761c;
            k92 k92Var = this.f6762d;
            Activity activity = this.f6763e;
            Window window = this.f6764f;
            Intrinsics.checkNotNullExpressionValue(window, "$window");
            kd1 kd1Var2 = this.f6760b;
            ym0 ym0Var = kd1Var2.f7242h;
            ln0 ln0Var = kd1Var2.f7241g;
            this.f6759a = 1;
            if (kd1Var.a(viewGroup, k92Var, activity, window, ym0Var, ln0Var, this) == aVar) {
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
