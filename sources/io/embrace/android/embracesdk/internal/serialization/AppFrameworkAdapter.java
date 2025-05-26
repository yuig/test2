package io.embrace.android.embracesdk.internal.serialization;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import oe2.o;
import oe2.o0;
import org.jetbrains.annotations.NotNull;
import th2.g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/embrace/android/embracesdk/internal/serialization/AppFrameworkAdapter;", "", "Lth2/g;", "appFramework", "", "toJson", "(Lth2/g;)I", "value", "fromJson", "(I)Lth2/g;", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AppFrameworkAdapter {
    @o
    public final g fromJson(int value) {
        g.Companion.getClass();
        g[] values = g.values();
        int a13 = y0.a(values.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (g gVar : values) {
            linkedHashMap.put(Integer.valueOf(gVar.getValue()), gVar);
        }
        return (g) linkedHashMap.get(Integer.valueOf(value));
    }

    @o0
    public final int toJson(@NotNull g appFramework) {
        Intrinsics.checkNotNullParameter(appFramework, "appFramework");
        return appFramework.getValue();
    }
}
