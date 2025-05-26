package qp;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.activity.create.view.FloatingBoardPicker;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kb.w0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import tb0.p;
import x02.i2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f104676b;

    public /* synthetic */ d(k kVar, int i13) {
        this.f104675a = i13;
        this.f104676b = kVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        String str;
        FragmentActivity E4;
        int i13 = this.f104675a;
        k this$0 = this.f104676b;
        switch (i13) {
            case 0:
                int i14 = k.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z13 = this$0.H0;
                LinkedHashSet linkedHashSet = this$0.f104711t0;
                if (!z13) {
                    this$0.Y7(new ArrayList(linkedHashSet));
                    return;
                }
                if (this$0.f91282J) {
                    this$0.s7().h0(f1.TAP, u0.SAVE_BUTTON, null, null, this$0.getF63135d0(), null, null, false);
                    vb0.j.f125466a.R(this$0.H0 && !Intrinsics.d(this$0.I0, "in_app_browser"), "Pin creation is only allowed in this fragment via FBP. Also, FBP is not enabled for IAB - if that changes, please add support for the first pin potentially being a repin and not a new pin", p.REPIN, new Object[0]);
                    if (linkedHashSet.isEmpty()) {
                        return;
                    }
                    if (this$0.E0 == null) {
                        i2 i2Var = this$0.B0;
                        if (i2Var == null) {
                            Intrinsics.r("pinRepository");
                            throw null;
                        }
                        kb.u0 u0Var = w0.f79048a;
                        Context context = kb0.a.f79058b;
                        this$0.E0 = new k11.d(i2Var, this$0, u0Var.a(f0.j0()), this$0.s7(), this$0.F0);
                    }
                    FloatingBoardPicker floatingBoardPicker = this$0.f104700i0;
                    if (floatingBoardPicker == null) {
                        Intrinsics.r("floatingBoardPicker");
                        throw null;
                    }
                    v7 v7Var = floatingBoardPicker.f34947f;
                    k11.d dVar = this$0.E0;
                    if (dVar != null) {
                        ArrayList arrayList = new ArrayList(linkedHashSet);
                        String uid = v7Var != null ? v7Var.getUid() : null;
                        if (v7Var == null || (str = v7Var.j1()) == null) {
                            str = "";
                        }
                        dVar.b(arrayList, uid, str, v7Var != null ? v7Var.R0() : null, this$0.f104706o0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i15 = k.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof om1.l) || (E4 = this$0.E4()) == null) {
                    return;
                }
                E4.finish();
                return;
            default:
                int i16 = k.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof em1.c) {
                    GestaltCheckBox gestaltCheckBox = this$0.f104701j0;
                    if (gestaltCheckBox != null) {
                        this$0.a8(c0.d.a2(gestaltCheckBox));
                        return;
                    } else {
                        Intrinsics.r("selectAllCheckBox");
                        throw null;
                    }
                }
                return;
        }
    }
}
