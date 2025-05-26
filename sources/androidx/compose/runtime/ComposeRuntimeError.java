package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final String f17383a;

    public ComposeRuntimeError(String str) {
        this.f17383a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f17383a;
    }
}
