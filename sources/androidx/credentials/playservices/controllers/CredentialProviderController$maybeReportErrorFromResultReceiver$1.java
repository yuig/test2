package androidx.credentials.playservices.controllers;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u5.m;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u0003\"\b\b\u0004\u0010\u0007*\u00020\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T1", "", "T2", "R2", "R1", "E1", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderController$maybeReportErrorFromResultReceiver$1 extends s implements Function0<Unit> {
    final /* synthetic */ m $callback;
    final /* synthetic */ E1 $exception;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$maybeReportErrorFromResultReceiver$1(Executor executor, m mVar, E1 e13) {
        super(0);
        this.$executor = executor;
        this.$callback = mVar;
        this.$exception = e13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(m callback, Object exception) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        callback.a(exception);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m35invoke();
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m35invoke() {
        Executor executor = this.$executor;
        final m mVar = this.$callback;
        final E1 e13 = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderController$maybeReportErrorFromResultReceiver$1.invoke$lambda$0(m.this, e13);
            }
        });
    }
}
