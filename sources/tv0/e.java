package tv0;

import android.os.Bundle;
import com.pinterest.feature.contextualtypeahead.view.ContextualTypeaheadListView;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x02.l2;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltv0/e;", "Lnl1/d;", "Lxp0/a;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class e extends nl1.d implements xp0.a {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f119516e0 = 0;
    public uk1.e X;
    public l2 Y;
    public GestaltTextField Z;

    /* renamed from: a0, reason: collision with root package name */
    public ContextualTypeaheadListView f119517a0;

    /* renamed from: b0, reason: collision with root package name */
    public xp0.d f119518b0;

    /* renamed from: c0, reason: collision with root package name */
    public final v f119519c0 = m.b(new au0.a(this, 13));

    /* renamed from: d0, reason: collision with root package name */
    public final a4 f119520d0 = a4.STORY_PIN_CREATE;

    @Override // nl1.d
    public final void K7() {
        super.K7();
        GestaltTextField W7 = W7();
        W7.postDelayed(new ne0.b(W7, 4), 270L);
    }

    @Override // nl1.d
    public void L7() {
        hf0.b.k(W7());
        super.L7();
    }

    /* renamed from: V7 */
    public abstract a getF119532p0();

    public final GestaltTextField W7() {
        GestaltTextField gestaltTextField = this.Z;
        if (gestaltTextField != null) {
            return gestaltTextField;
        }
        Intrinsics.r("searchBar");
        throw null;
    }

    public abstract Integer X7();

    public abstract int Y7();

    /* renamed from: Z7 */
    public abstract boolean getF119531o0();

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF117471s1() {
        return this.f119520d0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF117470r1() {
        Navigation navigation = this.I;
        d4 f49944f = navigation != null ? navigation.getF49944f() : null;
        return f49944f == null ? d4.UNKNOWN_VIEW : f49944f;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = aq1.f.fragment_idea_pin_user_tagging;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0071, code lost:
    
        if (r2.i(new tq.f0(df.j1.c0(r15 ? bs1.c.f2(r2, aq1.h.idea_pin_partner_search_paid_partnership_information_new) : bs1.c.f2(r2, aq1.h.idea_pin_partner_search_paid_partnership_information)), r2, r3)) == null) goto L9;
     */
    @Override // nl1.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv0.e.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
