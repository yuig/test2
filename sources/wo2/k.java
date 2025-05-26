package wo2;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public interface k extends c0, WritableByteChannel {
    k E1(byte[] bArr, int i13, int i14);

    k F1(long j13);

    k I(int i13);

    k I0(byte[] bArr);

    k I1(int i13, int i14, String str);

    k O0(long j13);

    k V();

    @Override // wo2.c0, java.io.Flushable
    void flush();

    k g1(int i13);

    long i2(e0 e0Var);

    j l();

    k l0(String str);

    k n();

    k p1(int i13);

    k t1(m mVar);
}
