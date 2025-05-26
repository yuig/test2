package qo2;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class p extends o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(no2.b element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    @Override // qo2.a
    public final Iterator h(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    @Override // qo2.a
    public final int i(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }
}
