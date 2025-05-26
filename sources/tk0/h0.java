package tk0;

import com.pinterest.api.model.ta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kh2.a1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o82.u0;
import o82.y0;
import u50.j0;
import u52.b1;
import u52.c1;
import u52.e1;
import um0.w0;
import um0.x0;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117968i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.e f117969j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i13, l82.e eVar) {
        super(1);
        this.f117968i = i13;
        this.f117969j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f117968i;
        l82.e eVar = this.f117969j;
        switch (i13) {
            case 0:
                e it = (e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = ((i0) eVar.f82219b).f117979i;
                return e.e(it, null, null, a.e(it.f117957c, true, i14, bs1.c.i2(d70.f.delete_pins_warning_message, i14, String.valueOf(i14)), 52), false, 11);
            case 1:
                um0.e it2 = (um0.e) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                int i15 = ((w0) eVar.f82219b).f122778h;
                boolean z13 = ((um0.e) eVar.f82218a).f122701g;
                Intrinsics.checkNotNullParameter(it2, "<this>");
                xm0.d headerState = a1.H0(it2.f122697c.f122780a, i15, z13);
                Intrinsics.checkNotNullParameter(headerState, "headerState");
                return um0.e.e(it2, null, null, new x0(headerState), 3);
            case 2:
                xs0.q it3 = (xs0.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                Boolean D4 = ((xs0.g0) eVar.f82219b).f135807a.D4();
                Boolean D42 = ((xs0.g0) eVar.f82219b).f135807a.D4();
                Intrinsics.f(D42);
                boolean booleanValue = D42.booleanValue();
                Intrinsics.f(D4);
                return xs0.q.e(it3, booleanValue, null, null, D4.booleanValue(), null, 22);
            case 3:
                yy0.d it4 = (yy0.d) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                int i16 = jv1.g.use_case_picker_subtitle_before_minimum;
                int i17 = ((yy0.d0) eVar.f82219b).f140443g;
                String[] formatArgs = {String.valueOf(i17)};
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return yy0.d.e(it4, null, null, new j0(i16, i17, kotlin.collections.c0.b0(formatArgs)), null, 11);
            case 4:
                x91.a it5 = (x91.a) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return x91.a.e(it5, null, null, ((x91.a) eVar.f82218a).f134304b.length() > 0, null, 11);
            case 5:
                kc1.n priorDisplayState = (kc1.n) obj;
                Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
                y0 y0Var = (y0) d7.b.F(priorDisplayState.f79169d.f93524a);
                List<u0> list = y0Var.f93756a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                for (u0 u0Var : list) {
                    l82.i0 i0Var = u0Var.f93721a;
                    Intrinsics.g(i0Var, "null cannot be cast to non-null type com.pinterest.feature.settings.profile.statebased.ChipVMState");
                    Set set = ((kc1.u) eVar.f82219b).f79176b;
                    ic1.y yVar = ((kc1.b) i0Var).f79136a;
                    arrayList.add(u0.a(u0Var, new kc1.b(yVar, CollectionsKt.L(set, yVar))));
                }
                List sectionStates = kotlin.collections.e0.b(y0.f(y0Var, arrayList, null, 6));
                priorDisplayState.f79169d.getClass();
                Intrinsics.checkNotNullParameter(sectionStates, "sectionStates");
                return kc1.n.e(priorDisplayState, null, 0, null, new o82.a0(sectionStates), 7);
            case 6:
                fk1.w it6 = (fk1.w) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return fk1.w.b(it6, null, 0, null, null, false, null, null, false, false, false, false, ((fk1.d) eVar.f82218a).f62348a, 12582911);
            case 7:
                hk1.v it7 = (hk1.v) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return hk1.v.b(it7, null, false, false, false, ((hk1.g) eVar.f82218a).f69351a, 511);
            case 8:
                r52.d0 it8 = (r52.d0) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                return r52.d0.b(it8, null, null, ((r52.d0) eVar.f82219b).f106280g, null, 95);
            case 9:
                Intrinsics.checkNotNullParameter((u52.x) obj, "it");
                b1 b1Var = (b1) eVar.f82219b;
                return Boolean.valueOf((b1Var.f120666e.isEmpty() ^ true) && (b1Var.f120670i.isEmpty() ^ true));
            default:
                u52.x mainDisplayState = (u52.x) obj;
                Intrinsics.checkNotNullParameter(mainDisplayState, "mainDisplayState");
                b1 b1Var2 = (b1) eVar.f82219b;
                Iterator it9 = b1Var2.f120666e.iterator();
                int i18 = 0;
                while (true) {
                    if (!it9.hasNext()) {
                        i18 = -1;
                    } else if (!Intrinsics.d(((ta) it9.next()).getUid(), b1Var2.f120667f)) {
                        i18++;
                    }
                }
                int i19 = i18 >= 0 ? i18 : 0;
                String str = b1Var2.f120663b;
                String str2 = b1Var2.f120665d;
                List list2 = b1Var2.f120666e;
                e1 e1Var = new e1(list2, str, str2);
                c1 c1Var = mainDisplayState.f120745c;
                int size = list2.size();
                c1Var.getClass();
                return u52.x.e(mainDisplayState, e1Var, new u52.v(b1Var2.f120670i), new c1(size, i19), null, 8);
        }
    }
}
