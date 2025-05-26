package sc0;

import i2.o;
import i2.u;
import kh2.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class c extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112282i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f112283j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f112284k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f112285l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f112286m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f112287n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i13, q qVar, int i14, Function0 function0, int i15, int i16) {
        super(2);
        this.f112282i = i13;
        this.f112283j = qVar;
        this.f112284k = i14;
        this.f112285l = function0;
        this.f112286m = i15;
        this.f112287n = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f112286m | 1);
        int i13 = this.f112284k;
        Function0 function0 = this.f112285l;
        b0.y(this.f112282i, this.f112283j, i13, function0, (o) obj, p13, this.f112287n);
        return Unit.f80348a;
    }
}
