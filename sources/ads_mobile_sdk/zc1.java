package ads_mobile_sdk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class zc1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ad1 f14717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Request f14718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc1(ad1 ad1Var, Request request, bl2.c cVar) {
        super(2, cVar);
        this.f14717b = ad1Var;
        this.f14718c = request;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new zc1(this.f14717b, this.f14718c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zc1(this.f14717b, this.f14718c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14716a;
        if (i13 == 0) {
            ue.c.H(obj);
            yp0 yp0Var = this.f14717b.f2367c;
            Request request = this.f14718c;
            this.f14716a = 1;
            obj = yp0.a(yp0Var, request, (zn2.b) null, this, 6);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        a.ad adVar = (a.ad) obj;
        if (!(adVar instanceof pk0)) {
            if (adVar instanceof jk0) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        ResponseBody responseBody = ((Response) ((pk0) adVar).f9719b).f95726g;
        if (responseBody != null) {
            return responseBody.string();
        }
        return null;
    }
}
