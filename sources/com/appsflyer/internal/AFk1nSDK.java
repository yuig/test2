package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1nSDK extends FilterInputStream {
    private int AFInAppEventParameterName;
    private final int[] areAllFieldsValid;
    private final byte[] component1;
    private final int[] component2;
    private final byte[][] component3;
    private final int component4;
    private final int copy;
    private final byte[] copydefault;
    private int equals;
    private int hashCode;
    private final int toString;
    private int values;
    private static final byte[] AFAdRevenueData = AFk1mSDK.getRevenue;
    private static final int[] getRevenue = AFk1mSDK.getMediationNetwork;
    private static final int[] getMonetizationNetwork = AFk1mSDK.getMonetizationNetwork;
    private static final int[] getCurrencyIso4217Code = AFk1mSDK.getCurrencyIso4217Code;
    private static final int[] getMediationNetwork = AFk1mSDK.AFAdRevenueData;

    public AFk1nSDK(InputStream inputStream, int i13, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i13, bArr, bArr2, (byte) 0);
    }

    private int getMediationNetwork() {
        if (this.equals == Integer.MAX_VALUE) {
            this.equals = ((FilterInputStream) this).in.read();
        }
        if (this.values == 16) {
            byte[] bArr = this.component1;
            int i13 = this.equals;
            bArr[0] = (byte) i13;
            if (i13 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component1, i14, 16 - i14);
                if (read <= 0) {
                    break;
                }
                i14 += read;
            } while (i14 < 16);
            if (i14 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i15 = this.copy;
            if (i15 == this.toString) {
                getMonetizationNetwork(this.component1, this.copydefault);
            } else {
                if (this.hashCode <= i15) {
                    getMonetizationNetwork(this.component1, this.copydefault);
                } else {
                    byte[] bArr2 = this.component1;
                    System.arraycopy(bArr2, 0, this.copydefault, 0, bArr2.length);
                }
                int i16 = this.hashCode;
                if (i16 < this.toString) {
                    this.hashCode = i16 + 1;
                } else {
                    this.hashCode = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.equals = read2;
            this.values = 0;
            this.AFInAppEventParameterName = read2 < 0 ? 16 - (this.copydefault[15] & 255) : 16;
        }
        return this.AFInAppEventParameterName;
    }

    private void getMonetizationNetwork(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component2;
        char c13 = 1;
        int i13 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.areAllFieldsValid;
        iArr[0] = i13 ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i14 = 4;
        int i15 = 1;
        while (i15 < this.component4) {
            int[] iArr3 = getRevenue;
            int[] iArr4 = this.component2;
            byte[][] bArr3 = this.component3;
            byte[] bArr4 = bArr3[0];
            int i16 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getMonetizationNetwork;
            byte[] bArr5 = bArr3[c13];
            int i17 = i16 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getCurrencyIso4217Code;
            byte[] bArr6 = bArr3[2];
            int i18 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i17;
            int[] iArr7 = getMediationNetwork;
            byte[] bArr7 = bArr3[3];
            int i19 = iArr7[iArr4[bArr7[0]] & 255] ^ i18;
            int[] iArr8 = this.areAllFieldsValid;
            int i23 = i19 ^ iArr8[i14];
            int i24 = ((iArr6[(iArr4[bArr6[c13]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c13]] >>> 24] ^ iArr5[(iArr4[bArr5[c13]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c13]] & 255]) ^ iArr8[i14 + 1];
            int i25 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i14 + 2];
            int i26 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i14 + 3];
            iArr4[0] = i23;
            iArr4[1] = i24;
            iArr4[2] = i25;
            iArr4[3] = i26;
            i15++;
            i14 += 4;
            c13 = 1;
        }
        int[] iArr9 = this.areAllFieldsValid;
        int i27 = iArr9[i14];
        byte[] bArr8 = AFAdRevenueData;
        int[] iArr10 = this.component2;
        byte[][] bArr9 = this.component3;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i27 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i27 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i27 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i27);
        int i28 = iArr9[i14 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i28 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i28 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i28 >>> 8));
        bArr2[7] = (byte) (i28 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i29 = iArr9[i14 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i29 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i29 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i29 >>> 8));
        bArr2[11] = (byte) (i29 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i33 = iArr9[i14 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i33 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i33 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i33 >>> 8));
        bArr2[15] = (byte) (i33 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    private static byte[][] getRevenue(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i13 = 0; i13 < bArr.length; i13++) {
            bArr2[i13] = new byte[bArr[i13].length];
            int i14 = 0;
            while (true) {
                byte[] bArr3 = bArr[i13];
                if (i14 < bArr3.length) {
                    bArr2[i13][bArr3[i14]] = (byte) i14;
                    i14++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        getMediationNetwork();
        return this.AFInAppEventParameterName - this.values;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i13) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        getMediationNetwork();
        int i13 = this.values;
        if (i13 >= this.AFInAppEventParameterName) {
            return -1;
        }
        byte[] bArr = this.copydefault;
        this.values = i13 + 1;
        return bArr[i13] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j13) {
        long j14 = 0;
        while (j14 < j13 && read() != -1) {
            j14++;
        }
        return j14;
    }

    private AFk1nSDK(InputStream inputStream, int i13, byte[] bArr, byte[][] bArr2, byte b13) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component2 = new int[4];
        this.component1 = new byte[16];
        this.copydefault = new byte[16];
        this.hashCode = 1;
        this.equals = Integer.MAX_VALUE;
        this.values = 16;
        this.AFInAppEventParameterName = 16;
        this.component4 = i13;
        this.areAllFieldsValid = AFk1mSDK.getCurrencyIso4217Code(bArr, i13);
        this.component3 = getRevenue(bArr2);
        this.copy = 100;
        this.toString = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = i13 + i14;
        for (int i16 = i13; i16 < i15; i16++) {
            getMediationNetwork();
            int i17 = this.values;
            if (i17 >= this.AFInAppEventParameterName) {
                if (i16 == i13) {
                    return -1;
                }
                return i14 - (i15 - i16);
            }
            byte[] bArr2 = this.copydefault;
            this.values = i17 + 1;
            bArr[i16] = bArr2[i17];
        }
        return i14;
    }
}
