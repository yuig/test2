package va1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f125201a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125202b;

    public k1(Integer num, String str, int i13) {
        num = (i13 & 1) != 0 ? null : num;
        str = (i13 & 2) != 0 ? null : str;
        this.f125201a = num;
        this.f125202b = str;
    }

    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f125202b;
        if (str != null) {
            return str;
        }
        Integer num = this.f125201a;
        String string = num != null ? context.getString(num.intValue()) : null;
        return string == null ? "" : string;
    }
}
