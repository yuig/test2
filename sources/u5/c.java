package u5;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f120498a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f120499b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f120500c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f120501d;

    /* renamed from: e, reason: collision with root package name */
    public final b f120502e;

    /* renamed from: f, reason: collision with root package name */
    public final String f120503f;

    public c(Bundle credentialData, Bundle candidateQueryData, boolean z13, b displayInfo, String str, boolean z14) {
        Intrinsics.checkNotNullParameter("android.credentials.TYPE_PASSWORD_CREDENTIAL", "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
        this.f120498a = "android.credentials.TYPE_PASSWORD_CREDENTIAL";
        this.f120499b = credentialData;
        this.f120500c = candidateQueryData;
        this.f120501d = false;
        this.f120502e = displayInfo;
        this.f120503f = str;
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z13);
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z14);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z13);
    }
}
