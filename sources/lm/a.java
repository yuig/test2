package lm;

import android.content.ContentProvider;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class a extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final nl.a f83829a = new nl.a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f83830b = new AtomicBoolean(false);
}
