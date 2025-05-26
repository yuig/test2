package dy;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.a0;
import pc.b0;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f56525j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f56526k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f56527i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.f56527i) {
            case 0:
                a0 loc = (a0) obj;
                Intrinsics.checkNotNullParameter(loc, "loc");
                StringBuilder s13 = a.a.s("Line ", loc.f99510a, ", Column ");
                s13.append(loc.f99511b);
                return s13.toString();
            default:
                b0 error = (b0) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                List list = error.f99516b;
                String Z = list != null ? CollectionsKt.Z(list, ", ", null, null, 0, null, f56525j, 30) : null;
                List list2 = error.f99517c;
                if (list2 == null || (str = CollectionsKt.Z(list2, " -> ", null, null, 0, null, null, 62)) == null) {
                    str = "No path";
                }
                StringBuilder sb3 = new StringBuilder("Error message: ");
                a.a.B(sb3, error.f99515a, ", Locations: [", Z, "], Path: ");
                sb3.append(str);
                return sb3.toString();
        }
    }
}
