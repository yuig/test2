package qm1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104392i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltIconButtonFloating f104393j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f104394k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(GestaltIconButtonFloating gestaltIconButtonFloating, b bVar, int i13) {
        super(1);
        this.f104392i = i13;
        this.f104393j = gestaltIconButtonFloating;
        this.f104394k = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f104392i;
        GestaltIconButtonFloating gestaltIconButtonFloating = this.f104393j;
        b bVar = this.f104394k;
        switch (i13) {
            case 0:
                b newState = (b) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                q qVar = GestaltIconButtonFloating.f49395f;
                gestaltIconButtonFloating.d(bVar, newState);
                return Unit.f80348a;
            case 1:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = gestaltIconButtonFloating.getContext();
                q qVar2 = bVar.f104382a;
                Context context2 = gestaltIconButtonFloating.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Drawable drawable = context.getDrawable(qVar2.drawableRes(context2));
                if (drawable == null) {
                    throw new Exception("GestaltIconButtonFloating: Invalid display state");
                }
                gestaltIconButtonFloating.f49398d = drawable;
                return Unit.f80348a;
            case 2:
                ((Boolean) obj).getClass();
                gestaltIconButtonFloating.setEnabled(bVar.f104385d);
                return Unit.f80348a;
            default:
                ((Number) obj).intValue();
                int i14 = bVar.f104386e;
                if (i14 != Integer.MIN_VALUE) {
                    gestaltIconButtonFloating.setId(i14);
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, GestaltIconButtonFloating gestaltIconButtonFloating) {
        super(1);
        this.f104392i = 3;
        this.f104394k = bVar;
        this.f104393j = gestaltIconButtonFloating;
    }
}
