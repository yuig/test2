package db;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class j {
    public static String b(Object value, String message) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(message, "message");
        return message + " value: " + value;
    }

    public abstract Object a();

    public abstract j c(String str, Function1 function1);
}
