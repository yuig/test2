package od0;

import android.os.Bundle;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.reportFlow.feature.ReportFlowScreenLocation;
import com.pinterest.screens.a1;
import com.pinterest.screens.a2;
import com.pinterest.screens.c1;
import com.pinterest.screens.s2;
import eq0.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kv0.q;
import lh0.h2;
import lh0.r1;
import n60.o;

/* loaded from: classes5.dex */
public final class d extends jr.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f94101n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(il1.b screenFactory, int i13) {
        super(screenFactory);
        this.f94101n = i13;
        if (i13 != 5) {
            Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
            k(f0.l(jr.a.n((ScreenLocation) c1.f50606c.getValue())));
            return;
        }
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        super(screenFactory);
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_ACTION_TAB", p02.a.YOUR_ACCOUNT);
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("EXTRA_ACTION_TAB", p02.a.YOUR_REPORTS);
        ReportFlowScreenLocation reportFlowScreenLocation = ReportFlowScreenLocation.SETTINGS_REPORTS_AND_VIOLATIONS_SECTION;
        k(CollectionsKt.F0(f0.l(jr.a.o(reportFlowScreenLocation, bundle), jr.a.o(reportFlowScreenLocation, bundle2))));
    }

    @Override // jr.a
    public final boolean q() {
        switch (this.f94101n) {
            case 1:
            case 4:
                return true;
            default:
                return this instanceof com.pinterest.feature.home.viewpager.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(il1.b screenFactory, String str, r1 experiments) {
        super(screenFactory);
        this.f94101n = 2;
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Bundle a13 = o.a("com.pinterest.EXTRA_USER_ID", str);
        k(CollectionsKt.F0(f0.l(jr.a.o((ScreenLocation) a2.f50510d.getValue(), a13), jr.a.o((ScreenLocation) a2.f50509c.getValue(), a13), jr.a.o((ScreenLocation) a2.f50507a.getValue(), a13), jr.a.o((ScreenLocation) a2.f50508b.getValue(), a13))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(il1.b screenFactory, h2 newshubExperiments) {
        super(screenFactory);
        this.f94101n = 4;
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(newshubExperiments, "newshubExperiments");
        ArrayList l13 = f0.l(jr.a.n((ScreenLocation) s2.f51347f.getValue()));
        if (!newshubExperiments.c()) {
            l13.add(jr.a.n((ScreenLocation) s2.f51344c.getValue()));
        }
        k(l13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String conversationId, String userUid, n nVar, il1.b screenFactory) {
        super(screenFactory);
        this.f94101n = 1;
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_CONVO_ID", conversationId);
        bundle.putString("com.pinterest.EXTRA_USER_ID", userUid);
        if (nVar != null) {
            String str = nVar.f59920a;
            if (str != null) {
                bundle.putString("com.pinterest.EXTRA_CONVO_THREAD_ID", str);
            }
            String str2 = nVar.f59924e;
            if (str2 != null) {
                bundle.putString("com.pinterest.EXTRA_CONVO_NEW_THREAD_PIN_ANCHOR_ID", str2);
            }
            String str3 = nVar.f59923d;
            if (str3 != null) {
                bundle.putString("com.pinterest.EXTRA_CONVO_NEW_THREAD_TEXT_ANCHOR", str3);
            }
            bundle.putBoolean("com.pinterest.EXTRA_CONVO_SHOULD_CREATE_NEW_THREAD", nVar.f59922c);
            bundle.putString("com.pinterest.EXTRA_CONVO_THREAD_ANCHOR_ID", nVar.f59921b);
        }
        k(f0.j(jr.a.o((ScreenLocation) a1.f50500g.getValue(), bundle), jr.a.o((ScreenLocation) a1.f50502i.getValue(), bundle)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List tabs, il1.b screenFactory) {
        super(screenFactory);
        this.f94101n = 3;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        List<q> list = tabs;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (q qVar : list) {
            ScreenModel o13 = jr.a.o(qVar.f80999c, qVar.f81000d);
            Intrinsics.checkNotNullExpressionValue(o13, "createScreenDescription(...)");
            arrayList.add(o13);
        }
        k(arrayList);
    }
}
