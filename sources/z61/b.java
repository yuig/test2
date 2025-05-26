package z61;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import ey.x;
import h32.d4;
import h61.h;
import kotlin.jvm.internal.Intrinsics;
import l11.f;
import s92.o;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f140891a;

    /* renamed from: b, reason: collision with root package name */
    public String f140892b;

    public /* synthetic */ b() {
        this(null);
    }

    public final void a(h searchType) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        new x(searchType.toPWTSearchType(), o.ERROR, d4.SEARCH, searchType.toViewParameterType(), null, null, 0, this.f140892b, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER).i();
    }

    public final void b(h searchType) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        new x(searchType.toPWTSearchType(), o.ERROR, d4.SEARCH, searchType.toViewParameterType(), null, null, 0, this.f140892b, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER).i();
    }

    public final void c(int i13, h searchType) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        new x(searchType.toPWTSearchType(), o.ABORTED, d4.SEARCH, searchType.toViewParameterType(), null, null, i13, this.f140892b, 48).i();
    }

    public b(f fVar) {
        this.f140891a = fVar;
    }
}
