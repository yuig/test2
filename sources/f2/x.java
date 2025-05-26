package f2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import q3.b1;
import q3.c1;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c1 f60934i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f60935j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f60936k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c1 f60937l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f60938m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f60939n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c1 c1Var, int i13, int i14, c1 c1Var2, int i15, int i16) {
        super(1);
        this.f60934i = c1Var;
        this.f60935j = i13;
        this.f60936k = i14;
        this.f60937l = c1Var2;
        this.f60938m = i15;
        this.f60939n = i16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b1 b1Var = (b1) obj;
        b1.f(b1Var, this.f60934i, this.f60935j, this.f60936k);
        b1.f(b1Var, this.f60937l, this.f60938m, this.f60939n);
        return Unit.f80348a;
    }
}
