package fo;

import com.google.android.gms.common.api.d;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import wo2.m;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f62729b;

    static {
        new d(18, 0);
        Intrinsics.checkNotNullParameter("", "name");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(go.a transport) {
        super(transport);
        Intrinsics.checkNotNullParameter(transport, "transport");
        this.f62729b = new byte[8];
    }

    @Override // fo.a
    public final void a(m buf) {
        Intrinsics.checkNotNullParameter(buf, "buf");
        g(buf.b());
        byte[] data = buf.i();
        go.a aVar = this.f62728a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        aVar.a(data, data.length);
    }

    @Override // fo.a
    public final void c(byte b13) {
        byte[] bArr = this.f62729b;
        bArr[0] = b13;
        this.f62728a.a(bArr, 1);
    }

    @Override // fo.a
    public final void d(double d2) {
        h(Double.doubleToRawLongBits(d2));
    }

    @Override // fo.a
    public final void e(String fieldName, int i13, byte b13) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        c(b13);
        f((short) i13);
    }

    @Override // fo.a
    public final void f(short s13) {
        byte[] bArr = this.f62729b;
        bArr[0] = (byte) ((s13 >> 8) & 255);
        bArr[1] = (byte) (s13 & 255);
        this.f62728a.a(bArr, 2);
    }

    @Override // fo.a
    public final void g(int i13) {
        byte[] bArr = this.f62729b;
        bArr[0] = (byte) ((i13 >> 24) & 255);
        bArr[1] = (byte) ((i13 >> 16) & 255);
        bArr[2] = (byte) ((i13 >> 8) & 255);
        bArr[3] = (byte) (i13 & 255);
        this.f62728a.a(bArr, 4);
    }

    @Override // fo.a
    public final void h(long j13) {
        byte[] bArr = this.f62729b;
        bArr[0] = (byte) ((j13 >> 56) & 255);
        bArr[1] = (byte) ((j13 >> 48) & 255);
        bArr[2] = (byte) ((j13 >> 40) & 255);
        bArr[3] = (byte) ((j13 >> 32) & 255);
        bArr[4] = (byte) ((j13 >> 24) & 255);
        bArr[5] = (byte) ((j13 >> 16) & 255);
        bArr[6] = (byte) ((j13 >> 8) & 255);
        bArr[7] = (byte) (j13 & 255);
        this.f62728a.a(bArr, 8);
    }

    @Override // fo.a
    public final void k(byte b13, int i13) {
        c(b13);
        g(i13);
    }

    @Override // fo.a
    public final void m(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] data = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(data, "getBytes(...)");
        g(data.length);
        go.a aVar = this.f62728a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        aVar.a(data, data.length);
    }

    public final void o(int i13, byte[] buffer) {
        int i14 = 0;
        int i15 = i13;
        while (i15 > 0) {
            go.a aVar = this.f62728a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int read = aVar.f65816a.read(buffer, i14, i15);
            if (read == -1) {
                throw new EOFException(a.a.f("Expected ", i13, " bytes; got ", i14));
            }
            i15 -= read;
            i14 += read;
        }
    }
}
