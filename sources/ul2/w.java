package ul2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh2.n3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122621i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f122622j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y f122623k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(y yVar, c0 c0Var, int i13) {
        super(0);
        this.f122621i = i13;
        this.f122623k = yVar;
        this.f122622j = c0Var;
    }

    public final List b() {
        int i13 = this.f122621i;
        c0 c0Var = this.f122622j;
        y yVar = this.f122623k;
        switch (i13) {
            case 2:
                Collection<pn2.b0> c13 = yVar.a().e().c();
                Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
                ArrayList arrayList = new ArrayList(c13.size());
                for (pn2.b0 b0Var : c13) {
                    Intrinsics.f(b0Var);
                    arrayList.add(new q1(b0Var, new jg2.h(b0Var, yVar, c0Var, 27)));
                }
                am2.g a13 = yVar.a();
                if (a13 == null) {
                    xl2.l.a(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
                    throw null;
                }
                ym2.g gVar = xl2.l.f135279e;
                if (!xl2.l.b(a13, xl2.q.f135292a) && !xl2.l.b(a13, xl2.q.f135294b)) {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            am2.h c14 = bn2.e.c(((q1) it.next()).f122585a).c();
                            Intrinsics.checkNotNullExpressionValue(c14, "getKind(...)");
                            if (c14 == am2.h.INTERFACE || c14 == am2.h.ANNOTATION_CLASS) {
                            }
                        }
                    }
                    pn2.h0 e13 = fn2.d.e(yVar.a()).e();
                    Intrinsics.checkNotNullExpressionValue(e13, "getAnyType(...)");
                    arrayList.add(new q1(e13, x.f122629i));
                }
                return wn2.k.e(arrayList);
            default:
                List k13 = yVar.a().k();
                Intrinsics.checkNotNullExpressionValue(k13, "getDeclaredTypeParameters(...)");
                List<am2.c1> list = k13;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list, 10));
                for (am2.c1 c1Var : list) {
                    Intrinsics.f(c1Var);
                    arrayList2.add(new s1(c0Var, c1Var));
                }
                return arrayList2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Field declaredField;
        String b13;
        int i13 = this.f122621i;
        y yVar = this.f122623k;
        c0 c0Var = this.f122622j;
        switch (i13) {
            case 0:
                am2.g a13 = yVar.a();
                if (a13.c() == am2.h.OBJECT) {
                    if (a13.P()) {
                        xl2.e eVar = xl2.e.f135265a;
                        if (!n3.v0(a13)) {
                            declaredField = c0Var.f122502b.getEnclosingClass().getDeclaredField(a13.getName().b());
                            Object obj = declaredField.get(null);
                            Intrinsics.g(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                            break;
                        }
                    }
                    declaredField = c0Var.f122502b.getDeclaredField("INSTANCE");
                    Object obj2 = declaredField.get(null);
                    Intrinsics.g(obj2, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                }
                break;
            case 1:
                if (!c0Var.f122502b.isAnonymousClass()) {
                    ym2.b t13 = c0Var.t();
                    if (t13.f139465c) {
                        yVar.getClass();
                        Class cls = c0Var.f122502b;
                        String simpleName = cls.getSimpleName();
                        Method enclosingMethod = cls.getEnclosingMethod();
                        if (enclosingMethod != null) {
                            b13 = StringsKt.a0(simpleName, enclosingMethod.getName() + '$', simpleName);
                        } else {
                            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                            if (enclosingConstructor != null) {
                                b13 = StringsKt.a0(simpleName, enclosingConstructor.getName() + '$', simpleName);
                            } else {
                                b13 = StringsKt.Z('$', simpleName, simpleName);
                            }
                        }
                    } else {
                        b13 = t13.i().b();
                        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
                    }
                    break;
                }
                break;
        }
        return b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c0 c0Var, y yVar) {
        super(0);
        this.f122621i = 1;
        this.f122622j = c0Var;
        this.f122623k = yVar;
    }
}
