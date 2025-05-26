package q2;

import i2.o;
import i2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class g extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f102097i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f102098j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f102099k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f102100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f102101m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f102102n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f102103o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f102104p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f102105q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f102106r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f102107s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i13) {
        super(2);
        this.f102097i = hVar;
        this.f102098j = obj;
        this.f102099k = obj2;
        this.f102100l = obj3;
        this.f102101m = obj4;
        this.f102102n = obj5;
        this.f102103o = obj6;
        this.f102104p = obj7;
        this.f102105q = obj8;
        this.f102106r = obj9;
        this.f102107s = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f102107s) | 1;
        Object obj3 = this.f102105q;
        Object obj4 = this.f102106r;
        this.f102097i.r(this.f102098j, this.f102099k, this.f102100l, this.f102101m, this.f102102n, this.f102103o, this.f102104p, obj3, obj4, (o) obj, p13);
        return Unit.f80348a;
    }
}
