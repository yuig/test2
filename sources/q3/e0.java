package q3;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f102195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f102196c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f102197d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f102198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f102199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f102200g;

    public e0(int i13, int i14, Map map, f0 f0Var, l0 l0Var, Function1 function1) {
        this.f102194a = i13;
        this.f102195b = i14;
        this.f102196c = map;
        this.f102198e = f0Var;
        this.f102199f = l0Var;
        this.f102200g = function1;
    }

    @Override // q3.q0
    public final Map c() {
        return this.f102196c;
    }

    @Override // q3.q0
    public final void d() {
        s3.a1 V0;
        boolean K = this.f102198e.K();
        Function1 function1 = this.f102200g;
        l0 l0Var = this.f102199f;
        if (!K || (V0 = l0Var.f102230a.f110837y.f110805b.V0()) == null) {
            function1.invoke(l0Var.f102230a.f110837y.f110805b.f111015i);
        } else {
            function1.invoke(V0.f111015i);
        }
    }

    @Override // q3.q0
    public final Function1 e() {
        return this.f102197d;
    }

    @Override // q3.q0
    public final int i() {
        return this.f102195b;
    }

    @Override // q3.q0
    public final int j() {
        return this.f102194a;
    }
}
