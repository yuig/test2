package o82;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class n0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93670r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f93671s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f93672t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d2 f93673u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f93674v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u50.r f93675w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(int i13, u50.r rVar, s0 s0Var, d2 d2Var, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f93671s = s0Var;
        this.f93672t = obj;
        this.f93673u = d2Var;
        this.f93674v = i13;
        this.f93675w = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n0(this.f93674v, this.f93675w, this.f93671s, this.f93673u, this.f93672t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i14 = this.f93670r;
        s0 s0Var = this.f93671s;
        if (i14 == 0) {
            ue.c.H(obj);
            k0 k0Var = s0Var.f93706a;
            int i15 = s0Var.f93709d;
            String str2 = s0Var.f93708c;
            this.f93670r = 1;
            obj = k0Var.a(i15, str2, this.f93672t, this.f93673u, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        boolean z13 = networkResponse instanceof xz.b;
        u50.r rVar = this.f93675w;
        if (z13) {
            xz.b bVar = (xz.b) networkResponse;
            l0 l0Var = (l0) bVar.f136205a;
            s0Var.f93708c = l0Var.f93653b;
            boolean isEmpty = l0Var.f93652a.isEmpty();
            Object obj2 = bVar.f136205a;
            if (!isEmpty || (str = ((l0) obj2).f93653b) == null || kotlin.text.z.j(str) || (i13 = this.f93674v) <= 0) {
                s0Var.f93709d = Integer.parseInt(s0Var.f93707b.c());
                List list = ((l0) obj2).f93652a;
                String str3 = s0Var.f93708c;
                rVar.a(new z0(list, !(str3 == null || kotlin.text.z.j(str3))));
            } else {
                this.f93670r = 2;
                s0Var.getClass();
                ko2.f fVar = ao2.v0.f20219a;
                Object M = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new n0(i13 - 1, this.f93675w, s0Var, this.f93673u, this.f93672t, null));
                if (M != aVar) {
                    M = Unit.f80348a;
                }
                if (M == aVar) {
                    return aVar;
                }
            }
        } else if (networkResponse instanceof xz.a) {
            rVar.a(new c1(((xz.a) networkResponse).f136204a));
        }
        return Unit.f80348a;
    }
}
