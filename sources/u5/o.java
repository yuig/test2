package u5;

import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f120520a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f120521b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f120522c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f120523d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f120524e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f120525f;

    public o(String type, Bundle requestData, Bundle candidateQueryData, boolean z13, boolean z14, Set allowedProviders, int i13) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        this.f120520a = type;
        this.f120521b = requestData;
        this.f120522c = candidateQueryData;
        this.f120523d = z13;
        this.f120524e = z14;
        this.f120525f = allowedProviders;
        requestData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z14);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z14);
        requestData.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i13);
        candidateQueryData.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i13);
    }
}
