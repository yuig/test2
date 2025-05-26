package h7;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface r {
    static long a(s sVar) {
        byte[] bArr = (byte[]) sVar.f67929b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
