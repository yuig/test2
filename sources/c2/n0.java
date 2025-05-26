package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f24991i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f24992j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f24993k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f24994l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f24995m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f24996n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f24997o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f24998p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(float f13, q3.c1 c1Var, int i13, int i14, int i15, q3.c1 c1Var2, int i16, int i17) {
        super(1);
        this.f24991i = f13;
        this.f24992j = c1Var;
        this.f24993k = i13;
        this.f24994l = i14;
        this.f24995m = i15;
        this.f24996n = c1Var2;
        this.f24997o = i16;
        this.f24998p = i17;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q3.b1 b1Var = (q3.b1) obj;
        float f13 = this.f24991i;
        int i13 = this.f24995m;
        if (f13 != 0.0f) {
            int i14 = this.f24994l + i13;
            q3.b1.f(b1Var, this.f24992j, this.f24993k, i14);
        }
        int i15 = this.f24998p + i13;
        q3.b1.f(b1Var, this.f24996n, this.f24997o, i15);
        return Unit.f80348a;
    }
}
