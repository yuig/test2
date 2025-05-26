package df;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a */
    public static final y f54881a = new y();

    /* renamed from: b */
    public static final HashMap f54882b = new HashMap();

    public static final void a(s callback, v feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a0.c(new x(callback, feature));
    }

    public static final boolean b(v feature) {
        boolean z13;
        Intrinsics.checkNotNullParameter(feature, "feature");
        boolean z14 = false;
        if (v.Unknown == feature) {
            return false;
        }
        if (v.Core == feature) {
            return true;
        }
        String string = le.v.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.toKey(), null);
        if (string != null && Intrinsics.d(string, "15.0.2")) {
            return false;
        }
        v parent = feature.getParent();
        if (parent == feature) {
            switch (w.f54877a[feature.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    z14 = true;
                    break;
            }
            AtomicBoolean atomicBoolean = a0.f54697a;
            return a0.b(feature.toKey(), le.v.b(), z14);
        }
        if (!b(parent)) {
            return false;
        }
        switch (w.f54877a[feature.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                z13 = false;
                break;
            default:
                z13 = true;
                break;
        }
        AtomicBoolean atomicBoolean2 = a0.f54697a;
        return a0.b(feature.toKey(), le.v.b(), z13);
    }
}
