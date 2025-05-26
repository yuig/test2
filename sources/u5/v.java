package u5;

import android.app.Activity;
import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v implements p {

    /* renamed from: a, reason: collision with root package name */
    public final CredentialManager f120534a;

    public v(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f120534a = ga.g.i(context.getSystemService("credential"));
    }

    @Override // u5.p
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f120534a != null;
    }

    @Override // u5.p
    public final void onCreateCredential(Context context, c request, CancellationSignal cancellationSignal, Executor executor, m callback) {
        CreateCredentialRequest.Builder isSystemProviderRequired;
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider;
        CreateCredentialRequest build;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s sVar = new s(callback, 0);
        CredentialManager credentialManager = this.f120534a;
        if (credentialManager == null) {
            sVar.invoke();
            return;
        }
        t tVar = new t((k) callback, (f) request, this);
        Intrinsics.f(credentialManager);
        ga.g.A();
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        b bVar = request.f120502e;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", bVar.f120497a);
        if (!TextUtils.isEmpty(null)) {
            bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, g0.ic_password));
        Bundle bundle2 = request.f120499b;
        bundle2.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle);
        isSystemProviderRequired = ga.g.g(request.f120498a, bundle2, request.f120500c).setIsSystemProviderRequired(request.f120501d);
        alwaysSendAppInfoToProvider = isSystemProviderRequired.setAlwaysSendAppInfoToProvider(true);
        Intrinsics.checkNotNullExpressionValue(alwaysSendAppInfoToProvider, "Builder(\n               …ndAppInfoToProvider(true)");
        String str = request.f120503f;
        if (str != null) {
            alwaysSendAppInfoToProvider.setOrigin(str);
        }
        build = alwaysSendAppInfoToProvider.build();
        Intrinsics.checkNotNullExpressionValue(build, "createCredentialRequestBuilder.build()");
        credentialManager.createCredential((Activity) context, build, cancellationSignal, (j) executor, tVar);
    }

    @Override // u5.p
    public final void onGetCredential(Context context, y request, CancellationSignal cancellationSignal, Executor executor, m callback) {
        GetCredentialRequest build;
        CredentialOption.Builder isSystemProviderRequired;
        CredentialOption.Builder allowedProviders;
        CredentialOption build2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s sVar = new s(callback, 1);
        CredentialManager credentialManager = this.f120534a;
        if (credentialManager == null) {
            sVar.invoke();
            return;
        }
        u uVar = new u((pq2.y) callback, this);
        Intrinsics.f(credentialManager);
        ga.g.q();
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", request.f120542c);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.f120544e);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", request.f120543d);
        GetCredentialRequest.Builder m13 = ga.g.m(bundle);
        for (o oVar : request.f120540a) {
            ga.g.y();
            isSystemProviderRequired = ga.g.l(oVar.f120520a, oVar.f120521b, oVar.f120522c).setIsSystemProviderRequired(oVar.f120523d);
            allowedProviders = isSystemProviderRequired.setAllowedProviders(oVar.f120525f);
            build2 = allowedProviders.build();
            m13.addCredentialOption(build2);
        }
        String str = request.f120541b;
        if (str != null) {
            m13.setOrigin(str);
        }
        build = m13.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        credentialManager.getCredential((Activity) context, build, cancellationSignal, (o.a) executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) uVar);
    }
}
