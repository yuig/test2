package ri1;

import android.content.res.Resources;
import ao2.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import m60.w;
import ni1.p;
import ni1.q;
import u50.r;

/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final w f108361a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f108362b;

    public a(w eventManager, Resources resources) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f108361a = eventManager;
        this.f108362b = resources;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, q request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (!(request instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        p pVar = (p) request;
        this.f108361a.d(new ls1.p(pVar.n(), pVar.q(), pVar.j(), pVar.k(), pVar.u(), pVar.s(), pVar.l().b(), pVar.p().b(), pVar.t(), pVar.r(), pVar.m(), this.f108362b.getDimensionPixelSize(pVar.o()), pVar.w(), pVar.v()));
    }
}
