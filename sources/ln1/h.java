package ln1;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.v;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ps0.y;

/* loaded from: classes2.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84006i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSpinner f84007j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f84008k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(GestaltSpinner gestaltSpinner, d dVar, int i13) {
        super(1);
        this.f84006i = i13;
        this.f84007j = gestaltSpinner;
        this.f84008k = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        se0.o oVar;
        int i13 = this.f84006i;
        d dVar = this.f84008k;
        GestaltSpinner gestaltSpinner = this.f84007j;
        switch (i13) {
            case 0:
                d newState = (d) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                y yVar = GestaltSpinner.B;
                gestaltSpinner.w(dVar, newState);
                return Unit.f80348a;
            default:
                c it = (c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                y yVar2 = GestaltSpinner.B;
                Context context = gestaltSpinner.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int F0 = dl2.b.F0(context, dVar.f83999a.getDimenAttrRes());
                Context context2 = gestaltSpinner.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                c cVar = dVar.f84000b;
                int x03 = dl2.b.x0(context2, cVar.getColorAttrRes()[0]);
                if (gestaltSpinner.f49605z) {
                    gestaltSpinner.f49601v = new v();
                    com.airbnb.lottie.n.f(gestaltSpinner.getContext(), q.indeterminate_spinner_animation).b(new a(gestaltSpinner, 1));
                    if (cVar == c.GRAYSCALE || cVar == c.WHITE) {
                        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_ATOP);
                        cc.f fVar = new cc.f("**");
                        androidx.appcompat.app.d dVar2 = new androidx.appcompat.app.d(porterDuffColorFilter);
                        Drawable drawable = gestaltSpinner.f49601v;
                        if (drawable == null) {
                            Intrinsics.r("spinnerDrawable");
                            throw null;
                        }
                        ColorFilter colorFilter = com.airbnb.lottie.y.F;
                        ((v) drawable).a(fVar, colorFilter, dVar2);
                        gestaltSpinner.f49600u.a(fVar, colorFilter, dVar2);
                    }
                } else if (gestaltSpinner.f49604y) {
                    int[] colorAttrRes = cVar.getColorAttrRes();
                    ArrayList arrayList = new ArrayList(colorAttrRes.length);
                    for (int i14 : colorAttrRes) {
                        Context context3 = gestaltSpinner.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        arrayList.add(Integer.valueOf(dl2.b.x0(context3, i14)));
                    }
                    Context context4 = gestaltSpinner.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    gestaltSpinner.f49601v = new k(context4, arrayList);
                } else {
                    if (cVar == c.WHITE) {
                        oVar = new se0.o(gestaltSpinner.getContext(), F0, x03);
                        Context context5 = gestaltSpinner.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        oVar.f112405c = dl2.b.x0(context5, eo1.a.comp_spinner_white_foreground_color);
                    } else {
                        oVar = new se0.o(gestaltSpinner.getContext(), F0);
                    }
                    gestaltSpinner.f49601v = oVar;
                }
                return Unit.f80348a;
        }
    }
}
