package ey;

import android.app.Activity;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayDeque f60573a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f60574b = new ArrayList(40);

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f60575c = j1.f60504a;

    public static void a(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
    }

    public static void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
