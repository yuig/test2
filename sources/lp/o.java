package lp;

import com.pinterest.activity.conversation.view.PeopleFacetSearchBar;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rl1.q;
import rl1.r;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypeAheadItem f84231b;

    public /* synthetic */ o(int i13, TypeAheadItem typeAheadItem) {
        this.f84230a = i13;
        this.f84231b = typeAheadItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84230a;
        TypeAheadItem typeAheadItem = this.f84231b;
        switch (i13) {
            case 0:
                q displayState = (q) obj;
                int i14 = PeopleFacetSearchBar.f34884d;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                String str = displayState.f108647a;
                rl1.e backgroundColor = new rl1.e(typeAheadItem.A());
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                r size = r.LG;
                Intrinsics.checkNotNullParameter(size, "size");
                return new q(str, displayState.f108648b, displayState.f108649c, size, displayState.f108651e, displayState.f108652f, displayState.f108653g, displayState.f108654h, displayState.f108655i, backgroundColor, displayState.f108657k);
            default:
                q displayState2 = (q) obj;
                er.b bVar = TypeAheadItem.f35139u;
                typeAheadItem.getClass();
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                String str2 = displayState2.f108647a;
                String imageUrl = typeAheadItem.l();
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                rl1.e backgroundColor2 = new rl1.e(typeAheadItem.A());
                Intrinsics.checkNotNullParameter(backgroundColor2, "backgroundColor");
                return new q(imageUrl, displayState2.f108648b, displayState2.f108649c, displayState2.f108650d, displayState2.f108651e, displayState2.f108652f, displayState2.f108653g, displayState2.f108654h, displayState2.f108655i, backgroundColor2, displayState2.f108657k);
        }
    }
}
