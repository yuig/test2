package bs1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import df.j1;
import g1.r;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final v f23858a = m.b(a.f23855j);

    /* renamed from: b, reason: collision with root package name */
    public static final v f23859b = m.b(a.f23856k);

    public static final sr a(f30 f30Var, as1.b imageResolutionProvider) {
        sr srVar;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(imageResolutionProvider, "imageResolutionProvider");
        v vVar = f23858a;
        r rVar = (r) vVar.getValue();
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        if (j1.e1((sr) rVar.c(uid))) {
            r rVar2 = (r) vVar.getValue();
            String uid2 = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            return (sr) rVar2.c(uid2);
        }
        Map A4 = f30Var.A4();
        if (A4 != null) {
            sr srVar2 = (sr) A4.get(imageResolutionProvider.b());
            if (srVar2 == null) {
                srVar2 = (sr) A4.get(imageResolutionProvider.e());
            }
            srVar = srVar2;
        } else {
            srVar = null;
        }
        if (srVar != null) {
            r rVar3 = (r) vVar.getValue();
            String uid3 = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
            rVar3.d(uid3, srVar);
        }
        return srVar;
    }

    public static final sr b(f30 f30Var, as1.b imageResolutionProvider) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(imageResolutionProvider, "imageResolutionProvider");
        String uid = f30Var.getUid();
        v vVar = f23859b;
        r rVar = (r) vVar.getValue();
        Intrinsics.f(uid);
        if (j1.e1((sr) rVar.c(uid))) {
            return (sr) ((r) vVar.getValue()).c(uid);
        }
        Map A4 = f30Var.A4();
        sr srVar = null;
        if (A4 != null) {
            sr srVar2 = (sr) A4.get(imageResolutionProvider.c());
            if (srVar2 == null) {
                srVar2 = (sr) A4.get(imageResolutionProvider.f());
            }
            if (srVar2 == null) {
                Map A42 = f30Var.A4();
                if (A42 != null) {
                    Iterator it = A42.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        sr srVar3 = (sr) ((Map.Entry) it.next()).getValue();
                        if (srVar3 != null) {
                            srVar = srVar3;
                            break;
                        }
                    }
                }
            } else {
                srVar = srVar2;
            }
        }
        sr srVar4 = srVar;
        if (srVar4 == null) {
            return srVar4;
        }
        ((r) vVar.getValue()).d(uid, srVar4);
        return srVar4;
    }
}
