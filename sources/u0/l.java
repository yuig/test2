package u0;

import java.nio.ByteBuffer;
import kh2.m2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f119778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f119779b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f119780c;

    /* renamed from: d, reason: collision with root package name */
    public long f119781d;

    public l(ByteBuffer byteBuffer, j jVar, int i13, int i14) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit() - byteBuffer.position();
        if (limit != jVar.f119774a) {
            StringBuilder s13 = a.a.s("Byte buffer size is not match with packet info: ", limit, " != ");
            s13.append(jVar.f119774a);
            throw new IllegalStateException(s13.toString());
        }
        this.f119778a = i13;
        this.f119779b = i14;
        this.f119780c = byteBuffer;
        this.f119781d = jVar.f119775b;
    }

    public final j a(ByteBuffer byteBuffer) {
        int remaining;
        long j13 = this.f119781d;
        ByteBuffer byteBuffer2 = this.f119780c;
        int position = byteBuffer2.position();
        int position2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            remaining = byteBuffer.remaining();
            this.f119781d += m2.I0(this.f119779b, m2.N1(this.f119778a, remaining));
            ByteBuffer duplicate = byteBuffer2.duplicate();
            duplicate.position(position).limit(position + remaining);
            byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
        } else {
            remaining = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(position2 + remaining).position(position2);
        }
        byteBuffer2.position(position + remaining);
        return new j(remaining, j13);
    }
}
