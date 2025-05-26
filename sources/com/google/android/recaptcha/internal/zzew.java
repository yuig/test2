package com.google.android.recaptcha.internal;

import bs1.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzew {

    @NotNull
    private final HttpURLConnection zza;

    public zzew(@NotNull HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e13) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e13.getMessage());
        } catch (IOException e14) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e14.getMessage());
        } catch (Exception e15) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e15.getMessage());
        }
    }

    private final OutputStream zzg() {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e13) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e13.getMessage());
        } catch (IOException e14) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e14.getMessage());
        } catch (Exception e15) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e15.getMessage());
        }
    }

    @NotNull
    public final zzoi zza(@NotNull zzoi zzoiVar) {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzbd(zzbb.zzc, zzba.zzau, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzbd(zzbb.zzc, zzba.zzK, null);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzi, null);
                }
                throw new zzbd(zzbb.zzi, zzba.zzJ, null);
            }
            byte[] I1 = c.I1(zzf());
            if (I1.length == 0) {
                throw new zzbd(zzbb.zzc, zzba.zzat, null);
            }
            try {
                Object zzb = zzoiVar.zzD().zzb(I1);
                Intrinsics.g(zzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzoi) zzb;
            } catch (Exception e13) {
                throw new zzbd(zzbb.zzc, zzba.zzG, e13.getMessage());
            }
        } catch (Exception e14) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e14.getMessage());
        }
    }

    @NotNull
    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e13) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e13.getMessage());
        } catch (IOException e14) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e14.getMessage());
        } catch (Exception e15) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e15.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(@NotNull byte[] bArr) {
        try {
            zzg().write(bArr);
        } catch (zzbd e13) {
            throw e13;
        } catch (IOException e14) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e14.getMessage());
        } catch (Exception e15) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e15.getMessage());
        }
    }
}
