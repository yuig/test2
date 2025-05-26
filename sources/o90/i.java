package o90;

import kl2.m;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements m {

    /* renamed from: r, reason: collision with root package name */
    public int f93803r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ o12.a f93804s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ String f93805t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ String f93806u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f93807v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ za0.b f93808w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, za0.b bVar, bl2.c cVar) {
        super(4, cVar);
        this.f93807v = str;
        this.f93808w = bVar;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        i iVar = new i(this.f93807v, this.f93808w, (bl2.c) obj4);
        iVar.f93804s = (o12.a) obj;
        iVar.f93805t = (String) obj2;
        iVar.f93806u = (String) obj3;
        return iVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93803r;
        if (i13 == 0) {
            ue.c.H(obj);
            o12.a aVar2 = this.f93804s;
            String str = this.f93805t;
            String str2 = this.f93806u;
            int ordinal = this.f93808w.ordinal();
            String str3 = j.f93809a;
            this.f93804s = null;
            this.f93805t = null;
            this.f93803r = 1;
            obj = aVar2.f(this.f93807v, ordinal, str3, str, str2, this);
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
