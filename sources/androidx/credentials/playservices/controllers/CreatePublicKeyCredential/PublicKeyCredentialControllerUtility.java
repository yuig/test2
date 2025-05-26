package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import a.a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import ao2.m0;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import gi.j1;
import ih.c;
import ih.d;
import io.jsonwebtoken.JwsHeader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u5.c0;
import u5.g;
import v5.b;
import v5.b0;
import v5.d0;
import v5.e;
import v5.f;
import v5.l;
import v5.n;
import v5.p;
import v5.r;
import v5.s;
import v5.z;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;", "", "()V", "Companion", "GetGMSVersion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PublicKeyCredentialControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_CREATE = 241217000;
    private static final int FLAGS = 11;

    @NotNull
    private static final String TAG = "PublicKeyUtility";

    @NotNull
    private static final LinkedHashMap<ErrorCode, e> orderedErrorCodeToExceptions;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";

    @NotNull
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";

    @NotNull
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";

    @NotNull
    private static final String JSON_KEY_SIGNATURE = "signature";

    @NotNull
    private static final String JSON_KEY_USER_HANDLE = "userHandle";

    @NotNull
    private static final String JSON_KEY_RESPONSE = "response";

    @NotNull
    private static final String JSON_KEY_ID = "id";

    @NotNull
    private static final String JSON_KEY_RAW_ID = "rawId";

    @NotNull
    private static final String JSON_KEY_TYPE = "type";

    @NotNull
    private static final String JSON_KEY_RPID = "rpId";

    @NotNull
    private static final String JSON_KEY_CHALLENGE = "challenge";

    @NotNull
    private static final String JSON_KEY_APPID = AppsFlyerProperties.APP_ID;

    @NotNull
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";

    @NotNull
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";

    @NotNull
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";

    @NotNull
    private static final String JSON_KEY_RES_KEY = "residentKey";

    @NotNull
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";

    @NotNull
    private static final String JSON_KEY_TIMEOUT = "timeout";

    @NotNull
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";

    @NotNull
    private static final String JSON_KEY_TRANSPORTS = "transports";

    @NotNull
    private static final String JSON_KEY_RP = "rp";

    @NotNull
    private static final String JSON_KEY_NAME = "name";

    @NotNull
    private static final String JSON_KEY_ICON = "icon";

    @NotNull
    private static final String JSON_KEY_ALG = JwsHeader.ALGORITHM;

    @NotNull
    private static final String JSON_KEY_USER = "user";

    @NotNull
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";

    @NotNull
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";

    @NotNull
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";

    @NotNull
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";

    @NotNull
    private static final String JSON_KEY_EXTENSTIONS = "extensions";

    @NotNull
    private static final String JSON_KEY_ATTESTATION = "attestation";

    @NotNull
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";

    @NotNull
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";

    @NotNull
    private static final String JSON_KEY_RK = "rk";

    @NotNull
    private static final String JSON_KEY_CRED_PROPS = "credProps";

    @Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bM\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0019\u001a\u00020$¢\u0006\u0004\b&\u0010'J!\u0010.\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b4\u00102J\u001f\u00107\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b6\u00102J\u001f\u00109\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b8\u00102J\u001f\u0010;\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b:\u00102J\u001f\u0010=\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b<\u00102J\u0015\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u0012¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u000e¢\u0006\u0004\bB\u0010CJ\u0015\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bG\u0010HJ\u001f\u0010K\u001a\u00020F2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bT\u0010RR\u001a\u0010U\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bU\u0010P\u001a\u0004\bV\u0010RR\u001a\u0010W\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bW\u0010P\u001a\u0004\bX\u0010RR\u001a\u0010Y\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bY\u0010P\u001a\u0004\bZ\u0010RR\u001a\u0010[\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b[\u0010P\u001a\u0004\b\\\u0010RR\u001a\u0010]\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b]\u0010P\u001a\u0004\b^\u0010RR\u001a\u0010_\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b_\u0010P\u001a\u0004\b`\u0010RR\u001a\u0010a\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\ba\u0010P\u001a\u0004\bb\u0010RR\u001a\u0010c\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bc\u0010P\u001a\u0004\bd\u0010RR\u001a\u0010e\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\be\u0010P\u001a\u0004\bf\u0010RR\u001a\u0010g\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bg\u0010P\u001a\u0004\bh\u0010RR\u001a\u0010i\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bi\u0010P\u001a\u0004\bj\u0010RR\u001a\u0010k\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bk\u0010P\u001a\u0004\bl\u0010RR\u001a\u0010m\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bm\u0010P\u001a\u0004\bn\u0010RR\u001a\u0010o\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bo\u0010P\u001a\u0004\bp\u0010RR\u001a\u0010q\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bq\u0010P\u001a\u0004\br\u0010RR\u001a\u0010s\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bs\u0010P\u001a\u0004\bt\u0010RR\u001a\u0010u\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bu\u0010P\u001a\u0004\bv\u0010RR\u001a\u0010w\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bw\u0010P\u001a\u0004\bx\u0010RR\u001a\u0010y\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\by\u0010P\u001a\u0004\bz\u0010RR\u001a\u0010{\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b{\u0010P\u001a\u0004\b|\u0010RR\u001a\u0010}\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b}\u0010P\u001a\u0004\b~\u0010RR\u001b\u0010\u007f\u001a\u00020\u00128\u0000X\u0080D¢\u0006\r\n\u0004\b\u007f\u0010P\u001a\u0005\b\u0080\u0001\u0010RR\u001d\u0010\u0081\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010P\u001a\u0005\b\u0082\u0001\u0010RR\u001d\u0010\u0083\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010P\u001a\u0005\b\u0084\u0001\u0010RR\u001d\u0010\u0085\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010P\u001a\u0005\b\u0086\u0001\u0010RR\u001d\u0010\u0087\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010P\u001a\u0005\b\u0088\u0001\u0010RR\u001d\u0010\u0089\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010P\u001a\u0005\b\u008a\u0001\u0010RR\u001d\u0010\u008b\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010P\u001a\u0005\b\u008c\u0001\u0010RR\u001d\u0010\u008d\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010P\u001a\u0005\b\u008e\u0001\u0010RR\u001d\u0010\u008f\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010P\u001a\u0005\b\u0090\u0001\u0010RR\u001d\u0010\u0091\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010P\u001a\u0005\b\u0092\u0001\u0010RR\u001d\u0010\u0093\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010P\u001a\u0005\b\u0094\u0001\u0010RR\u001d\u0010\u0095\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010P\u001a\u0005\b\u0096\u0001\u0010RR?\u0010\u009a\u0001\u001a\"\u0012\u0004\u0012\u00020(\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u0001j\u0010\u0012\u0004\u0012\u00020(\u0012\u0005\u0012\u00030\u0098\u0001`\u0099\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010\u009e\u0001\u001a\u00020I8\u0002X\u0082T¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010 \u0001\u001a\u00020D8\u0002X\u0082T¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0016\u0010¢\u0001\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0007\n\u0005\b¢\u0001\u0010P¨\u0006¥\u0001"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;", "", "Lu5/g;", "request", "Landroid/content/Context;", "context", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "convert", "(Lu5/g;Landroid/content/Context;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lorg/json/JSONObject;", "json", "convertJSON$credentials_play_services_auth_release", "(Lorg/json/JSONObject;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "convertJSON", "", "clientDataJSON", "attestationObject", "", "", "transportArray", "", "addAuthenticatorAttestationResponse$credentials_play_services_auth_release", "([B[B[Ljava/lang/String;Lorg/json/JSONObject;)V", "addAuthenticatorAttestationResponse", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "cred", "toAssertPasskeyResponse", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Ljava/lang/String;", "Lu5/c0;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "convertToPlayAuthPasskeyJsonRequest", "(Lu5/c0;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "convertToPlayAuthPasskeyRequest", "(Lu5/c0;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Landroidx/credentials/exceptions/CreateCredentialException;", "publicKeyCredentialResponseContainsError", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Landroidx/credentials/exceptions/CreateCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;", "code", "msg", "Landroidx/credentials/exceptions/GetCredentialException;", "beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release", "(Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "beginSignInPublicKeyCredentialResponseContainsError", "Lvh/c;", "builder", "parseOptionalExtensions$credentials_play_services_auth_release", "(Lorg/json/JSONObject;Lvh/c;)V", "parseOptionalExtensions", "parseOptionalAuthenticatorSelection$credentials_play_services_auth_release", "parseOptionalAuthenticatorSelection", "parseOptionalTimeout$credentials_play_services_auth_release", "parseOptionalTimeout", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials", "parseRequiredRpAndParams$credentials_play_services_auth_release", "parseRequiredRpAndParams", "parseRequiredChallengeAndUser$credentials_play_services_auth_release", "parseRequiredChallengeAndUser", "str", "b64Decode", "(Ljava/lang/String;)[B", "data", "b64Encode", "([B)Ljava/lang/String;", "", JwsHeader.ALGORITHM, "", "checkAlgSupported", "(I)Z", "", "version", "isDeviceGMSVersionOlderThan", "(Landroid/content/Context;J)Z", "getChallenge", "(Lorg/json/JSONObject;)[B", "JSON_KEY_CLIENT_DATA", "Ljava/lang/String;", "getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release", "()Ljava/lang/String;", "JSON_KEY_ATTESTATION_OBJ", "getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release", "JSON_KEY_AUTH_DATA", "getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release", "JSON_KEY_SIGNATURE", "getJSON_KEY_SIGNATURE$credentials_play_services_auth_release", "JSON_KEY_USER_HANDLE", "getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release", "JSON_KEY_RESPONSE", "getJSON_KEY_RESPONSE$credentials_play_services_auth_release", "JSON_KEY_ID", "getJSON_KEY_ID$credentials_play_services_auth_release", "JSON_KEY_RAW_ID", "getJSON_KEY_RAW_ID$credentials_play_services_auth_release", "JSON_KEY_TYPE", "getJSON_KEY_TYPE$credentials_play_services_auth_release", "JSON_KEY_RPID", "getJSON_KEY_RPID$credentials_play_services_auth_release", "JSON_KEY_CHALLENGE", "getJSON_KEY_CHALLENGE$credentials_play_services_auth_release", "JSON_KEY_APPID", "getJSON_KEY_APPID$credentials_play_services_auth_release", "JSON_KEY_THIRD_PARTY_PAYMENT", "getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release", "JSON_KEY_AUTH_SELECTION", "getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release", "JSON_KEY_REQUIRE_RES_KEY", "getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_RES_KEY", "getJSON_KEY_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_AUTH_ATTACHMENT", "getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release", "JSON_KEY_TIMEOUT", "getJSON_KEY_TIMEOUT$credentials_play_services_auth_release", "JSON_KEY_EXCLUDE_CREDENTIALS", "getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release", "JSON_KEY_TRANSPORTS", "getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release", "JSON_KEY_RP", "getJSON_KEY_RP$credentials_play_services_auth_release", "JSON_KEY_NAME", "getJSON_KEY_NAME$credentials_play_services_auth_release", "JSON_KEY_ICON", "getJSON_KEY_ICON$credentials_play_services_auth_release", "JSON_KEY_ALG", "getJSON_KEY_ALG$credentials_play_services_auth_release", "JSON_KEY_USER", "getJSON_KEY_USER$credentials_play_services_auth_release", "JSON_KEY_DISPLAY_NAME", "getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release", "JSON_KEY_USER_VERIFICATION_METHOD", "getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release", "JSON_KEY_KEY_PROTECTION_TYPE", "getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_MATCHER_PROTECTION_TYPE", "getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_EXTENSTIONS", "getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release", "JSON_KEY_ATTESTATION", "getJSON_KEY_ATTESTATION$credentials_play_services_auth_release", "JSON_KEY_PUB_KEY_CRED_PARAMS", "getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release", "JSON_KEY_CLIENT_EXTENSION_RESULTS", "getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release", "JSON_KEY_RK", "getJSON_KEY_RK$credentials_play_services_auth_release", "JSON_KEY_CRED_PROPS", "getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release", "Ljava/util/LinkedHashMap;", "Lv5/e;", "Lkotlin/collections/LinkedHashMap;", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "getOrderedErrorCodeToExceptions$credentials_play_services_auth_release", "()Ljava/util/LinkedHashMap;", "AUTH_MIN_VERSION_JSON_CREATE", "J", "FLAGS", "I", "TAG", "<init>", "()V", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] getChallenge(JSONObject json) {
            String challengeB64 = json.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), "");
            Intrinsics.checkNotNullExpressionValue(challengeB64, "challengeB64");
            if (challengeB64.length() != 0) {
                return b64Decode(challengeB64);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long version) {
            long j13;
            if (c.f72257d.c(context, d.f72258a) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "packageManager.getPackageInfo(packageName, 0)");
                j13 = GetGMSVersion.getVersionLong(packageInfo);
            } else {
                j13 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            return j13 > version;
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(@NotNull byte[] clientDataJSON, @NotNull byte[] attestationObject, @NotNull String[] transportArray, @NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(clientDataJSON, "clientDataJSON");
            Intrinsics.checkNotNullParameter(attestationObject, "attestationObject");
            Intrinsics.checkNotNullParameter(transportArray, "transportArray");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(clientDataJSON));
            jSONObject.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject);
        }

        @NotNull
        public final byte[] b64Decode(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            byte[] decode = Base64.decode(str, 11);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(str, FLAGS)");
            return decode;
        }

        @NotNull
        public final String b64Encode(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            String encodeToString = Base64.encodeToString(data, 11);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(data, FLAGS)");
            return encodeToString;
        }

        @NotNull
        public final GetCredentialException beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(@NotNull ErrorCode code, String msg) {
            Intrinsics.checkNotNullParameter(code, "code");
            e eVar = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(code);
            return eVar == null ? new GetPublicKeyCredentialDomException(new d0(), a.j("unknown fido gms exception - ", msg)) : (code == ErrorCode.NOT_ALLOWED_ERR && msg != null && StringsKt.E(msg, "Unable to get sync account", false)) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(eVar, msg);
        }

        public final boolean checkAlgSupported(int alg) {
            try {
                COSEAlgorithmIdentifier.a(alg);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @NotNull
        public final PublicKeyCredentialCreationOptions convert(@NotNull g request, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            if (isDeviceGMSVersionOlderThan(context, PublicKeyCredentialControllerUtility.AUTH_MIN_VERSION_JSON_CREATE)) {
                throw null;
            }
            throw null;
        }

        @NotNull
        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            vh.c cVar = new vh.c();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(json, cVar);
            parseRequiredRpAndParams$credentials_play_services_auth_release(json, cVar);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(json, cVar);
            parseOptionalTimeout$credentials_play_services_auth_release(json, cVar);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(json, cVar);
            parseOptionalExtensions$credentials_play_services_auth_release(json, cVar);
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = cVar.f125811a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = cVar.f125812b;
            byte[] bArr = cVar.f125813c;
            List list = cVar.f125814d;
            Double d2 = cVar.f125815e;
            List list2 = cVar.f125816f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = cVar.f125817g;
            AttestationConveyancePreference attestationConveyancePreference = cVar.f125818h;
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d2, list2, authenticatorSelectionCriteria, null, null, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), cVar.f125819i, null, null);
            Intrinsics.checkNotNullExpressionValue(publicKeyCredentialCreationOptions, "builder.build()");
            return publicKeyCredentialCreationOptions;
        }

        @NotNull
        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(@NotNull c0 option) {
            Intrinsics.checkNotNullParameter(option, "option");
            throw null;
        }

        @xk2.d
        @NotNull
        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(@NotNull c0 option) {
            Intrinsics.checkNotNullParameter(option, "option");
            throw null;
        }

        @NotNull
        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        @NotNull
        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        @NotNull
        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        @NotNull
        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        @NotNull
        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        @NotNull
        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        @NotNull
        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        @NotNull
        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        @NotNull
        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        @NotNull
        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        @NotNull
        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        @NotNull
        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        @NotNull
        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        @NotNull
        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        @NotNull
        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        @NotNull
        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        @NotNull
        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        @NotNull
        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        @NotNull
        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        @NotNull
        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        @NotNull
        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        @NotNull
        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        @NotNull
        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        @NotNull
        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        @NotNull
        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        @NotNull
        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        @NotNull
        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        @NotNull
        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        @NotNull
        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        @NotNull
        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        @NotNull
        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        @NotNull
        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        @NotNull
        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        @NotNull
        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        @NotNull
        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        @NotNull
        public final LinkedHashMap<ErrorCode, e> getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(@NotNull JSONObject json, @NotNull vh.c builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release());
                boolean optBoolean = jSONObject.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release(), false);
                String residentKey = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), "");
                Intrinsics.checkNotNullExpressionValue(residentKey, "residentKey");
                ResidentKeyRequirement fromString = residentKey.length() > 0 ? ResidentKeyRequirement.fromString(residentKey) : null;
                Boolean valueOf = Boolean.valueOf(optBoolean);
                String authenticatorAttachmentString = jSONObject.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release(), "");
                Intrinsics.checkNotNullExpressionValue(authenticatorAttachmentString, "authenticatorAttachmentString");
                Attachment fromString2 = authenticatorAttachmentString.length() > 0 ? Attachment.fromString(authenticatorAttachmentString) : null;
                builder.f125817g = new AuthenticatorSelectionCriteria(fromString2 == null ? null : fromString2.toString(), null, fromString == null ? null : fromString.toString(), valueOf);
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(@NotNull JSONObject json, @NotNull vh.c builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                String appIdExtension = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), "");
                Intrinsics.checkNotNullExpressionValue(appIdExtension, "appIdExtension");
                builder.f125819i = new AuthenticationExtensions(appIdExtension.length() > 0 ? new FidoAppIdExtension(appIdExtension) : null, null, jSONObject.optBoolean("uvm", false) ? new UserVerificationMethodExtension(true) : null, null, null, null, null, null, jSONObject.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release(), false) ? new GoogleThirdPartyPaymentExtension(true) : null, null, null, null);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(@NotNull JSONObject json, @NotNull vh.c builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                builder.f125815e = Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / 1000);
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(@NotNull JSONObject json, @NotNull vh.c builder) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release())) {
                JSONArray jSONArray = json.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release());
                int length = jSONArray.length();
                for (int i13 = 0; i13 < length; i13++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i13);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
                    Intrinsics.checkNotNullExpressionValue(string, "descriptorJSON.getString(JSON_KEY_ID)");
                    byte[] b64Decode = b64Decode(string);
                    String descriptorType = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    Intrinsics.checkNotNullExpressionValue(descriptorType, "descriptorType");
                    if (descriptorType.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (b64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i14 = 0; i14 < length2; i14++) {
                            try {
                                Transport fromString = Transport.fromString(jSONArray2.getString(i14));
                                Intrinsics.checkNotNullExpressionValue(fromString, "fromString(descriptorTransports.getString(j))");
                                arrayList.add(fromString);
                            } catch (Transport.UnsupportedTransportException e13) {
                                throw new CreatePublicKeyCredentialDomException(new f(), e13.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(descriptorType, b64Decode, arrayList));
                }
            }
            builder.f125816f = arrayList2;
            String attestationString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            Intrinsics.checkNotNullExpressionValue(attestationString, "attestationString");
            builder.f125818h = AttestationConveyancePreference.fromString(attestationString.length() != 0 ? attestationString : "none");
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(@NotNull JSONObject json, @NotNull vh.c builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            byte[] challenge = getChallenge(json);
            builder.getClass();
            com.bumptech.glide.d.t(challenge);
            builder.f125813c = challenge;
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            Intrinsics.checkNotNullExpressionValue(string, "user.getString(JSON_KEY_ID)");
            byte[] b64Decode = b64Decode(string);
            String userName = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            String displayName = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String optString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            Intrinsics.checkNotNullExpressionValue(displayName, "displayName");
            if (displayName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (b64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            Intrinsics.checkNotNullExpressionValue(userName, "userName");
            if (userName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.f125812b = new PublicKeyCredentialUserEntity(userName, optString, displayName, b64Decode);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(@NotNull JSONObject json, @NotNull vh.c builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            String rpId = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            String rpName = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), "");
            String optString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            Intrinsics.f(optString);
            if (optString.length() == 0) {
                optString = null;
            }
            Intrinsics.checkNotNullExpressionValue(rpName, "rpName");
            if (rpName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            Intrinsics.checkNotNullExpressionValue(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = new PublicKeyCredentialRpEntity(rpId, rpName, optString);
            builder.getClass();
            builder.f125811a = publicKeyCredentialRpEntity;
            JSONArray jSONArray = json.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i13 = 0; i13 < length; i13++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i13);
                int i14 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                String typeParam = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), "");
                Intrinsics.checkNotNullExpressionValue(typeParam, "typeParam");
                if (typeParam.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i14)) {
                    arrayList.add(new PublicKeyCredentialParameters(typeParam, i14));
                }
            }
            builder.f125814d = arrayList;
        }

        public final CreateCredentialException publicKeyCredentialResponseContainsError(@NotNull PublicKeyCredential cred) {
            Intrinsics.checkNotNullParameter(cred, "cred");
            Object obj = cred.f31129i;
            if (obj == null && (obj = cred.f31130j) == null && (obj = cred.f31131k) == null) {
                throw new IllegalStateException("No response set.");
            }
            Intrinsics.checkNotNullExpressionValue(obj, "cred.response");
            if (!(obj instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
            ErrorCode errorCode = authenticatorErrorResponse.f31101f;
            Intrinsics.checkNotNullExpressionValue(errorCode, "authenticatorResponse.errorCode");
            e eVar = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCode);
            String str = authenticatorErrorResponse.f31102g;
            return eVar == null ? new CreatePublicKeyCredentialDomException(new d0(), a.j("unknown fido gms exception - ", str)) : (errorCode == ErrorCode.NOT_ALLOWED_ERR && str != null && StringsKt.E(str, "Unable to get sync account", false)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(eVar, str);
        }

        @NotNull
        public final String toAssertPasskeyResponse(@NotNull SignInCredential cred) {
            Object obj;
            Intrinsics.checkNotNullParameter(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = cred.f30663n;
            JSONObject jSONObject2 = null;
            if (publicKeyCredential != null) {
                obj = publicKeyCredential.f31129i;
                if (obj == null && (obj = publicKeyCredential.f31130j) == null && (obj = publicKeyCredential.f31131k) == null) {
                    throw new IllegalStateException("No response set.");
                }
            } else {
                obj = null;
            }
            Intrinsics.f(obj);
            if (obj instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
                ErrorCode errorCode = authenticatorErrorResponse.f31101f;
                Intrinsics.checkNotNullExpressionValue(errorCode, "authenticatorResponse.errorCode");
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(errorCode, authenticatorErrorResponse.f31102g);
            }
            if (!(obj instanceof AuthenticatorAssertionResponse)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                String jSONObject3 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "json.toString()");
                return jSONObject3;
            }
            try {
                publicKeyCredential.getClass();
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    j1 j1Var = publicKeyCredential.f31128h;
                    if (j1Var != null && j1Var.n().length > 0) {
                        jSONObject4.put("rawId", m0.s(j1Var.n()));
                    }
                    String str = publicKeyCredential.f31133m;
                    if (str != null) {
                        jSONObject4.put("authenticatorAttachment", str);
                    }
                    String str2 = publicKeyCredential.f31127g;
                    AuthenticatorErrorResponse authenticatorErrorResponse2 = publicKeyCredential.f31131k;
                    if (str2 != null && authenticatorErrorResponse2 == null) {
                        jSONObject4.put("type", str2);
                    }
                    String str3 = publicKeyCredential.f31126f;
                    if (str3 != null) {
                        jSONObject4.put("id", str3);
                    }
                    String str4 = "response";
                    AuthenticatorAssertionResponse authenticatorAssertionResponse = publicKeyCredential.f31130j;
                    boolean z13 = true;
                    if (authenticatorAssertionResponse != null) {
                        jSONObject2 = authenticatorAssertionResponse.e();
                    } else {
                        AuthenticatorAttestationResponse authenticatorAttestationResponse = publicKeyCredential.f31129i;
                        if (authenticatorAttestationResponse != null) {
                            jSONObject2 = authenticatorAttestationResponse.e();
                        } else {
                            z13 = false;
                            if (authenticatorErrorResponse2 != null) {
                                try {
                                    jSONObject2 = new JSONObject();
                                    jSONObject2.put("code", authenticatorErrorResponse2.f31101f.getCode());
                                    String str5 = authenticatorErrorResponse2.f31102g;
                                    if (str5 != null) {
                                        jSONObject2.put("message", str5);
                                    }
                                    str4 = "error";
                                } catch (JSONException e13) {
                                    throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e13);
                                }
                            }
                        }
                    }
                    if (jSONObject2 != null) {
                        jSONObject4.put(str4, jSONObject2);
                    }
                    AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = publicKeyCredential.f31132l;
                    if (authenticationExtensionsClientOutputs != null) {
                        jSONObject4.put("clientExtensionResults", authenticationExtensionsClientOutputs.e());
                    } else if (z13) {
                        jSONObject4.put("clientExtensionResults", new JSONObject());
                    }
                    String jSONObject5 = jSONObject4.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject5, "publicKeyCred.toJson()");
                    return jSONObject5;
                } catch (JSONException e14) {
                    throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e14);
                }
            } catch (Throwable th3) {
                throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th3.getMessage());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$GetGMSVersion;", "", "()V", "getVersionLong", "", "info", "Landroid/content/pm/PackageInfo;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GetGMSVersion {

        @NotNull
        public static final GetGMSVersion INSTANCE = new GetGMSVersion();

        private GetGMSVersion() {
        }

        public static final long getVersionLong(@NotNull PackageInfo info2) {
            long longVersionCode;
            Intrinsics.checkNotNullParameter(info2, "info");
            longVersionCode = info2.getLongVersionCode();
            return longVersionCode;
        }
    }

    static {
        Pair[] pairs = {new Pair(ErrorCode.UNKNOWN_ERR, new d0()), new Pair(ErrorCode.ABORT_ERR, new v5.a()), new Pair(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new r()), new Pair(ErrorCode.CONSTRAINT_ERR, new b()), new Pair(ErrorCode.DATA_ERR, new v5.d()), new Pair(ErrorCode.INVALID_STATE_ERR, new l()), new Pair(ErrorCode.ENCODING_ERR, new f()), new Pair(ErrorCode.NETWORK_ERR, new n()), new Pair(ErrorCode.NOT_ALLOWED_ERR, new p()), new Pair(ErrorCode.NOT_SUPPORTED_ERR, new s()), new Pair(ErrorCode.SECURITY_ERR, new z()), new Pair(ErrorCode.TIMEOUT_ERR, new b0())};
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap<ErrorCode, e> linkedHashMap = new LinkedHashMap<>(y0.a(12));
        z0.q(linkedHashMap, pairs);
        orderedErrorCodeToExceptions = linkedHashMap;
    }

    @NotNull
    public static final PublicKeyCredentialCreationOptions convert(@NotNull g gVar, @NotNull Context context) {
        return INSTANCE.convert(gVar, context);
    }
}
