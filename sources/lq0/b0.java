package lq0;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.wy0;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends xo.s implements aq0.c {

    /* renamed from: d, reason: collision with root package name */
    public final mv f84250d;

    /* renamed from: e, reason: collision with root package name */
    public final wy0 f84251e;

    /* renamed from: f, reason: collision with root package name */
    public final aq0.d f84252f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f84253g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84254h;

    /* renamed from: i, reason: collision with root package name */
    public lh0.p0 f84255i;

    /* renamed from: j, reason: collision with root package name */
    public x f84256j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f84257k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f84258l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f84259m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f84260n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f84261o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f84262p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f84263q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.v f84264r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, mv message, wy0 activeUser, aq0.d conversationReactionHalfSheetType, boolean z13, boolean z14) {
        super(context, 7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(activeUser, "activeUser");
        Intrinsics.checkNotNullParameter(conversationReactionHalfSheetType, "conversationReactionHalfSheetType");
        this.f84250d = message;
        this.f84251e = activeUser;
        this.f84252f = conversationReactionHalfSheetType;
        this.f84253g = z13;
        this.f84254h = z14;
        this.f84257k = xk2.m.b(new a0(this, 6));
        this.f84258l = xk2.m.b(new a0(this, 0));
        this.f84259m = xk2.m.b(new a0(this, 4));
        this.f84260n = xk2.m.b(new a0(this, 5));
        this.f84261o = xk2.m.b(new a0(this, 7));
        this.f84262p = xk2.m.b(new a0(this, 1));
        this.f84263q = xk2.m.b(new a0(this, 3));
        this.f84264r = xk2.m.b(new a0(this, 2));
        View.inflate(context, xc0.f.conversation_message_reaction_halfsheet_modal_view, this);
    }

    public final PinterestRecyclerView i() {
        Object value = this.f84257k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PinterestRecyclerView) value;
    }
}
