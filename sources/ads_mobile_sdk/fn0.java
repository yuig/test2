package ads_mobile_sdk;

import a.s7;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class fn0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn0 f5214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebResourceRequest f5215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn0(kn0 kn0Var, WebResourceRequest webResourceRequest, bl2.c cVar) {
        super(2, cVar);
        this.f5214b = kn0Var;
        this.f5215c = webResourceRequest;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new fn0(this.f5214b, this.f5215c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new fn0(this.f5214b, this.f5215c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5213a;
        if (i13 == 0) {
            ue.c.H(obj);
            s7 s7Var = this.f5214b.f7409o;
            if (s7Var == null) {
                return null;
            }
            WebResourceRequest webResourceRequest = this.f5215c;
            this.f5213a = 1;
            obj = ((p03) s7Var).a(webResourceRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return (WebResourceResponse) obj;
    }
}
