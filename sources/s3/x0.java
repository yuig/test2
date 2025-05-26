package s3;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x0 implements q3.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f110993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f110994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f110995d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f110996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0 f110997f;

    public x0(int i13, int i14, Map map, Function1 function1, z0 z0Var) {
        this.f110992a = i13;
        this.f110993b = i14;
        this.f110994c = map;
        this.f110996e = function1;
        this.f110997f = z0Var;
    }

    @Override // q3.q0
    public final Map c() {
        return this.f110994c;
    }

    @Override // q3.q0
    public final void d() {
        this.f110996e.invoke(this.f110997f.f111015i);
    }

    @Override // q3.q0
    public final Function1 e() {
        return this.f110995d;
    }

    @Override // q3.q0
    public final int i() {
        return this.f110993b;
    }

    @Override // q3.q0
    public final int j() {
        return this.f110992a;
    }
}
