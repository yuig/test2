package v10;

import com.pinterest.api.model.ow;
import d12.h;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o10.e;

/* loaded from: classes.dex */
public final class c extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f123840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f123841e;

    public c(List<? extends s> list, d dVar) {
        this.f123840d = list;
        this.f123841e = dVar;
    }

    @Override // hb0.c
    public final void c() {
        o10.c cVar = o10.c.f92770a;
        ow owVar = new ow();
        List list = this.f123840d;
        ArrayList<s> destination = new ArrayList();
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : list) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        for (s sVar : destination) {
            e a13 = cVar.a(sVar);
            if (a13 != null) {
                a13.a(sVar, owVar);
            }
        }
        ((h) this.f123841e.f123842a).c(owVar, d12.a.f53619a);
    }
}
