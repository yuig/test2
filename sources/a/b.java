package a;

import ads_mobile_sdk.ym0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public interface b extends ce {
    ym0 a();

    default Object a(Function2 function2, dl2.d dVar) {
        Object invoke = function2.invoke(a(), dVar);
        return invoke == cl2.a.COROUTINE_SUSPENDED ? invoke : Unit.f80348a;
    }
}
