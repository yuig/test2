package a6;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f870a;

    /* renamed from: b, reason: collision with root package name */
    public final ao2.v f871b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f872c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f873d;

    public o(Function2 transform, ao2.w ack, k0 k0Var, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.f870a = transform;
        this.f871b = ack;
        this.f872c = k0Var;
        this.f873d = callerContext;
    }
}
