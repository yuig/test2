package androidx.work;

import ja.c0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kb.l;
import kb.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Lkb/t;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ArrayCreatingInputMerger extends t {
    @Override // kb.t
    public final l a(ArrayList inputs) {
        Object newArray;
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        c0 c0Var = new c0(1);
        HashMap hashMap = new HashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((l) it.next()).f().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (Intrinsics.d(cls2, cls)) {
                        Intrinsics.g(value, "null cannot be cast to non-null type kotlin.Any");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        Intrinsics.f(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        Intrinsics.checkNotNullExpressionValue(newArray2, "newArray");
                        value = newArray2;
                    } else {
                        if (!Intrinsics.d(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
                        value = newArray;
                    }
                } else if (cls.isArray()) {
                    Intrinsics.g(value, "null cannot be cast to non-null type kotlin.Any");
                } else {
                    newArray = Array.newInstance(cls, 1);
                    Array.set(newArray, 0, value);
                    Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
                    value = newArray;
                }
                hashMap.put(str, value);
            }
        }
        c0Var.e(hashMap);
        return c0Var.b();
    }
}
