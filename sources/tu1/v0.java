package tu1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;

/* loaded from: classes2.dex */
public abstract class v0 {
    public static final void a(ExperimentalUrlRequest.Builder builder, a annotation) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullExpressionValue(builder.addRequestAnnotation((Object) annotation), "addRequestAnnotation(...)");
    }

    public static final LinkedHashMap b(RequestFinishedInfo requestFinishedInfo) {
        Intrinsics.checkNotNullParameter(requestFinishedInfo, "<this>");
        Collection<Object> annotations = requestFinishedInfo.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "getAnnotations(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : annotations) {
            if (obj instanceof a) {
                arrayList.add(obj);
            }
        }
        int a13 = kotlin.collections.y0.a(kotlin.collections.g0.q(arrayList, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            linkedHashMap.put(aVar.f119341a, aVar.f119342b);
        }
        return linkedHashMap;
    }
}
