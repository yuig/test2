package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1qSDK extends FilterInputStream {
    private static final short getRevenue = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private byte[] AFAdRevenueData;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final int equals;
    private int getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private byte[] getMonetizationNetwork;
    private int hashCode;
    private int toString;
    private int values;

    public AFk1qSDK(InputStream inputStream, int[] iArr, int i13, byte[] bArr, int i14, int i15) {
        this(inputStream, iArr, i13, bArr, i14, i15, (byte) 0);
    }

    private void getCurrencyIso4217Code() {
        if (this.component2 == 3) {
            byte[] bArr = this.getMonetizationNetwork;
            System.arraycopy(bArr, 0, this.getMediationNetwork, 0, bArr.length);
        }
        byte[] bArr2 = this.getMonetizationNetwork;
        int i13 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i14 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i15 = 0;
        while (true) {
            int i16 = this.areAllFieldsValid;
            if (i15 >= i16) {
                break;
            }
            short s13 = getRevenue;
            i14 -= ((((i16 - i15) * s13) + i13) ^ ((i13 << 4) + this.copy)) ^ ((i13 >>> 5) + this.hashCode);
            i13 -= (((i14 << 4) + this.component3) ^ (((i16 - i15) * s13) + i14)) ^ ((i14 >>> 5) + this.toString);
            i15++;
        }
        byte[] bArr3 = this.getMonetizationNetwork;
        bArr3[0] = (byte) (i13 >> 24);
        bArr3[1] = (byte) (i13 >> 16);
        bArr3[2] = (byte) (i13 >> 8);
        bArr3[3] = (byte) i13;
        bArr3[4] = (byte) (i14 >> 24);
        bArr3[5] = (byte) (i14 >> 16);
        bArr3[6] = (byte) (i14 >> 8);
        bArr3[7] = (byte) i14;
        if (this.component2 == 3) {
            for (int i17 = 0; i17 < 8; i17++) {
                byte[] bArr4 = this.getMonetizationNetwork;
                bArr4[i17] = (byte) (bArr4[i17] ^ this.AFAdRevenueData[i17]);
            }
            byte[] bArr5 = this.getMediationNetwork;
            System.arraycopy(bArr5, 0, this.AFAdRevenueData, 0, bArr5.length);
        }
    }

    private int getRevenue() {
        if (this.component1 == Integer.MAX_VALUE) {
            this.component1 = ((FilterInputStream) this).in.read();
        }
        if (this.getCurrencyIso4217Code == 8) {
            byte[] bArr = this.getMonetizationNetwork;
            int i13 = this.component1;
            bArr[0] = (byte) i13;
            if (i13 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.getMonetizationNetwork, i14, 8 - i14);
                if (read <= 0) {
                    break;
                }
                i14 += read;
            } while (i14 < 8);
            if (i14 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i15 = this.copydefault;
            if (i15 == this.equals) {
                getCurrencyIso4217Code();
            } else {
                if (this.values <= i15) {
                    getCurrencyIso4217Code();
                }
                int i16 = this.values;
                if (i16 < this.equals) {
                    this.values = i16 + 1;
                } else {
                    this.values = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component1 = read2;
            this.getCurrencyIso4217Code = 0;
            this.component4 = read2 < 0 ? 8 - (this.getMonetizationNetwork[7] & 255) : 8;
        }
        return this.component4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        getRevenue();
        return this.component4 - this.getCurrencyIso4217Code;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        getRevenue();
        int i13 = this.getCurrencyIso4217Code;
        if (i13 >= this.component4) {
            return -1;
        }
        byte[] bArr = this.getMonetizationNetwork;
        this.getCurrencyIso4217Code = i13 + 1;
        return bArr[i13] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j13) {
        long j14 = 0;
        while (j14 < j13 && read() != -1) {
            j14++;
        }
        return j14;
    }

    private AFk1qSDK(InputStream inputStream, int[] iArr, int i13, byte[] bArr, int i14, int i15, byte b13) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component1 = Integer.MAX_VALUE;
        this.values = 1;
        this.getMonetizationNetwork = new byte[8];
        this.AFAdRevenueData = new byte[8];
        this.getMediationNetwork = new byte[8];
        this.getCurrencyIso4217Code = 8;
        this.component4 = 8;
        this.areAllFieldsValid = Math.min(Math.max(i14, 5), 16);
        this.component2 = i15;
        if (i15 == 3) {
            System.arraycopy(bArr, 0, this.AFAdRevenueData, 0, 8);
        }
        long j13 = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i13 == 0) {
            this.component3 = (int) j13;
            long j14 = j13 >> 3;
            short s13 = getRevenue;
            this.toString = (int) ((s13 * j14) >> 32);
            this.copy = (int) (j13 >> 32);
            this.hashCode = (int) (j14 + s13);
        } else {
            int i16 = (int) j13;
            this.component3 = i16;
            this.toString = i16 * i13;
            this.copy = i13 ^ i16;
            this.hashCode = (int) (j13 >> 32);
        }
        this.copydefault = 100;
        this.equals = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = i13 + i14;
        for (int i16 = i13; i16 < i15; i16++) {
            getRevenue();
            int i17 = this.getCurrencyIso4217Code;
            if (i17 >= this.component4) {
                if (i16 == i13) {
                    return -1;
                }
                return i14 - (i15 - i16);
            }
            byte[] bArr2 = this.getMonetizationNetwork;
            this.getCurrencyIso4217Code = i17 + 1;
            bArr[i16] = bArr2[i17];
        }
        return i14;
    }
}
