package kz0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f81151j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f81152k = new e(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81153i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f81153i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f81153i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            default:
                om1.c it2 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return om1.c.e(it2, null, null, om1.f.TRANSPARENT_ALWAYS_LIGHT, null, null, false, 0, 1019);
        }
    }
}
