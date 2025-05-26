package ic1;

import fd1.i0;
import kotlin.jvm.functions.Function1;
import uj2.f0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f72065b;

    public /* synthetic */ a(int i13, Function1 function1) {
        this.f72064a = i13;
        this.f72065b = function1;
    }

    @Override // ak2.f
    public final Object apply(Object obj) {
        int i13 = this.f72064a;
        Function1 function1 = this.f72065b;
        switch (i13) {
            case 6:
                int i14 = i0.f61945g;
                break;
            case 15:
                int i15 = sf1.s.P;
                break;
            case 18:
                int i16 = pg1.c.M;
                break;
        }
        return (f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
    }
}
