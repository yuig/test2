package e0;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class c extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56697a;

    /* renamed from: b, reason: collision with root package name */
    public final OutputStream f56698b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f56699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(OutputStream outputStream, ByteOrder byteOrder, int i13) {
        super(outputStream);
        this.f56697a = i13;
        this.f56698b = outputStream;
        this.f56699c = byteOrder;
    }

    public final void a(int i13) {
        int i14 = this.f56697a;
        OutputStream outputStream = this.f56698b;
        switch (i14) {
            case 0:
                outputStream.write(i13);
                break;
            default:
                outputStream.write(i13);
                break;
        }
    }

    public final void c(int i13) {
        int i14 = this.f56697a;
        OutputStream outputStream = this.f56698b;
        switch (i14) {
            case 0:
                ByteOrder byteOrder = this.f56699c;
                if (byteOrder != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((i13 >>> 24) & 255);
                        outputStream.write((i13 >>> 16) & 255);
                        outputStream.write((i13 >>> 8) & 255);
                        outputStream.write(i13 & 255);
                        break;
                    }
                } else {
                    outputStream.write(i13 & 255);
                    outputStream.write((i13 >>> 8) & 255);
                    outputStream.write((i13 >>> 16) & 255);
                    outputStream.write((i13 >>> 24) & 255);
                    break;
                }
                break;
            default:
                ByteOrder byteOrder2 = this.f56699c;
                if (byteOrder2 != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((i13 >>> 24) & 255);
                        outputStream.write((i13 >>> 16) & 255);
                        outputStream.write((i13 >>> 8) & 255);
                        outputStream.write(i13 & 255);
                        break;
                    }
                } else {
                    outputStream.write(i13 & 255);
                    outputStream.write((i13 >>> 8) & 255);
                    outputStream.write((i13 >>> 16) & 255);
                    outputStream.write((i13 >>> 24) & 255);
                    break;
                }
                break;
        }
    }

    public final void d(short s13) {
        int i13 = this.f56697a;
        OutputStream outputStream = this.f56698b;
        switch (i13) {
            case 0:
                ByteOrder byteOrder = this.f56699c;
                if (byteOrder != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((s13 >>> 8) & 255);
                        outputStream.write(s13 & 255);
                        break;
                    }
                } else {
                    outputStream.write(s13 & 255);
                    outputStream.write((s13 >>> 8) & 255);
                    break;
                }
                break;
            default:
                ByteOrder byteOrder2 = this.f56699c;
                if (byteOrder2 != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((s13 >>> 8) & 255);
                        outputStream.write(s13 & 255);
                        break;
                    }
                } else {
                    outputStream.write(s13 & 255);
                    outputStream.write((s13 >>> 8) & 255);
                    break;
                }
                break;
        }
    }

    public final void e(long j13) {
        switch (this.f56697a) {
            case 0:
                c((int) j13);
                break;
            default:
                c((int) j13);
                break;
        }
    }

    public final void f(int i13) {
        switch (this.f56697a) {
            case 0:
                d((short) i13);
                break;
            default:
                d((short) i13);
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        int i13 = this.f56697a;
        OutputStream outputStream = this.f56698b;
        switch (i13) {
            case 0:
                outputStream.write(bArr);
                break;
            default:
                outputStream.write(bArr);
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        int i15 = this.f56697a;
        OutputStream outputStream = this.f56698b;
        switch (i15) {
            case 0:
                outputStream.write(bArr, i13, i14);
                break;
            default:
                outputStream.write(bArr, i13, i14);
                break;
        }
    }
}
