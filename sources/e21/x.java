package e21;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.pinterest.ui.components.users.LegoUserRep;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class x extends LinearLayout implements z11.c {

    /* renamed from: a, reason: collision with root package name */
    public final LegoUserRep f56992a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f56993b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LegoUserRep legoUserRep = new LegoUserRep(context);
        legoUserRep.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        legoUserRep.y1(ze0.a.List);
        legoUserRep.B0(true);
        legoUserRep.t0(true);
        legoUserRep.r0(false);
        ps0.m mVar = vn1.h.f126275a;
        vn1.g gVar = vn1.h.f126278d;
        legoUserRep.M1(gVar);
        legoUserRep.T0(gVar);
        pe.i.w1(legoUserRep.f52345e, rl1.n.f(context));
        this.f56992a = legoUserRep;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        int Y = bs1.c.Y(context, r0.pin_reaction_full_icon_size);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Y, Y);
        layoutParams.setMarginStart(bs1.c.Y(context, eo1.c.lego_spacing_horizontal_medium));
        layoutParams.gravity = 16;
        appCompatImageView.setLayoutParams(layoutParams);
        this.f56993b = appCompatImageView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        addView(legoUserRep);
        addView(appCompatImageView);
    }
}
