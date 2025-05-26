package vk;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class e0 extends b {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f125942b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f125943c;

    public e0(g0 g0Var, ml.a aVar, Integer num) {
        this.f125942b = g0Var;
        this.f125943c = num;
    }

    public static e0 j(g0 g0Var, Integer num) {
        ml.a a13;
        f0 f0Var = g0Var.f125953b;
        if (f0Var == f0.f125949b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            a13 = ml.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (f0Var != f0.f125950c) {
                throw new GeneralSecurityException("Unknown Variant: " + g0Var.f125953b);
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            a13 = ml.a.a(new byte[0]);
        }
        return new e0(g0Var, a13, num);
    }
}
