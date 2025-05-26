package zz;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import rz.d;
import vd0.c;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final se2.a f143146a;

    public b(se2.a dynamicStoryDeserializer) {
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        this.f143146a = dynamicStoryDeserializer;
    }

    @Override // rz.d
    public final Object b(c cVar) {
        vd0.a o13 = o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)");
        ArrayList arrayList = new ArrayList();
        int d2 = o13.d();
        for (int i13 = 0; i13 < d2; i13++) {
            ke0.a aVar = (ke0.a) ((bf2.b) this.f143146a).get();
            c j13 = o13.j(i13);
            Intrinsics.checkNotNullExpressionValue(j13, "optJsonObject(...)");
            arrayList.add(aVar.d(j13));
        }
        return arrayList;
    }
}
