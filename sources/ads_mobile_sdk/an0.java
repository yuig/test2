package ads_mobile_sdk;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class an0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn0 f2443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f2444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an0(kn0 kn0Var, Uri uri, bl2.c cVar) {
        super(2, cVar);
        this.f2443b = kn0Var;
        this.f2444c = uri;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new an0(this.f2443b, this.f2444c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new an0(this.f2443b, this.f2444c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f2442a;
        if (i13 == 0) {
            ue.c.H(obj);
            kn0 kn0Var = this.f2443b;
            a.ce ceVar = kn0Var.f7395a;
            ym0 ym0Var = kn0Var.f7396b;
            Uri uri = this.f2444c;
            this.f2442a = 1;
            if (ceVar.a(ym0Var, uri, this) == aVar) {
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
