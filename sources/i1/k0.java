package i1;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f70807i = new k0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        w0 w0Var = (w0) obj2;
        return Boolean.valueOf(((w0) obj) == w0Var && w0Var == w0.PostExit);
    }
}
