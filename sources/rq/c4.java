package rq;

import com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c4 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109125i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j4 f109126j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(j4 j4Var, int i13) {
        super(2);
        this.f109125i = i13;
        this.f109126j = j4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hk2.b bVar;
        xj2.c cVar;
        hk2.b bVar2;
        xj2.c cVar2;
        j4 j4Var = this.f109126j;
        int i13 = this.f109125i;
        switch (i13) {
            case 0:
                rp0.d unifiedComment = (rp0.d) obj;
                CommentPreviewView commentPreviewView = (CommentPreviewView) obj2;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unifiedComment, "unifiedComment");
                        Intrinsics.checkNotNullParameter(commentPreviewView, "commentPreviewView");
                        j4.e(j4Var, unifiedComment, commentPreviewView);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unifiedComment, "unifiedComment");
                        Intrinsics.checkNotNullParameter(commentPreviewView, "commentPreviewView");
                        j4.e(j4Var, unifiedComment, commentPreviewView);
                        break;
                }
                return Unit.f80348a;
            case 1:
                rp0.d unifiedComment2 = (rp0.d) obj;
                CommentPreviewView commentPreviewView2 = (CommentPreviewView) obj2;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unifiedComment2, "unifiedComment");
                        Intrinsics.checkNotNullParameter(commentPreviewView2, "commentPreviewView");
                        j4.e(j4Var, unifiedComment2, commentPreviewView2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unifiedComment2, "unifiedComment");
                        Intrinsics.checkNotNullParameter(commentPreviewView2, "commentPreviewView");
                        j4.e(j4Var, unifiedComment2, commentPreviewView2);
                        break;
                }
                return Unit.f80348a;
            default:
                rp0.d unifiedComment3 = (rp0.d) obj;
                rh1.x actionType = (rh1.x) obj2;
                Intrinsics.checkNotNullParameter(unifiedComment3, "unifiedComment");
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                j4Var.getClass();
                boolean z13 = unifiedComment3 instanceof rp0.b;
                ck2.c cVar3 = ck2.i.f27923c;
                xj2.b bVar3 = j4Var.f109320t;
                int i14 = 5;
                int i15 = 3;
                int i16 = 2;
                int i17 = 1;
                int i18 = 4;
                if (z13) {
                    int i19 = g4.f109215a[actionType.ordinal()];
                    if (i19 == 1) {
                        x02.u uVar = j4Var.f109304d;
                        if (uVar == null) {
                            Intrinsics.r("aggregatedCommentRepository");
                            throw null;
                        }
                        hk2.k f03 = uVar.f0(((rp0.b) unifiedComment3).f109053a, null);
                        bVar2 = new hk2.b(new d1(20, h4.f109248k), new d1(29, h4.f109251n), cVar3);
                        f03.f(bVar2);
                    } else if (i19 != 2) {
                        if (i19 == 3) {
                            x02.u uVar2 = j4Var.f109304d;
                            if (uVar2 == null) {
                                Intrinsics.r("aggregatedCommentRepository");
                                throw null;
                            }
                            cVar2 = uVar2.g0(((rp0.b) unifiedComment3).f109053a, null).i(new xo.b(6), new a4(i16, h4.f109254q));
                        } else if (i19 != 4) {
                            hk2.b bVar4 = new hk2.b(new a4(i18, h4.f109256s), new a4(i14, f2.H), cVar3);
                            try {
                                bk2.d.complete(bVar4);
                                cVar2 = bVar4;
                            } catch (NullPointerException e13) {
                                throw e13;
                            } catch (Throwable th3) {
                                throw n60.o.g(th3, "subscribeActual failed", th3);
                            }
                        } else {
                            x02.u uVar3 = j4Var.f109304d;
                            if (uVar3 == null) {
                                Intrinsics.r("aggregatedCommentRepository");
                                throw null;
                            }
                            cVar2 = uVar3.i0(((rp0.b) unifiedComment3).f109053a, null).i(new xo.b(7), new a4(i15, h4.f109255r));
                        }
                        bVar3.a(cVar2);
                    } else {
                        x02.u uVar4 = j4Var.f109304d;
                        if (uVar4 == null) {
                            Intrinsics.r("aggregatedCommentRepository");
                            throw null;
                        }
                        hk2.z h03 = uVar4.h0(((rp0.b) unifiedComment3).f109053a, null);
                        bVar2 = new hk2.b(new a4(0, h4.f109252o), new a4(i17, h4.f109253p), cVar3);
                        h03.f(bVar2);
                    }
                    cVar2 = bVar2;
                    bVar3.a(cVar2);
                } else if (unifiedComment3 instanceof rp0.c) {
                    int i23 = g4.f109215a[actionType.ordinal()];
                    if (i23 == 1) {
                        x02.p1 p1Var = j4Var.f109305e;
                        if (p1Var == null) {
                            Intrinsics.r("didItRepository");
                            throw null;
                        }
                        uj2.l b03 = p1Var.b0(((rp0.c) unifiedComment3).f109054a, null);
                        d1 d1Var = new d1(21, f2.I);
                        d1 d1Var2 = new d1(22, f2.f109181J);
                        b03.getClass();
                        bVar = new hk2.b(d1Var, d1Var2, cVar3);
                        b03.f(bVar);
                    } else if (i23 != 2) {
                        if (i23 == 3) {
                            x02.p1 p1Var2 = j4Var.f109305e;
                            if (p1Var2 == null) {
                                Intrinsics.r("didItRepository");
                                throw null;
                            }
                            cVar = p1Var2.c0(((rp0.c) unifiedComment3).f109054a, null).i(new xo.b(i18), new d1(25, f2.M));
                        } else if (i23 != 4) {
                            hk2.b bVar5 = new hk2.b(new d1(27, h4.f109249l), new d1(28, h4.f109250m), cVar3);
                            try {
                                bk2.d.complete(bVar5);
                                cVar = bVar5;
                            } catch (NullPointerException e14) {
                                throw e14;
                            } catch (Throwable th4) {
                                throw n60.o.g(th4, "subscribeActual failed", th4);
                            }
                        } else {
                            x02.p1 p1Var3 = j4Var.f109305e;
                            if (p1Var3 == null) {
                                Intrinsics.r("didItRepository");
                                throw null;
                            }
                            cVar = p1Var3.e0(((rp0.c) unifiedComment3).f109054a, null).i(new xo.b(i14), new d1(26, h4.f109247j));
                        }
                        bVar3.a(cVar);
                    } else {
                        x02.p1 p1Var4 = j4Var.f109305e;
                        if (p1Var4 == null) {
                            Intrinsics.r("didItRepository");
                            throw null;
                        }
                        uj2.l d03 = p1Var4.d0(((rp0.c) unifiedComment3).f109054a, null);
                        d1 d1Var3 = new d1(23, f2.K);
                        d1 d1Var4 = new d1(24, f2.L);
                        d03.getClass();
                        bVar = new hk2.b(d1Var3, d1Var4, cVar3);
                        d03.f(bVar);
                    }
                    cVar = bVar;
                    bVar3.a(cVar);
                }
                return Unit.f80348a;
        }
    }
}
