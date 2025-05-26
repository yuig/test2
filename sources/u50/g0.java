package u50;

import android.content.res.TypedArray;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 {
    public static f0 a(String str) {
        return ep.b.x(str, "string", str);
    }

    public static k0 b(String[] formatArgs, int i13) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        ArrayList arrayList = new ArrayList(formatArgs.length);
        for (String str : formatArgs) {
            arrayList.add(new f0(str));
        }
        return new k0(i13, arrayList);
    }

    public static i0 c(TypedArray typedArray, int i13) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        String string = typedArray.getString(i13);
        return string != null ? new f0(string) : h0.f120562a;
    }
}
