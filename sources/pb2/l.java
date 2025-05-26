package pb2;

import com.pinterest.activity.sendapin.model.TypeAheadItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final TypeAheadItem f99507a;

    public l(@NotNull TypeAheadItem typeAheadItem) {
        Intrinsics.checkNotNullParameter(typeAheadItem, "typeAheadItem");
        this.f99507a = typeAheadItem;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String A = this.f99507a.A();
        Intrinsics.checkNotNullExpressionValue(A, "getUid(...)");
        return A;
    }

    @Override // pb2.f
    public final int r() {
        return 17;
    }
}
