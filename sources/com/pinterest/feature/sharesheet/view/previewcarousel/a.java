package com.pinterest.feature.sharesheet.view.previewcarousel;

import android.animation.AnimatorSet;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.api.model.e40;
import com.pinterest.api.model.v7;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer;
import com.pinterest.shuffles.scene.composer.t;
import com.pinterest.ui.imageview.WebImageView;
import i91.c0;
import i91.x;
import java.io.InputStream;
import java.util.Date;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.w0;
import so.f5;

/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f48426u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f48427v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FrameLayout itemView, LegoBoardRep boardView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(boardView, "boardView");
        this.f48427v = boardView;
    }

    @Override // com.pinterest.feature.sharesheet.view.previewcarousel.i
    public final void k0(c0 shareConfig, yk1.j mvpBinder, f5 shareBoardPreviewPresenterFactory) {
        String str;
        ViewGroup viewGroup = this.f48427v;
        r8 = null;
        Float f13 = null;
        switch (this.f48426u) {
            case 0:
                Intrinsics.checkNotNullParameter(shareConfig, "shareConfig");
                Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
                Intrinsics.checkNotNullParameter(shareBoardPreviewPresenterFactory, "shareBoardPreviewPresenterFactory");
                v7 v7Var = shareConfig instanceof i91.a ? ((i91.a) shareConfig).f71789a : shareConfig instanceof i91.c ? ((i91.c) shareConfig).f71802a : null;
                if (v7Var != null) {
                    LegoBoardRep legoBoardRep = (LegoBoardRep) viewGroup;
                    dc0.q qVar = dc0.q.Default;
                    e40 e40Var = (e40) CollectionsKt.U(0, kh2.d.U0(v7Var));
                    String c13 = e40Var != null ? e40Var.c() : null;
                    if (c13 == null) {
                        c13 = "";
                    }
                    e40 e40Var2 = (e40) CollectionsKt.U(1, kh2.d.U0(v7Var));
                    String c14 = e40Var2 != null ? e40Var2.c() : null;
                    if (c14 == null) {
                        c14 = "";
                    }
                    e40 e40Var3 = (e40) CollectionsKt.U(2, kh2.d.U0(v7Var));
                    String c15 = e40Var3 != null ? e40Var3.c() : null;
                    if (c15 == null) {
                        c15 = "";
                    }
                    dc0.g gVar = new dc0.g(c13, c14, c15);
                    int b03 = bs1.c.b0(legoBoardRep, eo1.c.space_200);
                    int i13 = eo1.b.color_background_secondary_base;
                    String j13 = v7Var.j1();
                    Resources resources = legoBoardRep.getResources();
                    int i14 = w0.plural_pins_string;
                    Integer l13 = v7Var.l1();
                    Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
                    String quantityString = resources.getQuantityString(i14, l13.intValue(), v7Var.l1());
                    Resources resources2 = legoBoardRep.getResources();
                    int i15 = le0.g.plural_sections;
                    Integer q13 = v7Var.q1();
                    Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
                    String D = a.a.D(quantityString, " · ", resources2.getQuantityString(i15, q13.intValue(), v7Var.q1()));
                    if (v7Var.D0() != null) {
                        Resources resources3 = legoBoardRep.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                        pb0.d dVar = new pb0.d(resources3);
                        Date D0 = v7Var.D0();
                        Intrinsics.f(D0);
                        str = dVar.c(xa0.j.p(D0), pb0.b.STYLE_COMPACT, false).toString();
                    } else {
                        str = "";
                    }
                    Integer valueOf = Integer.valueOf(b03);
                    Intrinsics.f(j13);
                    legoBoardRep.d0(new dc0.o(qVar, gVar, valueOf, null, null, null, j13, D, str, null, "", false, null, false, i13, null, null, false, false, false, null, null, false, false, 16357920));
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(shareConfig, "shareConfig");
                Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
                Intrinsics.checkNotNullParameter(shareBoardPreviewPresenterFactory, "shareBoardPreviewPresenterFactory");
                if ((shareConfig instanceof i91.d ? (i91.d) shareConfig : null) != null) {
                    i91.d dVar2 = (i91.d) shareConfig;
                    String uid = dVar2.f71807a.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    SharesheetBoardPreviewContainer sharesheetBoardPreviewContainer = (SharesheetBoardPreviewContainer) viewGroup;
                    mvpBinder.d(sharesheetBoardPreviewContainer, shareBoardPreviewPresenterFactory.a(uid, dVar2.f71808b));
                    sharesheetBoardPreviewContainer.a();
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(shareConfig, "shareConfig");
                Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
                Intrinsics.checkNotNullParameter(shareBoardPreviewPresenterFactory, "shareBoardPreviewPresenterFactory");
                if ((shareConfig instanceof x ? (x) shareConfig : null) != null) {
                    l lVar = (l) viewGroup;
                    SharesheetPinOrSpinPreviewView$RoundedCornerImageView sharesheetPinOrSpinPreviewView$RoundedCornerImageView = lVar.f48446e;
                    Uri uri = ((x) shareConfig).f71910a;
                    if (uri != null) {
                        ContentResolver contentResolver = lVar.getContext().getContentResolver();
                        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                        try {
                            InputStream openInputStream = contentResolver.openInputStream(uri);
                            if (openInputStream == null) {
                                dl2.b.J(openInputStream, null);
                            } else {
                                try {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeStream(openInputStream, null, options);
                                    Float valueOf2 = Float.valueOf((options.outHeight * 1.0f) / options.outWidth);
                                    dl2.b.J(openInputStream, null);
                                    f13 = valueOf2;
                                } finally {
                                }
                            }
                        } catch (Exception unused) {
                        }
                        if (f13 != null) {
                            float floatValue = f13.floatValue();
                            ViewGroup.LayoutParams layoutParams = sharesheetPinOrSpinPreviewView$RoundedCornerImageView.getLayoutParams();
                            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            int i16 = lVar.f48444c;
                            int i17 = (int) (i16 / floatValue);
                            int i18 = lVar.f48445d;
                            if (i18 <= i17) {
                                i17 = i18;
                            }
                            layoutParams2.width = i17;
                            int i19 = (int) (i18 * floatValue);
                            if (i16 > i19) {
                                i16 = i19;
                            }
                            layoutParams2.height = i16;
                            layoutParams2.gravity = 17;
                        }
                    }
                    View childAt = sharesheetPinOrSpinPreviewView$RoundedCornerImageView.getChildAt(0);
                    Intrinsics.g(childAt, "null cannot be cast to non-null type com.pinterest.ui.imageview.WebImageView");
                    ((WebImageView) childAt).w2(uri);
                    return;
                }
                return;
        }
    }

    @Override // com.pinterest.feature.sharesheet.view.previewcarousel.i
    public final void o0() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f48426u) {
            case 1:
                SharesheetBoardPreviewContainer sharesheetBoardPreviewContainer = (SharesheetBoardPreviewContainer) this.f48427v;
                if (sharesheetBoardPreviewContainer.f45339m) {
                    sharesheetBoardPreviewContainer.f45339m = false;
                    t tVar = sharesheetBoardPreviewContainer.f45336j;
                    if (tVar != null && (animatorSet2 = tVar.f52153d) != null) {
                        animatorSet2.resume();
                    }
                    t tVar2 = sharesheetBoardPreviewContainer.f45337k;
                    if (tVar2 != null && (animatorSet = tVar2.f52153d) != null) {
                        animatorSet.resume();
                    }
                    x72.j jVar = sharesheetBoardPreviewContainer.f45334h;
                    if (jVar != null) {
                        jVar.h(true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.pinterest.feature.sharesheet.view.previewcarousel.i
    public final void r0() {
        switch (this.f48426u) {
            case 1:
                ((SharesheetBoardPreviewContainer) this.f48427v).a();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FrameLayout itemView, SharesheetBoardPreviewContainer videoPreviewView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(videoPreviewView, "videoPreviewView");
        this.f48427v = videoPreviewView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FrameLayout itemView, l previewView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        this.f48427v = previewView;
    }
}
