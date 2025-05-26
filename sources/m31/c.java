package m31;

import android.text.Editable;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import d70.g;
import h32.f1;
import java.util.ArrayList;
import jk2.a0;
import jk2.n0;
import jk2.v;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;
import m60.x0;
import nx.d0;
import s7.z;
import u50.h0;
import x02.a2;
import yk1.i;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85764i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f85765j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f85764i = i13;
        this.f85765j = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r33;
        ArrayList<Integer> Q1;
        int i13 = this.f85764i;
        e eVar = this.f85765j;
        switch (i13) {
            case 0:
                j31.a aVar = eVar.f85778t0;
                if (aVar != null) {
                    GestaltTextField gestaltTextField = eVar.f85776r0;
                    if (gestaltTextField == null) {
                        Intrinsics.r("editText");
                        throw null;
                    }
                    Editable z03 = gestaltTextField.z0();
                    String obj2 = z03 != null ? z03.toString() : null;
                    String boardName = obj2 != null ? obj2 : "";
                    l31.d dVar = (l31.d) aVar;
                    Intrinsics.checkNotNullParameter(boardName, "boardName");
                    GestaltButton gestaltButton = ((e) ((j31.b) dVar.getView())).f85775q0;
                    if (gestaltButton == null) {
                        Intrinsics.r("createButton");
                        throw null;
                    }
                    gestaltButton.d(new i31.a(false, 1));
                    boolean z13 = dVar.f81518k;
                    if (z13) {
                        d0.B(dVar.getPinalytics(), f1.AUTO_BOARD_NAME_INPUTTED, null, null, dVar.q3(boardName), 22);
                    }
                    z zVar = new z(boardName, false, z13 ? z42.c.AUTO_ORGANIZE_PINS : null, 4);
                    j0 j0Var = new j0();
                    ((e) ((j31.b) dVar.getView())).setLoadState(i.LOADING);
                    v f03 = dVar.f81513f.f0(zVar);
                    a21.a aVar2 = new a21.a(22, new l31.b(dVar, 1));
                    a2 a2Var = ck2.i.f27924d;
                    ck2.c cVar = ck2.i.f27923c;
                    dVar.addDisposable(new n0(new a0(f03, aVar2, a2Var, cVar), new wv0.a(26, new l31.c(j0Var, dVar)), false, 2).H(tk2.e.f118017c).A(wj2.c.a()).F(new a21.a(23, new l31.c(dVar, j0Var)), new a21.a(24, new rx0.f(dVar, boardName, j0Var, 8)), cVar, a2Var));
                    dVar.f81514g.c();
                }
                return Unit.f80348a;
            case 1:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = e.f85767x0;
                Navigation navigation = eVar.I;
                if (navigation == null || (Q1 = navigation.Q1("cluster_pin_types")) == null) {
                    r33 = q0.f80391a;
                } else {
                    r33 = new ArrayList();
                    for (Integer num : Q1) {
                        d42.a aVar3 = d42.c.Companion;
                        Intrinsics.f(num);
                        int intValue = num.intValue();
                        aVar3.getClass();
                        d42.c a13 = d42.a.a(intValue);
                        if (a13 != null) {
                            r33.add(a13);
                        }
                    }
                }
                return rn1.a.y(it, null, null, null, null, null, 0, r33.contains(d42.c.DOWNLOADED) ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                ao1.b it2 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                int i15 = e.f85767x0;
                eVar.getClass();
                return ao1.b.e(it2, com.bumptech.glide.d.Z(eVar, "com.pinterest.EXTRA_BOARD_NAME", "").length() > 0 ? bs1.c.h2(com.bumptech.glide.d.Z(eVar, "com.pinterest.EXTRA_BOARD_NAME", "")) : h0.f120562a, bs1.c.j2(new String[0], g.editable_board_name_label), null, bs1.c.j2(new String[0], x0.add), null, false, 1, 0, 0, false, false, false, null, false, 0, null, null, null, null, 0, 4161324);
        }
    }
}
