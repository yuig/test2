package nl;

import com.google.android.gms.internal.measurement.q4;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f91231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91232b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91233c;

    /* renamed from: d, reason: collision with root package name */
    public final String f91234d;

    /* renamed from: e, reason: collision with root package name */
    public final String f91235e;

    /* renamed from: f, reason: collision with root package name */
    public final String f91236f;

    /* renamed from: g, reason: collision with root package name */
    public final String f91237g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        com.bumptech.glide.d.w("ApplicationId must be set.", !oh.e.a(str));
        this.f91232b = str;
        this.f91231a = str2;
        this.f91233c = str3;
        this.f91234d = str4;
        this.f91235e = str5;
        this.f91236f = str6;
        this.f91237g = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return com.bumptech.glide.c.x(this.f91232b, iVar.f91232b) && com.bumptech.glide.c.x(this.f91231a, iVar.f91231a) && com.bumptech.glide.c.x(this.f91233c, iVar.f91233c) && com.bumptech.glide.c.x(this.f91234d, iVar.f91234d) && com.bumptech.glide.c.x(this.f91235e, iVar.f91235e) && com.bumptech.glide.c.x(this.f91236f, iVar.f91236f) && com.bumptech.glide.c.x(this.f91237g, iVar.f91237g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f91232b, this.f91231a, this.f91233c, this.f91234d, this.f91235e, this.f91236f, this.f91237g});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f91232b, "applicationId");
        q4Var.m(this.f91231a, "apiKey");
        q4Var.m(this.f91233c, "databaseUrl");
        q4Var.m(this.f91235e, "gcmSenderId");
        q4Var.m(this.f91236f, "storageBucket");
        q4Var.m(this.f91237g, "projectId");
        return q4Var.toString();
    }
}
