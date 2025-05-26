package net.quikkly.core;

import java.io.Closeable;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class Pipeline implements Closeable {
    public static final int IMAGE_FORMAT_BGRA_UINT32 = 1;
    public static final int IMAGE_FORMAT_GREY_UINT8 = 0;
    public static final int IMAGE_FORMAT_NV21_UINT8 = 3;
    public static final int IMAGE_FORMAT_RGBA_UINT32 = 2;
    private long nativePointer = 0;

    private Pipeline() {
    }

    private native synchronized ScanResult extractResult(boolean z13);

    private native synchronized String generateSvgLong(String str, long j13, Skin skin);

    private native synchronized long maxDataValueLong(String str);

    private native synchronized void processFrame(byte[] bArr, int i13, int i14, int i15, int i16);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }

    public String generateSvg(String str, BigInteger bigInteger, Skin skin) {
        return generateSvgLong(str, IntUtils.bigIntegerAsUnsignedLong(bigInteger), skin);
    }

    public native synchronized String[] getTemplateIdentifiers();

    public BigInteger maxDataValue(String str) {
        return IntUtils.unsignedLongAsBigInteger(maxDataValueLong(str));
    }

    public native synchronized void release();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:11:0x0011, B:12:0x001c, B:14:0x001f, B:18:0x0028, B:19:0x0059, B:20:0x0018), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[Catch: all -> 0x0016, TRY_ENTER, TryCatch #0 {all -> 0x0016, blocks: (B:11:0x0011, B:12:0x001c, B:14:0x001f, B:18:0x0028, B:19:0x0059, B:20:0x0018), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized net.quikkly.core.ScanResult scanFrame(byte[] r4, int r5, int r6, int r7, int r8, boolean r9) {
        /*
            r3 = this;
            java.lang.String r0 = "Frame size "
            monitor-enter(r3)
            if (r5 == 0) goto Le
            r1 = 1
            if (r5 == r1) goto L18
            r1 = 2
            if (r5 == r1) goto L18
            r1 = 3
            if (r5 == r1) goto L11
        Le:
            int r1 = r6 * r7
            goto L1c
        L11:
            int r1 = r7 / 2
            int r1 = r1 + r7
            int r1 = r1 * r6
            goto L1c
        L16:
            r4 = move-exception
            goto L5a
        L18:
            int r1 = r6 * r7
            int r1 = r1 * 4
        L1c:
            int r2 = r4.length     // Catch: java.lang.Throwable -> L16
            if (r2 < r1) goto L28
            r3.processFrame(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L16
            net.quikkly.core.ScanResult r4 = r3.extractResult(r9)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r3)
            return r4
        L28:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L16
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L16
            int r4 = r4.length     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r9.append(r4)     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = " bytes is too small for "
            r9.append(r4)     // Catch: java.lang.Throwable -> L16
            r9.append(r6)     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = " x "
            r9.append(r4)     // Catch: java.lang.Throwable -> L16
            r9.append(r7)     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = " px in format "
            r9.append(r4)     // Catch: java.lang.Throwable -> L16
            r9.append(r5)     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "."
            r9.append(r4)     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L16
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L16
            throw r8     // Catch: java.lang.Throwable -> L16
        L5a:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.quikkly.core.Pipeline.scanFrame(byte[], int, int, int, int, boolean):net.quikkly.core.ScanResult");
    }

    public native synchronized int scanStatus(String str);
}
