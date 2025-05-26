package w21;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f127691j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f127692k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f127693l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f127694m = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h f127695n = new h(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h f127696o = new h(5);

    /* renamed from: p, reason: collision with root package name */
    public static final h f127697p = new h(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127698i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f127698i = i13;
    }

    public final m b(m displayState) {
        switch (this.f127698i) {
            case 4:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                break;
            default:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                break;
        }
        return m.e(displayState, null, 0, null, null, false, 447);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f127698i) {
            case 0:
                kn1.b it = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                in1.b it2 = (in1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                int i13 = db0.f.pin_selection_cta_button;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                hn1.d dVar = new hn1.d(new yl1.b(new u50.k0(i13, new ArrayList(0)), false, null, null, yl1.i.a(), null, null, null, 0, null, 1006));
                int i14 = eo1.c.space_400;
                break;
            case 2:
                ln1.l bind = (ln1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                bind.c(ln1.f.LG);
                break;
            case 3:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltSpinner gestaltSpinner = new GestaltSpinner(6, context, (AttributeSet) null);
                kh2.s0.w(gestaltSpinner, f127693l);
                break;
        }
        return b((m) obj);
    }
}
