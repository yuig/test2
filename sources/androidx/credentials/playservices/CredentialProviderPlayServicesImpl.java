package androidx.credentials.playservices;

import ai.g;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.bumptech.glide.d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import ej.b;
import ih.c;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.a;
import u5.e0;
import u5.m;
import u5.o;
import u5.p;
import u5.y;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001f\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e0\rH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R(\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006."}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lu5/p;", "Landroid/content/Context;", "context", "", "isGooglePlayServicesAvailable", "(Landroid/content/Context;)I", "Lu5/y;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Lu5/m;", "Lu5/z;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "", "onGetCredential", "(Landroid/content/Context;Lu5/y;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lu5/m;)V", "Lu5/c;", "Lu5/d;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Lu5/c;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lu5/m;)V", "", "isAvailableOnDevice", "()Z", "Lu5/a;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Lu5/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lu5/m;)V", "Landroid/content/Context;", "Lih/c;", "googleApiAvailability", "Lih/c;", "getGoogleApiAvailability", "()Lih/c;", "setGoogleApiAvailability", "(Lih/c;)V", "getGoogleApiAvailability$annotations", "()V", "<init>", "(Landroid/content/Context;)V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements p {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;

    @NotNull
    private static final String TAG = "PlayServicesImpl";

    @NotNull
    private final Context context;

    @NotNull
    private c googleApiAvailability;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "", "callback", "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function0;)V", "cancellationReviewerWithCallback", "", "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "Lu5/y;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(Lu5/y;)Z", "isGetSignInIntentRequest", "", "MIN_GMS_APK_VERSION", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, @NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(@NotNull y request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator it = request.f120540a.iterator();
            while (it.hasNext()) {
                if (((o) it.next()) instanceof b) {
                    return true;
                }
            }
            return false;
        }
    }

    public CredentialProviderPlayServicesImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        c cVar = c.f72257d;
        Intrinsics.checkNotNullExpressionValue(cVar, "getInstance()");
        this.googleApiAvailability = cVar;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.c(context, MIN_GMS_APK_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl this$0, CancellationSignal cancellationSignal, Executor executor, m callback, Exception e13) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(e13, "e");
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(e13, executor, callback));
    }

    @NotNull
    public final c getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // u5.p
    public boolean isAvailableOnDevice() {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z13 = isGooglePlayServicesAvailable == 0;
        if (!z13) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(isGooglePlayServicesAvailable));
        }
        return z13;
    }

    public void onClearCredential(@NotNull a request, final CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final m callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Context context = this.context;
        d.t(context);
        g gVar = new g(context, new dh.c());
        gVar.f30761a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = i.f30771a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((i) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        f.a();
        q a13 = r.a();
        a13.f30860d = new Feature[]{ai.i.f15225a};
        a13.f30859c = new bb.p(gVar, 15);
        a13.f30858b = false;
        a13.f30857a = 1554;
        Task d2 = gVar.d(1, a13.a());
        final CredentialProviderPlayServicesImpl$onClearCredential$1 credentialProviderPlayServicesImpl$onClearCredential$1 = new CredentialProviderPlayServicesImpl$onClearCredential$1(cancellationSignal, executor, callback);
        d2.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(CredentialProviderPlayServicesImpl.this, cancellationSignal, executor, callback, exc);
            }
        });
    }

    @Override // u5.p
    public void onCreateCredential(@NotNull Context context, @NotNull u5.c request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull m callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (!(request instanceof u5.f)) {
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
        CredentialProviderCreatePasswordController.INSTANCE.getInstance(context).invokePlayServices((u5.f) request, callback, executor, cancellationSignal);
    }

    @Override // u5.p
    public void onGetCredential(@NotNull Context context, @NotNull y request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull m callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }

    public void onPrepareCredential(@NotNull y request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull m callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public final void setGoogleApiAvailability(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.googleApiAvailability = cVar;
    }

    public void onGetCredential(@NotNull Context context, @NotNull e0 pendingGetCredentialHandle, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull m callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
