package bk1;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23380i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f23381j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f23382k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f23383l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Enum f23384m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f23385n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Object obj, Object obj2, Object obj3, Enum r43, Object obj4, int i13) {
        super(1);
        this.f23380i = i13;
        this.f23381j = obj;
        this.f23382k = obj2;
        this.f23383l = obj3;
        this.f23384m = r43;
        this.f23385n = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f23380i;
        Object obj2 = this.f23385n;
        Enum r33 = this.f23384m;
        Object obj3 = this.f23383l;
        Object obj4 = this.f23382k;
        Object obj5 = this.f23381j;
        switch (i13) {
            case 0:
                a2 it = (a2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                v vVar = (v) ((q0) obj5);
                boolean z13 = vVar.f23362b;
                wa2.m mVar = (wa2.m) obj4;
                boolean z14 = mVar.N;
                wa2.g0 g0Var = mVar.f128851b0;
                boolean z15 = g0Var != null && g0Var.f128731m;
                h32.u0 u0Var = g0Var != null ? g0Var.f128726h : null;
                z1 z1Var = (z1) obj3;
                boolean D = ((es.v) z1Var.f23390d).D();
                es.v vVar2 = (es.v) z1Var.f23390d;
                boolean P = vVar2.P();
                x32.e eVar = (x32.e) r33;
                return a2.b(it, null, mVar.f128847J, mVar.f128879p0, mVar.f128877o0, null, 0, false, null, null, null, z13, z15, null, null, 0, false, z14, mVar.O, mVar.S, mVar.T, u0Var, mVar.W, mVar.X, g0Var != null && g0Var.f128738t, g0Var != null && g0Var.f128719a, g0Var != null && g0Var.f128722d, g0Var != null && g0Var.f128743y, null, null, mVar.f128875n0, mVar.M, false, vVar.f23363c, false, D, eVar, vVar2.l(eVar, ((a2) obj2).f23155a), P, false, false, false, 16580383, 493208);
            default:
                tn1.b state = (tn1.b) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                tn1.e eVar2 = (tn1.e) obj5;
                tn1.c cVar = (tn1.c) obj4;
                Context context = cVar.f118619a;
                vn1.g variant = vn1.g.BODY_100;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(variant, "default");
                if (context != null) {
                    vn1.g gVar = dl2.b.T1(context) ? eVar2.f118625b : eVar2.f118624a;
                    if (gVar != null) {
                        variant = gVar;
                    }
                }
                tn1.d dVar = (tn1.d) obj3;
                Context context2 = cVar.f118619a;
                List style = tn1.c.f118617i;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(style, "default");
                if (context2 != null) {
                    List list = dl2.b.T1(context2) ? dVar.f118623b : dVar.f118622a;
                    if (list != null) {
                        style = list;
                    }
                }
                vn1.c color = (vn1.c) r33;
                vn1.b alignment = (vn1.b) obj2;
                state.getClass();
                Intrinsics.checkNotNullParameter(color, "color");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(variant, "variant");
                return new tn1.b(color, alignment, style, variant);
        }
    }
}
