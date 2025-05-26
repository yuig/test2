package i6;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends c {
    public final void b(int i13, ByteBuffer byteBuffer) {
        this.f71621b = byteBuffer;
        if (byteBuffer == null) {
            this.f71620a = 0;
            this.f71622c = 0;
            this.f71623d = 0;
        } else {
            this.f71620a = i13;
            int i14 = i13 - byteBuffer.getInt(i13);
            this.f71622c = i14;
            this.f71623d = this.f71621b.getShort(i14);
        }
    }
}
