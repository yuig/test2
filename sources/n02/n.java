package n02;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88850r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f88851s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f88852t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f88851s = oVar;
        this.f88852t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f88851s, this.f88852t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88850r;
        o oVar = this.f88851s;
        if (i13 == 0) {
            ue.c.H(obj);
            k22.m mVar = oVar.f88855c;
            this.f88850r = 1;
            obj = mVar.g(this.f88852t, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        if (k3.s1((NetworkResponse) obj)) {
            i92.k kVar = oVar.f88863k;
            int i14 = h02.e.report_pin_unblock_user_success;
            String str = oVar.f88864l;
            if (str == null) {
                Intrinsics.r("creatorName");
                throw null;
            }
            kVar.l(i14, str);
        } else {
            i92.k kVar2 = oVar.f88863k;
            int i15 = h02.e.report_pin_unblock_user_failure;
            String str2 = oVar.f88864l;
            if (str2 == null) {
                Intrinsics.r("creatorName");
                throw null;
            }
            kVar2.l(i15, str2);
        }
        return Unit.f80348a;
    }
}
