package androidx.credentials.playservices;

import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u5.m;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$1 extends s implements Function1<Void, Unit> {
    final /* synthetic */ m $callback;
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ Executor $executor;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements Function0<Unit> {
        final /* synthetic */ m $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Executor executor, m mVar) {
            super(0);
            this.$executor = executor;
            this.$callback = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(m callback) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            callback.onResult(null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m10invoke();
            return Unit.f80348a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m10invoke() {
            Log.i("PlayServicesImpl", "During clear credential, signed out successfully!");
            Executor executor = this.$executor;
            final m mVar = this.$callback;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl$onClearCredential$1.AnonymousClass1.invoke$lambda$0(m.this);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$1(CancellationSignal cancellationSignal, Executor executor, m mVar) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Void) obj);
        return Unit.f80348a;
    }

    public final void invoke(Void r53) {
        CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback));
    }
}
