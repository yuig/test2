package fk0;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import ca0.b0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import mq.e0;
import mq.f0;
import mq.g0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfk0/q;", "Lmm1/l;", "<init>", "()V", "create_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class q extends z {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f62319j0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public final m1 f62320g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltButton f62321h0;

    /* renamed from: i0, reason: collision with root package name */
    public final d4 f62322i0;

    public q() {
        int i13 = 29;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new b0(7, new q1(this, i13)));
        this.f62320g0 = a1.s(this, k0.f80436a.b(x.class), new e0(a13, 28), new f0(null, a13, i13), new g0(this, a13, i13));
        this.f62322i0 = d4.UNKNOWN_VIEW;
    }

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(x60.d.fragment_board_create_sheet, false, 0, 0, true, false, new jh0.d(this, 12), 716);
    }

    public final x d8() {
        return (x) this.f62320g0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.f62322i0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        a8(i.f62287o);
        View findViewById = v13.findViewById(x60.c.create_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        gestaltButton.d(i.f62288p);
        gestaltButton.e(new yb0.b(this, 18));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f62321h0 = gestaltButton;
        View findViewById2 = v13.findViewById(x60.c.board_name_edit_text);
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById2;
        gestaltTextField.X(i.f62289q);
        gestaltTextField.L(new m(this, 0));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = v13.findViewById(x60.c.is_secret_board_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        pe.i.j((GestaltSwitchWithLabel) findViewById3, new m(this, 1));
        View findViewById4 = v13.findViewById(x60.c.add_collaborators_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new p(this, null), 3);
    }
}
