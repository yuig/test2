package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzlf extends zzli {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public /* synthetic */ zzlf(byte[] bArr, int i13, int i14, boolean z13, zzlh zzlhVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzJ() {
        int i13 = this.zzf + this.zzg;
        this.zzf = i13;
        int i14 = this.zzj;
        if (i13 <= i14) {
            this.zzg = 0;
            return;
        }
        int i15 = i13 - i14;
        this.zzg = i15;
        this.zzf = i13 - i15;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzA(int i13) {
        this.zzj = i13;
        zzJ();
    }

    public final void zzB(int i13) {
        if (i13 >= 0) {
            int i14 = this.zzf;
            int i15 = this.zzh;
            if (i13 <= i14 - i15) {
                this.zzh = i15 + i13;
                return;
            }
        }
        if (i13 >= 0) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzC() {
        return this.zzh == this.zzf;
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
            if (this.zzf - this.zzh < 10) {
                while (i15 < 10) {
                    if (zza() < 0) {
                        i15++;
                    }
                }
                throw new zznn("CodedInputStream encountered a malformed varint.");
            }
            while (i15 < 10) {
                byte[] bArr = this.zze;
                int i16 = this.zzh;
                this.zzh = i16 + 1;
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
        int i13 = this.zzh;
        if (i13 == this.zzf) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i13 + 1;
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
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zze(int i13) {
        if (i13 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = i13 + this.zzh;
        if (i14 < 0) {
            throw new zznn("Failed to parse the message.");
        }
        int i15 = this.zzj;
        if (i14 > i15) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = i14;
        zzJ();
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
        int i13 = this.zzh;
        if (this.zzf - i13 < 4) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i13 + 4;
        int i14 = bArr[i13] & 255;
        int i15 = bArr[i13 + 1] & 255;
        int i16 = bArr[i13 + 2] & 255;
        return ((bArr[i13 + 3] & 255) << 24) | (i15 << 8) | i14 | (i16 << 16);
    }

    public final int zzj() {
        int i13;
        int i14 = this.zzh;
        int i15 = this.zzf;
        if (i15 != i14) {
            byte[] bArr = this.zze;
            int i16 = i14 + 1;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.zzh = i16;
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
                this.zzh = i17;
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
            this.zzi = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzi = zzj;
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
        int i13 = this.zzh;
        if (this.zzf - i13 < 8) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i13 + 8;
        long j13 = bArr[i13];
        long j14 = bArr[i13 + 2];
        long j15 = bArr[i13 + 3];
        return ((bArr[i13 + 7] & 255) << 56) | (j13 & 255) | ((bArr[i13 + 1] & 255) << 8) | ((j14 & 255) << 16) | ((j15 & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j13;
        long j14;
        int i13 = this.zzh;
        int i14 = this.zzf;
        if (i14 != i13) {
            byte[] bArr = this.zze;
            int i15 = i13 + 1;
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                this.zzh = i15;
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
                this.zzh = i16;
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
        if (zzj > 0) {
            int i13 = this.zzf;
            int i14 = this.zzh;
            if (zzj <= i13 - i14) {
                zzle zzk = zzle.zzk(this.zze, i14, zzj);
                this.zzh += zzj;
                return zzk;
            }
        }
        if (zzj == 0) {
            return zzle.zzb;
        }
        if (zzj > 0) {
            int i15 = this.zzf;
            int i16 = this.zzh;
            if (zzj <= i15 - i16) {
                int i17 = zzj + i16;
                this.zzh = i17;
                return new zzlc(Arrays.copyOfRange(this.zze, i16, i17));
            }
        }
        if (zzj <= 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i13 = this.zzf;
            int i14 = this.zzh;
            if (zzj <= i13 - i14) {
                String str = new String(this.zze, i14, zzj, zznl.zza);
                this.zzh += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzy() {
        int zzj = zzj();
        if (zzj > 0) {
            int i13 = this.zzf;
            int i14 = this.zzh;
            if (zzj <= i13 - i14) {
                String zzd = zzpv.zzd(this.zze, i14, zzj);
                this.zzh += zzj;
                return zzd;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzz(int i13) {
        if (this.zzi != i13) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
    }
}
