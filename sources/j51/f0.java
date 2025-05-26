package j51;

import com.pinterest.api.model.f30;
import com.pinterest.feature.profile.boardlesspins.components.IdeaPreviewCarouselView;
import com.pinterest.feature.profile.boardlesspins.components.UnorganizedIdeasModule;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class f0 extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final yk1.v f74740a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f74741b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f74742c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f74743d;

    public f0(yk1.v resources, g51.l onBound, g51.m ideaTapAction, g51.l ctaTapAction) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(onBound, "onBound");
        Intrinsics.checkNotNullParameter(ideaTapAction, "ideaTapAction");
        Intrinsics.checkNotNullParameter(ctaTapAction, "ctaTapAction");
        this.f74740a = resources;
        this.f74741b = onBound;
        this.f74742c = ideaTapAction;
        this.f74743d = ctaTapAction;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        UnorganizedIdeasModule view = (UnorganizedIdeasModule) nVar;
        d51.q model = (d51.q) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        List<f30> list = model.f53715a;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (f30 f30Var : list) {
            String p03 = bs1.c.p0(f30Var);
            if (p03 == null && (p03 = f30Var.y4()) == null) {
                p03 = "";
            }
            arrayList.add(new k31.e(p03, null, new b01.c(18, this.f74742c, f30Var), 2));
        }
        int size = model.f53716b - arrayList.size();
        if (size < 0) {
            size = 0;
        }
        yk1.v vVar = this.f74740a;
        Iterable b13 = size > 0 ? kotlin.collections.e0.b(new k31.e(null, ((yk1.a) vVar).f139224a.getString(nz1.f.unorganized_ideas_overflow_label, Integer.valueOf(size)), null, 5)) : q0.f80391a;
        yk1.a aVar = (yk1.a) vVar;
        k31.j jVar = new k31.j(aVar.f139224a.getString(nz1.f.unorganized_ideas), new k31.i(this.f74743d, aVar.f139224a.getString(x0.organize_board_button)));
        k31.a state = new k31.a(CollectionsKt.l0(b13, arrayList));
        k31.k state2 = new k31.k(jVar, state);
        view.getClass();
        Intrinsics.checkNotNullParameter(state2, "state");
        view.f47499a.L(jVar);
        IdeaPreviewCarouselView ideaPreviewCarouselView = view.f47500b;
        ideaPreviewCarouselView.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        ideaPreviewCarouselView.f47494h.setValue(state);
        if (!arrayList.isEmpty()) {
            this.f74741b.invoke();
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        d51.q model = (d51.q) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
