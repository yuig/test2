package io.jsonwebtoken.lang;

import java.security.Provider;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class RuntimeEnvironment {
    private static final AtomicBoolean bcLoaded = new AtomicBoolean(false);
    private static final String BC_PROVIDER_CLASS_NAME = "org.bouncycastle.jce.provider.BouncyCastleProvider";
    public static final boolean BOUNCY_CASTLE_AVAILABLE = Classes.isAvailable(BC_PROVIDER_CLASS_NAME);

    static {
        enableBouncyCastleIfPossible();
    }

    private RuntimeEnvironment() {
    }

    public static void enableBouncyCastleIfPossible() {
        if (!BOUNCY_CASTLE_AVAILABLE || bcLoaded.get()) {
            return;
        }
        try {
            Class forName = Classes.forName(BC_PROVIDER_CLASS_NAME);
            for (Provider provider : Security.getProviders()) {
                if (forName.isInstance(provider)) {
                    bcLoaded.set(true);
                    return;
                }
            }
            Security.addProvider((Provider) Classes.newInstance(forName));
            bcLoaded.set(true);
        } catch (UnknownClassException unused) {
        }
    }
}
