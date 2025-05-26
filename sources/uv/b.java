package uv;

import com.pinterest.qrCodeLogin.h;
import com.pinterest.qrCodeLogin.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123146i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k0 f123147j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(k0 k0Var, int i13) {
        super(1);
        this.f123146i = i13;
        this.f123147j = k0Var;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f123146i) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, this.f123147j, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
    }

    public final yl1.b e(yl1.b it) {
        switch (this.f123146i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, this.f123147j, false, null, null, null, null, null, null, 0, null, 1022);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                k0 k0Var = this.f123147j;
                return yl1.b.f(it, k0Var, false, null, k0Var, null, null, null, null, 0, null, 1014);
            case 2:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, this.f123147j, false, null, null, null, null, null, null, 0, null, 1022);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, this.f123147j, false, null, null, null, null, null, null, 0, null, 1020);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f123146i) {
            case 0:
                return e((yl1.b) obj);
            case 1:
                return e((yl1.b) obj);
            case 2:
                cn1.d state = (cn1.d) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return cn1.d.e(state, null, this.f123147j, null, null, null, null, null, null, null, null, null, 524279);
            case 3:
                return e((yl1.b) obj);
            case 4:
                return b((rn1.a) obj);
            case 5:
                return b((rn1.a) obj);
            case 6:
                return e((yl1.b) obj);
            case 7:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, this.f123147j, null, yn1.f.ERROR, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            default:
                j it2 = (j) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                ln1.e eVar = ln1.e.LOADED;
                h hVar = new h(this.f123147j);
                it2.getClass();
                return j.e(eVar, hVar);
        }
    }
}
