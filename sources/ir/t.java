package ir;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final t f73480j = new t(0);

    /* renamed from: k, reason: collision with root package name */
    public static final t f73481k = new t(1);

    /* renamed from: l, reason: collision with root package name */
    public static final t f73482l = new t(2);

    /* renamed from: m, reason: collision with root package name */
    public static final t f73483m = new t(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73484i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i13) {
        super(1);
        this.f73484i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73484i) {
            case 0:
                vd0.c pinterestJsonObject = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m13 = pinterestJsonObject.m("data");
                if (m13 == null) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
