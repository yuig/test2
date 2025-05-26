package b7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f22042a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void d();

    ByteBuffer e();

    void f(ByteBuffer byteBuffer);

    void flush();

    e g(e eVar);

    void h();

    boolean i();

    boolean isActive();
}
