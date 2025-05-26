package j1;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Parcelable;
import com.pinterest.api.model.dk;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.lv;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.uk;
import com.pinterest.api.model.v7;
import com.pinterest.error.ServerError;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s80.z6;
import x40.j5;
import x40.k5;

/* loaded from: classes2.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74190i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f74191j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f74192k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f74193l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f74194m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ha0.f fVar, fa0.w wVar, ao2.j0 j0Var, u50.r rVar) {
        super(1);
        this.f74190i = 13;
        this.f74191j = fVar;
        this.f74192k = wVar;
        this.f74194m = j0Var;
        this.f74193l = rVar;
    }

    public final i2.s0 b() {
        int i13 = this.f74190i;
        Object obj = this.f74194m;
        Object obj2 = this.f74193l;
        Object obj3 = this.f74192k;
        Object obj4 = this.f74191j;
        switch (i13) {
            case 1:
                androidx.compose.foundation.lazy.layout.l0 l0Var = (androidx.compose.foundation.lazy.layout.l0) obj4;
                l0Var.f17263d = new androidx.compose.foundation.lazy.layout.b1((androidx.compose.foundation.lazy.layout.x) obj3, (q3.n1) obj2, (androidx.compose.foundation.lazy.layout.d1) obj);
                return new e.b(l0Var, 3);
            default:
                w1.l1 l1Var = (w1.l1) obj4;
                if (l1Var.b()) {
                    h4.g0 g0Var = (h4.g0) obj3;
                    kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
                    e.f fVar = new e.f(l1Var.f127358d, l1Var.f127374t, j0Var, 6);
                    h4.a0 a0Var = g0Var.f67562a;
                    a0Var.e((h4.f0) obj2, (h4.o) obj, fVar, l1Var.f127375u);
                    h4.m0 m0Var = new h4.m0(g0Var, a0Var);
                    g0Var.f67563b.set(m0Var);
                    j0Var.f80434a = m0Var;
                    l1Var.f127359e = m0Var;
                }
                return new w1.z();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Bitmap bitmap) {
        ArrayList arrayList;
        int i13 = this.f74190i;
        Object obj = this.f74194m;
        Object obj2 = this.f74193l;
        Object obj3 = this.f74192k;
        Object obj4 = this.f74191j;
        switch (i13) {
            case 25:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Function1 function1 = (Function1) obj4;
                ru0.j jVar = (ru0.j) obj3;
                pu0.z zVar = jVar.f109997b;
                qq qqVar = (qq) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                int i14 = 1;
                if (zVar == pu0.z.Enter) {
                    List<pu0.a> list = pu0.h.f101389a;
                    arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                    for (pu0.a aVar : list) {
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new pu0.p(((dk) aVar.getSpec()).getType() == qqVar.getDurationConfig().getEnterTransitionType() ? i14 : 0, new ru0.c(jVar, i14), qqVar, bitmap2, bitmap, aVar));
                        arrayList = arrayList2;
                        i14 = i14;
                    }
                } else {
                    List list2 = pu0.h.f101390b;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                    for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                        pu0.b bVar = (pu0.b) it.next();
                        arrayList3.add(new pu0.q(((uk) bVar.getSpec()).getType() == qqVar.getDurationConfig().getExitTransitionType(), new ru0.c(jVar, 2), qqVar, bitmap2, bitmap, bVar));
                    }
                    arrayList = arrayList3;
                }
                function1.invoke(new pu0.s(zVar, arrayList, false));
                break;
            case 28:
                Intrinsics.f(bitmap);
                ((IdeaPinVideoExportWorker) obj4).s(bitmap, (List) obj3, (jq) obj2, (RectF) obj);
                r5.L--;
                break;
            default:
                Intrinsics.f(bitmap);
                ((IdeaPinVideoExportWorker) obj4).s(bitmap, (List) obj3, (mq) obj2, (RectF) obj);
                r5.L--;
                break;
        }
    }

    public final void f(Navigation goToCutoutTool) {
        int i13 = this.f74190i;
        Object obj = this.f74194m;
        Object obj2 = this.f74193l;
        Object obj3 = this.f74192k;
        Object obj4 = this.f74191j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(goToCutoutTool, "$this$goToCutoutTool");
                String str = (String) obj4;
                if (str != null && !kotlin.text.z.j(str)) {
                    goToCutoutTool.m0("com.pinterest.EXTRA_CUTOUT_LOCAL_IMAGE", str);
                }
                goToCutoutTool.z(((sa0.d0) obj3).getValue(), "com.pinterest.EXTRA_CUTOUT_LOCAL_IMAGE_SOURCE");
                Integer num = (Integer) obj2;
                if (num != null) {
                    goToCutoutTool.z(num.intValue(), "com.pinterest.EXTRA_CUTOUT_EDIT_SOURCE");
                }
                Parcelable parcelable = (Parcelable) obj;
                if (parcelable != null) {
                    goToCutoutTool.w0(parcelable, "com.pinterest.EXTRA_CUTOUT_MASK");
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(goToCutoutTool, "$this$goToCutoutTool");
                String str2 = (String) obj4;
                if (str2 != null && !kotlin.text.z.j(str2)) {
                    goToCutoutTool.m0("com.pinterest.EXTRA_PIN_ID", str2);
                }
                String str3 = (String) obj3;
                if (str3 != null && !kotlin.text.z.j(str3)) {
                    goToCutoutTool.m0("com.pinterest.EXTRA_URL", str3);
                }
                Integer num2 = (Integer) obj2;
                if (num2 != null) {
                    goToCutoutTool.z(num2.intValue(), "com.pinterest.EXTRA_CUTOUT_EDIT_SOURCE");
                }
                goToCutoutTool.z(((d32.c) obj).getValue(), "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE");
                break;
        }
    }

    public final void h(Throwable th3) {
        v.f1 f1Var;
        int i13 = this.f74190i;
        Object obj = this.f74191j;
        switch (i13) {
            case 6:
                if (!qb0.d.f103396a.c()) {
                    ((sr.j) obj).f115072h.f115049a.g();
                    break;
                } else {
                    sr.j jVar = (sr.j) obj;
                    NavigationImpl navigation = Navigation.w1((ScreenLocation) com.pinterest.screens.d1.f50636b.getValue());
                    Intrinsics.checkNotNullExpressionValue(navigation, "create(...)");
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(navigation, "navigation");
                    sr.f fVar = jVar.f115070f;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(navigation, "navigation");
                    fVar.c(navigation);
                    jVar.f115072h.f115049a.g();
                    break;
                }
            default:
                if (!(th3 instanceof ServerError) || (f1Var = ((ServerError) th3).f45043a) == null || f1Var.f123449b != 404) {
                    Function0 function0 = (Function0) this.f74193l;
                    if (function0 != null) {
                        function0.invoke();
                        break;
                    }
                } else {
                    jq jqVar = (jq) obj;
                    v7 board = jqVar.getBoard();
                    Object obj2 = this.f74192k;
                    if (board == null) {
                        Function0 function02 = (Function0) obj2;
                        if (function02 != null) {
                            function02.invoke();
                            break;
                        }
                    } else {
                        com.pinterest.feature.ideaPinCreation.closeup.view.f0.g((com.pinterest.feature.ideaPinCreation.closeup.view.f0) this.f74194m, board, jqVar, (Function0) obj2);
                        break;
                    }
                }
                break;
        }
    }

    public final void i(z40.u uVar) {
        int i13 = this.f74190i;
        Object obj = this.f74194m;
        Object obj2 = this.f74193l;
        Object obj3 = this.f74192k;
        Object obj4 = this.f74191j;
        switch (i13) {
            case 19:
                String str = (String) obj4;
                String uid = ((ue) obj3).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                eq0.k kVar = eq0.k.YOURS_TAB;
                k5 k5Var = (k5) uVar;
                j5 j5Var = k5Var.f132664d;
                eq0.c.b(str, uid, kVar, j5Var != null ? j5Var.f132591d : null);
                dq0.p pVar = (dq0.p) obj2;
                lq0.b1 b1Var = pVar.f56123c;
                lq0.v1 v1Var = b1Var instanceof lq0.v1 ? (lq0.v1) b1Var : null;
                if (v1Var != null) {
                    j5 j5Var2 = k5Var.f132664d;
                    if (j5Var2 != null) {
                        lv Q = v1Var.f84448c.Q();
                        Q.i(j5Var2.f132591d);
                        mv a13 = Q.a();
                        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                        Intrinsics.checkNotNullParameter(a13, "<set-?>");
                        v1Var.f84448c = a13;
                    }
                    pVar.U3((String) obj, false, false);
                    break;
                }
                break;
            default:
                String str2 = (String) obj4;
                String uid2 = ((ue) obj3).getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                eq0.k kVar2 = (eq0.k) obj2;
                j5 j5Var3 = ((k5) uVar).f132664d;
                eq0.c.b(str2, uid2, kVar2, j5Var3 != null ? j5Var3.f132591d : null);
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x06fc, code lost:
    
        if (r13 != false) goto L187;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 2852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.p0.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        super(1);
        this.f74190i = i13;
        this.f74191j = obj;
        this.f74192k = obj2;
        this.f74193l = obj3;
        this.f74194m = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(z6 z6Var, w80.h1 h1Var, i2.q1 q1Var, i2.q1 q1Var2) {
        super(1);
        this.f74190i = 9;
        this.f74192k = z6Var;
        this.f74193l = h1Var;
        this.f74191j = q1Var;
        this.f74194m = q1Var2;
    }
}
