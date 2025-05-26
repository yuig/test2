package k6;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: e, reason: collision with root package name */
    public static final ByteOrder f78343e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f, reason: collision with root package name */
    public static final ByteOrder f78344f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f78345a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f78346b;

    /* renamed from: c, reason: collision with root package name */
    public int f78347c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f78348d;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i13) {
        int i14 = 0;
        while (i14 < i13) {
            DataInputStream dataInputStream = this.f78345a;
            int i15 = i13 - i14;
            int skip = (int) dataInputStream.skip(i15);
            if (skip <= 0) {
                if (this.f78348d == null) {
                    this.f78348d = new byte[8192];
                }
                skip = dataInputStream.read(this.f78348d, 0, Math.min(8192, i15));
                if (skip == -1) {
                    throw new EOFException(a.a.e("Reached EOF while skipping ", i13, " bytes."));
                }
            }
            i14 += skip;
        }
        this.f78347c += i14;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f78345a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i13) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f78347c++;
        return this.f78345a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f78347c++;
        return this.f78345a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f78347c++;
        int read = this.f78345a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f78347c += 2;
        return this.f78345a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i13, int i14) {
        this.f78347c += i14;
        this.f78345a.readFully(bArr, i13, i14);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f78347c += 4;
        DataInputStream dataInputStream = this.f78345a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f78346b;
        if (byteOrder == f78343e) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f78344f) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f78346b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f78347c += 8;
        DataInputStream dataInputStream = this.f78345a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f78346b;
        if (byteOrder == f78343e) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f78344f) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new IOException("Invalid byte order: " + this.f78346b);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f78347c += 2;
        DataInputStream dataInputStream = this.f78345a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f78346b;
        if (byteOrder == f78343e) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == f78344f) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f78346b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f78347c += 2;
        return this.f78345a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f78347c++;
        return this.f78345a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f78347c += 2;
        DataInputStream dataInputStream = this.f78345a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f78346b;
        if (byteOrder == f78343e) {
            return (read2 << 8) + read;
        }
        if (byteOrder == f78344f) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f78346b);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i13) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f78346b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f78345a = dataInputStream;
        dataInputStream.mark(0);
        this.f78347c = 0;
        this.f78346b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int read = this.f78345a.read(bArr, i13, i14);
        this.f78347c += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f78347c += bArr.length;
        this.f78345a.readFully(bArr);
    }
}
