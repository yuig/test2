package k90;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import lh0.e0;
import m60.w;
import nx.d0;
import yk1.n;

/* loaded from: classes5.dex */
public final class g extends ConstraintLayout implements n {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f78749j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f78750a;

    /* renamed from: b, reason: collision with root package name */
    public final w f78751b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f78752c;

    /* renamed from: d, reason: collision with root package name */
    public final d4 f78753d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f78754e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltAvatar f78755f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f78756g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f78757h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltIconButton f78758i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String shuffleAssetId, w eventManager, d0 pinalytics, d4 viewType, e0 experiments) {
        super(context, null, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(shuffleAssetId, "shuffleAssetId");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f78750a = shuffleAssetId;
        this.f78751b = eventManager;
        this.f78752c = pinalytics;
        this.f78753d = viewType;
        this.f78754e = experiments;
        View inflate = View.inflate(context, a90.d.collages_cutout_image_details, this);
        View findViewById = inflate.findViewById(a90.c.user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f78755f = (GestaltAvatar) findViewById;
        View findViewById2 = inflate.findViewById(a90.c.artist_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f78756g = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(a90.c.follower_count);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f78757h = (GestaltText) findViewById3;
        View findViewById4 = inflate.findViewById(a90.c.cutout_details_overflow_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f78758i = (GestaltIconButton) findViewById4;
    }
}
