package g60;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.component.board.view.LegoBoardRep;
import kotlin.jvm.internal.Intrinsics;
import u50.r;

/* loaded from: classes5.dex */
public final class f extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f63707c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final LegoBoardRep f63708a;

    /* renamed from: b, reason: collision with root package name */
    public r f63709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LegoBoardRep legoBoardRep = new LegoBoardRep(context);
        this.f63708a = legoBoardRep;
        setLayoutParams(new FrameLayout.LayoutParams(bs1.c.W(this, f60.c.profile_pin_cluster_width), -2));
        addView(legoBoardRep);
        legoBoardRep.a0(new qc2.d(), e.f63704j);
        legoBoardRep.T();
        setOnClickListener(new tq.j(this, 16));
    }
}
