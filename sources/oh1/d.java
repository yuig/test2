package oh1;

import android.content.Context;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.qs0;
import com.pinterest.api.model.ts0;
import com.pinterest.api.model.y2;
import com.pinterest.api.model.z2;
import com.pinterest.api.model.zy0;
import java.util.LinkedHashMap;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.j4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94483i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f94484j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(m mVar, int i13) {
        super(1);
        this.f94483i = i13;
        this.f94484j = mVar;
    }

    public final void b(z2 z2Var) {
        int B3;
        int i13 = this.f94483i;
        boolean z13 = true;
        m mVar = this.f94484j;
        switch (i13) {
            case 0:
                mh1.d x33 = mVar.x3();
                Intrinsics.f(z2Var);
                x33.T(z2Var);
                break;
            case 1:
                int indexOf = mVar.x3().d().indexOf(z2Var);
                if (indexOf >= 0) {
                    mVar.x3().removeItem(indexOf);
                    Intrinsics.f(z2Var);
                    LinkedHashMap linkedHashMap = n10.a.f88916a;
                    Intrinsics.checkNotNullParameter(z2Var, "<this>");
                    if (n10.a.e(z2Var) != null) {
                        String e13 = n10.a.e(z2Var);
                        if (e13 != null) {
                            Intrinsics.checkNotNullParameter(z2Var, "<this>");
                            String str = (String) n10.a.f88917b.get(z2Var.getUid());
                            if (str != null && (B3 = mVar.B3(e13, str)) >= 0) {
                                dl1.s sVar = (dl1.s) mVar.x3().d().get(B3);
                                if (sVar instanceof z2) {
                                    z2 z2Var2 = (z2) sVar;
                                    y2 c03 = z2Var2.c0();
                                    c03.b(Integer.valueOf(Math.max(0, z2Var2.J().intValue() - 1)));
                                    z2 a13 = c03.a();
                                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                                    mVar.f94521c.W(a13);
                                } else if (sVar instanceof az0) {
                                    az0 az0Var = (az0) sVar;
                                    zy0 V = az0Var.V();
                                    V.b(Integer.valueOf(Math.max(0, az0Var.G().intValue() - 1)));
                                    az0 a14 = V.a();
                                    Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                                    mVar.f94523e.W(a14);
                                }
                            }
                        }
                    } else {
                        String uid = z2Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        mVar.U3(uid);
                    }
                    mVar.N3();
                    break;
                }
                break;
            default:
                Intrinsics.f(z2Var);
                n10.a.g(z2Var, mVar.f94542x);
                n10.a.f(z2Var, mVar.f94543y);
                dl1.s sVar2 = (dl1.s) mVar.x3().d().get(mVar.B3(mVar.f94542x, mVar.f94543y));
                if (sVar2 instanceof z2) {
                    z2 z2Var3 = (z2) sVar2;
                    y2 c04 = z2Var3.c0();
                    c04.b(Integer.valueOf(z2Var3.J().intValue() + 1));
                    z2 a15 = c04.a();
                    Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
                    mVar.f94521c.W(a15);
                    mVar.Z3(z2Var, new rp0.b(z2Var3));
                } else if (sVar2 instanceof az0) {
                    az0 az0Var2 = (az0) sVar2;
                    zy0 V2 = az0Var2.V();
                    V2.b(Integer.valueOf(az0Var2.G().intValue() + 1));
                    az0 a16 = V2.a();
                    Intrinsics.checkNotNullExpressionValue(a16, "build(...)");
                    mVar.f94523e.W(a16);
                    mVar.Z3(z2Var, new rp0.c(az0Var2));
                }
                mVar.f94542x = "";
                mVar.f94543y = "";
                mVar.f94544z = "";
                mVar.A = "";
                mVar.D3(new fd1.h(z13, 20));
                break;
        }
    }

    public final void e(com.pinterest.feature.unifiedcomments.d view) {
        int i13 = this.f94483i;
        m mVar = this.f94484j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(view, "view");
                j4 j4Var = mVar.f94526h;
                j4Var.getClass();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) j4Var.f83399a;
                if (g1Var.o("android_comment_sort_option", "enabled", z3Var) || g1Var.l("android_comment_sort_option")) {
                    ((rh1.k) view).i9(mVar.x3().f49127q.size() > 1);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                String userUid = mVar.f94544z;
                String userName = mVar.A;
                rh1.k kVar = (rh1.k) view;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(userUid, "userUid");
                Intrinsics.checkNotNullParameter(userName, "userName");
                CommentComposerView Y8 = kVar.Y8();
                up0.l lVar = kVar.A0;
                if (lVar == null) {
                    Intrinsics.r("typeaheadTextUtility");
                    throw null;
                }
                Context requireContext = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                qs0 h10 = ts0.h();
                h10.d(userUid);
                h10.b(Integer.valueOf(userName.length()));
                h10.e(0);
                h10.f(Integer.valueOf(f32.c.USER.getValue()));
                Y8.F0(up0.l.c(lVar, requireContext, userName + " ", e0.b(h10.a())));
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oh1.d.invoke(java.lang.Object):java.lang.Object");
    }
}
