package uf2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh2.g;

/* loaded from: classes4.dex */
public abstract class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f122110a;

    /* renamed from: b, reason: collision with root package name */
    public final lh2.b f122111b;

    /* renamed from: c, reason: collision with root package name */
    public final wf2.a f122112c;

    public b(Object obj, lh2.b logger, wf2.a limitStrategy) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(limitStrategy, "limitStrategy");
        this.f122110a = obj;
        this.f122111b = logger;
        this.f122112c = limitStrategy;
    }

    @Override // uf2.a
    public void a() {
    }

    @Override // uf2.a
    public void c() {
    }

    public final void e(Function0 inputValidation, Function1 captureAction) {
        Intrinsics.checkNotNullParameter(inputValidation, "inputValidation");
        Intrinsics.checkNotNullParameter(captureAction, "captureAction");
        f(inputValidation, captureAction, true);
    }

    public final boolean f(Function0 inputValidation, Function1 captureAction, boolean z13) {
        Intrinsics.checkNotNullParameter(inputValidation, "inputValidation");
        Intrinsics.checkNotNullParameter(captureAction, "captureAction");
        if (z13) {
            try {
                if (!this.f122112c.b()) {
                    return false;
                }
            } catch (Throwable th3) {
                ((lh2.e) this.f122111b).b(g.DATA_SOURCE_DATA_CAPTURE_FAIL, th3);
                return false;
            }
        }
        if (!((Boolean) inputValidation.invoke()).booleanValue()) {
            return false;
        }
        captureAction.invoke(this.f122110a);
        return true;
    }
}
