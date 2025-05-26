package o82;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93661r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f93662s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f93663t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d2 f93664u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f93665v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u50.r f93666w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i13, u50.r rVar, s0 s0Var, d2 d2Var, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f93662s = s0Var;
        this.f93663t = obj;
        this.f93664u = d2Var;
        this.f93665v = i13;
        this.f93666w = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m0(this.f93665v, this.f93666w, this.f93662s, this.f93664u, this.f93663t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i14 = this.f93661r;
        s0 s0Var = this.f93662s;
        if (i14 == 0) {
            ue.c.H(obj);
            k0 k0Var = s0Var.f93706a;
            int i15 = s0Var.f93709d;
            String str2 = s0Var.f93708c;
            this.f93661r = 1;
            obj = k0Var.a(i15, str2, this.f93663t, this.f93664u, this);
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
        u50.r rVar = this.f93666w;
        if (z13) {
            xz.b bVar = (xz.b) networkResponse;
            l0 l0Var = (l0) bVar.f136205a;
            s0Var.f93708c = l0Var.f93653b;
            boolean isEmpty = l0Var.f93652a.isEmpty();
            Object obj2 = bVar.f136205a;
            if (!isEmpty || (str = ((l0) obj2).f93653b) == null || kotlin.text.z.j(str) || (i13 = this.f93665v) <= 0) {
                s0Var.f93709d = Integer.parseInt(s0Var.f93707b.e());
                List list = ((l0) obj2).f93652a;
                String str3 = s0Var.f93708c;
                rVar.a(new m1(list, !(str3 == null || kotlin.text.z.j(str3))));
            } else {
                this.f93661r = 2;
                s0Var.getClass();
                ko2.f fVar = ao2.v0.f20219a;
                Object M = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new m0(i13 - 1, this.f93666w, s0Var, this.f93664u, this.f93663t, null));
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
