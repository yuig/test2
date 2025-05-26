package q3;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f102171a = new c();

    public c() {
        super(2, ml2.a.class, "max", "max(II)I", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
