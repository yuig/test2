package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class i1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g3.b f77880i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f77881j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f77882k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u2.e f77883l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q3.n f77884m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f77885n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b3.p f77886o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f77887p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f77888q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(g3.b bVar, String str, u2.q qVar, u2.e eVar, q3.n nVar, float f13, b3.p pVar, int i13, int i14) {
        super(2);
        this.f77880i = bVar;
        this.f77881j = str;
        this.f77882k = qVar;
        this.f77883l = eVar;
        this.f77884m = nVar;
        this.f77885n = f13;
        this.f77886o = pVar;
        this.f77887p = i13;
        this.f77888q = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f77887p | 1);
        float f13 = this.f77885n;
        b3.p pVar = this.f77886o;
        com.bumptech.glide.c.b(this.f77880i, this.f77881j, this.f77882k, this.f77883l, this.f77884m, f13, pVar, (i2.o) obj, p13, this.f77888q);
        return Unit.f80348a;
    }
}
