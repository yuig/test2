package rk1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import z40.y;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f108485j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f108486k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f108487l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f108488m = new d(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108489i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f108489i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f108489i) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                ((Throwable) obj).getMessage();
                break;
            case 2:
                Intrinsics.checkNotNullParameter((y) obj, "it");
                break;
            case 3:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                break;
            default:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                break;
        }
        return Unit.f80348a;
    }
}
