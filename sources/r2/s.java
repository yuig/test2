package r2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f106063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f106064b;

    public s(Function2 function2, Function1 function1) {
        this.f106063a = function2;
        this.f106064b = function1;
    }

    @Override // r2.p
    public final Object a(c cVar, Object obj) {
        return this.f106063a.invoke(cVar, obj);
    }
}
