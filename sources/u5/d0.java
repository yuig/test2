package u5;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class d0 extends i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f120505f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f120506d;

    /* renamed from: e, reason: collision with root package name */
    public final String f120507e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d0(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "password"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "androidx.credentials.BUNDLE_KEY_ID"
            r0.putString(r1, r3)
            java.lang.String r1 = "androidx.credentials.BUNDLE_KEY_PASSWORD"
            r0.putString(r1, r4)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.d0.<init>(java.lang.String, java.lang.String):void");
    }

    public final String c() {
        return this.f120506d;
    }

    public final String d() {
        return this.f120507e;
    }

    public d0(String str, String str2, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        this.f120506d = str;
        this.f120507e = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty".toString());
        }
    }
}
