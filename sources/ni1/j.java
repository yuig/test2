package ni1;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f90709a;

    /* renamed from: b, reason: collision with root package name */
    public i f90710b;

    /* renamed from: c, reason: collision with root package name */
    public String f90711c;

    /* renamed from: d, reason: collision with root package name */
    public u50.r f90712d;

    public j(m60.w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f90709a = eventManager;
        this.f90711c = "no_pin_id_set_yet";
    }

    @Override // l82.g
    public final CoroutineContext f(l82.h hVar) {
        n effectRequest = (n) hVar;
        Intrinsics.checkNotNullParameter(effectRequest, "effectRequest");
        ko2.f fVar = ao2.v0.f20219a;
        return ((bo2.e) ho2.q.f69782a).f23612f;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(ao2.j0 scope, n request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof m;
        m60.w wVar = this.f90709a;
        if (!z13) {
            if (request instanceof l) {
                wVar.d(new ls1.r(((l) request).j()));
                return;
            }
            return;
        }
        this.f90711c = ((m) request).f90738a;
        this.f90712d = eventIntake;
        if (this.f90710b == null) {
            i iVar = new i(this);
            this.f90710b = iVar;
            wVar.h(iVar);
        }
    }
}
