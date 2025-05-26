package e0;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class q extends FilterOutputStream {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f56729g = "Exif\u0000\u0000".getBytes(i.f56708d);

    /* renamed from: a, reason: collision with root package name */
    public final p f56730a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f56731b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f56732c;

    /* renamed from: d, reason: collision with root package name */
    public int f56733d;

    /* renamed from: e, reason: collision with root package name */
    public int f56734e;

    /* renamed from: f, reason: collision with root package name */
    public int f56735f;

    public q(ByteArrayOutputStream byteArrayOutputStream, p pVar) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f56731b = new byte[1];
        this.f56732c = ByteBuffer.allocate(4);
        this.f56733d = 0;
        this.f56730a = pVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i13) {
        byte[] bArr = this.f56731b;
        bArr[0] = (byte) (i13 & 255);
        write(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0373, code lost:
    
        ((java.io.FilterOutputStream) r18).out.write(r19, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0378, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0371, code lost:
    
        if (r3 <= 0) goto L173;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.q.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
