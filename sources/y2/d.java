package y2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class d implements n4.b {

    /* renamed from: a, reason: collision with root package name */
    public a f136664a = h.f136669a;

    /* renamed from: b, reason: collision with root package name */
    public com.pinterest.framework.multisection.datasource.pagedlist.j f136665b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f136666c;

    public final com.pinterest.framework.multisection.datasource.pagedlist.j a(Function1 function1) {
        com.pinterest.framework.multisection.datasource.pagedlist.j jVar = new com.pinterest.framework.multisection.datasource.pagedlist.j();
        jVar.f49143a = function1;
        this.f136665b = jVar;
        return jVar;
    }

    @Override // n4.b
    public final float b() {
        return this.f136664a.b().b();
    }

    @Override // n4.b
    public final float j0() {
        return this.f136664a.b().j0();
    }
}
