package q3;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f102208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f102209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f102210c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f102211d;

    public g0(q0 q0Var, l0 l0Var, int i13, q0 q0Var2) {
        this.f102209b = l0Var;
        this.f102210c = i13;
        this.f102211d = q0Var2;
        this.f102208a = q0Var;
    }

    @Override // q3.q0
    public final Map c() {
        return this.f102208a.c();
    }

    @Override // q3.q0
    public final void d() {
        int i13 = this.f102210c;
        l0 l0Var = this.f102209b;
        l0Var.f102234e = i13;
        this.f102211d.d();
        Set entrySet = l0Var.f102241l.entrySet();
        q0.e predicate = new q0.e(l0Var, 26);
        Intrinsics.checkNotNullParameter(entrySet, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        kotlin.collections.k0.x(entrySet, predicate, true);
    }

    @Override // q3.q0
    public final Function1 e() {
        return this.f102208a.e();
    }

    @Override // q3.q0
    public final int i() {
        return this.f102208a.i();
    }

    @Override // q3.q0
    public final int j() {
        return this.f102208a.j();
    }
}
