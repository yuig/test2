package qo1;

import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f104526j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f104527k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104528i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f104528i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        switch (this.f104528i) {
            case 0:
                dl1.s it = (dl1.s) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof f30) {
                    String id3 = ((f30) it).getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                    if (id3.length() > 0) {
                        z13 = true;
                        return Boolean.valueOf(z13);
                    }
                }
                z13 = false;
                return Boolean.valueOf(z13);
            default:
                dl1.s it2 = (dl1.s) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String id4 = it2.getId();
                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                return id4;
        }
    }
}
