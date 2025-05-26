package cl2;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static bl2.c a(Function2 function2, Object obj, bl2.c completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (function2 instanceof dl2.a) {
            return ((dl2.a) function2).create(obj, completion);
        }
        CoroutineContext context = completion.getContext();
        return context == j.f80412a ? new d(function2, obj, completion) : new e(completion, context, function2, obj);
    }

    public static bl2.c b(bl2.c cVar) {
        bl2.c<Object> intercepted;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        dl2.d dVar = cVar instanceof dl2.d ? (dl2.d) cVar : null;
        return (dVar == null || (intercepted = dVar.intercepted()) == null) ? cVar : intercepted;
    }

    public static Object c(Function2 function2, Object obj, bl2.c completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        Object fVar = context == j.f80412a ? new f(completion) : new g(completion, context);
        dl2.b.y(2, function2);
        return function2.invoke(obj, fVar);
    }
}
