package e5;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f57243a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f57244b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f57245c = new Object();

    public static Typeface a(Context context, int i13) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i13, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, ue.c r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.n.b(android.content.Context, int, android.util.TypedValue, int, ue.c, boolean, boolean):android.graphics.Typeface");
    }
}
