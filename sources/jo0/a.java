package jo0;

import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.boardsection.pincarousel.view.BoardSectionPinCarousel;
import io0.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qp.g;
import tk2.e;
import uj2.q;
import uk1.d;
import uk2.f;
import vb0.j;
import x02.i2;
import xo.l;
import yk1.c;
import yk1.r;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends c implements io0.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f77208a;

    /* renamed from: b, reason: collision with root package name */
    public final List f77209b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77210c;

    /* renamed from: d, reason: collision with root package name */
    public final f f77211d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f77212e;

    /* renamed from: f, reason: collision with root package name */
    public v f77213f;

    public a(List list, f fVar, d dVar, q qVar, i2 i2Var) {
        super(dVar, qVar);
        this.f77209b = list;
        this.f77210c = false;
        this.f77208a = new ArrayList();
        this.f77211d = fVar;
        this.f77212e = i2Var;
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(b bVar) {
        super.r3((r) bVar);
        BoardSectionPinCarousel boardSectionPinCarousel = (BoardSectionPinCarousel) bVar;
        Intrinsics.checkNotNullParameter(this, "dataSource");
        ko0.a aVar = new ko0.a(this);
        boardSectionPinCarousel.f45383b = aVar;
        RecyclerView recyclerView = boardSectionPinCarousel.f45382a;
        if (recyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        recyclerView.H2(aVar);
        List list = this.f77209b;
        if (qb0.b.p(list)) {
            j.f125466a.S(qb0.b.p(list), "Empty or null list of pin ids given to BoardSectionPinCarouselPresenter in its constructor", new Object[0]);
            addDisposable(this.f77212e.N(list).r(e.f118017c).l(wj2.c.a()).o(new xo.a(this, 10), new l(16)));
        }
        f fVar = this.f77211d;
        if (fVar == null) {
            return;
        }
        g gVar = new g(this, 5);
        fVar.d(gVar);
        addDisposable(gVar);
    }

    public final void r3(yk1.a aVar) {
        this.f77213f = aVar;
    }
}
