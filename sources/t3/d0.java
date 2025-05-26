package t3;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f115933b;

    public /* synthetic */ d0(int i13, Function2 function2) {
        this.f115932a = i13;
        this.f115933b = function2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13 = this.f115932a;
        Function2 tmp0 = this.f115933b;
        switch (i13) {
            case 0:
                break;
            case 1:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            default:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
        }
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }
}
