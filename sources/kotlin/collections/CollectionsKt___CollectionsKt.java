package kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "firstOrNull", "(Ljava/util/List;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes2.dex */
public class CollectionsKt___CollectionsKt extends m0 {
    public static final Object G(Iterable iterable, int i13) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        boolean z13 = iterable instanceof List;
        if (z13) {
            return ((List) iterable).get(i13);
        }
        n0 defaultValue = new n0(i13);
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (z13) {
            List list = (List) iterable;
            return (i13 < 0 || i13 > f0.i(list)) ? defaultValue.invoke(Integer.valueOf(i13)) : list.get(i13);
        }
        if (i13 < 0) {
            return defaultValue.invoke(Integer.valueOf(i13));
        }
        int i14 = 0;
        for (Object obj : iterable) {
            int i15 = i14 + 1;
            if (i13 == i14) {
                return obj;
            }
            i14 = i15;
        }
        return defaultValue.invoke(Integer.valueOf(i13));
    }

    public static final void H(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i14 = 0;
        for (Object obj : iterable) {
            i14++;
            if (i14 > 1) {
                buffer.append(separator);
            }
            if (i13 >= 0 && i14 > i13) {
                break;
            } else {
                kotlin.text.r.a(buffer, obj, function1);
            }
        }
        if (i13 >= 0 && i14 > i13) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
    }

    public static final void I(Iterable iterable, AbstractCollection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
    }

    public static final List J(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return CollectionsKt.H0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        I(iterable, arrayList);
        return arrayList;
    }

    public static <T> T firstOrNull(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
