package nu1;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import df.j1;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lu1.b;
import lu1.c;
import m60.f0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final b f92334a;

    public a(b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f92334a = baseActivityHelper;
    }

    public static boolean c(a aVar, String str, String str2, HashMap hashMap, boolean z13, int i13) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            hashMap = null;
        }
        boolean z14 = (i13 & 8) != 0;
        boolean z15 = (i13 & 16) != 0 ? false : z13;
        aVar.getClass();
        if (str == null || str.length() == 0) {
            return false;
        }
        return aVar.a(Uri.parse(str), str2, hashMap, z14, z15);
    }

    public final boolean a(Uri uri, String str, HashMap hashMap, boolean z13, boolean z14) {
        HashMap hashMap2;
        if (uri == null || !j1.H0(z13, uri)) {
            return false;
        }
        Context context = kb0.a.f79058b;
        Application W = f0.W();
        Intent j13 = ((c) this.f92334a).j(W);
        j13.setData(uri);
        j13.addFlags(268435456);
        j13.putExtra("analytics_extra", str);
        if (hashMap == null || !(!hashMap.isEmpty())) {
            hashMap2 = null;
        } else {
            hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    hashMap2.put(str2, value.toString());
                }
            }
        }
        j13.putExtra("analytics_map_extra", hashMap2);
        if (z14) {
            j13.putExtra("force_finish_after_create", true);
        }
        W.startActivity(j13);
        return true;
    }
}
