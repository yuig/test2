package ads_mobile_sdk;

import android.webkit.WebResourceRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jn0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn0 f6888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebResourceRequest f6889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn0(kn0 kn0Var, WebResourceRequest webResourceRequest, bl2.c cVar) {
        super(2, cVar);
        this.f6888b = kn0Var;
        this.f6889c = webResourceRequest;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new jn0(this.f6888b, this.f6889c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new jn0(this.f6888b, this.f6889c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6887a;
        if (i13 == 0) {
            ue.c.H(obj);
            ed2 ed2Var = this.f6888b.f7412r;
            if (ed2Var != null) {
                String uri = this.f6889c.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                this.f6887a = 1;
                if (ed2.a(ed2Var, uri, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        kn0 kn0Var = this.f6888b;
        a.q6 q6Var = (a.q6) kn0Var.f7407m.getValue(kn0Var, kn0.f7394t[3]);
        if (q6Var != null) {
            this.f6887a = 2;
            if (q6Var.l(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
