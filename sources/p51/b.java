package p51;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.pinterest.ui.components.users.LegoUserRep;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import pe.i;
import ps0.m;
import rl1.n;
import vn1.g;
import vn1.h;

/* loaded from: classes5.dex */
public final class b extends LinearLayout implements m51.b {

    /* renamed from: a, reason: collision with root package name */
    public final LegoUserRep f98893a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f98894b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LegoUserRep legoUserRep = new LegoUserRep(context);
        legoUserRep.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        legoUserRep.y1(ze0.a.List);
        legoUserRep.B0(true);
        legoUserRep.t0(true);
        legoUserRep.r0(false);
        m mVar = h.f126275a;
        g gVar = h.f126278d;
        legoUserRep.M1(gVar);
        legoUserRep.T0(gVar);
        i.w1(legoUserRep.f52345e, n.f(context));
        this.f98893a = legoUserRep;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        int Y = bs1.c.Y(context, r0.pin_reaction_full_icon_size);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Y, Y);
        layoutParams.setMarginStart(bs1.c.Y(context, eo1.c.lego_spacing_horizontal_medium));
        layoutParams.gravity = 16;
        appCompatImageView.setLayoutParams(layoutParams);
        this.f98894b = appCompatImageView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        addView(legoUserRep);
        addView(appCompatImageView);
    }
}
