package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import com.bumptech.glide.d;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import ej.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.b0;
import u5.o;
import u5.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility;", "", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "BeginSignInUtility";

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility$Companion;", "", "Landroid/content/Context;", "context", "", "determineDeviceGMSVersionCode", "(Landroid/content/Context;)J", "curAuthVersion", "", "needsBackwardsCompatibleRequest", "(J)Z", "Lej/a;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "convertToGoogleIdTokenOption", "(Lej/a;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "Lu5/y;", "request", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest$credentials_play_services_auth_release", "(Lu5/y;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest", "AUTH_MIN_VERSION_JSON_PARSING", "J", "AUTH_MIN_VERSION_PREFER_IMME_CRED", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(a option) {
            com.google.android.gms.auth.api.identity.a e13 = BeginSignInRequest.GoogleIdTokenRequestOptions.e();
            e13.f30669d = option.f59064i;
            e13.f30668c = option.f59063h;
            e13.f30672g = option.f59067l;
            String str = option.f59062g;
            d.o(str);
            e13.f30667b = str;
            e13.f30666a = true;
            Intrinsics.checkNotNullExpressionValue(e13, "builder()\n              …      .setSupported(true)");
            String str2 = option.f59065j;
            if (str2 != null) {
                List a13 = option.a();
                e13.f30670e = str2;
                e13.f30671f = a13;
            }
            BeginSignInRequest.GoogleIdTokenRequestOptions a14 = e13.a();
            Intrinsics.checkNotNullExpressionValue(a14, "idTokenOption.build()");
            return a14;
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            Intrinsics.checkNotNullExpressionValue(context.getPackageManager(), "context.packageManager");
            return r3.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long curAuthVersion) {
            return curAuthVersion < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        @NotNull
        public final BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(@NotNull y request, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(false);
            com.google.android.gms.auth.api.identity.a e13 = BeginSignInRequest.GoogleIdTokenRequestOptions.e();
            e13.f30666a = false;
            BeginSignInRequest.GoogleIdTokenRequestOptions a13 = e13.a();
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions(false, null, null);
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions(null, false);
            long determineDeviceGMSVersionCode = determineDeviceGMSVersionCode(context);
            boolean z13 = false;
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = a13;
            for (o oVar : request.f120540a) {
                if (oVar instanceof b0) {
                    passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(true);
                    if (!z13 && !oVar.f120524e) {
                        z13 = false;
                    }
                    z13 = true;
                } else if (oVar instanceof a) {
                    a aVar = (a) oVar;
                    googleIdTokenRequestOptions = convertToGoogleIdTokenOption(aVar);
                    d.t(googleIdTokenRequestOptions);
                    if (!z13 && !aVar.f59068m) {
                        z13 = false;
                    }
                    z13 = true;
                }
            }
            BeginSignInRequest beginSignInRequest = new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, null, z13, 0, passkeysRequestOptions, passkeyJsonRequestOptions, determineDeviceGMSVersionCode > BeginSignInControllerUtility.AUTH_MIN_VERSION_PREFER_IMME_CRED ? request.f120544e : false);
            Intrinsics.checkNotNullExpressionValue(beginSignInRequest, "requestBuilder.setAutoSe…abled(autoSelect).build()");
            return beginSignInRequest;
        }
    }
}
