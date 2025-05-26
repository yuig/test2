package me;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f86971a;

    /* renamed from: b, reason: collision with root package name */
    public static final ReentrantReadWriteLock f86972b;

    /* renamed from: c, reason: collision with root package name */
    public static String f86973c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f86974d;

    static {
        String simpleName = c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "AnalyticsUserIDStore::class.java.simpleName");
        f86971a = simpleName;
        f86972b = new ReentrantReadWriteLock();
    }

    public static void a() {
        if (f86974d) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f86972b;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f86974d) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            f86973c = PreferenceManager.getDefaultSharedPreferences(le.v.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f86974d = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th3) {
            f86972b.writeLock().unlock();
            throw th3;
        }
    }
}
