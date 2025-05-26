package tv0;

import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.navigation.Navigation;
import dl1.t;
import h32.g0;
import jk2.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pk.a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltv0/j;", "Ltv0/e;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f119533n0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    public t f119534k0;

    /* renamed from: l0, reason: collision with root package name */
    public ag1.b f119535l0;

    /* renamed from: m0, reason: collision with root package name */
    public final a f119536m0;

    public j() {
        int i13 = eo1.b.color_black_900;
        vn1.c cVar = vn1.c.LIGHT;
        this.f119536m0 = new a(i13, cVar, om1.f.TRANSPARENT_ALWAYS_LIGHT, cVar);
    }

    @Override // tv0.e, nl1.d
    public final void L7() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.d1(requireActivity);
        super.L7();
    }

    @Override // tv0.e
    /* renamed from: V7, reason: from getter */
    public final a getF119532p0() {
        return this.f119536m0;
    }

    @Override // tv0.e
    public final Integer X7() {
        return null;
    }

    @Override // tv0.e
    public final int Y7() {
        return aq1.h.idea_pin_creation_at_mention_search_modal_title;
    }

    @Override // tv0.e
    /* renamed from: Z7 */
    public final boolean getF119531o0() {
        return false;
    }

    @Override // xp0.a
    public final void b1(br.d typeAheadItem, String currentTypeaheadTerm) {
        Intrinsics.checkNotNullParameter(typeAheadItem, "typeAheadItem");
        Intrinsics.checkNotNullParameter(currentTypeaheadTerm, "currentTypeaheadTerm");
        String uid = typeAheadItem.getUid();
        Navigation navigation = this.I;
        if (navigation == null || !navigation.S("com.pinterest.EXTRA_IDEA_PIN_IS_EDITING_EXISTING_USER_TAG", false)) {
            t tVar = this.f119534k0;
            if (tVar == null) {
                Intrinsics.r("storyPinLocalDataRepository");
                throw null;
            }
            ag1.b bVar = this.f119535l0;
            if (bVar == null) {
                Intrinsics.r("dataManager");
                throw null;
            }
            e0 M = ((dl1.l) tVar).M(bVar.d());
            hk2.b bVar2 = new hk2.b(new pv0.e(10, new r0(22, uid, this)), new pv0.e(11, g.f119524k), ck2.i.f27923c);
            M.f(bVar2);
            R6(bVar2);
        } else {
            String e13 = typeAheadItem.e();
            w f73 = f7();
            Intrinsics.f(uid);
            f73.d(new hv0.h(uid, a.a.j("@", e13), typeAheadItem.g()));
        }
        z(g.f119525l);
        hf0.b.k(W7());
    }

    @Override // nl1.d, nx.i1
    public final g0 b2() {
        return g0.USER_MENTION;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.D(requireActivity);
        super.onResume();
    }
}
