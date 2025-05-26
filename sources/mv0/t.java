package mv0;

import android.os.Bundle;
import android.view.View;
import com.pinterest.base.LockableViewPager;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.navigation.Navigation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmv0/t;", "Lyk1/u;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Lod0/d;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class t extends e<od0.d> implements yk1.u {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f88408u0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public uk1.e f88409r0;

    /* renamed from: s0, reason: collision with root package name */
    public so.b f88410s0;

    /* renamed from: t0, reason: collision with root package name */
    public List f88411t0;

    public t() {
        this.S = false;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f88409r0;
        if (eVar != null) {
            return new com.pinterest.creatorHub.feature.creatorpathways.j(((uk1.a) eVar).g(), p7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("pinProductUid") : null;
        Navigation navigation2 = this.I;
        List b03 = kotlin.jvm.internal.r.b0(v03, navigation2 != null ? navigation2.S("com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", false) : false);
        this.f88411t0 = b03;
        this.E = aq1.f.product_tagging_container_view;
        so.b bVar = this.f88410s0;
        if (bVar == null) {
            Intrinsics.r("pagerAdapterFactory");
            throw null;
        }
        if (b03 != null) {
            f8(bVar.a(b03));
        } else {
            Intrinsics.r("tabs");
            throw null;
        }
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        GestaltTabLayout gestaltTabLayout = (GestaltTabLayout) view.findViewById(aq1.d.classes_tabs);
        Intrinsics.f(gestaltTabLayout);
        gestaltTabLayout.x(gestaltTabLayout.B());
        List list = this.f88411t0;
        if (list == null) {
            Intrinsics.r("tabs");
            throw null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            kv0.q qVar = (kv0.q) obj;
            String string = getResources().getString(qVar.b());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(kh2.b0.U(gestaltTabLayout, string, qVar.a(), 8));
            i13 = i14;
        }
        gestaltTabLayout.E(gestaltTabLayout.m(), arrayList);
        gestaltTabLayout.b(new ka0.h(this, (LockableViewPager) b8().f21278a, 1));
        Y7(new ka0.i(gestaltTabLayout, this));
        GestaltIconButton gestaltIconButton = (GestaltIconButton) view.findViewById(aq1.d.back_button);
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new np0.h(this, 15));
        }
    }
}
