package hu;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import java.util.List;
import ju.i;
import kg.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import qa2.s1;

/* loaded from: classes3.dex */
public final class b extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70378d;

    /* renamed from: e, reason: collision with root package name */
    public final List f70379e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f70380f;

    public b(int i13, List dobMonthItem, Function1 handleAction) {
        this.f70378d = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(dobMonthItem, "countryList");
            Intrinsics.checkNotNullParameter(handleAction, "handleAction");
            this.f70379e = dobMonthItem;
            this.f70380f = handleAction;
            return;
        }
        Intrinsics.checkNotNullParameter(dobMonthItem, "dobMonthItem");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        this.f70379e = dobMonthItem;
        this.f70380f = handleAction;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        int i13 = this.f70378d;
        List list = this.f70379e;
        switch (i13) {
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        rm1.a aVar = rm1.a.f108689k;
        int i14 = this.f70378d;
        List list = this.f70379e;
        switch (i14) {
            case 0:
                a holder = (a) y2Var;
                Intrinsics.checkNotNullParameter(holder, "holder");
                m91.b item = (m91.b) list.get(i13);
                d dVar = holder.f70377u;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                String str = item.f86724d;
                if (str == null) {
                    str = "";
                }
                a0.p(dVar.f70386b, str);
                boolean z13 = item.f86725e;
                GestaltIcon gestaltIcon = dVar.f70387c;
                if (z13) {
                    t.e1(gestaltIcon);
                } else {
                    Intrinsics.checkNotNullParameter(gestaltIcon, "<this>");
                    gestaltIcon.g2(aVar);
                }
                dVar.setOnClickListener(new co.a(23, dVar, item));
                break;
            default:
                iu.a holder2 = (iu.a) y2Var;
                Intrinsics.checkNotNullParameter(holder2, "holder");
                i item2 = (i) list.get(i13);
                d dVar2 = holder2.f73678u;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(item2, "item");
                a0.p(dVar2.f70386b, item2.f77608a.toString());
                boolean z14 = item2.f77609b;
                GestaltIcon gestaltIcon2 = dVar2.f70387c;
                if (z14) {
                    t.e1(gestaltIcon2);
                } else {
                    Intrinsics.checkNotNullParameter(gestaltIcon2, "<this>");
                    gestaltIcon2.g2(aVar);
                }
                dVar2.setOnClickListener(new co.a(24, dVar2, item2));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        int i14 = this.f70378d;
        Function1 function1 = this.f70380f;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                d leadGenCountrySelectItemView = new d(context, function1, 0);
                Intrinsics.checkNotNullParameter(leadGenCountrySelectItemView, "leadGenCountrySelectItemView");
                a aVar = new a(leadGenCountrySelectItemView);
                aVar.f70377u = leadGenCountrySelectItemView;
                return aVar;
            default:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                d leadGenMonthSelectItemView = new d(context2, function1, 1);
                Intrinsics.checkNotNullParameter(leadGenMonthSelectItemView, "leadGenMonthSelectItemView");
                iu.a aVar2 = new iu.a(leadGenMonthSelectItemView);
                aVar2.f73678u = leadGenMonthSelectItemView;
                return aVar2;
        }
    }
}
