package b4;

import b3.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21506i;

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f21489j = new a0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a0 f21490k = new a0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a0 f21491l = new a0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a0 f21492m = new a0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a0 f21493n = new a0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a0 f21494o = new a0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a0 f21495p = new a0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a0 f21496q = new a0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a0 f21497r = new a0(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a0 f21498s = new a0(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a0 f21499t = new a0(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a0 f21500u = new a0(11);

    /* renamed from: v, reason: collision with root package name */
    public static final a0 f21501v = new a0(12);

    /* renamed from: w, reason: collision with root package name */
    public static final a0 f21502w = new a0(13);

    /* renamed from: x, reason: collision with root package name */
    public static final a0 f21503x = new a0(14);

    /* renamed from: y, reason: collision with root package name */
    public static final a0 f21504y = new a0(15);

    /* renamed from: z, reason: collision with root package name */
    public static final a0 f21505z = new a0(16);
    public static final a0 A = new a0(17);
    public static final a0 B = new a0(18);
    public static final a0 C = new a0(19);
    public static final a0 D = new a0(20);
    public static final a0 E = new a0(21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i13) {
        super(2);
        this.f21506i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = 0;
        switch (this.f21506i) {
            case 0:
                r2.c cVar = (r2.c) obj;
                g gVar = (g) obj2;
                String str = gVar.f21571a;
                r2.s sVar = f0.f21549a;
                List b13 = gVar.b();
                r2.s sVar2 = f0.f21550b;
                Object a13 = f0.a(b13, sVar2, cVar);
                Object obj3 = gVar.f21573c;
                if (obj3 == null) {
                    obj3 = kotlin.collections.q0.f80391a;
                }
                return kotlin.collections.f0.d(str, a13, f0.a(obj3, sVar2, cVar), f0.a(gVar.f21574d, sVar2, cVar));
            case 1:
                r2.c cVar2 = (r2.c) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i13 < size) {
                    arrayList.add(f0.a((e) list.get(i13), f0.f21551c, cVar2));
                    i13++;
                }
                return arrayList;
            case 2:
                r2.c cVar3 = (r2.c) obj;
                e eVar = (e) obj2;
                Object obj4 = eVar.f21542a;
                i iVar = obj4 instanceof v ? i.Paragraph : obj4 instanceof g0 ? i.Span : obj4 instanceof u0 ? i.VerbatimTts : obj4 instanceof t0 ? i.Url : obj4 instanceof m ? i.Link : obj4 instanceof l ? i.Clickable : i.String;
                int i14 = c0.f21535a[iVar.ordinal()];
                Object obj5 = eVar.f21542a;
                switch (i14) {
                    case 1:
                        Intrinsics.g(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        obj5 = f0.a((v) obj5, f0.f21556h, cVar3);
                        break;
                    case 2:
                        Intrinsics.g(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        obj5 = f0.a((g0) obj5, f0.f21557i, cVar3);
                        break;
                    case 3:
                        Intrinsics.g(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        obj5 = f0.a((u0) obj5, f0.f21552d, cVar3);
                        break;
                    case 4:
                        Intrinsics.g(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        obj5 = f0.a((t0) obj5, f0.f21553e, cVar3);
                        break;
                    case 5:
                        Intrinsics.g(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        obj5 = f0.a((m) obj5, f0.f21554f, cVar3);
                        break;
                    case 6:
                        Intrinsics.g(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        obj5 = f0.a((l) obj5, f0.f21555g, cVar3);
                        break;
                    case 7:
                        r2.s sVar3 = f0.f21549a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return kotlin.collections.f0.d(iVar, obj5, Integer.valueOf(eVar.f21543b), Integer.valueOf(eVar.f21544c), eVar.f21545d);
            case 3:
                return Float.valueOf(((m4.a) obj2).f85783a);
            case 4:
                l lVar = (l) obj2;
                return kotlin.collections.f0.d(lVar.f21601a, f0.a(lVar.f21602b, f0.f21558j, (r2.c) obj));
            case 5:
                long j13 = ((b3.w) obj2).f21392a;
                return j13 == 16 ? Boolean.FALSE : Integer.valueOf(androidx.compose.ui.graphics.a.u(j13));
            case 6:
                return Integer.valueOf(((g4.l) obj2).f63474a);
            case 7:
                m mVar = (m) obj2;
                return kotlin.collections.f0.d(mVar.f21613a, f0.a(mVar.f21614b, f0.f21558j, (r2.c) obj));
            case 8:
                r2.c cVar4 = (r2.c) obj;
                List list2 = ((i4.c) obj2).f71504a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i13 < size2) {
                    arrayList2.add(f0.a((i4.b) list2.get(i13), f0.f21570v, cVar4));
                    i13++;
                }
                return arrayList2;
            case 9:
                return ((i4.b) obj2).f71502a.toLanguageTag();
            case 10:
                long j14 = ((a3.c) obj2).f482a;
                if (a3.c.b(j14, y2.h.f136670b)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(a3.c.d(j14));
                r2.s sVar4 = f0.f21549a;
                return kotlin.collections.f0.d(valueOf, Float.valueOf(a3.c.e(j14)));
            case 11:
                r2.c cVar5 = (r2.c) obj;
                v vVar = (v) obj2;
                m4.j jVar = new m4.j(vVar.f21664a);
                r2.s sVar5 = f0.f21549a;
                m4.l lVar2 = new m4.l(vVar.f21665b);
                Object a14 = f0.a(new n4.m(vVar.f21666c), f0.f21567s, cVar5);
                m4.q qVar = m4.q.f85809c;
                return kotlin.collections.f0.d(jVar, lVar2, a14, f0.a(vVar.f21667d, f0.f21561m, cVar5));
            case 12:
                r2.c cVar6 = (r2.c) obj;
                w0 w0Var = (w0) obj2;
                return kotlin.collections.f0.d(f0.a(new b3.w(w0Var.f21394a), f0.f21566r, cVar6), f0.a(new a3.c(w0Var.f21395b), f0.f21568t, cVar6), Float.valueOf(w0Var.f21396c));
            case 13:
                r2.c cVar7 = (r2.c) obj;
                g0 g0Var = (g0) obj2;
                b3.w wVar = new b3.w(g0Var.f21575a.b());
                e0 e0Var = f0.f21566r;
                Object a15 = f0.a(wVar, e0Var, cVar7);
                n4.m mVar2 = new n4.m(g0Var.f21576b);
                e0 e0Var2 = f0.f21567s;
                Object a16 = f0.a(mVar2, e0Var2, cVar7);
                g4.l lVar3 = g4.l.f63467b;
                Object a17 = f0.a(g0Var.f21577c, f0.f21562n, cVar7);
                Object a18 = f0.a(new n4.m(g0Var.f21582h), e0Var2, cVar7);
                Object a19 = f0.a(g0Var.f21583i, f0.f21563o, cVar7);
                Object a23 = f0.a(g0Var.f21584j, f0.f21560l, cVar7);
                i4.c cVar8 = i4.c.f71503c;
                Object a24 = f0.a(g0Var.f21585k, f0.f21569u, cVar7);
                Object a25 = f0.a(new b3.w(g0Var.f21586l), e0Var, cVar7);
                Object a26 = f0.a(g0Var.f21587m, f0.f21559k, cVar7);
                w0 w0Var2 = w0.f21393d;
                return kotlin.collections.f0.d(a15, a16, a17, g0Var.f21578d, g0Var.f21579e, -1, g0Var.f21581g, a18, a19, a23, a24, a25, a26, f0.a(g0Var.f21588n, f0.f21565q, cVar7));
            case 14:
                return Integer.valueOf(((m4.k) obj2).f85801a);
            case 15:
                m4.p pVar = (m4.p) obj2;
                return kotlin.collections.f0.d(Float.valueOf(pVar.f85807a), Float.valueOf(pVar.f85808b));
            case 16:
                r2.c cVar9 = (r2.c) obj;
                m4.q qVar2 = (m4.q) obj2;
                n4.m mVar3 = new n4.m(qVar2.f85810a);
                e0 e0Var3 = f0.f21567s;
                return kotlin.collections.f0.d(f0.a(mVar3, e0Var3, cVar9), f0.a(new n4.m(qVar2.f85811b), e0Var3, cVar9));
            case 17:
                r2.c cVar10 = (r2.c) obj;
                n0 n0Var = (n0) obj2;
                g0 g0Var2 = n0Var.f21621a;
                r2.s sVar6 = f0.f21557i;
                return kotlin.collections.f0.d(f0.a(g0Var2, sVar6, cVar10), f0.a(n0Var.f21622b, sVar6, cVar10), f0.a(n0Var.f21623c, sVar6, cVar10), f0.a(n0Var.f21624d, sVar6, cVar10));
            case 18:
                long j15 = ((p0) obj2).f21641a;
                int i15 = p0.f21640c;
                Integer valueOf2 = Integer.valueOf((int) (j15 >> 32));
                r2.s sVar7 = f0.f21549a;
                return kotlin.collections.f0.d(valueOf2, Integer.valueOf((int) (j15 & 4294967295L)));
            case 19:
                long j16 = ((n4.m) obj2).f89190a;
                if (n4.m.a(j16, n4.m.f89189c)) {
                    return Boolean.FALSE;
                }
                Float valueOf3 = Float.valueOf(n4.m.c(j16));
                r2.s sVar8 = f0.f21549a;
                return kotlin.collections.f0.d(valueOf3, new n4.n(n4.m.b(j16)));
            case 20:
                String str2 = ((t0) obj2).f21662a;
                r2.s sVar9 = f0.f21549a;
                return str2;
            default:
                String str3 = ((u0) obj2).f21663a;
                r2.s sVar10 = f0.f21549a;
                return str3;
        }
    }
}
