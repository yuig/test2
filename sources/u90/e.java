package u90;

import android.net.Uri;
import android.util.Size;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import r72.i1;
import v90.a1;
import v90.u0;

/* loaded from: classes5.dex */
public final class e implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f121179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f121180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f121181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f121182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f121183e;

    public e(j0 j0Var, j0 j0Var2, j jVar, ao2.j0 j0Var3, a1 a1Var) {
        this.f121179a = j0Var;
        this.f121180b = j0Var2;
        this.f121181c = jVar;
        this.f121182d = j0Var3;
        this.f121183e = a1Var;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        Collection values;
        Object obj2;
        f30 f30Var = (f30) obj;
        Uri parse = Uri.parse(g3.t0(f30Var));
        j0 j0Var = this.f121179a;
        j0Var.f80434a = parse;
        j jVar = this.f121181c;
        jVar.getClass();
        Map A4 = f30Var.A4();
        Size size = null;
        if (A4 != null && (values = A4.values()) != null) {
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.d(((sr) obj2).j(), g3.t0(f30Var))) {
                    break;
                }
            }
            sr srVar = (sr) obj2;
            if (srVar != null) {
                size = new Size((int) srVar.k().doubleValue(), (int) srVar.h().doubleValue());
            }
        }
        j0 j0Var2 = this.f121180b;
        j0Var2.f80434a = size;
        i1 i1Var = ((u0) this.f121183e).f124964b;
        Object element = j0Var.f80434a;
        Intrinsics.checkNotNullExpressionValue(element, "element");
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String value = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(value, "getUid(...)");
        Intrinsics.checkNotNullParameter(value, "value");
        jVar.f121202a.c(this.f121182d, i1Var, new u62.b((Uri) element, value, (Size) j0Var2.f80434a));
        return Unit.f80348a;
    }
}
