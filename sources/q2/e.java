package q2;

import i2.o;
import i2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f102078i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f102079j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f102080k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f102081l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f102082m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f102083n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f102084o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f102085p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f102086q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i13) {
        super(2);
        this.f102078i = hVar;
        this.f102079j = obj;
        this.f102080k = obj2;
        this.f102081l = obj3;
        this.f102082m = obj4;
        this.f102083n = obj5;
        this.f102084o = obj6;
        this.f102085p = obj7;
        this.f102086q = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f102086q) | 1;
        Object obj3 = this.f102084o;
        Object obj4 = this.f102085p;
        this.f102078i.l(this.f102079j, this.f102080k, this.f102081l, this.f102082m, this.f102083n, obj3, obj4, (o) obj, p13);
        return Unit.f80348a;
    }
}
