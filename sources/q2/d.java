package q2;

import i2.o;
import i2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class d extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f102070i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f102071j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f102072k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f102073l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f102074m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f102075n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f102076o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f102077p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i13) {
        super(2);
        this.f102070i = hVar;
        this.f102071j = obj;
        this.f102072k = obj2;
        this.f102073l = obj3;
        this.f102074m = obj4;
        this.f102075n = obj5;
        this.f102076o = obj6;
        this.f102077p = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f102077p) | 1;
        Object obj3 = this.f102075n;
        Object obj4 = this.f102076o;
        this.f102070i.j(this.f102071j, this.f102072k, this.f102073l, this.f102074m, obj3, obj4, (o) obj, p13);
        return Unit.f80348a;
    }
}
