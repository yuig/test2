package qx;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.oc0;
import com.pinterest.api.model.yc0;
import fk2.f0;
import kh2.k3;
import kk2.m;
import kk2.t;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import l7.w0;
import lq0.f1;
import n60.o;
import uj2.b0;

/* loaded from: classes3.dex */
public final class b extends com.pinterest.hairball.network.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105311a = 3;

    /* renamed from: b, reason: collision with root package name */
    public final Object f105312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.pinterest.hairball.network.e f105313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dr0.a aVar, yc0 yc0Var) {
        super(aVar, yc0Var);
        this.f105313c = aVar;
        this.f105312b = yc0Var;
    }

    @Override // com.pinterest.hairball.network.c
    public final /* bridge */ /* synthetic */ Object buildRequest() {
        switch (this.f105311a) {
        }
        return buildRequest();
    }

    @Override // com.pinterest.hairball.network.d, com.pinterest.hairball.network.b
    public final /* bridge */ /* synthetic */ Object execute(Object obj, Object obj2) {
        switch (this.f105311a) {
            case 4:
                return execute((ak2.e) obj, (ak2.e) obj2);
            default:
                return super.execute(obj, obj2);
        }
    }

    @Override // com.pinterest.hairball.network.d
    public final Object[] getParams() {
        switch (this.f105311a) {
            case 4:
                return (Object[]) this.f105312b;
            default:
                return super.getParams();
        }
    }

    @Override // com.pinterest.hairball.network.d
    public final xj2.c execute(ak2.e onSuccess, ak2.e onError) {
        switch (this.f105311a) {
            case 4:
                Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
                Intrinsics.checkNotNullParameter(onError, "onError");
                xj2.c o13 = buildRequest().l(wj2.c.a()).o(onSuccess, onError);
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                return o13;
            default:
                return super.execute(onSuccess, onError);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hj0.a aVar, String boardId) {
        super(aVar, new Object[0]);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f105313c = aVar;
        this.f105312b = boardId;
    }

    @Override // com.pinterest.hairball.network.c
    public final b0 buildRequest() {
        f0 f0Var;
        int i13 = this.f105311a;
        int i14 = 2;
        Object obj = this.f105312b;
        com.pinterest.hairball.network.e eVar = this.f105313c;
        switch (i13) {
            case 0:
                return ((c) eVar).f105315b.getRepinnedBoardsForPin((String) obj, "repin", n00.b.a(n00.c.BOARD_METADATA_FIELDS));
            case 1:
                return ((e12.c) ((hj0.a) eVar).f69280b).d((String) obj);
            case 2:
                return ((c) eVar).f105315b.getRepinnedBoardsForPin((String) obj, "repin", n00.b.a(n00.c.REPINNED_BOARDS));
            case 3:
                yc0 yc0Var = (yc0) obj;
                if (yc0Var != null) {
                    dr0.a aVar = (dr0.a) eVar;
                    String a13 = ((rr0.b) aVar.f56212a).a(yc0Var.f44008i, yc0Var.h().size(), yc0Var.f105383c, null);
                    Intrinsics.checkNotNullExpressionValue(a13, "createNextPageUrl(...)");
                    m k13 = aVar.f56213b.a(a13).k(new qk0.b(28, new f1(this, i14)));
                    Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
                    return k13;
                }
                throw new IllegalArgumentException();
            default:
                Object[] params = getParams();
                js0.a aVar2 = (js0.a) ((js0.b) eVar);
                int i15 = aVar2.f77562a;
                int i16 = 3;
                x10.b bVar = aVar2.f77563b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Object obj2 = params[0];
                        f30 f30Var = obj2 instanceof f30 ? (f30) obj2 : null;
                        if (f30Var != null) {
                            Object obj3 = params[1];
                            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Int");
                            int intValue = ((Integer) obj3).intValue();
                            String str = (String) c0.J(2, params);
                            String str2 = (String) c0.J(3, params);
                            String id3 = f30Var.getId();
                            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                            String z13 = dn.c.z(f30Var);
                            oc0 d63 = f30Var.d6();
                            String j13 = d63 != null ? d63.j() : null;
                            int R = b40.R(j13 != null ? j13 : "");
                            oc0 d64 = f30Var.d6();
                            f0Var = new f0(aVar2.f77563b.k(id3, intValue, z13, R, str, str2, d64 != null ? k3.U1(d64) : null).h(wj2.c.a()), new w0(i14), null, 0);
                            Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                            break;
                        } else {
                            throw new IllegalArgumentException("First argument should be Pin");
                        }
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Object J2 = c0.J(0, params);
                        f30 f30Var2 = J2 instanceof f30 ? (f30) J2 : null;
                        if (f30Var2 != null) {
                            Object J3 = c0.J(1, params);
                            l32.f fVar = J3 instanceof l32.f ? (l32.f) J3 : null;
                            if (fVar != null) {
                                Object J4 = c0.J(2, params);
                                String str3 = J4 instanceof String ? (String) J4 : null;
                                if (o.y(f30Var2, "getIsThirdPartyAd(...)") && b40.c0(f30Var2)) {
                                    String id4 = f30Var2.getId();
                                    Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                                    uj2.b d2 = bVar.d(id4, l32.c.BLOCK_PFY_THROUGH_PIN, fVar);
                                    w0 w0Var = new w0(i16);
                                    d2.getClass();
                                    f0Var = new f0(d2, w0Var, null, 0);
                                    Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                                    break;
                                } else if (b40.c0(f30Var2)) {
                                    String id5 = f30Var2.getId();
                                    Intrinsics.checkNotNullExpressionValue(id5, "getUid(...)");
                                    uj2.b g13 = bVar.g(id5, l32.c.BLOCK_PFY_THROUGH_PIN, fVar);
                                    w0 w0Var2 = new w0(4);
                                    g13.getClass();
                                    f0Var = new f0(g13, w0Var2, null, 0);
                                    Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                                    break;
                                } else {
                                    String id6 = f30Var2.getId();
                                    Intrinsics.checkNotNullExpressionValue(id6, "getUid(...)");
                                    l32.c cVar = l32.c.BLOCK_PFY_THROUGH_PIN;
                                    oc0 d65 = f30Var2.d6();
                                    String j14 = d65 != null ? d65.j() : null;
                                    int R2 = b40.R(j14 != null ? j14 : "");
                                    oc0 d66 = f30Var2.d6();
                                    uj2.b i17 = aVar2.f77563b.i(id6, cVar, fVar, R2, str3, d66 != null ? k3.U1(d66) : null);
                                    w0 w0Var3 = new w0(5);
                                    i17.getClass();
                                    f0Var = new f0(i17, w0Var3, null, 0);
                                    Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                                    break;
                                }
                            } else {
                                throw new IllegalArgumentException("second param must be a RecommendationComplaintReason");
                            }
                        } else {
                            throw new IllegalArgumentException("first param must be a Pin");
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Object obj4 = params[0];
                        f30 f30Var3 = obj4 instanceof f30 ? (f30) obj4 : null;
                        if (f30Var3 != null) {
                            String id7 = f30Var3.getId();
                            Intrinsics.checkNotNullExpressionValue(id7, "getUid(...)");
                            int value = l32.f.LOW_QUALITY.value();
                            String z14 = dn.c.z(f30Var3);
                            oc0 d67 = f30Var3.d6();
                            String j15 = d67 != null ? d67.j() : null;
                            int R3 = b40.R(j15 != null ? j15 : "");
                            oc0 d68 = f30Var3.d6();
                            uj2.b o13 = aVar2.f77563b.o(id7, value, z14, R3, d68 != null ? k3.U1(d68) : null);
                            w0 w0Var4 = new w0(6);
                            o13.getClass();
                            f0Var = new f0(o13, w0Var4, null, 0);
                            Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                            break;
                        } else {
                            throw new IllegalArgumentException("First argument should be a Pin");
                        }
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Object obj5 = params[0];
                        f30 f30Var4 = obj5 instanceof f30 ? (f30) obj5 : null;
                        if (f30Var4 != null) {
                            String id8 = f30Var4.getId();
                            Intrinsics.checkNotNullExpressionValue(id8, "getUid(...)");
                            int value2 = l32.f.NOT_FOR_ME.value();
                            String z15 = dn.c.z(f30Var4);
                            oc0 d69 = f30Var4.d6();
                            String j16 = d69 != null ? d69.j() : null;
                            int R4 = b40.R(j16 != null ? j16 : "");
                            oc0 d610 = f30Var4.d6();
                            uj2.b o14 = aVar2.f77563b.o(id8, value2, z15, R4, d610 != null ? k3.U1(d610) : null);
                            w0 w0Var5 = new w0(7);
                            o14.getClass();
                            f0Var = new f0(o14, w0Var5, null, 0);
                            Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                            break;
                        } else {
                            throw new IllegalArgumentException("First argument should be a Pin");
                        }
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Object C = c0.C(params);
                        String str4 = C instanceof String ? (String) C : null;
                        if (str4 != null) {
                            Object J5 = c0.J(1, params);
                            l32.c cVar2 = J5 instanceof l32.c ? (l32.c) J5 : null;
                            if (cVar2 != null) {
                                Object J6 = c0.J(2, params);
                                l32.f fVar2 = J6 instanceof l32.f ? (l32.f) J6 : null;
                                if (fVar2 != null) {
                                    uj2.b g14 = bVar.g(str4, cVar2, fVar2);
                                    w0 w0Var6 = new w0(8);
                                    g14.getClass();
                                    f0Var = new f0(g14, w0Var6, null, 0);
                                    Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                                    break;
                                } else {
                                    throw new IllegalStateException("Third argument should be reason");
                                }
                            } else {
                                throw new IllegalArgumentException("Second argument should be feedbackType");
                            }
                        } else {
                            throw new IllegalArgumentException("First argument should be pinUid");
                        }
                    case 5:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Object obj6 = params[0];
                        String str5 = obj6 instanceof String ? (String) obj6 : null;
                        if (str5 != null) {
                            uj2.b p13 = bVar.p(str5, l32.c.BLOCK_SINGLE_PFY_PIN.value());
                            w0 w0Var7 = new w0(9);
                            p13.getClass();
                            f0Var = new f0(p13, w0Var7, null, 0);
                            Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                            break;
                        } else {
                            throw new IllegalArgumentException("First argument should be pinUid");
                        }
                    case 6:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Object obj7 = params[0];
                        String str6 = obj7 instanceof String ? (String) obj7 : null;
                        if (str6 != null) {
                            uj2.b c13 = bVar.c(str6, l32.c.BLOCK_SINGLE_PFY_PIN.value());
                            w0 w0Var8 = new w0(10);
                            c13.getClass();
                            f0Var = new f0(c13, w0Var8, null, 0);
                            Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                            break;
                        } else {
                            throw new IllegalArgumentException("First argument should be pinUid");
                        }
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Object obj8 = params[0];
                        String str7 = obj8 instanceof String ? (String) obj8 : null;
                        if (str7 != null) {
                            uj2.b a14 = bVar.a(str7);
                            w0 w0Var9 = new w0(11);
                            a14.getClass();
                            f0Var = new f0(a14, w0Var9, null, 0);
                            Intrinsics.checkNotNullExpressionValue(f0Var, "toSingle(...)");
                            break;
                        } else {
                            throw new IllegalArgumentException("First argument should be pinUid");
                        }
                }
                t r13 = f0Var.r(tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
                return r13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(js0.b bVar, Object[] params) {
        super(bVar, params);
        Intrinsics.checkNotNullParameter(params, "params");
        this.f105313c = bVar;
        this.f105312b = params;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String pinId) {
        super(cVar, pinId);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f105313c = cVar;
        this.f105312b = pinId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String pinId, int i13) {
        super(cVar, pinId);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f105313c = cVar;
        this.f105312b = pinId;
    }
}
