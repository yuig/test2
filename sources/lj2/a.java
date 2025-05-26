package lj2;

import aj2.j;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f83630a = new a();

    static {
        Logger.getLogger(a.class.getName());
        new AtomicBoolean(false);
        TimeUnit timeUnit = j.f15445a;
        new gi2.b(5.0d / timeUnit.toSeconds(1L), 5.0d);
        new gi2.b(5.0d / timeUnit.toSeconds(1L), 1.0d);
    }

    public final String toString() {
        return "DefaultAggregation";
    }
}
