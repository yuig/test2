package com.pinterest.activity.newshub.view.header;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import av1.a;
import com.pinterest.activity.conversation.view.GroupUserImageView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.ui.brio.view.LegacyRoundImageView;
import dl1.s;
import gq.c;
import java.util.List;
import kg.o;
import kh2.d;
import kh2.k3;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import lp.l;
import pe.i;
import rl1.b0;
import rl1.r;

/* loaded from: classes3.dex */
public class NewsHubMultiUserAvatar extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34971d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f34972a;

    /* renamed from: b, reason: collision with root package name */
    public final GroupUserImageView f34973b;

    /* renamed from: c, reason: collision with root package name */
    public final LegacyRoundImageView f34974c;

    public NewsHubMultiUserAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(String str, c cVar) {
        c(cVar);
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            this.f34972a.H2(new l(str, 1));
        } else if (ordinal == 2 || ordinal == 3) {
            this.f34974c.loadUrl(str);
        }
    }

    public final void b(qx qxVar) {
        String j13 = qxVar.j();
        if (j13 != null) {
            a(j13, c.SINGLE_USER);
            return;
        }
        List list = qxVar.f41415v;
        boolean z13 = (list == null || list.isEmpty()) ? false : true;
        k3.R1(this, z13);
        if (z13) {
            s sVar = (s) list.get(0);
            if (sVar instanceof wy0) {
                c(c.SINGLE_USER);
                m0.V0(this.f34972a, (wy0) sVar);
            } else if (sVar instanceof v7) {
                a(d.L((v7) sVar), c.BOARD);
            } else if (sVar instanceof f30) {
                a(o.m((f30) sVar), c.PIN);
            }
        }
    }

    public final void c(c cVar) {
        int ordinal = cVar.ordinal();
        LegacyRoundImageView legacyRoundImageView = this.f34974c;
        GroupUserImageView groupUserImageView = this.f34973b;
        GestaltAvatar gestaltAvatar = this.f34972a;
        if (ordinal == 0) {
            Intrinsics.checkNotNullParameter(gestaltAvatar, "<this>");
            gestaltAvatar.H2(b0.f108526k);
            k3.R1(groupUserImageView, false);
            k3.R1(legacyRoundImageView, false);
            return;
        }
        if (ordinal == 1) {
            i.K(gestaltAvatar);
            k3.R1(groupUserImageView, true);
            k3.R1(legacyRoundImageView, false);
        } else if (ordinal == 2 || ordinal == 3) {
            i.K(gestaltAvatar);
            k3.R1(groupUserImageView, false);
            k3.R1(legacyRoundImageView, true);
        }
    }

    public NewsHubMultiUserAvatar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        GroupUserImageView groupUserImageView = new GroupUserImageView(6, context, (AttributeSet) null);
        this.f34973b = groupUserImageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(groupUserImageView, layoutParams);
        GestaltAvatar m13 = m0.m(context, r.LG, false);
        this.f34972a = m13;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(m13, layoutParams2);
        LegacyRoundImageView legacyRoundImageView = new LegacyRoundImageView(context);
        this.f34974c = legacyRoundImageView;
        legacyRoundImageView.i2(false);
        float dimension = getResources().getDimension(a.news_hub_corner_radius);
        legacyRoundImageView.g2(dimension, dimension, dimension, dimension);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        addView(legacyRoundImageView, layoutParams3);
    }
}
