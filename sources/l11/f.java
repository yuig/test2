package l11;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import ey.e0;
import ey.k1;
import ey.l1;
import ey.l2;
import ey.q1;
import ey.x;
import ey.z4;
import h32.d4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements pr0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81413a = 2;

    /* renamed from: b, reason: collision with root package name */
    public Object f81414b;

    public f() {
    }

    @Override // pr0.a
    public final void b(Object obj) {
        switch (this.f81413a) {
            case 0:
                e();
                break;
            case 1:
                e();
                break;
            default:
                h61.h hVar = (h61.h) obj;
                new l2("SCROLL").i();
                if (hVar != null) {
                    new x(hVar.toPWTSearchType(), s92.o.ABORTED, d4.SEARCH, hVar.toViewParameterType(), null, null, 0, (String) this.f81414b, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER).i();
                    break;
                }
                break;
        }
    }

    @Override // pr0.a
    public final void c(Object obj) {
        switch (this.f81413a) {
            case 0:
                break;
            case 1:
                break;
            default:
                h61.h hVar = (h61.h) obj;
                if (hVar != null) {
                    new k1(hVar.toPWTSearchType()).i();
                    break;
                }
                break;
        }
    }

    public final void d() {
        switch (this.f81413a) {
            case 0:
                new gy.e(s92.o.COMPLETE, ((j) this.f81414b).getJ0(), ((j) this.f81414b).getF22531t0()).i();
                break;
            default:
                new my.e(s92.i.SEARCH_TAB_RENDER, s92.o.COMPLETE).i();
                ((Function0) this.f81414b).invoke();
                break;
        }
    }

    public final void e() {
        switch (this.f81413a) {
            case 0:
                new gy.e(s92.o.ABORTED, ((j) this.f81414b).getJ0(), ((j) this.f81414b).getF22531t0()).i();
                break;
            default:
                new my.e(s92.i.SEARCH_TAB_RENDER, s92.o.ABORTED).i();
                ((Function0) this.f81414b).invoke();
                break;
        }
    }

    public final void f(h61.h hVar) {
        if (hVar != null) {
            q1 pwtSearchType = hVar.toPWTSearchType();
            Intrinsics.checkNotNullParameter(pwtSearchType, "pwtSearchType");
            new l1(pwtSearchType).i();
        }
    }

    @Override // pr0.a
    public final void o(int i13, ny.f fVar, e0 e0Var, Object obj) {
        switch (this.f81413a) {
            case 0:
                d();
                break;
            case 1:
                d();
                break;
            default:
                h61.h hVar = (h61.h) obj;
                if (hVar != null) {
                    new x(hVar.toPWTSearchType(), s92.o.COMPLETE, d4.SEARCH, hVar.toViewParameterType(), fVar, e0Var, 0, (String) this.f81414b, 64).i();
                    String scenarioName = z4.f60636a;
                    Intrinsics.checkNotNullParameter(scenarioName, "scenarioName");
                    break;
                }
                break;
        }
    }

    @Override // pr0.a
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        switch (this.f81413a) {
            case 0:
                break;
            case 1:
                break;
            default:
                f((h61.h) obj);
                break;
        }
    }

    public f(c61.b onInitialRenderCompleted) {
        Intrinsics.checkNotNullParameter(onInitialRenderCompleted, "onInitialRenderCompleted");
        this.f81414b = onInitialRenderCompleted;
    }

    public f(j jVar) {
        this.f81414b = jVar;
    }
}
