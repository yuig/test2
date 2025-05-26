package u5;

import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a0 extends o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Bundle requestData, Bundle candidateQueryData, boolean z13, Set allowedProviders, int i13) {
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", requestData, candidateQueryData, true, z13, allowedProviders, i13);
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", "type");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        if ("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL".length() <= 0) {
            throw new IllegalArgumentException("type should not be empty".toString());
        }
        if (i13 == 100) {
            throw new IllegalArgumentException("Custom types should not have passkey level priority.".toString());
        }
    }
}
