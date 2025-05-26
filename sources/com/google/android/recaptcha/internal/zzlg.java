package com.google.android.recaptcha.internal;

import a.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class zzlg extends zzli {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzlg(InputStream inputStream, int i13, zzlh zzlhVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        byte[] bArr = zznl.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int i13) {
        ArrayList arrayList = new ArrayList();
        while (i13 > 0) {
            int min = Math.min(i13, 4096);
            byte[] bArr = new byte[min];
            int i14 = 0;
            while (i14 < min) {
                int read = this.zze.read(bArr, i14, min - i14);
                if (read == -1) {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += read;
                i14 += read;
            }
            i13 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzK() {
        int i13 = this.zzg + this.zzh;
        this.zzg = i13;
        int i14 = this.zzk + i13;
        int i15 = this.zzl;
        if (i14 <= i15) {
            this.zzh = 0;
            return;
        }
        int i16 = i14 - i15;
        this.zzh = i16;
        this.zzg = i13 - i16;
    }

    private final void zzL(int i13) {
        if (zzM(i13)) {
            return;
        }
        if (i13 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean zzM(int i13) {
        int i14 = this.zzi;
        int i15 = i14 + i13;
        int i16 = this.zzg;
        if (i15 <= i16) {
            throw new IllegalStateException(a.e("refillBuffer() called when ", i13, " bytes were already available in buffer"));
        }
        int i17 = this.zzk;
        if (i13 > (Integer.MAX_VALUE - i17) - i14 || i17 + i14 + i13 > this.zzl) {
            return false;
        }
        if (i14 > 0) {
            if (i16 > i14) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
            }
            i17 = this.zzk + i14;
            this.zzk = i17;
            i16 = this.zzg - i14;
            this.zzg = i16;
            this.zzi = 0;
        }
        try {
            int read = this.zze.read(this.zzf, i16, Math.min(4096 - i16, (Integer.MAX_VALUE - i17) - i16));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.zzg += read;
            zzK();
            if (this.zzg >= i13) {
                return true;
            }
            return zzM(i13);
        } catch (zznn e13) {
            e13.zza();
            throw e13;
        }
    }

    private final byte[] zzN(int i13, boolean z13) {
        byte[] zzO = zzO(i13);
        if (zzO != null) {
            return zzO;
        }
        int i14 = this.zzi;
        int i15 = this.zzg;
        int i16 = i15 - i14;
        this.zzk += i15;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzJ = zzJ(i13 - i16);
        byte[] bArr = new byte[i13];
        System.arraycopy(this.zzf, i14, bArr, 0, i16);
        for (byte[] bArr2 : zzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i16, length);
            i16 += length;
        }
        return bArr;
    }

    private final byte[] zzO(int i13) {
        if (i13 == 0) {
            return zznl.zzb;
        }
        int i14 = this.zzk;
        int i15 = this.zzi;
        int i16 = i14 + i15 + i13;
        if ((-2147483647) + i16 > 0) {
            throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i17 = this.zzl;
        if (i16 > i17) {
            zzB((i17 - i14) - i15);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i18 = this.zzg - i15;
        int i19 = i13 - i18;
        if (i19 >= 4096) {
            try {
                if (i19 > this.zze.available()) {
                    return null;
                }
            } catch (zznn e13) {
                e13.zza();
                throw e13;
            }
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i18);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i18 < i13) {
            try {
                int read = this.zze.read(bArr, i18, i13 - i18);
                if (read == -1) {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += read;
                i18 += read;
            } catch (zznn e14) {
                e14.zza();
                throw e14;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzA(int i13) {
        this.zzl = i13;
        zzK();
    }

    public final void zzB(int i13) {
        int i14 = this.zzg;
        int i15 = this.zzi;
        int i16 = i14 - i15;
        if (i13 <= i16 && i13 >= 0) {
            this.zzi = i15 + i13;
            return;
        }
        if (i13 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i17 = this.zzk;
        int i18 = i17 + i15;
        int i19 = this.zzl;
        if (i18 + i13 > i19) {
            zzB((i19 - i17) - i15);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i18;
        this.zzg = 0;
        this.zzi = 0;
        while (i16 < i13) {
            try {
                long j13 = i13 - i16;
                try {
                    long skip = this.zze.skip(j13);
                    if (skip < 0 || skip > j13) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i16 += (int) skip;
                    }
                } catch (zznn e13) {
                    e13.zza();
                    throw e13;
                }
            } catch (Throwable th3) {
                this.zzk += i16;
                zzK();
                throw th3;
            }
        }
        this.zzk += i16;
        zzK();
        if (i16 >= i13) {
            return;
        }
        int i23 = this.zzg;
        int i24 = i23 - this.zzi;
        this.zzi = i23;
        zzL(1);
        while (true) {
            int i25 = i13 - i24;
            int i26 = this.zzg;
            if (i25 <= i26) {
                this.zzi = i25;
                return;
            } else {
                i24 += i26;
                this.zzi = i26;
                zzL(1);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzC() {
        return this.zzi == this.zzg && !zzM(1);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzE(int i13) {
        int i14 = i13 & 7;
        int i15 = 0;
        if (i14 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i15 < 10) {
                    if (zza() < 0) {
                        i15++;
                    }
                }
                throw new zznn("CodedInputStream encountered a malformed varint.");
            }
            while (i15 < 10) {
                byte[] bArr = this.zzf;
                int i16 = this.zzi;
                this.zzi = i16 + 1;
                if (bArr[i16] < 0) {
                    i15++;
                }
            }
            throw new zznn("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i14 == 1) {
            zzB(8);
            return true;
        }
        if (i14 == 2) {
            zzB(zzj());
            return true;
        }
        if (i14 == 3) {
            zzI();
            zzz(((i13 >>> 3) << 3) | 4);
            return true;
        }
        if (i14 == 4) {
            return false;
        }
        if (i14 != 5) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        zzB(4);
        return true;
    }

    public final byte zza() {
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i13 = this.zzi;
        this.zzi = i13 + 1;
        return bArr[i13];
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zze(int i13) {
        if (i13 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.zzk + this.zzi + i13;
        if (i14 < 0) {
            throw new zznn("Failed to parse the message.");
        }
        int i15 = this.zzl;
        if (i14 > i15) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i14;
        zzK();
        return i15;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        int i13 = this.zzi;
        if (this.zzg - i13 < 4) {
            zzL(4);
            i13 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i13 + 4;
        int i14 = bArr[i13] & 255;
        int i15 = bArr[i13 + 1] & 255;
        int i16 = bArr[i13 + 2] & 255;
        return ((bArr[i13 + 3] & 255) << 24) | (i15 << 8) | i14 | (i16 << 16);
    }

    public final int zzj() {
        int i13;
        int i14 = this.zzi;
        int i15 = this.zzg;
        if (i15 != i14) {
            byte[] bArr = this.zzf;
            int i16 = i14 + 1;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.zzi = i16;
                return b13;
            }
            if (i15 - i16 >= 9) {
                int i17 = i14 + 2;
                int i18 = (bArr[i16] << 7) ^ b13;
                if (i18 < 0) {
                    i13 = i18 ^ (-128);
                } else {
                    int i19 = i14 + 3;
                    int i23 = (bArr[i17] << 14) ^ i18;
                    if (i23 >= 0) {
                        i13 = i23 ^ 16256;
                    } else {
                        int i24 = i14 + 4;
                        int i25 = i23 ^ (bArr[i19] << 21);
                        if (i25 < 0) {
                            i13 = (-2080896) ^ i25;
                        } else {
                            i19 = i14 + 5;
                            byte b14 = bArr[i24];
                            int i26 = (i25 ^ (b14 << 28)) ^ 266354560;
                            if (b14 < 0) {
                                i24 = i14 + 6;
                                if (bArr[i19] < 0) {
                                    i19 = i14 + 7;
                                    if (bArr[i24] < 0) {
                                        i24 = i14 + 8;
                                        if (bArr[i19] < 0) {
                                            i19 = i14 + 9;
                                            if (bArr[i24] < 0) {
                                                int i27 = i14 + 10;
                                                if (bArr[i19] >= 0) {
                                                    i17 = i27;
                                                    i13 = i26;
                                                }
                                            }
                                        }
                                    }
                                }
                                i13 = i26;
                            }
                            i13 = i26;
                        }
                        i17 = i24;
                    }
                    i17 = i19;
                }
                this.zzi = i17;
                return i13;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzl() {
        return zzli.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzm() {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzj = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw new zznn("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        int i13 = this.zzi;
        if (this.zzg - i13 < 8) {
            zzL(8);
            i13 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i13 + 8;
        long j13 = bArr[i13];
        long j14 = bArr[i13 + 2];
        long j15 = bArr[i13 + 3];
        return ((bArr[i13 + 7] & 255) << 56) | (j13 & 255) | ((bArr[i13 + 1] & 255) << 8) | ((j14 & 255) << 16) | ((j15 & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j13;
        long j14;
        int i13 = this.zzi;
        int i14 = this.zzg;
        if (i14 != i13) {
            byte[] bArr = this.zzf;
            int i15 = i13 + 1;
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                this.zzi = i15;
                return b13;
            }
            if (i14 - i15 >= 9) {
                int i16 = i13 + 2;
                int i17 = (bArr[i15] << 7) ^ b13;
                if (i17 < 0) {
                    j13 = i17 ^ (-128);
                } else {
                    int i18 = i13 + 3;
                    int i19 = (bArr[i16] << 14) ^ i17;
                    if (i19 >= 0) {
                        j13 = i19 ^ 16256;
                    } else {
                        int i23 = i13 + 4;
                        int i24 = i19 ^ (bArr[i18] << 21);
                        if (i24 < 0) {
                            long j15 = (-2080896) ^ i24;
                            i16 = i23;
                            j13 = j15;
                        } else {
                            i18 = i13 + 5;
                            long j16 = (bArr[i23] << 28) ^ i24;
                            if (j16 >= 0) {
                                j13 = j16 ^ 266354560;
                            } else {
                                i16 = i13 + 6;
                                long j17 = (bArr[i18] << 35) ^ j16;
                                if (j17 < 0) {
                                    j14 = -34093383808L;
                                } else {
                                    int i25 = i13 + 7;
                                    long j18 = j17 ^ (bArr[i16] << 42);
                                    if (j18 >= 0) {
                                        j13 = j18 ^ 4363953127296L;
                                    } else {
                                        i16 = i13 + 8;
                                        j17 = j18 ^ (bArr[i25] << 49);
                                        if (j17 < 0) {
                                            j14 = -558586000294016L;
                                        } else {
                                            i25 = i13 + 9;
                                            long j19 = (j17 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j19 < 0) {
                                                i16 = i13 + 10;
                                                if (bArr[i25] >= 0) {
                                                    j13 = j19;
                                                }
                                            } else {
                                                j13 = j19;
                                            }
                                        }
                                    }
                                    i16 = i25;
                                }
                                j13 = j17 ^ j14;
                            }
                        }
                    }
                    i16 = i18;
                }
                this.zzi = i16;
                return j13;
            }
        }
        return zzs();
    }

    public final long zzs() {
        long j13 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            j13 |= (r3 & Byte.MAX_VALUE) << i13;
            if ((zza() & 128) == 0) {
                return j13;
            }
        }
        throw new zznn("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzu() {
        return zzli.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final zzle zzw() {
        int zzj = zzj();
        int i13 = this.zzg;
        int i14 = this.zzi;
        if (zzj <= i13 - i14 && zzj > 0) {
            zzle zzk = zzle.zzk(this.zzf, i14, zzj);
            this.zzi += zzj;
            return zzk;
        }
        if (zzj == 0) {
            return zzle.zzb;
        }
        if (zzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] zzO = zzO(zzj);
        if (zzO != null) {
            return zzle.zzk(zzO, 0, zzO.length);
        }
        int i15 = this.zzi;
        int i16 = this.zzg;
        int i17 = i16 - i15;
        this.zzk += i16;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzJ = zzJ(zzj - i17);
        byte[] bArr = new byte[zzj];
        System.arraycopy(this.zzf, i15, bArr, 0, i17);
        for (byte[] bArr2 : zzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i17, length);
            i17 += length;
        }
        return new zzlc(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i13 = this.zzg;
            int i14 = this.zzi;
            if (zzj <= i13 - i14) {
                String str = new String(this.zzf, i14, zzj, zznl.zza);
                this.zzi += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (zzj > this.zzg) {
            return new String(zzN(zzj, false), zznl.zza);
        }
        zzL(zzj);
        String str2 = new String(this.zzf, this.zzi, zzj, zznl.zza);
        this.zzi += zzj;
        return str2;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzy() {
        byte[] zzN;
        int zzj = zzj();
        int i13 = this.zzi;
        int i14 = this.zzg;
        if (zzj <= i14 - i13 && zzj > 0) {
            zzN = this.zzf;
            this.zzi = i13 + zzj;
        } else {
            if (zzj == 0) {
                return "";
            }
            if (zzj < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i13 = 0;
            if (zzj <= i14) {
                zzL(zzj);
                zzN = this.zzf;
                this.zzi = zzj;
            } else {
                zzN = zzN(zzj, false);
            }
        }
        return zzpv.zzd(zzN, i13, zzj);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzz(int i13) {
        if (this.zzj != i13) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
    }
}
