package dm2;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class r implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55516c;

    public /* synthetic */ r(u uVar, v vVar, int i13) {
        this.f55514a = i13;
        this.f55516c = uVar;
        this.f55515b = vVar;
    }

    public final Collection b(ym2.g gVar) {
        int i13 = this.f55514a;
        Object obj = this.f55516c;
        switch (i13) {
            case 0:
                u uVar = (u) obj;
                if (gVar != null) {
                    return uVar.j(uVar.i().a(gVar, hm2.e.FOR_NON_TRACKED_SCOPE), gVar);
                }
                uVar.getClass();
                u.h(8);
                throw null;
            default:
                u uVar2 = (u) obj;
                if (gVar != null) {
                    return uVar2.j(uVar2.i().d(gVar, hm2.e.FOR_NON_TRACKED_SCOPE), gVar);
                }
                uVar2.getClass();
                u.h(4);
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55514a) {
            case 0:
                return b((ym2.g) obj);
            case 1:
                return b((ym2.g) obj);
            default:
                ((CompletableFuture) this.f55515b).cancel(false);
                ((fo2.a) this.f55516c).cont = null;
                return Unit.f80348a;
        }
    }

    public r(CompletableFuture completableFuture, fo2.a aVar) {
        this.f55514a = 2;
        this.f55515b = completableFuture;
        this.f55516c = aVar;
    }
}
