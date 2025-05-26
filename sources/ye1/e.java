package ye1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import gg0.n0;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class e extends n0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f138849h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f138850d;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f138851e;

    /* renamed from: f, reason: collision with root package name */
    public ku1.l f138852f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltButton.SmallSecondaryButton f138853g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, HashMap hashMap, HashMap hashMap2, d0 d0Var, int i13) {
        super(context, 4);
        String str2 = (i13 & 2) != 0 ? null : str;
        HashMap hashMap3 = (i13 & 4) != 0 ? null : hashMap;
        HashMap hashMap4 = (i13 & 8) != 0 ? null : hashMap2;
        d0 d0Var2 = (i13 & 16) != 0 ? null : d0Var;
        g0 componentType = g0.PIN_CLOSEUP_RELATED_MODULE;
        u0 elementType = u0.SEE_MORE_BUTTON;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f138850d = componentType;
        this.f138851e = elementType;
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context, (AttributeSet) null);
        smallSecondaryButton.getLayoutParams();
        smallSecondaryButton.setGravity(17);
        this.f138853g = smallSecondaryButton;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        setGravity(17);
        setLayoutParams(layoutParams);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.space_400);
        addView(smallSecondaryButton);
        setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        setOnClickListener(new uh0.a(this, str2, hashMap3, hashMap4, d0Var2));
    }
}
