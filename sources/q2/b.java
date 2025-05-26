package q2;

import i2.o;
import i2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f102059i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f102060j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f102061k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f102062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f102063m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, Object obj, Object obj2, Object obj3, int i13) {
        super(2);
        this.f102059i = hVar;
        this.f102060j = obj;
        this.f102061k = obj2;
        this.f102062l = obj3;
        this.f102063m = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f102063m) | 1;
        Object obj3 = this.f102061k;
        Object obj4 = this.f102062l;
        this.f102059i.f(this.f102060j, obj3, obj4, (o) obj, p13);
        return Unit.f80348a;
    }
}
