package qb2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import pb2.e;
import pb2.f;

/* loaded from: classes4.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f103420i = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Integer.valueOf(((f) obj2) instanceof e ? 3 : 25);
    }
}
