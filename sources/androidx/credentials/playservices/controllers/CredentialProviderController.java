package androidx.credentials.playservices.controllers;

import a.a;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import org.jetbrains.annotations.NotNull;
import u5.m;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 #*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u0001*\b\b\u0004\u0010\u0006*\u00020\u00012\u00020\u0007:\u0001#B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J[\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00028\u00040\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00028\u0000H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00028\u00032\u0006\u0010\u001c\u001a\u00028\u0002H$¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController;", "", "T1", "T2", "R2", "R1", "E1", "Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;", "Landroid/os/Bundle;", "resultData", "Lkotlin/Function2;", "", "conversionFn", "Ljava/util/concurrent/Executor;", "executor", "Lu5/m;", "callback", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "maybeReportErrorFromResultReceiver", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function2;Ljava/util/concurrent/Executor;Lu5/m;Landroid/os/CancellationSignal;)Z", "request", "", "invokePlayServices", "(Ljava/lang/Object;Lu5/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Ljava/lang/Object;)Ljava/lang/Object;", "response", "convertResponseToCredentialManager", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0005J\r\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010JP\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2 \u0010\u0013\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0004\u0012\u00020\u00060\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0005JP\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2 \u0010\u0013\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0004\u0012\u00020\u00060\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion;", "", "()V", "ERROR_MESSAGE_START_ACTIVITY_FAILED", "", "cancelOrCallbackExceptionOrResult", "", "cancellationSignal", "Landroid/os/CancellationSignal;", "onResultOrException", "Lkotlin/Function0;", "generateErrorStringCanceled", "generateErrorStringCanceled$credentials_play_services_auth_release", "generateErrorStringUnknown", "resultCode", "", "generateErrorStringUnknown$credentials_play_services_auth_release", "maybeReportErrorResultCodeCreate", "", "cancelOnError", "Lkotlin/Function2;", "onError", "Lkotlin/Function1;", "Landroidx/credentials/exceptions/CreateCredentialException;", "maybeReportErrorResultCodeGet", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, @NotNull Function0<Unit> onResultOrException) {
            Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        @NotNull
        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        @NotNull
        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int resultCode) {
            return a.e("activity with result code: ", resultCode, " indicating not RESULT_OK");
        }

        public final boolean maybeReportErrorResultCodeCreate(int resultCode, @NotNull Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> cancelOnError, @NotNull Function1<? super CreateCredentialException, Unit> onError, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(cancelOnError, "cancelOnError");
            Intrinsics.checkNotNullParameter(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            j0 j0Var = new j0();
            j0Var.f80434a = new CreateCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth_release(resultCode));
            if (resultCode == 0) {
                j0Var.f80434a = new CreateCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            cancelOnError.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(onError, j0Var));
            return true;
        }

        public final boolean maybeReportErrorResultCodeGet(int resultCode, @NotNull Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> cancelOnError, @NotNull Function1<? super GetCredentialException, Unit> onError, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(cancelOnError, "cancelOnError");
            Intrinsics.checkNotNullParameter(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            j0 j0Var = new j0();
            j0Var.f80434a = new GetCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth_release(resultCode));
            if (resultCode == 0) {
                j0Var.f80434a = new GetCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            cancelOnError.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(onError, j0Var));
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, @NotNull Function0<Unit> function0) {
        INSTANCE.cancelOrCallbackExceptionOrResult(cancellationSignal, function0);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i13, @NotNull Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> function2, @NotNull Function1<? super CreateCredentialException, Unit> function1, CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeCreate(i13, function2, function1, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i13, @NotNull Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> function2, @NotNull Function1<? super GetCredentialException, Unit> function1, CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeGet(i13, function2, function1, cancellationSignal);
    }

    @NotNull
    public abstract T2 convertRequestToPlayServices(@NotNull T1 request);

    @NotNull
    public abstract R1 convertResponseToCredentialManager(@NotNull R2 response);

    public abstract void invokePlayServices(@NotNull T1 request, @NotNull m callback, @NotNull Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(@NotNull Bundle resultData, @NotNull Function2<? super String, ? super String, ? extends E1> conversionFn, @NotNull Executor executor, @NotNull m callback, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(conversionFn, "conversionFn");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!resultData.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderController$maybeReportErrorFromResultReceiver$1(executor, callback, conversionFn.invoke(resultData.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), resultData.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }
}
