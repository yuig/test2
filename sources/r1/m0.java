package r1;

import androidx.compose.foundation.lazy.layout.a1;
import androidx.compose.foundation.lazy.layout.b1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p0 f105936i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f105937j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, int i13) {
        super(1);
        this.f105936i = p0Var;
        this.f105937j = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        androidx.compose.foundation.lazy.layout.j0 j0Var = (androidx.compose.foundation.lazy.layout.j0) obj;
        a aVar = this.f105936i.f105954a;
        s2.i P = bk.f.P();
        bk.f.c0(P, bk.f.X(P), P != null ? P.f() : null);
        for (int i13 = 0; i13 < aVar.f105831a; i13++) {
            int i14 = this.f105937j + i13;
            j0Var.getClass();
            long j13 = androidx.compose.foundation.lazy.layout.m0.f17270a;
            androidx.compose.foundation.lazy.layout.l0 l0Var = j0Var.f17255b;
            b1 b1Var = l0Var.f17263d;
            if (b1Var != null) {
                j0Var.f17254a.add(new a1(b1Var, i14, j13, l0Var.f17262c));
            }
        }
        return Unit.f80348a;
    }
}
