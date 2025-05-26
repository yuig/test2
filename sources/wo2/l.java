package wo2;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public interface l extends e0, ReadableByteChannel {
    String B0();

    String C1(Charset charset);

    long L0(m mVar);

    void N0(long j13);

    boolean P0(long j13, m mVar);

    void R(j jVar, long j13);

    String Z(long j13);

    m a1(long j13);

    long f0(c0 c0Var);

    int j0(v vVar);

    long j2();

    h k2();

    j l();

    byte[] m1();

    boolean o1();

    y peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j13);

    void skip(long j13);
}
