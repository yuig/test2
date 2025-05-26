package qb0;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f103388a = new LinkedHashMap();

    public final void a(int i13, Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        LinkedHashMap linkedHashMap = f103388a;
        if (!linkedHashMap.containsKey(Integer.valueOf(i13))) {
            tk2.e.f118016b.b(new v.j(this, i13, callback, 9));
            return;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i13));
        if (str != null) {
            callback.invoke(str);
        }
    }
}
