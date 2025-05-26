package yk;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f139222a = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f139223b = new AtomicBoolean(false);

    public static boolean a() {
        Boolean bool;
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f139222a.info("Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }
}
