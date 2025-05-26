package gg0;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.radioGroup.GestaltRadioButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f64914i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var) {
        super(2);
        this.f64914i = e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GestaltRadioButton radioButton = (GestaltRadioButton) obj;
        rg0.k selection = (rg0.k) obj2;
        Intrinsics.checkNotNullParameter(radioButton, "radioButton");
        Intrinsics.checkNotNullParameter(selection, "selection");
        e0 e0Var = this.f64914i;
        i0 i0Var = e0Var.f64922u;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(selection, "selection");
        boolean z13 = k0.f64942k0;
        k0 k0Var = i0Var.f64939a;
        hg0.i p73 = k0Var.p7();
        p73.getClass();
        Intrinsics.checkNotNullParameter(selection, "selection");
        p73.f69078g = selection.f108042c;
        GestaltButton gestaltButton = k0Var.f64948h0;
        if (gestaltButton != null) {
            bs1.c.s(gestaltButton, a.D);
        }
        u2.y(radioButton, a.B);
        LinkedHashSet linkedHashSet = e0Var.D;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : linkedHashSet) {
            if (!Intrinsics.d((GestaltRadioButton) obj3, radioButton)) {
                arrayList.add(obj3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u2.y((GestaltRadioButton) it.next(), a.C);
        }
        return Unit.f80348a;
    }
}
