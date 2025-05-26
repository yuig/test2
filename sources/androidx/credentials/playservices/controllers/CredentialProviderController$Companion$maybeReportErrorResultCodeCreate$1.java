package androidx.credentials.playservices.controllers;

import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u0003\"\b\b\u0004\u0010\u0007*\u00020\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T1", "", "T2", "R2", "R1", "E1", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1 extends s implements Function0<Unit> {
    final /* synthetic */ j0 $exception;
    final /* synthetic */ Function1<CreateCredentialException, Unit> $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(Function1<? super CreateCredentialException, Unit> function1, j0 j0Var) {
        super(0);
        this.$onError = function1;
        this.$exception = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m32invoke();
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m32invoke() {
        this.$onError.invoke(this.$exception.f80434a);
    }
}
