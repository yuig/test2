package q3;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f102168a = new b();

    public b() {
        super(2, ml2.a.class, "min", "min(II)I", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
