package org.chromium.base;

import dp2.a;
import dp2.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.task.PostTask;

/* loaded from: classes4.dex */
public class ApplicationStatus {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f97279a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b, reason: collision with root package name */
    public static final Map f97280b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c, reason: collision with root package name */
    public static a f97281c;

    /* renamed from: d, reason: collision with root package name */
    public static g f97282d;

    public static void a() {
        synchronized (f97279a) {
        }
    }

    @CalledByNative
    public static int getStateForApplication() {
        synchronized (f97279a) {
        }
        return 0;
    }

    @CalledByNative
    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        return stateForApplication == 1 || stateForApplication == 2;
    }

    @CalledByNative
    public static void registerThreadSafeNativeApplicationStateListener() {
        ln.a aVar = new ln.a(2);
        Object obj = ThreadUtils.f97317a;
        PostTask.c(aVar);
    }
}
