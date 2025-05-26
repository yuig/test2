package t3;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c5 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115924i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d5 f115925j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f115926k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5(d5 d5Var, Function2 function2, int i13) {
        super(2);
        this.f115924i = i13;
        this.f115925j = d5Var;
        this.f115926k = function2;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f115924i;
        Function2 function2 = this.f115926k;
        int i15 = 0;
        d5 d5Var = this.f115925j;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                AndroidCompositionLocals_androidKt.a(d5Var.f115942a, function2, oVar, 0);
                break;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                Object tag = d5Var.f115942a.getTag(u2.s.inspection_slot_table_set);
                Set set = (tag instanceof Set) && (!(tag instanceof ll2.a) || (tag instanceof ll2.f)) ? (Set) tag : null;
                c0 c0Var = d5Var.f115942a;
                if (set == null) {
                    Object parent = c0Var.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(u2.s.inspection_slot_table_set) : null;
                    set = (!(tag2 instanceof Set) || ((tag2 instanceof ll2.a) && !(tag2 instanceof ll2.f))) ? null : (Set) tag2;
                }
                if (set != null) {
                    i2.s sVar3 = (i2.s) oVar;
                    set.add(sVar3.f71267c);
                    sVar3.f71280p = true;
                    sVar3.B = true;
                    sVar3.f71267c.d();
                    sVar3.G.d();
                    i2.y2 y2Var = sVar3.H;
                    i2.w2 w2Var = y2Var.f71376a;
                    y2Var.f71380e = w2Var.f71348i;
                    y2Var.f71381f = w2Var.f71349j;
                }
                i2.s sVar4 = (i2.s) oVar;
                boolean j13 = sVar4.j(d5Var);
                Object J2 = sVar4.J();
                am.d dVar = i2.n.f71185a;
                if (j13 || J2 == dVar) {
                    J2 = new a5(d5Var, null);
                    sVar4.g0(J2);
                }
                i2.u.e(c0Var, (Function2) J2, sVar4);
                boolean j14 = sVar4.j(d5Var);
                Object J3 = sVar4.J();
                if (j14 || J3 == dVar) {
                    J3 = new b5(d5Var, null);
                    sVar4.g0(J3);
                }
                i2.u.e(c0Var, (Function2) J3, sVar4);
                com.bumptech.glide.d.a(t2.b.f115818a.c(set), q2.i.c(-1193460702, new c5(d5Var, function2, i15), sVar4), sVar4, 56);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f115924i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
