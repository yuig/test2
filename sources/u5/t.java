package u5;

import android.credentials.CreateCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f120529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f120530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f120531c;

    public t(k kVar, f fVar, v vVar) {
        this.f120529a = kVar;
        this.f120530b = fVar;
        this.f120531c = vVar;
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
            android.credentials.CreateCredentialException r6 = u5.r.a(r6)
            java.lang.String r0 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r1 = "CredManProvService"
            java.lang.String r2 = "CreateCredentialResponse error returned from framework"
            android.util.Log.i(r1, r2)
            u5.m r1 = r5.f120529a
            u5.v r2 = r5.f120531c
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = u5.r.l(r6)
            int r2 = r0.hashCode()
            switch(r2) {
                case -2055374133: goto L5f;
                case 1316905704: goto L4c;
                case 2092588512: goto L39;
                case 2131915191: goto L26;
                default: goto L25;
            }
        L25:
            goto L67
        L26:
            java.lang.String r2 = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2f
            goto L67
        L2f:
            androidx.credentials.exceptions.CreateCredentialNoCreateOptionException r0 = new androidx.credentials.exceptions.CreateCredentialNoCreateOptionException
            java.lang.String r6 = u5.r.v(r6)
            r0.<init>(r6)
            goto La5
        L39:
            java.lang.String r2 = "android.credentials.CreateCredentialException.TYPE_INTERRUPTED"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L42
            goto L67
        L42:
            androidx.credentials.exceptions.CreateCredentialInterruptedException r0 = new androidx.credentials.exceptions.CreateCredentialInterruptedException
            java.lang.String r6 = u5.r.v(r6)
            r0.<init>(r6)
            goto La5
        L4c:
            java.lang.String r2 = "android.credentials.CreateCredentialException.TYPE_UNKNOWN"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L55
            goto L67
        L55:
            androidx.credentials.exceptions.CreateCredentialUnknownException r0 = new androidx.credentials.exceptions.CreateCredentialUnknownException
            java.lang.String r6 = u5.r.v(r6)
            r0.<init>(r6)
            goto La5
        L5f:
            java.lang.String r2 = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L9c
        L67:
            java.lang.String r0 = u5.r.y(r6)
            java.lang.String r2 = "error.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r3 = 0
            java.lang.String r4 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            boolean r0 = kotlin.text.z.p(r0, r4, r3)
            if (r0 == 0) goto L8b
            v5.x r0 = androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException.f18016a
            java.lang.String r3 = u5.r.y(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            java.lang.String r6 = u5.r.v(r6)
            androidx.credentials.exceptions.CreateCredentialException r0 = r0.s(r3, r6)
            goto La5
        L8b:
            androidx.credentials.exceptions.CreateCredentialCustomException r0 = new androidx.credentials.exceptions.CreateCredentialCustomException
            java.lang.String r3 = u5.r.y(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            java.lang.String r6 = u5.r.v(r6)
            r0.<init>(r6, r3)
            goto La5
        L9c:
            androidx.credentials.exceptions.CreateCredentialCancellationException r0 = new androidx.credentials.exceptions.CreateCredentialCancellationException
            java.lang.String r6 = u5.r.v(r6)
            r0.<init>(r6)
        La5:
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.t.onError(java.lang.Throwable):void");
    }

    public final void onResult(Object obj) {
        Bundle data;
        Object eVar;
        CreateCredentialResponse response = r.b(obj);
        Intrinsics.checkNotNullParameter(response, "response");
        Log.i("CredManProvService", "Create Result returned from framework: ");
        m mVar = this.f120529a;
        String type = this.f120530b.f120498a;
        data = response.getData();
        Intrinsics.checkNotNullExpressionValue(data, "response.data");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            if (Intrinsics.d(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                Intrinsics.checkNotNullParameter(data, "data");
                eVar = new e(data);
            } else {
                if (!Intrinsics.d(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    throw new FrameworkClassParsingException();
                }
                m4.i iVar = h.f120512b;
                Intrinsics.checkNotNullParameter(data, "data");
                try {
                    String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                    Intrinsics.f(string);
                    eVar = new h(string, data);
                } catch (Exception unused) {
                    throw new FrameworkClassParsingException();
                }
            }
        } catch (FrameworkClassParsingException unused2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            eVar = new e(type, data);
            if (type.length() <= 0) {
                throw new IllegalArgumentException("type should not be empty".toString());
            }
        }
        mVar.onResult(eVar);
    }
}
