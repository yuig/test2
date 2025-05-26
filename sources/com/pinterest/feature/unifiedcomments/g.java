package com.pinterest.feature.unifiedcomments;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import fd1.h;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import oh1.w;
import rh1.v1;
import yk1.n;
import yk1.u;

/* loaded from: classes2.dex */
public interface g extends n, u {
    static void u4(g gVar, boolean z13, File file, String str, int i13) {
        if ((i13 & 2) != 0) {
            file = null;
        }
        if ((i13 & 4) != 0) {
            str = null;
        }
        v1 v1Var = (v1) gVar;
        v1Var.getClass();
        boolean z14 = true;
        boolean z15 = false;
        boolean z16 = (file == null && (str == null || str.length() == 0)) ? false : true;
        WebImageView webImageView = v1Var.f108320w0;
        if (webImageView == null) {
            Intrinsics.r("photoPreview");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = webImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = z13 ? bs1.c.W(webImageView, db0.a.photo_comment_preview_height) : -2;
        webImageView.setLayoutParams(layoutParams);
        float dimension = z13 ? 0.0f : webImageView.getResources().getDimension(eo1.c.lego_corner_radius_medium);
        webImageView.g2(dimension, dimension, dimension, dimension);
        webImageView.setScaleType(z13 ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP);
        if (file != null) {
            webImageView.t2(file);
        }
        if (str != null) {
            webImageView.loadUrl(str);
        }
        webImageView.setVisibility(z16 ? 0 : 8);
        int i14 = 24;
        if (z16) {
            v1Var.f8(true);
            GestaltIconButton gestaltIconButton = v1Var.f108323z0;
            if (gestaltIconButton == null) {
                Intrinsics.r("addStickerButton");
                throw null;
            }
            gestaltIconButton.t(new h(z15, i14));
        } else {
            f fVar = v1Var.N0;
            if (fVar != null) {
                w wVar = (w) fVar;
                g gVar2 = (g) wVar.getView();
                f30 f30Var = wVar.f94593o;
                if (f30Var != null && Intrinsics.d(f30Var.j4(), Boolean.FALSE)) {
                    ((v1) gVar2).f8(false);
                }
                v1 v1Var2 = (v1) gVar2;
                GestaltIconButton gestaltIconButton2 = v1Var2.f108323z0;
                if (gestaltIconButton2 == null) {
                    Intrinsics.r("addStickerButton");
                    throw null;
                }
                Navigation navigation = v1Var2.I;
                String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_COMMENT_TYPE") : null;
                if (v03 != null && v03.length() != 0) {
                    z14 = false;
                }
                gestaltIconButton2.t(new h(z14, i14));
            }
        }
        v1Var.j8();
    }
}
