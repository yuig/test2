package s80;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class z3 extends kotlin.jvm.internal.s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111876i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f111877j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f111878k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f111879l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(Object obj, Object obj2, Object obj3, int i13) {
        super(4);
        this.f111876i = i13;
        this.f111878k = obj;
        this.f111877j = obj2;
        this.f111879l = obj3;
    }

    public final void b(s1.g0 HorizontalPager, int i13, i2.o oVar) {
        u2.n nVar = u2.n.f120041b;
        int i14 = this.f111876i;
        Object obj = this.f111879l;
        Object obj2 = this.f111877j;
        Object obj3 = this.f111878k;
        switch (i14) {
            case 1:
                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                ia0.q qVar = (ia0.q) CollectionsKt.U(i13, (List) obj3);
                if (qVar == null) {
                    qVar = ia0.q.f71983c;
                }
                ia0.q qVar2 = qVar;
                s1.o0 o0Var = (s1.o0) obj;
                if (i13 < 0) {
                    o0Var.getClass();
                } else if (i13 <= o0Var.n()) {
                    float l13 = (i13 - o0Var.l()) - o0Var.f110493c.f110450c.h();
                    float f13 = ql2.s.f(Math.abs(l13), 0.0f, 1.0f);
                    if (l13 <= 0.0f) {
                        f13 = -f13;
                    }
                    ia0.l.c(qVar2, androidx.compose.foundation.layout.e.b(kh2.g0.m0(nVar, f13 * 2.0f), 1.0f), 0.0f, 0L, new ia0.f((Function1) obj2, qVar2, 0), oVar, 8, 12);
                    return;
                }
                StringBuilder s13 = a.a.s("page ", i13, " is not within the range 0 to ");
                s13.append(o0Var.n());
                throw new IllegalArgumentException(s13.toString().toString());
            default:
                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                ia0.q qVar3 = (ia0.q) CollectionsKt.U(i13, (List) obj3);
                if (qVar3 == null) {
                    qVar3 = ia0.q.f71983c;
                }
                ia0.q qVar4 = qVar3;
                u2.q b13 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
                Function1 function1 = (Function1) obj2;
                Function1 function12 = (Function1) obj;
                p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, oVar, 0);
                i2.s sVar = (i2.s) oVar;
                int i15 = sVar.P;
                i2.z1 o13 = sVar.o();
                u2.q X = ao2.m0.X(oVar, b13);
                s3.k.Qo.getClass();
                s3.i iVar = s3.j.f110798b;
                boolean z13 = sVar.f71265a instanceof i2.f;
                if (!z13) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar.a0();
                if (sVar.O) {
                    sVar.n(iVar);
                } else {
                    sVar.j0();
                }
                s3.h hVar = s3.j.f110801e;
                tb.f.f0(oVar, a13, hVar);
                s3.h hVar2 = s3.j.f110800d;
                tb.f.f0(oVar, o13, hVar2);
                s3.h hVar3 = s3.j.f110802f;
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
                    ep.b.y(i15, sVar, i15, hVar3);
                }
                s3.h hVar4 = s3.j.f110799c;
                tb.f.f0(oVar, X, hVar4);
                u2.q b14 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
                q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
                int i16 = sVar.P;
                i2.z1 o14 = sVar.o();
                u2.q X2 = ao2.m0.X(oVar, b14);
                if (!z13) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar.a0();
                if (sVar.O) {
                    sVar.n(iVar);
                } else {
                    sVar.j0();
                }
                tb.f.f0(oVar, e13, hVar);
                tb.f.f0(oVar, o14, hVar2);
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
                    ep.b.y(i16, sVar, i16, hVar3);
                }
                tb.f.f0(oVar, X2, hVar4);
                androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
                ia0.z.b(qVar4, androidx.compose.foundation.layout.e.f17184c, 0.0f, 0L, new ia0.f(function1, qVar4, 1), oVar, 56, 12);
                u2.q n13 = androidx.compose.foundation.layout.b.n(cVar.a(androidx.compose.foundation.layout.e.b(nVar, 1.0f), u2.b.f120020h), com.bumptech.glide.d.A(eo1.c.space_200, oVar));
                int i17 = ea0.k.use_template_button_label;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                rl2.g0.b(new yl1.b(new u50.k0(i17, new ArrayList(0)), false, null, null, yl1.d.TERTIARY.getColorPalette(), yl1.c.SMALL, null, null, 0, null, 974), n13, new t80.r(16, function12, qVar4), oVar, 8, 0);
                sVar.r(true);
                ia0.b bVar = qVar4.f71985b;
                if (!bVar.e(oVar)) {
                    kg.t.b(bVar, null, oVar, 8, 2);
                }
                sVar.r(true);
                return;
        }
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        int i14 = this.f111876i;
        Object obj5 = this.f111879l;
        Object obj6 = this.f111877j;
        Object obj7 = this.f111878k;
        switch (i14) {
            case 0:
                i1.r AnimatedContent = (i1.r) obj;
                p7 targetState = (p7) obj2;
                i2.o oVar = (i2.o) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.checkNotNullParameter(targetState, "targetState");
                int i15 = y3.f111856a[targetState.ordinal()];
                u2.n nVar = u2.n.f120041b;
                if (i15 == 1) {
                    i2.s sVar = (i2.s) oVar;
                    sVar.W(1361823276);
                    w80.x1 x1Var = ((j) obj7).f111593b;
                    u2.q b13 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
                    sVar.W(-1475086960);
                    float n13 = kh2.u2.n(om1.e.LG, sVar);
                    sVar.r(false);
                    kh2.u2.m(x1Var, b13, n13, (Function1) obj6, (Function1) obj5, sVar, 56, 0);
                    sVar.r(false);
                } else if (i15 == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    sVar2.W(1362206932);
                    kh2.u2.l(6, 0, sVar2, androidx.compose.foundation.layout.e.b(nVar, 1.0f), (Function1) obj6);
                    sVar2.r(false);
                } else if (i15 == 3 || i15 == 4) {
                    i2.s sVar3 = (i2.s) oVar;
                    sVar3.W(1362447399);
                    sVar3.W(-1475086960);
                    float n14 = kh2.u2.n(om1.e.LG, sVar3);
                    sVar3.r(false);
                    kh2.u2.k(n14, null, sVar3, 0, 2);
                    sVar3.r(false);
                } else {
                    i2.s sVar4 = (i2.s) oVar;
                    sVar4.W(1362575522);
                    sVar4.r(false);
                }
                break;
            case 1:
                ((Number) obj4).intValue();
                b((s1.g0) obj, ((Number) obj2).intValue(), (i2.o) obj3);
                break;
            case 2:
                ((Number) obj4).intValue();
                b((s1.g0) obj, ((Number) obj2).intValue(), (i2.o) obj3);
                break;
            default:
                q1.c cVar = (q1.c) obj;
                int intValue = ((Number) obj2).intValue();
                i2.o oVar2 = (i2.o) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i13 = intValue2 | (((i2.s) oVar2).h(cVar) ? 4 : 2);
                } else {
                    i13 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i13 |= ((i2.s) oVar2).f(intValue) ? 32 : 16;
                }
                if ((i13 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
                    i2.s sVar5 = (i2.s) oVar2;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                om0.f1 f1Var = (om0.f1) ((List) obj7).get(intValue);
                i2.s sVar6 = (i2.s) oVar2;
                sVar6.W(-1230543224);
                om0.o1.c(f1Var, null, (om0.f0) obj6, (om0.a1) obj5, sVar6, BitmapUtils.BITMAP_TO_JPEG_SIZE, 2);
                sVar6.r(false);
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(List list, s1.o0 o0Var, Function1 function1) {
        super(4);
        this.f111876i = 1;
        this.f111878k = list;
        this.f111879l = o0Var;
        this.f111877j = function1;
    }
}
