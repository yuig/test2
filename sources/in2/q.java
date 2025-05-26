package in2;

import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72876i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f72877j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i13) {
        super(0);
        this.f72876i = i13;
        this.f72877j = rVar;
    }

    public final List b() {
        int i13 = this.f72876i;
        r rVar = this.f72877j;
        switch (i13) {
            case 0:
                return f0.j(dl2.b.T(rVar.f72879b), dl2.b.U(rVar.f72879b));
            default:
                return rVar.f72880c ? f0.k(dl2.b.S(rVar.f72879b)) : q0.f80391a;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f72876i) {
        }
        return b();
    }
}
