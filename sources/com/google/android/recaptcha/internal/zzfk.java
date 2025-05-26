package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzfk {

    @NotNull
    private final List zza;

    public zzfk() {
        this(true);
    }

    public static final boolean zzc(@NotNull Uri uri) {
        return zze(uri);
    }

    private final boolean zzd(String str) {
        List list = this.zza;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (z.p(str, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !Intrinsics.d("https", uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zzf(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }

    public final boolean zza(@NotNull Uri uri) {
        return zze(uri) && zzd(uri.toString());
    }

    public final boolean zzb(@NotNull String str) {
        Uri parse = Uri.parse(str);
        Intrinsics.f(parse);
        return zze(parse) && zzd(parse.toString());
    }

    public zzfk(boolean z13) {
        this.zza = zzf(f0.j("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
    }
}
