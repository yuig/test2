package oh1;

import android.content.Context;
import android.text.Editable;
import android.widget.HorizontalScrollView;
import com.pinterest.activity.pin.view.unifiedcomments.NewCommentTextEdit;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qs0;
import com.pinterest.api.model.ts0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import qf1.z;
import rh1.v1;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94572i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f94573j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.pinterest.feature.unifiedcomments.g f94574k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.pinterest.feature.unifiedcomments.g gVar, w wVar) {
        super(1);
        this.f94572i = 2;
        this.f94574k = gVar;
        this.f94573j = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rp0.d dVar;
        int i13 = this.f94572i;
        com.pinterest.feature.unifiedcomments.g gVar = this.f94574k;
        w wVar = this.f94573j;
        switch (i13) {
            case 0:
                f30 f30Var = (f30) obj;
                Boolean j43 = f30Var.j4();
                Intrinsics.checkNotNullExpressionValue(j43, "getDoneByMe(...)");
                if (j43.booleanValue()) {
                    ((v1) gVar).f8(true);
                }
                Boolean Q3 = f30Var.Q3();
                Intrinsics.checkNotNullExpressionValue(Q3, "getCommentsDisabled(...)");
                if (!Q3.booleanValue()) {
                    List j13 = f0.j(q32.c.ART, q32.c.BEAUTY, q32.c.DIY_AND_CRAFTS, q32.c.FOOD_AND_DRINKS, q32.c.WOMENS_FASHION);
                    q32.a aVar = q32.c.Companion;
                    Integer B6 = f30Var.B6();
                    Intrinsics.checkNotNullExpressionValue(B6, "getTopInterest(...)");
                    int intValue = B6.intValue();
                    aVar.getClass();
                    if (CollectionsKt.L(j13, q32.a.a(intValue))) {
                        v1 v1Var = (v1) gVar;
                        if (v1Var.e8() == null) {
                            GestaltText gestaltText = v1Var.E0;
                            if (gestaltText == null) {
                                Intrinsics.r("communityGuidelineBanner");
                                throw null;
                            }
                            if (!bs1.c.o1(gestaltText)) {
                                NewCommentTextEdit newCommentTextEdit = v1Var.f108319v0;
                                if (newCommentTextEdit == null) {
                                    Intrinsics.r("textEdit");
                                    throw null;
                                }
                                Editable text = newCommentTextEdit.getText();
                                if (text != null && text.length() == 0 && v1Var.Q0 == null) {
                                    HorizontalScrollView horizontalScrollView = v1Var.C0;
                                    if (horizontalScrollView == null) {
                                        Intrinsics.r("commentsQuickRepliesScroll");
                                        throw null;
                                    }
                                    bs1.c.R1(horizontalScrollView, true);
                                    GestaltIconButton gestaltIconButton = v1Var.f108322y0;
                                    if (gestaltIconButton == null) {
                                        Intrinsics.r("addPhotoButton");
                                        throw null;
                                    }
                                    if (gestaltIconButton.getVisibility() == 0) {
                                        GestaltDivider gestaltDivider = v1Var.A0;
                                        if (gestaltDivider == null) {
                                            Intrinsics.r("addPhotoButtonDivider");
                                            throw null;
                                        }
                                        j1.W1(gestaltDivider);
                                    }
                                    v1Var.g8(fm1.c.INVISIBLE);
                                }
                            }
                        }
                    }
                    wVar.f94593o = f30Var;
                }
                return Unit.f80348a;
            case 1:
                dl1.s sVar = (dl1.s) obj;
                if (sVar instanceof z2) {
                    Intrinsics.f(sVar);
                    dVar = new rp0.b((z2) sVar);
                } else if (sVar instanceof az0) {
                    Intrinsics.f(sVar);
                    dVar = new rp0.c((az0) sVar);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    ((v1) gVar).h8(dVar.r(), dVar.q());
                }
                if (dVar != null) {
                    com.pinterest.feature.unifiedcomments.g.u4(gVar, false, null, dVar.g(), 2);
                }
                String m13 = dVar != null ? dVar.m() : null;
                if (m13 != null && m13.length() != 0) {
                    v1 v1Var2 = (v1) gVar;
                    GestaltIconButton gestaltIconButton2 = v1Var2.f108322y0;
                    if (gestaltIconButton2 == null) {
                        Intrinsics.r("addPhotoButton");
                        throw null;
                    }
                    com.bumptech.glide.c.d0(gestaltIconButton2);
                    GestaltIconButton gestaltIconButton3 = v1Var2.f108323z0;
                    if (gestaltIconButton3 == null) {
                        Intrinsics.r("addStickerButton");
                        throw null;
                    }
                    com.bumptech.glide.c.d0(gestaltIconButton3);
                    GestaltDivider gestaltDivider2 = v1Var2.A0;
                    if (gestaltDivider2 == null) {
                        Intrinsics.r("addPhotoButtonDivider");
                        throw null;
                    }
                    j1.A0(gestaltDivider2);
                }
                wVar.f94594p = dVar;
                return Unit.f80348a;
            default:
                rp0.d parent = (rp0.d) obj;
                Intrinsics.checkNotNullParameter(parent, "parent");
                wy0 w13 = parent.w();
                if (w13 != null) {
                    String title = ((yk1.a) wVar.f94586h).f139224a.getString(x0.reply_to_user, w13.U2());
                    v1 v1Var3 = (v1) gVar;
                    v1Var3.getClass();
                    Intrinsics.checkNotNullParameter(title, "title");
                    GestaltText gestaltText2 = v1Var3.f108318u0;
                    if (gestaltText2 == null) {
                        Intrinsics.r("titleTextView");
                        throw null;
                    }
                    gestaltText2.i(new z(title, 26));
                }
                String m14 = parent.m();
                if (m14 != null) {
                    wy0 user = parent.w();
                    if (user != null) {
                        v1 v1Var4 = (v1) gVar;
                        v1Var4.getClass();
                        Intrinsics.checkNotNullParameter(user, "user");
                        String U2 = user.U2();
                        if (U2 == null) {
                            U2 = "";
                        }
                        up0.l lVar = v1Var4.f108311n0;
                        if (lVar == null) {
                            Intrinsics.r("typeaheadTextUtility");
                            throw null;
                        }
                        NewCommentTextEdit newCommentTextEdit2 = v1Var4.f108319v0;
                        if (newCommentTextEdit2 == null) {
                            Intrinsics.r("textEdit");
                            throw null;
                        }
                        Context context = newCommentTextEdit2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        String concat = U2.concat(" ");
                        qs0 h10 = ts0.h();
                        h10.d(user.getUid());
                        h10.b(Integer.valueOf(U2.length()));
                        h10.e(0);
                        h10.f(Integer.valueOf(f32.c.USER.getValue()));
                        v1Var4.Y(up0.l.c(lVar, context, concat, e0.b(h10.a())));
                    }
                    wVar.s3(m14, parent.l(), l.f94515o);
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(w wVar, com.pinterest.feature.unifiedcomments.g gVar, int i13) {
        super(1);
        this.f94572i = i13;
        this.f94573j = wVar;
        this.f94574k = gVar;
    }
}
