package hf1;

import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import if1.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69008i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f69009j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f69008i = i13;
        this.f69009j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f69008i;
        c cVar = this.f69009j;
        switch (i13) {
            case 0:
                BoardFeed boardFeed = (BoardFeed) obj;
                if (cVar.isBound()) {
                    ff1.b bVar = (ff1.b) cVar.getView();
                    List boardFilters = boardFeed.q();
                    Intrinsics.checkNotNullExpressionValue(boardFilters, "getItems(...)");
                    d dVar = (d) bVar;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(boardFilters, "boardFilters");
                    String string = dVar.getResources().getString(d62.c.wishlist_all_tab);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    int i14 = 1;
                    dVar.g8(string, 0, null, true);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : boardFilters) {
                        v7 v7Var = (v7) obj2;
                        if (v7Var.j1() != null && v7Var.getUid() != null) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    int i15 = 1;
                    while (it.hasNext()) {
                        v7 v7Var2 = (v7) it.next();
                        String j13 = v7Var2.j1();
                        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                        dVar.g8(j13, i15, v7Var2.getUid(), false);
                        i15++;
                    }
                    cVar.addDisposable(nl.b.m(((jf1.a) ((d) ((ff1.b) cVar.getView())).a8()).H(), "WishlistPresenter:feedLoadedPublishSubject", new a(cVar, i14)));
                }
                return Unit.f80348a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                GestaltTabLayout gestaltTabLayout = ((d) ((ff1.b) cVar.getView())).f72235p0;
                if (gestaltTabLayout == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                if (gestaltTabLayout.getVisibility() == 4) {
                    gestaltTabLayout.setVisibility(booleanValue ? 0 : 4);
                }
                return Unit.f80348a;
        }
    }
}
