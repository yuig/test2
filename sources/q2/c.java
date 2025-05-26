package q2;

import i2.o;
import i2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class c extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f102064i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f102065j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f102066k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f102067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f102068m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f102069n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        super(2);
        this.f102064i = hVar;
        this.f102065j = obj;
        this.f102066k = obj2;
        this.f102067l = obj3;
        this.f102068m = obj4;
        this.f102069n = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f102069n) | 1;
        Object obj3 = this.f102067l;
        Object obj4 = this.f102068m;
        this.f102064i.h(this.f102065j, this.f102066k, obj3, obj4, (o) obj, p13);
        return Unit.f80348a;
    }
}
