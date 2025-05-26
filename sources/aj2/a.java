package aj2;

import java.util.Random;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public enum a implements Supplier {
    INSTANCE;

    private static final Random random = new Random();

    @Override // java.util.function.Supplier
    public Random get() {
        return random;
    }
}
