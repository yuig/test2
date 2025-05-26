package t90;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import i1.s0;
import i2.f2;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s90.d1;
import sv.y;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final p f116787a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f116788b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f116789c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f116790d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f116791e;

    static {
        p x13 = el.a.x(d1.collage_cutout_select_tool_label, rm1.q.SELECT);
        f116787a = x13;
        p x14 = el.a.x(d1.collage_cutout_refine_add_tool_label, rm1.q.PEN);
        f116788b = x14;
        p x15 = el.a.x(d1.collage_cutout_refine_erase_tool_label, rm1.q.ERASE);
        f116789c = x15;
        f116790d = new o(e0.b(p.e(x13, true)));
        f116791e = new o(f0.j(p.e(x13, true), x14, x15));
    }

    public static final void a(o state, u2.q qVar, Function0 function0, Function0 function02, Function0 function03, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(335950406);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        Function0 function04 = (i14 & 4) != 0 ? c.f116784i : function0;
        Function0 function05 = (i14 & 8) != 0 ? d.f116785i : function02;
        Function0 function06 = (i14 & 16) != 0 ? e.f116786i : function03;
        u2.q r13 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.e.c(qVar2, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER), 0.0f, 0.0f, 0.0f, 4, 7);
        sVar.W(-1889100058);
        boolean z13 = true;
        boolean z14 = ((((i13 & 896) ^ 384) > 256 && sVar.h(function04)) || (i13 & 384) == 256) | ((((i13 & 7168) ^ 3072) > 2048 && sVar.h(function05)) || (i13 & 3072) == 2048);
        if ((((57344 & i13) ^ 24576) <= 16384 || !sVar.h(function06)) && (i13 & 24576) != 16384) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object J2 = sVar.J();
        if (z15 || J2 == i2.n.f71185a) {
            J2 = new y(function04, function05, function06, 10);
            sVar.g0(J2);
        }
        sVar.r(false);
        el.a.g(state, r13, (Function1) J2, 0.0f, null, sVar, 8, 24);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s0(state, qVar2, function04, function05, function06, i13, i14, 8);
        }
    }

    public static final o b() {
        return f116790d;
    }

    public static final o c() {
        return f116791e;
    }
}
