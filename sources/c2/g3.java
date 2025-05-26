package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g3 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24763i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f24764j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f24765k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h4.p0 f24766l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o1.l f24767m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f24768n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function2 f24769o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function2 f24770p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function2 f24771q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function2 f24772r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b3.x0 f24773s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m1 f24774t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f24775u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(Object obj, boolean z13, boolean z14, h4.p0 p0Var, o1.l lVar, boolean z15, Function2 function2, Function2 function22, Function2 function23, Function2 function24, b3.x0 x0Var, m1 m1Var, int i13) {
        super(3);
        this.f24763i = i13;
        this.f24775u = obj;
        this.f24764j = z13;
        this.f24765k = z14;
        this.f24766l = p0Var;
        this.f24767m = lVar;
        this.f24768n = z15;
        this.f24769o = function2;
        this.f24770p = function22;
        this.f24771q = function23;
        this.f24772r = function24;
        this.f24773s = x0Var;
        this.f24774t = m1Var;
    }

    public final void b(Function2 function2, i2.o oVar, int i13) {
        int i14;
        int i15;
        int i16 = this.f24763i;
        Object obj = this.f24775u;
        switch (i16) {
            case 0:
                if ((i13 & 6) == 0) {
                    i14 = i13 | (((i2.s) oVar).j(function2) ? 4 : 2);
                } else {
                    i14 = i13;
                }
                if ((i14 & 19) == 18) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                g5 g5Var = g5.f24781a;
                String str = ((h4.f0) obj).f67559a.f21571a;
                boolean z13 = this.f24764j;
                boolean z14 = this.f24768n;
                o1.l lVar = this.f24767m;
                m1 m1Var = this.f24774t;
                b3.x0 x0Var = this.f24773s;
                g5Var.b(str, function2, z13, this.f24765k, this.f24766l, lVar, z14, this.f24769o, this.f24770p, this.f24771q, this.f24772r, x0Var, m1Var, null, q2.i.c(-794566495, new f3(z13, z14, lVar, m1Var, x0Var, 0), oVar), oVar, (i14 << 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 221184, 8192);
                break;
            default:
                if ((i13 & 6) == 0) {
                    i15 = i13 | (((i2.s) oVar).j(function2) ? 4 : 2);
                } else {
                    i15 = i13;
                }
                if ((i15 & 19) == 18) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                g5.f24781a.c((String) obj, function2, this.f24764j, this.f24765k, this.f24766l, this.f24767m, this.f24768n, this.f24769o, this.f24770p, this.f24771q, this.f24772r, this.f24773s, this.f24774t, null, oVar, (i15 << 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 24576, 8192);
                break;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f24763i) {
            case 0:
                b((Function2) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            default:
                b((Function2) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
