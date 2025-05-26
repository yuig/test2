package ads_mobile_sdk;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class kr2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f7462a = Logger.getLogger(kr2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f7463b = new AtomicBoolean(false);

    public static boolean a() {
        return f7463b.get();
    }
}
