package pb1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.h0;
import u50.i0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99464i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f99465j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(a aVar, int i13) {
        super(1);
        this.f99464i = i13;
        this.f99465j = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i0 i0Var;
        int i13 = this.f99464i;
        a aVar = this.f99465j;
        switch (i13) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, aVar.f99435a, null, null, null, null, null, null, 0, null, 1021);
            default:
                ao1.b it2 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                yn1.f fVar = aVar.f99436b;
                if (aVar.f99437c) {
                    i0Var = bs1.c.j2(new String[0], c52.e.settings_parental_passcode_required_helper_text);
                } else {
                    i0Var = h0.f120562a;
                }
                return ao1.b.e(it2, null, null, i0Var, null, fVar, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
        }
    }
}
