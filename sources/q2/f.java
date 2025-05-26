package q2;

import i2.o;
import i2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class f extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f102087i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f102088j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f102089k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f102090l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f102091m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f102092n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f102093o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f102094p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f102095q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f102096r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i13) {
        super(2);
        this.f102087i = hVar;
        this.f102088j = obj;
        this.f102089k = obj2;
        this.f102090l = obj3;
        this.f102091m = obj4;
        this.f102092n = obj5;
        this.f102093o = obj6;
        this.f102094p = obj7;
        this.f102095q = obj8;
        this.f102096r = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f102096r) | 1;
        Object obj3 = this.f102094p;
        Object obj4 = this.f102095q;
        this.f102087i.n(this.f102088j, this.f102089k, this.f102090l, this.f102091m, this.f102092n, this.f102093o, obj3, obj4, (o) obj, p13);
        return Unit.f80348a;
    }
}
