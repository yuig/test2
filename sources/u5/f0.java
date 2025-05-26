package u5;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f0 extends i {

    /* renamed from: d, reason: collision with root package name */
    public static final m4.i f120511d = new m4.i(23, 0);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(String authenticationResponseJson) {
        this(authenticationResponseJson, f120511d.a(authenticationResponseJson));
        Intrinsics.checkNotNullParameter(authenticationResponseJson, "authenticationResponseJson");
    }

    public f0(String jsonString, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        if (jsonString.length() != 0) {
            try {
                new JSONObject(jsonString);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON".toString());
    }
}
