package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v3 extends kotlin.jvm.internal.s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f111824i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f111825j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f111826k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f111827l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ do2.b2 f111828m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(Function1 function1, j jVar, Function1 function12, Function1 function13, do2.b2 b2Var) {
        super(4);
        this.f111824i = function1;
        this.f111825j = jVar;
        this.f111826k = function12;
        this.f111827l = function13;
        this.f111828m = b2Var;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        i1.r AnimatedContent = (i1.r) obj;
        g targetState = (g) obj2;
        i2.o oVar = (i2.o) obj3;
        ((Number) obj4).intValue();
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        float n13 = kh2.u2.n(om1.e.LG, oVar);
        i2.s sVar = (i2.s) oVar;
        sVar.W(1992530045);
        boolean e13 = sVar.e(n13);
        Object J2 = sVar.J();
        Object obj5 = i2.n.f71185a;
        if (e13 || J2 == obj5) {
            float f13 = 0;
            J2 = new w80.c(f13, f13, new w80.a(n13, n13));
            sVar.g0(J2);
        }
        w80.c cVar = (w80.c) J2;
        sVar.r(false);
        int i13 = u3.f111813a[targetState.ordinal()];
        u2.n nVar = u2.n.f120041b;
        if (i13 != 1) {
            j jVar = this.f111825j;
            Function1 function1 = this.f111826k;
            if (i13 == 2) {
                sVar.W(1639717883);
                ra0.u uVar = jVar.f111596e.f111805a;
                u2.q b13 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
                float f14 = ra0.h0.f106929a;
                ra0.v b14 = ra0.h0.b(androidx.compose.foundation.layout.b.b(com.bumptech.glide.d.A(eo1.c.space_200, sVar), 2), sVar, ra0.h0.f106945q << 15, 15);
                sVar.W(1992568740);
                boolean h10 = sVar.h(function1);
                Object J3 = sVar.J();
                if (h10 || J3 == obj5) {
                    J3 = jq.b.o(19, function1, sVar);
                }
                Function0 function0 = (Function0) J3;
                sVar.r(false);
                sVar.W(1992571002);
                boolean h13 = sVar.h(function1);
                Object J4 = sVar.J();
                if (h13 || J4 == obj5) {
                    J4 = new i1.f1(25, function1);
                    sVar.g0(J4);
                }
                sVar.r(false);
                kh2.r.c(uVar, b13, function0, null, (Function1) J4, b14, sVar, 56, 8);
                sVar.r(false);
            } else if (i13 == 3) {
                sVar.W(1640292158);
                w80.d1 d1Var = jVar.f111597f;
                u2.q b15 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
                float f15 = cVar.f128266d;
                sVar.W(1992584351);
                boolean h14 = sVar.h(function1);
                Object J5 = sVar.J();
                if (h14 || J5 == obj5) {
                    J5 = jq.b.o(20, function1, sVar);
                }
                sVar.r(false);
                w80.d0.a(d1Var, this.f111828m, b15, f15, (Function0) J5, sVar, 448, 0);
                sVar.r(false);
            } else if (i13 == 4) {
                sVar.W(1640677922);
                kh2.u2.k(com.bumptech.glide.d.A(dq1.a.idea_pin_drawing_editor_brush_button_height, sVar), null, sVar, 0, 2);
                sVar.r(false);
            } else if (i13 != 5) {
                sVar.W(1641038204);
                sVar.r(false);
            } else {
                sVar.W(1640898549);
                kh2.u2.k(cVar.f128266d, null, sVar, 0, 2);
                sVar.r(false);
            }
        } else {
            sVar.W(1639307536);
            sVar.W(1992546659);
            Function1 function12 = this.f111824i;
            boolean h15 = sVar.h(function12);
            Object J6 = sVar.J();
            if (h15 || J6 == obj5) {
                J6 = new i1.f1(23, function12);
                sVar.g0(J6);
            }
            sVar.r(false);
            u2.q g13 = androidx.compose.ui.layout.b.g(nVar, (Function1) J6);
            sVar.W(1992552867);
            Function1 function13 = this.f111827l;
            boolean h16 = sVar.h(function13);
            Object J7 = sVar.J();
            if (h16 || J7 == obj5) {
                J7 = new i1.f1(24, function13);
                sVar.g0(J7);
            }
            sVar.r(false);
            kh2.u2.j(this.f111825j, g13, cVar, this.f111826k, (Function1) J7, sVar, 8, 0);
            sVar.r(false);
        }
        return Unit.f80348a;
    }
}
