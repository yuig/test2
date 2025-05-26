package u5;

import android.credentials.Credential;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f120532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f120533b;

    public u(pq2.y yVar, v vVar) {
        this.f120532a = yVar;
        this.f120533b = vVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onError(java.lang.Throwable r6) {
        /*
            r5 = this;
            android.credentials.GetCredentialException r6 = u5.r.e(r6)
            java.lang.String r0 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r1 = "CredManProvService"
            java.lang.String r2 = "GetCredentialResponse error returned from framework"
            android.util.Log.i(r1, r2)
            u5.m r1 = r5.f120532a
            u5.v r2 = r5.f120533b
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = u5.r.m(r6)
            int r2 = r0.hashCode()
            switch(r2) {
                case -781118336: goto L5f;
                case -45448328: goto L4c;
                case 580557411: goto L39;
                case 627896683: goto L26;
                default: goto L25;
            }
        L25:
            goto L67
        L26:
            java.lang.String r2 = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2f
            goto L67
        L2f:
            androidx.credentials.exceptions.NoCredentialException r0 = new androidx.credentials.exceptions.NoCredentialException
            java.lang.String r6 = u5.r.w(r6)
            r0.<init>(r6)
            goto La5
        L39:
            java.lang.String r2 = "android.credentials.GetCredentialException.TYPE_USER_CANCELED"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L42
            goto L67
        L42:
            androidx.credentials.exceptions.GetCredentialCancellationException r0 = new androidx.credentials.exceptions.GetCredentialCancellationException
            java.lang.String r6 = u5.r.w(r6)
            r0.<init>(r6)
            goto La5
        L4c:
            java.lang.String r2 = "android.credentials.GetCredentialException.TYPE_INTERRUPTED"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L55
            goto L67
        L55:
            androidx.credentials.exceptions.GetCredentialInterruptedException r0 = new androidx.credentials.exceptions.GetCredentialInterruptedException
            java.lang.String r6 = u5.r.w(r6)
            r0.<init>(r6)
            goto La5
        L5f:
            java.lang.String r2 = "android.credentials.GetCredentialException.TYPE_UNKNOWN"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L9c
        L67:
            java.lang.String r0 = u5.r.z(r6)
            java.lang.String r2 = "error.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r3 = 0
            java.lang.String r4 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            boolean r0 = kotlin.text.z.p(r0, r4, r3)
            if (r0 == 0) goto L8b
            v5.x r0 = androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException.f18018a
            java.lang.String r3 = u5.r.z(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            java.lang.String r6 = u5.r.w(r6)
            androidx.credentials.exceptions.GetCredentialException r0 = r0.t(r3, r6)
            goto La5
        L8b:
            androidx.credentials.exceptions.GetCredentialCustomException r0 = new androidx.credentials.exceptions.GetCredentialCustomException
            java.lang.String r3 = u5.r.z(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            java.lang.String r6 = u5.r.w(r6)
            r0.<init>(r6, r3)
            goto La5
        L9c:
            androidx.credentials.exceptions.GetCredentialUnknownException r0 = new androidx.credentials.exceptions.GetCredentialUnknownException
            java.lang.String r6 = u5.r.w(r6)
            r0.<init>(r6)
        La5:
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.u.onError(java.lang.Throwable):void");
    }

    public final void onResult(Object obj) {
        Credential credential;
        String type;
        Bundle data;
        i wVar;
        GetCredentialResponse response = r.g(obj);
        Intrinsics.checkNotNullParameter(response, "response");
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        m mVar = this.f120532a;
        this.f120533b.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        credential = response.getCredential();
        Intrinsics.checkNotNullExpressionValue(credential, "response.credential");
        type = credential.getType();
        Intrinsics.checkNotNullExpressionValue(type, "credential.type");
        data = credential.getData();
        Intrinsics.checkNotNullExpressionValue(data, "credential.data");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
        } catch (FrameworkClassParsingException unused) {
            wVar = new w(type, data);
        }
        if (Intrinsics.d(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                Intrinsics.f(string);
                Intrinsics.f(string2);
                wVar = new d0(string, string2, data);
                mVar.onResult(new z(wVar));
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }
        if (!Intrinsics.d(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
            throw new FrameworkClassParsingException();
        }
        m4.i iVar = f0.f120511d;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
            Intrinsics.f(string3);
            wVar = new f0(string3, data);
            mVar.onResult(new z(wVar));
        } catch (Exception unused3) {
            throw new FrameworkClassParsingException();
        }
        wVar = new w(type, data);
        mVar.onResult(new z(wVar));
    }
}
