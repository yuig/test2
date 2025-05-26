package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import ql2.c;
import ql2.e;

/* loaded from: classes3.dex */
public final class zzbm implements zzaq {

    @NotNull
    private final Context zza;

    @NotNull
    private final String zzb = "rce_";

    public zzbm(@NotNull Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(@NotNull String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (z.p(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(@NotNull String str, @NotNull String str2) {
        e eVar = new e('A', 'z');
        ArrayList arrayList = new ArrayList(g0.q(eVar, 10));
        Iterator it = eVar.iterator();
        while (((c) it).f104100c) {
            arrayList.add(Character.valueOf(((d0) it).b()));
        }
        String Z = CollectionsKt.Z(((ArrayList) e0.c(arrayList)).subList(0, 8), "", null, null, 0, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(Z)));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(@NotNull String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    File file2 = listFiles[i13];
                    if (Intrinsics.d(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i13++;
                }
            }
            return file != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
