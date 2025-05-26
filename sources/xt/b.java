package xt;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.st;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f135852j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f135853k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f135854l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f135855m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135856i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f135856i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135856i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return Unit.f80348a;
            case 2:
                String s13 = ((st) obj).s();
                return s13 == null ? "" : s13;
            default:
                String id3 = ((f30) obj).getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                return id3;
        }
    }
}
