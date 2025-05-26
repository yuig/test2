package com.google.android.recaptcha.internal;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kh2.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.k;
import xk2.m;

/* loaded from: classes3.dex */
public final class zzfa implements zzey {

    @NotNull
    private final k zza;

    public zzfa() {
        int i13 = zzav.zza;
        this.zza = m.b(zzez.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzey
    @NotNull
    public final zzsc zza(@NotNull String str, @NotNull zzto zztoVar) {
        zzew zzewVar = null;
        try {
            try {
                try {
                    zzewVar = ((zzex) this.zza.getValue()).zza(str);
                    zzewVar.zzc();
                    zzewVar.zze(zztoVar.zzd());
                    zzsc zzscVar = (zzsc) zzewVar.zza(zzsc.zzi());
                    zzewVar.zzd();
                    return zzscVar;
                } catch (Exception e13) {
                    throw new zzbd(zzbb.zzc, zzba.zzF, e13.getMessage());
                }
            } catch (zzbd e14) {
                if (zzewVar == null) {
                    throw e14;
                }
                if (!Intrinsics.d(e14.zza(), zzba.zzau)) {
                    throw e14;
                }
                try {
                    throw zzbc.zza(zztu.zzg(zzewVar.zzb().getErrorStream()).zzi());
                } catch (Exception e15) {
                    throw new zzbd(zzbb.zzc, zzba.zzG, e15.getMessage());
                }
            }
        } catch (Throwable th3) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th3;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzey
    @NotNull
    public final String zzb(@NotNull String str) {
        try {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                Intrinsics.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), null);
                }
                try {
                    return j.z2(Intrinsics.d("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                } catch (Exception unused) {
                    throw new zzbd(zzbb.zzc, zzba.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
