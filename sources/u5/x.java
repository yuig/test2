package u5;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import mm2.k0;
import nx.r0;
import pn2.h0;
import pn2.t1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f120535a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f120536b;

    /* renamed from: c, reason: collision with root package name */
    public Object f120537c;

    /* renamed from: d, reason: collision with root package name */
    public Object f120538d;

    /* renamed from: e, reason: collision with root package name */
    public Object f120539e;

    public x(bm2.a aVar, boolean z13, rg.a containerContext, im2.b containerApplicabilityType, boolean z14) {
        Intrinsics.checkNotNullParameter(containerContext, "containerContext");
        Intrinsics.checkNotNullParameter(containerApplicabilityType, "containerApplicabilityType");
        this.f120537c = aVar;
        this.f120535a = z13;
        this.f120538d = containerContext;
        this.f120539e = containerApplicabilityType;
        this.f120536b = z14;
    }

    public static void e(Object obj, ArrayList arrayList, br1.a0 a0Var) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) a0Var.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                e(it.next(), arrayList, a0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static qm2.g g(sn2.j jVar) {
        Iterable iterable;
        qm2.f fVar;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (!(jVar instanceof k0)) {
            return null;
        }
        List g03 = pk.a0.g0(jVar);
        List<sn2.f> list = g03;
        boolean z13 = list instanceof Collection;
        if (z13 && list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!pk.a0.y0((sn2.f) it.next())) {
                if (!z13 || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (i((sn2.f) it2.next()) != null) {
                            iterable = g03;
                            break;
                        }
                    }
                }
                if (z13 && list.isEmpty()) {
                    return null;
                }
                for (sn2.f fVar2 : list) {
                    Intrinsics.checkNotNullParameter(fVar2, "<this>");
                    if (com.bumptech.glide.c.J((pn2.b0) fVar2) != null) {
                        iterable = new ArrayList();
                        for (sn2.f fVar3 : list) {
                            Intrinsics.checkNotNullParameter(fVar3, "<this>");
                            pn2.b0 J2 = com.bumptech.glide.c.J((pn2.b0) fVar3);
                            if (J2 != null) {
                                iterable.add(J2);
                            }
                        }
                        Iterable iterable2 = iterable;
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (!pk.a0.F0((sn2.f) it3.next())) {
                                    fVar = qm2.f.NOT_NULL;
                                    break;
                                }
                            }
                        }
                        fVar = qm2.f.NULLABLE;
                        return new qm2.g(fVar, iterable != g03);
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static ym2.e h(h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        rn2.j jVar = t1.f100842a;
        am2.j b13 = h0Var.w0().b();
        am2.g gVar = b13 instanceof am2.g ? (am2.g) b13 : null;
        if (gVar != null) {
            return bn2.e.h(gVar);
        }
        return null;
    }

    public static qm2.f i(sn2.f fVar) {
        h0 k13;
        h0 k14;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        pn2.v j13 = pk.a0.j(fVar);
        if (j13 == null || (k13 = pk.a0.O0(j13)) == null) {
            k13 = pk.a0.k(fVar);
            Intrinsics.f(k13);
        }
        if (pk.a0.C0(k13)) {
            return qm2.f.NULLABLE;
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        pn2.v j14 = pk.a0.j(fVar);
        if (j14 == null || (k14 = pk.a0.u1(j14)) == null) {
            k14 = pk.a0.k(fVar);
            Intrinsics.f(k14);
        }
        if (pk.a0.C0(k14)) {
            return null;
        }
        return qm2.f.NOT_NULL;
    }

    public final fd1.e a(boolean z13, TextInputLayout inputLayout) {
        if (inputLayout.f33165c.f33258h != -1) {
            return null;
        }
        com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.f120538d;
        int i13 = 14;
        yj1.d makeClickEvent = new yj1.d(this, i13);
        qVar.getClass();
        Intrinsics.checkNotNullParameter(inputLayout, "inputLayout");
        Intrinsics.checkNotNullParameter(makeClickEvent, "makeClickEvent");
        fd1.e eVar = new fd1.e(i13, qVar, makeClickEvent);
        if (!z13) {
            inputLayout.F(eVar);
        }
        return eVar;
    }

    public final im1.o b(boolean z13, TextInputEditText textInputEditText) {
        int i13 = 0;
        return ((com.google.firebase.messaging.q) this.f120538d).J(z13, textInputEditText, new zn1.d(this, i13), new zn1.e(this, i13), new zn1.e(this, 1), new zn1.f(this, i13));
    }

    public final yq0.c0 c(boolean z13, TextInputLayout inputLayout) {
        com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.f120538d;
        r0 makeClickEvent = new r0(this, 19);
        qVar.getClass();
        Intrinsics.checkNotNullParameter(inputLayout, "inputLayout");
        Intrinsics.checkNotNullParameter(makeClickEvent, "makeClickEvent");
        yq0.c0 c0Var = new yq0.c0(2, qVar, makeClickEvent);
        if (!z13) {
            com.google.android.material.textfield.v vVar = inputLayout.f33163b;
            View.OnLongClickListener onLongClickListener = vVar.f33322h;
            CheckableImageButton checkableImageButton = vVar.f33318d;
            checkableImageButton.setOnClickListener(c0Var);
            l0.k1(checkableImageButton, onLongClickListener);
        }
        return c0Var;
    }

    public final void d(int i13, int i14, String str) {
        this.f120536b = true;
        GestaltTextField gestaltTextField = (GestaltTextField) this.f120537c;
        gestaltTextField.X(new an1.i(ao1.b.e(gestaltTextField.k0(), bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, Integer.valueOf(i13 + i14), null, null, null, null, 0, 4161534), 17));
        this.f120536b = false;
    }

    public final im2.d f() {
        return ((lm2.a) ((rg.a) this.f120538d).f107929a).f83947q;
    }

    public final ArrayList j(sn2.f fVar) {
        qn2.p pVar = qn2.p.f104516a;
        im2.a0 a0Var = (im2.a0) ((xk2.k) ((rg.a) this.f120538d).f107932d).getValue();
        im2.d f13 = f();
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        qm2.a aVar = new qm2.a(fVar, f13.c(a0Var, ((pn2.b0) fVar).getAnnotations()), null);
        br1.a0 a0Var2 = new br1.a0(11, this, pVar);
        ArrayList arrayList = new ArrayList(1);
        e(aVar, arrayList, a0Var2);
        return arrayList;
    }
}
