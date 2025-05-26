package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class xe2 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm.u f13625a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe2(nm.u uVar) {
        super(0);
        this.f13625a = uVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        il0 il0Var = il0.CUI_NAME_ADREQUEST_PARSERESPONSE;
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        nm.u uVar = this.f13625a;
        cs2 a13 = qs2.a(il0Var, q0Var, true);
        try {
            nm.q w13 = uVar.w("responses");
            int i13 = 0;
            nm.u i14 = !w13.f91364a.isEmpty() ? w13.u(0).i() : null;
            nm.q w14 = i14 != null ? i14.w("ad_configs") : null;
            ArrayList arrayList = new ArrayList();
            if (w14 != null) {
                Iterator it = w14.f91364a.iterator();
                int i15 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    nm.s sVar = (nm.s) next;
                    Intrinsics.f(sVar);
                    nm.u i17 = sVar.i();
                    Intrinsics.checkNotNullExpressionValue(i17, "getAsJsonObject(...)");
                    r0 r13 = gh0.b.r(i17, i15);
                    if (r13 != null) {
                        arrayList.add(r13);
                    }
                    i15 = i16;
                }
            }
            vo g13 = f0.h.g(i14 != null ? i14.x("common") : null);
            nm.s v13 = uVar.v("actions");
            nm.q f13 = v13 != null ? v13.f() : null;
            ArrayList arrayList2 = new ArrayList();
            if (f13 != null) {
                Iterator it2 = f13.f91364a.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i18 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    nm.s sVar2 = (nm.s) next2;
                    Intrinsics.f(sVar2);
                    nm.u i19 = sVar2.i();
                    Intrinsics.checkNotNullExpressionValue(i19, "getAsJsonObject(...)");
                    we2 e13 = ig1.b.e(i19);
                    if (e13 != null) {
                        arrayList2.add(e13);
                    }
                    i13 = i18;
                }
            }
            ye2 ye2Var = new ye2(arrayList, g13, arrayList2);
            dl2.b.J(a13, null);
            return ye2Var;
        } catch (Throwable th3) {
            try {
                a13.b(th3);
                if (th3 instanceof a.jf) {
                    throw th3;
                }
                a13.a(th3);
                if (th3 instanceof TimeoutCancellationException) {
                    throw new xl0(th3);
                }
                if (th3 instanceof CancellationException) {
                    throw new yj0(th3);
                }
                if (th3 instanceof uk0) {
                    throw th3;
                }
                throw new dk0(th3);
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    dl2.b.J(a13, th4);
                    throw th5;
                }
            }
        }
    }
}
