package p02;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f98466r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p70.e f98467s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s02.v f98468t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f98469u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p70.e eVar, s02.v vVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f98467s = eVar;
        this.f98468t = vVar;
        this.f98469u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w(this.f98467s, this.f98468t, this.f98469u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f98466r;
        s02.v vVar = this.f98468t;
        if (i13 == 0) {
            ue.c.H(obj);
            o02.a aVar2 = (o02.a) this.f98467s.f99072b;
            String str = ((s02.t) vVar).f110349a ? "content" : "reporter";
            String str2 = ((s02.t) vVar).f110350b;
            String str3 = ((s02.t) vVar).f110352d;
            String str4 = ((s02.t) vVar).f110351c;
            String str5 = ((s02.t) vVar).f110353e;
            this.f98466r = 1;
            obj = aVar2.d(str, str2, str3, str4, str5, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        k3.y1((NetworkResponse) obj, new gw1.i(14, this.f98469u, vVar));
        return Unit.f80348a;
    }
}
