package nj2;

import java.util.Random;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public enum f implements c {
    INSTANCE;

    private static final long INVALID_ID = 0;
    private static final Supplier<Random> randomSupplier;

    static {
        randomSupplier = "Dalvik".equals(System.getProperty("java.vm.name")) ? aj2.a.INSTANCE : new bg.b(1);
    }

    @Override // nj2.c
    public String generateSpanId() {
        long nextLong;
        Random random = randomSupplier.get();
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        return pp2.a.q(nextLong);
    }

    @Override // nj2.c
    public String generateTraceId() {
        long nextLong;
        Random random = randomSupplier.get();
        long nextLong2 = random.nextLong();
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        return ui2.m.c(nextLong2, nextLong);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "RandomIdGenerator{}";
    }
}
