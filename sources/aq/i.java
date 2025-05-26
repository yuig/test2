package aq;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20346i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f20347j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(0);
        this.f20346i = i13;
        this.f20347j = jVar;
    }

    public final String b() {
        int i13 = this.f20346i;
        j jVar = this.f20347j;
        switch (i13) {
            case 0:
                return String.valueOf(jVar.d());
            case 1:
                return String.valueOf(jVar.a());
            case 2:
                return String.valueOf(jVar.b());
            case 3:
                return jVar.G();
            case 4:
                return jVar.A();
            case 5:
                return jVar.F();
            case 6:
                return jVar.C();
            case 7:
                return jVar.D();
            case 8:
                return String.valueOf(jVar.R());
            case 9:
                String Q = jVar.Q();
                return Q == null ? "" : Q;
            case 10:
                return jVar.B();
            case 11:
                List K = jVar.K();
                if (K == null) {
                    K = q0.f80391a;
                }
                return CollectionsKt.Z(CollectionsKt.M(K), ",", null, null, 0, null, null, 62);
            case 12:
                return jVar.S();
            case 13:
                return jVar.x();
            case 14:
                return jVar.U();
            case 15:
                return jVar.J();
            case 16:
                return jVar.v();
            case 17:
                return jVar.P();
            case 18:
                return jVar.t();
            default:
                return String.valueOf(jVar.N());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20346i) {
        }
        return b();
    }
}
