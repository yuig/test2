package tv0;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import dl1.t;
import h32.g0;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import om0.m1;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltv0/h;", "Ltv0/e;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: k0, reason: collision with root package name */
    public t f119527k0;

    /* renamed from: l0, reason: collision with root package name */
    public ag1.b f119528l0;

    /* renamed from: m0, reason: collision with root package name */
    public s1 f119529m0;

    /* renamed from: n0, reason: collision with root package name */
    public final v f119530n0 = m.b(new f(this, 0));

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f119531o0 = true;

    /* renamed from: p0, reason: collision with root package name */
    public final a f119532p0 = new a(eo1.b.color_themed_background_default, vn1.c.DEFAULT, om1.f.TRANSPARENT_DARK_GRAY, vn1.c.SUBTLE);

    @Override // tv0.e
    /* renamed from: V7, reason: from getter */
    public final a getF119532p0() {
        return this.f119532p0;
    }

    @Override // tv0.e
    public final Integer X7() {
        return Integer.valueOf(((Boolean) this.f119530n0.getValue()).booleanValue() ? aq1.h.idea_pin_partner_search_paid_partnership_information_new : aq1.h.idea_pin_partner_search_paid_partnership_information);
    }

    @Override // tv0.e
    public final int Y7() {
        return ((Boolean) this.f119530n0.getValue()).booleanValue() ? aq1.h.idea_pin_partner_search_title_new : aq1.h.idea_pin_partner_search_title;
    }

    @Override // tv0.e
    /* renamed from: Z7, reason: from getter */
    public final boolean getF119531o0() {
        return this.f119531o0;
    }

    @Override // xp0.a
    public final void b1(br.d typeAheadItem, String currentTypeaheadTerm) {
        Intrinsics.checkNotNullParameter(typeAheadItem, "typeAheadItem");
        Intrinsics.checkNotNullParameter(currentTypeaheadTerm, "currentTypeaheadTerm");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        String j13 = typeAheadItem.j();
        if (j13 == null) {
            j13 = "";
        }
        a1.x0(requireActivity, requireContext, j13, ((Boolean) this.f119530n0.getValue()).booleanValue(), new m1(22, this, typeAheadItem), new f(this, 1));
        hf0.b.k(W7());
    }

    @Override // nl1.d, nx.i1
    public final g0 b2() {
        return g0.SPONSOR_TAG;
    }
}
