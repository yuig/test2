package rq;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u2 implements u61.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f109579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x61.j f109580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f109581c;

    public u2(x2 x2Var, x61.j jVar, ArrayList arrayList) {
        this.f109579a = x2Var;
        this.f109580b = jVar;
        this.f109581c = arrayList;
    }

    @Override // u61.b
    public final void f() {
    }

    @Override // u61.b
    public final void g() {
        x2 x2Var = this.f109579a;
        x2Var.f109651g = -1;
        x2.b(x2Var, null);
    }

    @Override // u61.b
    public final void n(v61.a hairPattern, int i13) {
        Intrinsics.checkNotNullParameter(hairPattern, "hairPattern");
        x2 x2Var = this.f109579a;
        x2Var.f109651g = i13;
        x2.b(x2Var, String.valueOf(hairPattern.f124212e));
        int i14 = x2Var.f109651g;
        if (i14 >= 0) {
            List list = this.f109581c;
            if (i14 < list.size()) {
                this.f109580b.e(list, (v61.a) list.get(i14));
            }
        }
    }
}
