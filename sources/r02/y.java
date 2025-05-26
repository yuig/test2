package r02;

import android.content.Context;
import com.pinterest.gestalt.banner.GestaltBanner;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f105827r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f105828s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e0 e0Var, bl2.c cVar) {
        super(2, cVar);
        this.f105828s = e0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        y yVar = new y(this.f105828s, cVar);
        yVar.f105827r = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((p02.g) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        boolean z13;
        Boolean bool;
        boolean z14;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        p02.g gVar = (p02.g) this.f105827r;
        int i13 = e0.P0;
        e0 e0Var = this.f105828s;
        e0Var.getClass();
        kg.q qVar = gVar.f98414c.e().f93757b;
        boolean z15 = true;
        if (qVar instanceof o82.u) {
            bool = null;
            z13 = false;
            z14 = false;
        } else {
            if (qVar instanceof o82.t) {
                boolean isEmpty = gVar.f98414c.e().f93756a.isEmpty();
                bool = Boolean.valueOf(!isEmpty);
                z13 = isEmpty;
            } else if (qVar instanceof o82.s) {
                bool = Boolean.FALSE;
                z13 = true;
                z14 = true;
                z15 = false;
            } else {
                z13 = true;
                bool = null;
            }
            z15 = false;
            z14 = false;
        }
        e0Var.c9(z15);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            PinterestRecyclerView pinterestRecyclerView = e0Var.K0;
            if (pinterestRecyclerView == null) {
                Intrinsics.r("recyclerView");
                throw null;
            }
            pinterestRecyclerView.setVisibility(booleanValue ? 0 : 8);
        }
        GestaltBanner gestaltBanner = e0Var.L0;
        if (gestaltBanner == null) {
            Intrinsics.r("llContainerDataResult");
            throw null;
        }
        gestaltBanner.setVisibility(z13 ? 0 : 8);
        if (z13) {
            GestaltBanner gestaltBanner2 = e0Var.L0;
            if (gestaltBanner2 == null) {
                Intrinsics.r("llContainerDataResult");
                throw null;
            }
            ph.a.o(gestaltBanner2, new qf1.f0(z14, e0Var, 13));
        }
        p02.v vVar = gVar.f98415d;
        if (vVar != null) {
            String fileType = vVar.getFileType();
            String fileContent = vVar.getFileContent();
            Context requireContext = e0Var.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            m60.e eVar = e0Var.N0;
            if (eVar == null) {
                Intrinsics.r("applicationInfoProvider");
                throw null;
            }
            pe.i.X0(fileType, fileContent, requireContext, eVar, e0Var.T);
        }
        return Unit.f80348a;
    }
}
