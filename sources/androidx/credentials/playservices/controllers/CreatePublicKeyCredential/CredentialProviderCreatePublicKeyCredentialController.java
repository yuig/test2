package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import ao2.m0;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import gi.j1;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import u5.d;
import u5.g;
import u5.h;
import u5.m;
import v5.d0;
import v5.f;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0007*\u0001-\b\u0000\u0018\u0000 22 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00012B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b0\u00101J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0004H\u0017¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\r8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u000e\u0010&\u0012\u0004\b'\u0010(R\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0010\u0010)\u0012\u0004\b*\u0010(R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0012\u0010+\u0012\u0004\b,\u0010(R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lu5/g;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Lu5/d;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Lorg/json/JSONException;", "exception", "Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "JSONExceptionToPKCError", "(Lorg/json/JSONException;)Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "request", "Lu5/m;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Lu5/g;Lu5/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "convertRequestToPlayServices", "(Lu5/g;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Lu5/d;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lu5/m;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;", "<init>", "(Landroid/content/Context;)V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<g, PublicKeyCredentialCreationOptions, PublicKeyCredential, d, CreateCredentialException> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "CreatePublicKey";
    private m callback;
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    private Executor executor;

    @NotNull
    private final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;", "", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CredentialProviderCreatePublicKeyCredentialController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, @NotNull Bundle resultData) {
                Executor executor;
                m mVar;
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE);
                executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
                if (executor == null) {
                    Intrinsics.r("executor");
                    throw null;
                }
                mVar = CredentialProviderCreatePublicKeyCredentialController.this.callback;
                if (mVar == null) {
                    Intrinsics.r("callback");
                    throw null;
                }
                cancellationSignal = CredentialProviderCreatePublicKeyCredentialController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, mVar, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CredentialProviderCreatePublicKeyCredentialController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreatePublicKeyCredentialDomException JSONExceptionToPKCError(JSONException exception) {
        String message = exception.getMessage();
        return (message == null || message.length() <= 0) ? new CreatePublicKeyCredentialDomException(new f(), "Unknown error") : new CreatePublicKeyCredentialDomException(new f(), message);
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    @NotNull
    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m mVar = this$0.callback;
        if (mVar != null) {
            mVar.a(new CreatePublicKeyCredentialDomException(new d0(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
        } else {
            Intrinsics.r("callback");
            throw null;
        }
    }

    @NotNull
    /* renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public PublicKeyCredentialCreationOptions convertRequestToPlayServices2(@NotNull g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return PublicKeyCredentialControllerUtility.INSTANCE.convert(request, this.context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public d convertResponseToCredentialManager(@NotNull PublicKeyCredential response) {
        JSONObject jSONObject;
        String str = "response";
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            response.getClass();
            try {
                JSONObject jSONObject2 = new JSONObject();
                j1 j1Var = response.f31128h;
                if (j1Var != null && j1Var.n().length > 0) {
                    jSONObject2.put("rawId", m0.s(j1Var.n()));
                }
                String str2 = response.f31133m;
                if (str2 != null) {
                    jSONObject2.put("authenticatorAttachment", str2);
                }
                String str3 = response.f31127g;
                AuthenticatorErrorResponse authenticatorErrorResponse = response.f31131k;
                if (str3 != null && authenticatorErrorResponse == null) {
                    jSONObject2.put("type", str3);
                }
                String str4 = response.f31126f;
                if (str4 != null) {
                    jSONObject2.put("id", str4);
                }
                AuthenticatorAssertionResponse authenticatorAssertionResponse = response.f31130j;
                boolean z13 = true;
                if (authenticatorAssertionResponse != null) {
                    jSONObject = authenticatorAssertionResponse.e();
                } else {
                    AuthenticatorAttestationResponse authenticatorAttestationResponse = response.f31129i;
                    if (authenticatorAttestationResponse != null) {
                        jSONObject = authenticatorAttestationResponse.e();
                    } else {
                        z13 = false;
                        if (authenticatorErrorResponse != null) {
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("code", authenticatorErrorResponse.f31101f.getCode());
                                String str5 = authenticatorErrorResponse.f31102g;
                                if (str5 != null) {
                                    jSONObject.put("message", str5);
                                }
                                str = "error";
                            } catch (JSONException e13) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e13);
                            }
                        } else {
                            jSONObject = null;
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject2.put(str, jSONObject);
                }
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = response.f31132l;
                if (authenticationExtensionsClientOutputs != null) {
                    jSONObject2.put("clientExtensionResults", authenticationExtensionsClientOutputs.e());
                } else if (z13) {
                    jSONObject2.put("clientExtensionResults", new JSONObject());
                }
                String registrationResponseJson = jSONObject2.toString();
                Intrinsics.checkNotNullExpressionValue(registrationResponseJson, "response.toJson()");
                Intrinsics.checkNotNullParameter(registrationResponseJson, "registrationResponseJson");
                return new h(registrationResponseJson, h.f120512b.a(registrationResponseJson));
            } catch (JSONException e14) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e14);
            }
        } catch (Throwable th3) {
            throw new CreateCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th3.getMessage());
        }
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, Intent data) {
        if (uniqueRequestCode != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.INSTANCE, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor = this.executor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this);
                    }
                });
                return;
            } else {
                Intrinsics.r("executor");
                throw null;
            }
        }
        Parcelable.Creator<PublicKeyCredential> creator = PublicKeyCredential.CREATOR;
        com.bumptech.glide.d.t(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        obtain.setDataPosition(0);
        PublicKeyCredential createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        PublicKeyCredential publicKeyCredential = createFromParcel;
        Intrinsics.checkNotNullExpressionValue(publicKeyCredential, "deserializeFromBytes(bytes)");
        CreateCredentialException publicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.INSTANCE.publicKeyCredentialResponseContainsError(publicKeyCredential);
        if (publicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(this, publicKeyCredentialResponseContainsError));
            return;
        }
        try {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(this, convertResponseToCredentialManager(publicKeyCredential)));
        } catch (JSONException e13) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(this, e13));
        } catch (Throwable th3) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(this, th3));
        }
    }

    /* renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(@NotNull g request, @NotNull m callback, @NotNull Executor executor, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions convertRequestToPlayServices2 = convertRequestToPlayServices2(request);
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices2);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            try {
                this.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(this));
            }
        } catch (JSONException e13) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1(this, e13));
        } catch (Throwable th3) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2(this, th3));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* bridge */ /* synthetic */ PublicKeyCredentialCreationOptions convertRequestToPlayServices(g gVar) {
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(gVar);
        return convertRequestToPlayServices2((g) null);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* bridge */ /* synthetic */ void invokePlayServices(g gVar, m mVar, Executor executor, CancellationSignal cancellationSignal) {
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(gVar);
        invokePlayServices2((g) null, mVar, executor, cancellationSignal);
    }
}
