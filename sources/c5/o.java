package c5;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f25824a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f25825b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25826c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25827d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25828e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f25829f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f25830g;

    public o(int i13, String str, PendingIntent pendingIntent) {
        IconCompat a13 = i13 != 0 ? IconCompat.a(null, "", i13) : null;
        Bundle bundle = new Bundle();
        this.f25827d = true;
        this.f25825b = a13;
        if (a13 != null && a13.d() == 2) {
            this.f25828e = a13.b();
        }
        this.f25829f = u.c(str);
        this.f25830g = pendingIntent;
        this.f25824a = bundle;
        this.f25826c = true;
        this.f25827d = true;
    }

    public final IconCompat a() {
        int i13;
        if (this.f25825b == null && (i13 = this.f25828e) != 0) {
            this.f25825b = IconCompat.a(null, "", i13);
        }
        return this.f25825b;
    }
}
