package ow;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f97894r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p0 f97895s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f97896t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ww.a f97897u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p0 p0Var, String str, ww.a aVar, bl2.c cVar) {
        super(2, cVar);
        this.f97895s = p0Var;
        this.f97896t = str;
        this.f97897u = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u(this.f97895s, this.f97896t, this.f97897u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f97894r;
        if (i13 == 0) {
            ue.c.H(obj);
            p0 p0Var = this.f97895s;
            LinkedHashMap linkedHashMap = p0Var.f97871m;
            String str = this.f97896t;
            ww.g gVar = (ww.g) linkedHashMap.get(str);
            if ((gVar != null ? gVar.f131165c : null) == null || gVar.f131167e == null) {
                ((pw.c) p0Var.f97861c).f(gVar != null ? gVar.f131164b : null, new Throwable("Attempting to track interaction type for ad session or media events that do not exist."));
                return Unit.f80348a;
            }
            int i14 = t.f97893a[this.f97897u.ordinal()];
            com.iab.omid.library.pinterest.adsession.media.b bVar = gVar.f131167e;
            if (i14 == 1) {
                this.f97894r = 1;
                if (p0.c(p0Var, str, bVar, this) == aVar) {
                    return aVar;
                }
            } else if (i14 == 2) {
                com.iab.omid.library.pinterest.adsession.media.c cVar = com.iab.omid.library.pinterest.adsession.media.c.EXPANDED;
                this.f97894r = 2;
                if (p0.k(p0Var, bVar, cVar, this) == aVar) {
                    return aVar;
                }
            } else if (i14 == 3) {
                com.iab.omid.library.pinterest.adsession.media.c cVar2 = com.iab.omid.library.pinterest.adsession.media.c.NORMAL;
                this.f97894r = 3;
                if (p0.k(p0Var, bVar, cVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i13 != 1 && i13 != 2 && i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
