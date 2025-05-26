package wr0;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements ak2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f130903b;

    public /* synthetic */ l(int i13, Function1 function1) {
        this.f130902a = i13;
        this.f130903b = function1;
    }

    @Override // ak2.f
    public final Object apply(Object obj) {
        int i13 = this.f130902a;
        Function1 function1 = this.f130903b;
        switch (i13) {
            case 13:
                Set set = is0.h.B;
                break;
        }
        return (uj2.t) ep.b.j(function1, "$tmp0", obj, "p0", obj);
    }
}
