package fc0;

import android.content.Context;
import android.view.ContextThemeWrapper;
import i2.w3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final w3 f61712a = new w3(j.f61711i);

    public static final Context a(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return i13 != 0 ? new ContextThemeWrapper(context, i13) : context;
    }
}
