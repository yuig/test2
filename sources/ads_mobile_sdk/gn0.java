package ads_mobile_sdk;

import a.of;
import android.webkit.WebResourceRequest;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class gn0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ of f5625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kn0 f5626c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebResourceRequest f5627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn0(of ofVar, kn0 kn0Var, WebResourceRequest webResourceRequest, bl2.c cVar) {
        super(2, cVar);
        this.f5625b = ofVar;
        this.f5626c = kn0Var;
        this.f5627d = webResourceRequest;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new gn0(this.f5625b, this.f5626c, this.f5627d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gn0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5624a;
        if (i13 == 0) {
            ue.c.H(obj);
            of ofVar = this.f5625b;
            ym0 ym0Var = this.f5626c.f7396b;
            WebResourceRequest webResourceRequest = this.f5627d;
            this.f5624a = 1;
            obj = ((ad1) ofVar).a(ym0Var, webResourceRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
