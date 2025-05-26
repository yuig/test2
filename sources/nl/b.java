package nl;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import is1.u;
import is1.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb0.n;
import m60.f0;
import or1.j;
import t3.c0;
import tb0.o;
import uj2.b0;
import uj2.l;
import uj2.q;
import x02.a2;
import z2.a0;
import z2.z;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    public static boolean f91207a;

    public static /* synthetic */ void a(int i13) {
        String str = (i13 == 7 || i13 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 7 || i13 == 10) ? 2 : 3];
        switch (i13) {
            case 1:
            case 3:
            case 18:
            case 20:
                objArr[0] = "supertype";
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 23:
                objArr[0] = MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 15:
                objArr[0] = "typeParameterVariance";
                break;
            case 16:
                objArr[0] = "typeArgumentVariance";
                break;
            case 21:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 22:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i13 == 7) {
            objArr[1] = "getOutType";
        } else if (i13 != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i13) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 17:
            case 18:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case 20:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 21:
            case 22:
            case 23:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 7 && i13 != 10) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static final ak2.e b(Function1 function1) {
        if (function1 != v.f73650k && !Intrinsics.d(function1, v.f73649j)) {
            return new j(10, function1);
        }
        a2 a2Var = ck2.i.f27924d;
        Intrinsics.checkNotNullExpressionValue(a2Var, "emptyConsumer(...)");
        return a2Var;
    }

    public static final ak2.a c(Function0 function0) {
        if (function0 != is1.d.f73581k) {
            return new vy.b(1, function0);
        }
        ck2.c EMPTY_ACTION = ck2.i.f27923c;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ACTION, "EMPTY_ACTION");
        return EMPTY_ACTION;
    }

    public static final a3.d d(View view) {
        int[] iArr = z2.f.f140615a;
        view.getLocationInWindow(iArr);
        int i13 = iArr[0];
        return new a3.d(i13, iArr[1], i13 + view.getWidth(), iArr[1] + view.getHeight());
    }

    public static at1.d e() {
        Context context = kb0.a.f79058b;
        return (at1.d) f0.j0();
    }

    public static at1.i f() {
        at1.i iVar = e().f20441f;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("ManagedApplication's context is null".toString());
    }

    public static final void g(z zVar) {
        z2.h hVar = ((c0) com.bumptech.glide.c.V0(zVar)).f115877e.f17410g;
        hVar.b(hVar.f140621c, zVar);
    }

    public static final boolean h(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof c0)) {
            if (rect != null) {
                View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final a0 i(z zVar) {
        return ((c0) com.bumptech.glide.c.V0(zVar)).f115877e.f17411h;
    }

    public static final boolean j(Intent intent) {
        return (f91207a || !(o.f117104k || ((lb0.b) n.a()).e("PREF_DID_CRASH_ON_LAST_LOAD", false)) || (o.f117105l || ((lb0.b) n.a()).e("PREF_LAST_CRASH_OOM", false)) || (intent != null && intent.getBooleanExtra("experiments_reload_attempted", false))) ? false : true;
    }

    public static final ek2.f k(uj2.b bVar, String errorDetailMessage, Function0 onComplete) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(errorDetailMessage, "errorDetailMessage");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        ek2.f i13 = bVar.i(c(onComplete), new u(errorDetailMessage, 1));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        return i13;
    }

    public static final ek2.j l(uk2.f fVar, String errorDetailMessage, o71.c onSuccess) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(errorDetailMessage, "errorDetailMessage");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        xj2.c F = fVar.F(b(onSuccess), new l71.d(errorDetailMessage, 1), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        return (ek2.j) F;
    }

    public static final xj2.c m(q qVar, String errorDetailMessage, Function1 onSuccess) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(errorDetailMessage, "errorDetailMessage");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        xj2.c F = qVar.F(b(onSuccess), new u(errorDetailMessage, 0), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        return F;
    }

    public static final ek2.f n(uj2.b bVar, Function0 onComplete, Function1 onError) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        ek2.f i13 = bVar.i(c(onComplete), b(onError));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        return i13;
    }

    public static final hk2.b o(l lVar, Function1 onSuccess, Function1 onError) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        hk2.b bVar = new hk2.b(b(onSuccess), b(onError), ck2.i.f27923c);
        lVar.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        return bVar;
    }

    public static final xj2.c p(q qVar, Function1 onSuccess, Function1 onError, Function0 onComplete) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        xj2.c F = qVar.F(b(onSuccess), b(onError), c(onComplete), ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        return F;
    }

    public static final xj2.c q(b0 b0Var, Function1 onComplete, Function1 onError) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        xj2.c o13 = b0Var.o(b(onComplete), b(onError));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        return o13;
    }

    public static /* synthetic */ ek2.f r(uj2.b bVar, Function0 function0, Function1 function1, int i13) {
        if ((i13 & 1) != 0) {
            function0 = is1.d.f73581k;
        }
        if ((i13 & 2) != 0) {
            function1 = v.f73649j;
        }
        return n(bVar, function0, function1);
    }

    public static /* synthetic */ xj2.c s(q qVar, Function1 function1, u60.c cVar, Function0 function0, int i13) {
        if ((i13 & 1) != 0) {
            function1 = v.f73650k;
        }
        Function1 function12 = cVar;
        if ((i13 & 2) != 0) {
            function12 = v.f73649j;
        }
        if ((i13 & 4) != 0) {
            function0 = is1.d.f73581k;
        }
        return p(qVar, function1, function12, function0);
    }

    public static /* synthetic */ xj2.c t(b0 b0Var, Function1 function1, Function1 function12, int i13) {
        if ((i13 & 1) != 0) {
            function1 = v.f73650k;
        }
        if ((i13 & 2) != 0) {
            function12 = v.f73649j;
        }
        return q(b0Var, function1, function12);
    }

    public static final Integer u(int i13) {
        if (z2.c.b(i13, 5)) {
            return 33;
        }
        if (z2.c.b(i13, 6)) {
            return Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
        }
        if (z2.c.b(i13, 3)) {
            return 17;
        }
        if (z2.c.b(i13, 4)) {
            return 66;
        }
        if (z2.c.b(i13, 1)) {
            return 2;
        }
        return z2.c.b(i13, 2) ? 1 : null;
    }

    public static final z2.c v(int i13) {
        if (i13 == 1) {
            return new z2.c(2);
        }
        if (i13 == 2) {
            return new z2.c(1);
        }
        if (i13 == 17) {
            return new z2.c(3);
        }
        if (i13 == 33) {
            return new z2.c(5);
        }
        if (i13 == 66) {
            return new z2.c(4);
        }
        if (i13 != 130) {
            return null;
        }
        return new z2.c(6);
    }
}
