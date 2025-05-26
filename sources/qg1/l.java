package qg1;

import com.pinterest.api.model.h01;
import com.pinterest.api.model.km0;
import com.pinterest.api.model.pq0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.vg;
import java.util.Iterator;
import java.util.List;
import kh2.n3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final List f103849b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f103850c;

    /* renamed from: d, reason: collision with root package name */
    public final k f103851d;

    /* renamed from: e, reason: collision with root package name */
    public final String f103852e;

    public l(List list, boolean z13) {
        super(Unit.f80348a);
        this.f103849b = list;
        this.f103850c = z13;
        this.f103851d = new k();
        this.f103852e = "";
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uo0 uo0Var = (uo0) it.next();
                List o13 = uo0Var.o();
                if (o13 != null) {
                    this.f103852e = uo0Var.v();
                    Iterator it2 = o13.iterator();
                    while (it2.hasNext()) {
                        ((ro0) it2.next()).a(this);
                    }
                }
            }
        }
    }

    @Override // com.pinterest.api.model.vg
    public final Object c(km0 value5) {
        Intrinsics.checkNotNullParameter(value5, "value5");
        if (this.f103850c) {
            k kVar = this.f103851d;
            kVar.f103848b.put(this.f103852e, Double.valueOf(kVar.f103847a));
            kVar.f103847a += 5000;
        }
        return Unit.f80348a;
    }

    @Override // com.pinterest.api.model.vg
    public final Object j(pq0 value6) {
        Intrinsics.checkNotNullParameter(value6, "value6");
        Intrinsics.checkNotNullParameter(value6, "<this>");
        h01 s13 = n3.s(value6);
        long doubleValue = s13 != null ? (long) s13.m().doubleValue() : 0L;
        k kVar = this.f103851d;
        kVar.f103848b.put(this.f103852e, Double.valueOf(kVar.f103847a));
        kVar.f103847a += doubleValue;
        return Unit.f80348a;
    }
}
