package rq;

import a.cb;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109654i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ wy0 f109655j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i13, wy0 wy0Var) {
        super(1);
        this.f109654i = i13;
        this.f109655j = wy0Var;
    }

    public final rl1.q b(rl1.q it) {
        int i13 = this.f109654i;
        wy0 wy0Var = this.f109655j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String U2 = wy0Var.U2();
                String str = (U2 == null && (U2 = wy0Var.Z2()) == null) ? "" : U2;
                String s03 = dl2.b.s0(wy0Var);
                int i14 = le0.h.content_description_user_avatar;
                String[] formatArgs = new String[1];
                String Z2 = wy0Var.Z2();
                formatArgs[0] = Z2 != null ? Z2 : "";
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new u50.f0(formatArgs[0]));
                return rl1.q.e(it, s03, str, false, null, new u50.k0(i14, arrayList), false, false, null, 0, new rl1.d(wy0Var.q2().intValue()), null, 1516);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                String U22 = wy0Var.U2();
                String str2 = (U22 == null && (U22 = wy0Var.Z2()) == null) ? "" : U22;
                String s04 = dl2.b.s0(wy0Var);
                int i15 = le0.h.content_description_user_avatar;
                String[] formatArgs2 = new String[1];
                String Z22 = wy0Var.Z2();
                formatArgs2[0] = Z22 != null ? Z22 : "";
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(new u50.f0(formatArgs2[0]));
                return rl1.q.e(it, s04, str2, false, null, new u50.k0(i15, arrayList2), false, false, null, 0, new rl1.d(wy0Var.q2().intValue()), null, 1516);
            case 3:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String U23 = wy0Var.U2();
                return rl1.q.e(it, "https://s.pinimg.com/images/user/default_280.png", U23 == null ? "" : U23, false, null, null, false, false, null, 0, new rl1.d(wy0Var.q2().intValue()), null, 1532);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                String s05 = dl2.b.s0(wy0Var);
                String U24 = wy0Var.U2();
                if (U24 == null && (U24 = wy0Var.Z2()) == null) {
                    U24 = "";
                }
                return rl1.q.e(it, s05, U24, false, rl1.r.LG, null, false, false, null, 0, new rl1.d(wy0Var.q2().intValue()), null, 1524);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f109654i;
        wy0 wy0Var = this.f109655j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                List b13 = kotlin.collections.e0.b(vn1.b.CENTER_VERTICAL);
                Boolean J3 = wy0Var.J3();
                Intrinsics.checkNotNullExpressionValue(J3, "getIsPrivateProfile(...)");
                return rn1.a.y(it, null, null, b13, null, null, 0, null, null, J3.booleanValue() ? new rm1.d(new rm1.e(rm1.n.LOCK, rm1.h.SM), null, null, 0, null, 30) : cb.y(wy0Var, "getIsVerifiedMerchant(...)") ? new rm1.d(new rm1.e(rm1.n.CHECK_CIRCLE_FILL, rm1.h.SM), rm1.c.INFO, null, 0, null, 28) : dl2.b.W1(wy0Var) ? new rm1.d(new rm1.e(rm1.n.CHECK_CIRCLE_FILL, rm1.h.SM), rm1.c.BRAND, null, 0, null, 28) : null, null, false, 0, null, null, null, null, null, false, null, null, 2096891);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                String Z2 = wy0Var.Z2();
                return rn1.a.y(it, bs1.c.h2(Z2 != null ? Z2 : ""), vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2("@" + wy0Var.z4()), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String X3 = wy0Var.X3();
                return rn1.a.y(it, bs1.c.h2(X3 != null ? X3 : ""), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String parentEmail;
        mr1.h hVar;
        Object obj2;
        mr1.h hVar2;
        wy0 wy0Var;
        Object obj3 = null;
        int i13 = this.f109654i;
        wy0 user = this.f109655j;
        switch (i13) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                return b((rl1.q) obj);
            case 2:
                return b((rl1.q) obj);
            case 3:
                return e((rn1.a) obj);
            case 4:
                return b((rl1.q) obj);
            case 5:
                return e((rn1.a) obj);
            case 6:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 6:
                        th3.getMessage();
                        break;
                    default:
                        th3.getMessage();
                        break;
                }
                return Unit.f80348a;
            case 7:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 6:
                        th4.getMessage();
                        break;
                    default:
                        th4.getMessage();
                        break;
                }
                return Unit.f80348a;
            case 8:
                y31.o0 it = (y31.o0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return y31.o0.b(it, user, null, 59);
            case 9:
                return b((rl1.q) obj);
            case 10:
                vy0 it2 = (vy0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                it2.f43028b1 = user.X3();
                boolean[] zArr = it2.V1;
                if (zArr.length > 105) {
                    zArr[105] = true;
                }
                it2.v0(user.E3());
                it2.f43093x0 = user.v3();
                boolean[] zArr2 = it2.V1;
                if (zArr2.length > 75) {
                    zArr2[75] = true;
                }
                wy0 a13 = it2.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            case 11:
                sb1.b it3 = (sb1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                String X3 = user.X3();
                parentEmail = X3 != null ? X3 : "";
                boolean z13 = !user.F3().booleanValue();
                it3.getClass();
                Intrinsics.checkNotNullParameter(parentEmail, "parentEmail");
                return new sb1.b(false, parentEmail, z13);
            case 12:
                return e((rn1.a) obj);
            case 13:
                rl1.c0 bind = (rl1.c0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                rl1.d backgroundColor = new rl1.d(user.q2().intValue());
                bind.getClass();
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                bind.f108537j = backgroundColor;
                String l33 = user.l3();
                parentEmail = l33 != null ? l33 : "";
                Intrinsics.checkNotNullParameter(parentEmail, "imageUrl");
                bind.f108528a = parentEmail;
                return Unit.f80348a;
            case 14:
                com.pinterest.feature.unifiedcomments.d view = (com.pinterest.feature.unifiedcomments.d) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                rh1.k kVar = (rh1.k) view;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                kVar.Y8().T0(user);
                return Unit.f80348a;
            case 15:
                wy0 it4 = (wy0) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                String userUid = it4.getUid();
                Intrinsics.checkNotNullExpressionValue(userUid, "getUid(...)");
                Intrinsics.checkNotNullParameter(userUid, "userUid");
                a60.a.a(null).edit().remove(userUid).commit();
                return user;
            default:
                List accounts = (List) obj;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                boolean L1 = dl2.b.L1(user);
                if (L1) {
                    List list = accounts;
                    Iterator it5 = list.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj2 = it5.next();
                            if (Intrinsics.d(user.getUid(), ((mr1.h) obj2).f88088a)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    mr1.h hVar3 = (mr1.h) obj2;
                    Iterator it6 = list.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            Object next = it6.next();
                            if (Intrinsics.d((hVar3 == null || (hVar2 = hVar3.f88091d) == null || (wy0Var = hVar2.f88089b) == null) ? null : wy0Var.getUid(), ((mr1.h) next).f88088a)) {
                                obj3 = next;
                            }
                        }
                    }
                    hVar = (mr1.h) obj3;
                    if (hVar == null) {
                        hVar = (mr1.h) CollectionsKt.firstOrNull(accounts);
                    }
                } else {
                    if (L1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar = (mr1.h) CollectionsKt.firstOrNull(accounts);
                }
                return hVar != null ? uj2.l.d(hVar) : hk2.i.f69412a;
        }
    }
}
