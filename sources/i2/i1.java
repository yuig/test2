package i2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface i1 extends CoroutineContext.Element {

    /* renamed from: zo, reason: collision with root package name */
    public static final /* synthetic */ int f71128zo = 0;

    Object d(Function1 function1, bl2.c cVar);

    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.h getKey() {
        return n.f71186b;
    }
}
