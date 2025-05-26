package jh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f76161d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f76162a;

    /* renamed from: b, reason: collision with root package name */
    public final String f76163b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f76164c;

    public i0(String str, String str2, boolean z13) {
        com.bumptech.glide.d.o(str);
        this.f76162a = str;
        com.bumptech.glide.d.o(str2);
        this.f76163b = str2;
        this.f76164c = z13;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f76162a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f76164c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f76161d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e13) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e13.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f76163b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return com.bumptech.glide.c.x(this.f76162a, i0Var.f76162a) && com.bumptech.glide.c.x(this.f76163b, i0Var.f76163b) && com.bumptech.glide.c.x(null, null) && this.f76164c == i0Var.f76164c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76162a, this.f76163b, null, 4225, Boolean.valueOf(this.f76164c)});
    }

    public final String toString() {
        String str = this.f76162a;
        if (str != null) {
            return str;
        }
        com.bumptech.glide.d.t(null);
        throw null;
    }
}
