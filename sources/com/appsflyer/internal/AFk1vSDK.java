package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1vSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int areAllFieldsValid;
    private int component1;
    private long[] component2;
    private byte[] component3;
    private short component4;
    private final int getCurrencyIso4217Code;
    private int getMediationNetwork;
    private long[] getMonetizationNetwork;
    private final int getRevenue;
    private int toString;

    public AFk1vSDK(InputStream inputStream, int i13, int i14, short s13, int i15, int i16) {
        this(inputStream, i13, i14, s13, i15, i16, (byte) 0);
    }

    private int AFAdRevenueData() {
        int i13;
        if (this.component1 == Integer.MAX_VALUE) {
            this.component1 = ((FilterInputStream) this).in.read();
        }
        if (this.areAllFieldsValid == this.getCurrencyIso4217Code) {
            byte[] bArr = this.component3;
            int i14 = this.component1;
            bArr[0] = (byte) i14;
            if (i14 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i15 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component3, i15, this.getCurrencyIso4217Code - i15);
                if (read <= 0) {
                    break;
                }
                i15 += read;
            } while (i15 < this.getCurrencyIso4217Code);
            if (i15 < this.getCurrencyIso4217Code) {
                throw new IllegalStateException("unexpected block size");
            }
            int i16 = this.getRevenue;
            if (i16 == this.AFAdRevenueData) {
                getCurrencyIso4217Code();
            } else {
                if (this.getMediationNetwork <= i16) {
                    getCurrencyIso4217Code();
                }
                int i17 = this.getMediationNetwork;
                if (i17 < this.AFAdRevenueData) {
                    this.getMediationNetwork = i17 + 1;
                } else {
                    this.getMediationNetwork = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component1 = read2;
            this.areAllFieldsValid = 0;
            if (read2 < 0) {
                int i18 = this.getCurrencyIso4217Code;
                i13 = i18 - (this.component3[i18 - 1] & 255);
            } else {
                i13 = this.getCurrencyIso4217Code;
            }
            this.toString = i13;
        }
        return this.toString;
    }

    private void getCurrencyIso4217Code() {
        long[] jArr = this.getMonetizationNetwork;
        long[] jArr2 = this.component2;
        short s13 = this.component4;
        long j13 = jArr[s13 % 4] * 2147483085;
        long j14 = jArr2[(s13 + 2) % 4];
        int i13 = (s13 + 3) % 4;
        jArr2[i13] = ((jArr[i13] * 2147483085) + j14) / 2147483647L;
        jArr[i13] = (j13 + j14) % 2147483647L;
        for (int i14 = 0; i14 < this.getCurrencyIso4217Code; i14++) {
            this.component3[i14] = (byte) (r1[i14] ^ ((this.getMonetizationNetwork[this.component4] >> (i14 << 3)) & 255));
        }
        this.component4 = (short) ((this.component4 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFAdRevenueData();
        return this.toString - this.areAllFieldsValid;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFAdRevenueData();
        int i13 = this.areAllFieldsValid;
        if (i13 >= this.toString) {
            return -1;
        }
        byte[] bArr = this.component3;
        this.areAllFieldsValid = i13 + 1;
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

    private AFk1vSDK(InputStream inputStream, int i13, int i14, short s13, int i15, int i16, byte b13) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getMediationNetwork = 1;
        this.component1 = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s13, 4), 8);
        this.getCurrencyIso4217Code = min;
        this.component3 = new byte[min];
        this.getMonetizationNetwork = new long[4];
        this.component2 = new long[4];
        this.areAllFieldsValid = min;
        this.toString = min;
        this.getMonetizationNetwork = AFk1uSDK.getCurrencyIso4217Code(i13 ^ i16, min ^ i16);
        this.component2 = AFk1uSDK.getCurrencyIso4217Code(i14 ^ i16, i15 ^ i16);
        this.getRevenue = 100;
        this.AFAdRevenueData = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = i13 + i14;
        for (int i16 = i13; i16 < i15; i16++) {
            AFAdRevenueData();
            int i17 = this.areAllFieldsValid;
            if (i17 >= this.toString) {
                if (i16 == i13) {
                    return -1;
                }
                return i14 - (i15 - i16);
            }
            byte[] bArr2 = this.component3;
            this.areAllFieldsValid = i17 + 1;
            bArr[i16] = bArr2[i17];
        }
        return i14;
    }
}
