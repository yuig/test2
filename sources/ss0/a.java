package ss0;

import com.pinterest.api.model.v7;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import com.pinterest.framework.multisection.datasource.pagedlist.k0;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lh0.r1;
import lq0.f1;
import qz.f0;
import t3.s1;
import tk2.e;
import uk2.d;
import x02.x;
import xs0.l;

/* loaded from: classes5.dex */
public final class a extends h0 {
    public final /* synthetic */ int E = 0;
    public final Object F;
    public Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b60.b userManager, r1 experiments, l boardToggleSettingViewBinder) {
        super("users/me/boards/feed/", new ke0.a[]{gh0.b.K()}, null, null, null, null, null, null, 0L, 2044);
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(boardToggleSettingViewBinder, "boardToggleSettingViewBinder");
        this.F = userManager;
        this.G = experiments;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.HOMEFEED_TUNER_BOARD_RECOMMENDATIONS_FIELDS));
        String value = x.ALL_BOARDS_FILTER.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        f0Var.e("filter", value);
        f0Var.e("sort", "last_pinned_to");
        this.f49121k = f0Var;
        W(9992, boardToggleSettingViewBinder, new xb0.a(this, 28));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        switch (this.E) {
            case 1:
                Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
                super.b0(e0(itemsToSet), z13);
                f0();
                break;
            default:
                super.b0(itemsToSet, z13);
                break;
        }
    }

    public final ArrayList e0(List list) {
        ArrayList H0 = CollectionsKt.H0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            s sVar = (s) next;
            if (sVar instanceof v7) {
                String j13 = ((v7) sVar).j1();
                Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                Locale locale = Locale.ROOT;
                String lowerCase = j13.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((String) this.G).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (!z.p(lowerCase, lowerCase2, false)) {
                    if (StringsKt.E(lowerCase, " " + lowerCase2, false)) {
                    }
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void f0() {
        r rVar = this.f49128r;
        k0 k0Var = rVar instanceof k0 ? (k0) rVar : null;
        String str = k0Var != null ? k0Var.f49144f : null;
        if (true ^ (str == null || str.length() == 0)) {
            j1();
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.E) {
            case 0:
                return 9992;
            default:
                return 0;
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void w(List itemsToAppend, boolean z13) {
        switch (this.E) {
            case 1:
                Intrinsics.checkNotNullParameter(itemsToAppend, "itemsToAppend");
                super.w(e0(itemsToAppend), z13);
                f0();
                break;
            default:
                super.w(itemsToAppend, z13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ot0.c boardSelectionListener) {
        super("users/me/boards/feed/", new ke0.a[]{gh0.b.K()}, null, null, null, null, null, null, 0L, 2044);
        Intrinsics.checkNotNullParameter(boardSelectionListener, "boardSelectionListener");
        d h10 = s1.h("create(...)");
        this.F = h10;
        this.G = "";
        o(0, new ot0.b(boardSelectionListener));
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.IDEA_PIN_BOARD_STICKER_PICKER));
        String value = x.PUBLIC_BOARDS_FILTER.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        f0Var.e("privacy_filter", value);
        f0Var.e("sort", "alphabetical");
        this.f49121k = f0Var;
        jk2.x H = h10.l(100L, TimeUnit.MILLISECONDS, e.f118016b).A(wj2.c.a()).H(e.f118017c);
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        nl.b.s(H, new f1(this, 25), null, null, 6);
    }
}
