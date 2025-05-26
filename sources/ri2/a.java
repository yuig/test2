package ri2;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f108391a = Logger.getLogger(a.class.getName());

    public static void a() {
        Level level = Level.FINEST;
        Logger logger = f108391a;
        if (logger.isLoggable(level)) {
            logger.log(level, "context is null", (Throwable) new AssertionError());
        }
    }
}
