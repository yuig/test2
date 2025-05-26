package nh0;

import com.google.gson.reflect.TypeToken;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

/* loaded from: classes.dex */
public abstract class b {
    static {
        Intrinsics.checkNotNullExpressionValue(new TypeToken<a>() { // from class: com.pinterest.experiment.api.model.extension.UserExperimentsKt$userExperimentsType$1
        }.f33847b, "getType(...)");
    }

    public static final a a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Set<String> g13 = cVar.g();
        a aVar = new a();
        String str = null;
        for (String str2 : g13) {
            c m13 = cVar.m(str2);
            if (m13 != null) {
                str = m13.o("group", "");
            }
            if (str != null) {
                Intrinsics.f(str2);
                aVar.put(str2, str);
            }
        }
        return aVar;
    }
}
