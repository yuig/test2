package j01;

import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u01.r;
import yn2.c0;
import yn2.j;
import yn2.k;
import zp.v0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f73964a;

    public b(Function1 lazyBlock) {
        Intrinsics.checkNotNullParameter(lazyBlock, "lazyBlock");
        this.f73964a = lazyBlock;
    }

    public final ArrayList a(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        a aVar = new a();
        this.f73964a.invoke(aVar);
        List unmodifiableList = Collections.unmodifiableList(aVar.f73963a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        k m13 = c0.m(CollectionsKt.K(unmodifiableList), new v0(3, pin, z13));
        ArrayList arrayList = new ArrayList();
        j jVar = new j(m13);
        while (jVar.b()) {
            Object next = jVar.next();
            if (!((r) next).f119934a || z13) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
