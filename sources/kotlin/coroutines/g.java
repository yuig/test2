package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g {
    public static Object a(CoroutineContext.Element element, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, element);
    }

    public static CoroutineContext.Element b(CoroutineContext.Element element, h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.d(element.getKey(), key)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext c(CoroutineContext.Element element, h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.d(element.getKey(), key) ? j.f80412a : element;
    }

    public static CoroutineContext d(CoroutineContext context, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(context, "context");
        CoroutineContext.Element element2 = element;
        Intrinsics.checkNotNullParameter(context, "context");
        return context == j.f80412a ? element2 : (CoroutineContext) context.fold(element2, i.f80411i);
    }
}
