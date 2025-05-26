package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Element", "kotlin/coroutines/h", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface CoroutineContext {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public interface Element extends CoroutineContext {
        h getKey();
    }

    Object fold(Object obj, Function2 function2);

    Element get(h hVar);

    CoroutineContext minusKey(h hVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
