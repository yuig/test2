package com.google.android.recaptcha.internal;

import a.a;
import com.google.android.recaptcha.internal.zzkn;
import com.google.android.recaptcha.internal.zzko;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzko<MessageType extends zzko<MessageType, BuilderType>, BuilderType extends zzkn<MessageType, BuilderType>> implements zzoi {
    protected int zza = 0;

    public static void zzc(Iterable iterable, List list) {
        zzkn.zzd(iterable, list);
    }

    public int zza(zzow zzowVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final zzle zzb() {
        try {
            int zzo = zzo();
            zzle zzleVar = zzle.zzb;
            byte[] bArr = new byte[zzo];
            zzlk zzlkVar = new zzlk(bArr, 0, zzo);
            zze(zzlkVar);
            zzlkVar.zzC();
            return new zzlc(bArr);
        } catch (IOException e13) {
            throw new RuntimeException(a.k("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e13);
        }
    }

    public final byte[] zzd() {
        try {
            int zzo = zzo();
            byte[] bArr = new byte[zzo];
            zzlk zzlkVar = new zzlk(bArr, 0, zzo);
            zze(zzlkVar);
            zzlkVar.zzC();
            return bArr;
        } catch (IOException e13) {
            throw new RuntimeException(a.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e13);
        }
    }
}
