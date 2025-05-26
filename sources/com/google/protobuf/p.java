package com.google.protobuf;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a */
    public int f33953a;

    /* renamed from: b */
    public final int f33954b = 100;

    /* renamed from: c */
    public final int f33955c = Integer.MAX_VALUE;

    /* renamed from: d */
    public r f33956d;

    public static int b(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    public static long c(long j13) {
        return (-(j13 & 1)) ^ (j13 >>> 1);
    }

    public static m f(byte[] bArr, int i13, int i14, boolean z13) {
        m mVar = new m(bArr, i13, i14, z13);
        try {
            mVar.j(i14);
            return mVar;
        } catch (InvalidProtocolBufferException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static p g(InputStream inputStream) {
        if (inputStream != null) {
            return new n(inputStream);
        }
        byte[] bArr = w0.f34009b;
        return f(bArr, 0, bArr.length, false);
    }

    public static p h(ByteBuffer byteBuffer, boolean z13) {
        if (byteBuffer.hasArray()) {
            return f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z13);
        }
        if (byteBuffer.isDirect() && o.E()) {
            return new o(byteBuffer, z13);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return f(bArr, 0, remaining, true);
    }

    public static int t(int i13, InputStream inputStream) {
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            return i13;
        }
        int i14 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i15 = 7;
        while (i15 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.g();
            }
            i14 |= (read & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i15;
            if ((read & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
                return i14;
            }
            i15 += 7;
        }
        while (i15 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.g();
            }
            if ((read2 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
                return i14;
            }
            i15 += 7;
        }
        throw InvalidProtocolBufferException.d();
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public abstract boolean D(int i13);

    public abstract void a(int i13);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i13);

    public abstract int j(int i13);

    public abstract boolean k();

    public abstract j l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();
}
