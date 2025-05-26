package n02;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88809r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f88810s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f88811t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f88812u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f88813v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, String str, String str2, String str3, bl2.c cVar) {
        super(2, cVar);
        this.f88810s = oVar;
        this.f88811t = str;
        this.f88812u = str2;
        this.f88813v = str3;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f88810s, this.f88811t, this.f88812u, this.f88813v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88809r;
        o oVar = this.f88810s;
        if (i13 == 0) {
            ue.c.H(obj);
            k22.m mVar = oVar.f88855c;
            this.f88809r = 1;
            obj = mVar.q(this.f88811t, this.f88812u, this.f88813v, this);
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
            int i14 = h02.e.report_pin_block_user_success;
            String str = oVar.f88864l;
            if (str == null) {
                Intrinsics.r("creatorName");
                throw null;
            }
            kVar.l(i14, str);
        } else {
            i92.k kVar2 = oVar.f88863k;
            int i15 = h02.e.report_pin_block_user_failure;
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
