package it1;

import a.cb;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import k1.n1;
import kotlin.jvm.internal.Intrinsics;
import pe.i;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f73674a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteOrder f73675b;

    /* renamed from: c, reason: collision with root package name */
    public int f73676c;

    /* renamed from: d, reason: collision with root package name */
    public int f73677d;

    public a(byte[] backingBuffer, int i13, int i14, ByteOrder byteOrder) {
        Intrinsics.checkNotNullParameter(backingBuffer, "backingBuffer");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        this.f73674a = backingBuffer;
        this.f73675b = byteOrder;
        this.f73676c = i13;
        this.f73677d = i14;
        if (i13 < 0 || i13 >= backingBuffer.length) {
            throw new RuntimeException(cb.j("backingBufferOffset [", i13, "] invalid for array of length [", backingBuffer.length, "]"));
        }
        if (i14 < 0 || i14 > backingBuffer.length) {
            throw new RuntimeException(cb.j("backingBufferUsedByteCount [", i14, "] is invalid. Array length is [", backingBuffer.length, "]"));
        }
    }

    public final void a(int i13, int i14, ByteBuffer destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        boolean d2 = Intrinsics.d(destination.order(), this.f73675b);
        byte[] bArr = this.f73674a;
        if (d2 || i13 <= 1) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            destination.clear();
            n1 n1Var = new n1(15, destination, this);
            if (i14 > this.f73677d) {
                throw new BufferUnderflowException();
            }
            int i15 = this.f73676c;
            int min = Math.min(bArr.length, i15 + i14) - i15;
            int i16 = i14 - min;
            if (min > 0) {
                n1Var.invoke(0, Integer.valueOf(i15), Integer.valueOf(min));
            }
            if (i16 > 0) {
                n1Var.invoke(Integer.valueOf(min), 0, Integer.valueOf(i16));
            }
            destination.flip();
            this.f73676c = (this.f73676c + i14) % bArr.length;
            this.f73677d -= i14;
            return;
        }
        destination.clear();
        i.l(destination.remaining(), 0, i14);
        i.k(this.f73677d, i14);
        int i17 = i14 / i13;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i18 * i13;
            for (int i23 = i13 - 1; -1 < i23; i23--) {
                destination.put(bArr[(this.f73676c + (i19 + i23)) % bArr.length]);
            }
        }
        destination.flip();
        int i24 = i17 * i13;
        this.f73677d -= i24;
        int i25 = this.f73676c + i24;
        this.f73676c = i25;
        this.f73676c = i25 % bArr.length;
    }
}
