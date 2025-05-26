package n72;

import android.graphics.Typeface;
import c72.c0;
import do2.t2;
import do2.u2;
import do2.y1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import r72.k2;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f89708a;

    public b(c0 typeFaceInMemoryDataSource) {
        Intrinsics.checkNotNullParameter(typeFaceInMemoryDataSource, "typeFaceInMemoryDataSource");
        this.f89708a = typeFaceInMemoryDataSource;
    }

    public final Typeface a(k2 fontType) {
        Intrinsics.checkNotNullParameter(fontType, "fontType");
        String key = fontType.name();
        c0 c0Var = this.f89708a;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = c0Var.f26893a;
        Object obj = linkedHashMap.get(key);
        if (obj == null) {
            Typeface DEFAULT = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            obj = u2.a(DEFAULT);
            linkedHashMap.put(key, obj);
        }
        return (Typeface) ((t2) ((y1) obj)).getValue();
    }
}
