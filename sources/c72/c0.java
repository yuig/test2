package c72;

import android.graphics.Typeface;
import do2.t2;
import do2.u2;
import do2.y1;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f26893a = new LinkedHashMap();

    public final void a(Typeface font, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(font, "font");
        synchronized (this) {
            LinkedHashMap linkedHashMap = this.f26893a;
            Object obj = linkedHashMap.get(key);
            if (obj == null) {
                Typeface DEFAULT = Typeface.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                obj = u2.a(DEFAULT);
                linkedHashMap.put(key, obj);
            }
            ((t2) ((y1) obj)).i(font);
            Unit unit = Unit.f80348a;
        }
    }
}
