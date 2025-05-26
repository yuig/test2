package vs;

import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.ui.grid.PinterestRecyclerView;
import java.util.ArrayList;
import java.util.List;
import kh2.s0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f126510r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f126511s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f126511s = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f126511s, cVar);
        rVar.f126510r = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((h) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        h hVar = (h) this.f126510r;
        g gVar = hVar.f126484a;
        boolean z13 = gVar instanceof f;
        u uVar = this.f126511s;
        if (z13) {
            GestaltSpinner gestaltSpinner = uVar.f126519e0;
            if (gestaltSpinner == null) {
                Intrinsics.r("loadingSpinner");
                throw null;
            }
            s0.w(gestaltSpinner, new tq.a0(hVar, 16));
        } else if (gVar instanceof e) {
            GestaltSpinner gestaltSpinner2 = uVar.f126519e0;
            if (gestaltSpinner2 == null) {
                Intrinsics.r("loadingSpinner");
                throw null;
            }
            s0.w(gestaltSpinner2, q.f126504k);
            PinterestRecyclerView pinterestRecyclerView = uVar.f126520f0;
            if (pinterestRecyclerView == null) {
                Intrinsics.r("recyclerView");
                throw null;
            }
            b bVar = uVar.f126521g0;
            g gVar2 = hVar.f126484a;
            if (bVar == null) {
                ArrayList H0 = CollectionsKt.H0(((e) gVar2).f126479a);
                i92.k kVar = uVar.f126517c0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                b bVar2 = new b(H0, kVar);
                uVar.f126521g0 = bVar2;
                pinterestRecyclerView.j(bVar2);
            } else {
                List data = ((e) gVar2).f126479a;
                Intrinsics.checkNotNullParameter(data, "data");
                androidx.recyclerview.widget.w e13 = androidx.recyclerview.widget.a0.e(new c(0, (List) bVar.f126470e, data));
                Intrinsics.checkNotNullExpressionValue(e13, "calculateDiff(...)");
                ((List) bVar.f126470e).clear();
                ((List) bVar.f126470e).addAll(data);
                e13.b(bVar);
            }
        } else if (gVar instanceof d) {
            GestaltSpinner gestaltSpinner3 = uVar.f126519e0;
            if (gestaltSpinner3 == null) {
                Intrinsics.r("loadingSpinner");
                throw null;
            }
            s0.w(gestaltSpinner3, q.f126505l);
        }
        return Unit.f80348a;
    }
}
