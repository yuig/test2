package ro2;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements oo2.g {

    /* renamed from: a, reason: collision with root package name */
    public final xk2.v f109039a;

    public s(p pVar) {
        this.f109039a = xk2.m.b(pVar);
    }

    public final oo2.g a() {
        return (oo2.g) this.f109039a.getValue();
    }

    @Override // oo2.g
    public final boolean b() {
        return false;
    }

    @Override // oo2.g
    public final oo2.n c() {
        return a().c();
    }

    @Override // oo2.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return a().d(name);
    }

    @Override // oo2.g
    public final int e() {
        return a().e();
    }

    @Override // oo2.g
    public final String f(int i13) {
        return a().f(i13);
    }

    @Override // oo2.g
    public final List g(int i13) {
        return a().g(i13);
    }

    @Override // oo2.g
    public final List getAnnotations() {
        return q0.f80391a;
    }

    @Override // oo2.g
    public final oo2.g h(int i13) {
        return a().h(i13);
    }

    @Override // oo2.g
    public final String i() {
        return a().i();
    }

    @Override // oo2.g
    public final boolean isInline() {
        return false;
    }

    @Override // oo2.g
    public final boolean j(int i13) {
        return a().j(i13);
    }
}
