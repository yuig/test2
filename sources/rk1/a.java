package rk1;

import android.content.Context;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lr.z;
import so.oa;
import z40.y;

/* loaded from: classes5.dex */
public final class a extends s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f108478j = new a(1);

    /* renamed from: k, reason: collision with root package name */
    public static final a f108479k = new a(2);

    /* renamed from: l, reason: collision with root package name */
    public static final a f108480l = new a(3);

    /* renamed from: m, reason: collision with root package name */
    public static final a f108481m = new a(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108482i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(2);
        this.f108482i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f108482i;
        switch (i13) {
            case 0:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter((wy0) obj, "<anonymous parameter 0>");
                break;
            case 1:
                Intrinsics.checkNotNullParameter((y) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter((Function0) obj2, "<anonymous parameter 1>");
                break;
            case 2:
                zs interest = (zs) obj;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(interest, "interest");
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new z(interest));
                break;
            case 3:
                wy0 wy0Var = (wy0) obj;
                Function0 function0 = (Function0) obj2;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(wy0Var, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(function0, "<anonymous parameter 1>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(wy0Var, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(function0, "<anonymous parameter 1>");
                        break;
                }
                break;
            default:
                wy0 wy0Var2 = (wy0) obj;
                Function0 function02 = (Function0) obj2;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(wy0Var2, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(function02, "<anonymous parameter 1>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(wy0Var2, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(function02, "<anonymous parameter 1>");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
