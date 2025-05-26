package vr1;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.component.avatarpairs.AvatarPair;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yb0.n;

/* loaded from: classes4.dex */
public final class j extends n {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f126465q = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List avatarDisplays, CharSequence explanationText, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(avatarDisplays, "avatarDisplays");
        Intrinsics.checkNotNullParameter(explanationText, "explanationText");
        Intrinsics.checkNotNullParameter(context, "context");
        i().removeAllViews();
        LinearLayout i13 = i();
        AvatarPair avatarPair = new AvatarPair(context);
        avatarPair.X(avatarDisplays);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        Unit unit = Unit.f80348a;
        i13.addView(avatarPair, layoutParams);
        i13.addView(j());
        i13.addView(h());
        u(explanationText);
        String string = getResources().getString(py1.b.notify_me);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        q(string);
        String string2 = getResources().getString(py1.b.no_thanks);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        m(string2);
        f();
    }
}
