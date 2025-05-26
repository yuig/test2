package cq0;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.c2;
import aq0.d;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import dq0.h;
import h32.a4;
import h32.i0;
import jc0.n;
import kotlin.jvm.internal.Intrinsics;
import lq0.b0;
import lq0.b1;
import m60.w;
import nx.j0;
import nx.m;
import x02.e1;
import x02.i2;
import x02.x2;
import yk1.l;

/* loaded from: classes5.dex */
public final class a extends l implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final mv f53015a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53016b;

    /* renamed from: c, reason: collision with root package name */
    public final wy0 f53017c;

    /* renamed from: d, reason: collision with root package name */
    public final e1 f53018d;

    /* renamed from: e, reason: collision with root package name */
    public final x2 f53019e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f53020f;

    /* renamed from: g, reason: collision with root package name */
    public final e02.a f53021g;

    /* renamed from: h, reason: collision with root package name */
    public final il1.a f53022h;

    /* renamed from: i, reason: collision with root package name */
    public final d f53023i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f53024j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f53025k;

    /* renamed from: l, reason: collision with root package name */
    public final c2 f53026l;

    /* renamed from: m, reason: collision with root package name */
    public final w f53027m;

    /* renamed from: n, reason: collision with root package name */
    public final b1 f53028n;

    /* renamed from: o, reason: collision with root package name */
    public j0 f53029o;

    /* renamed from: p, reason: collision with root package name */
    public b0 f53030p;

    public a(mv message, String str, wy0 activeUser, e1 conversationMessageRepository, x2 userRepository, i2 pinRepository, e02.a boardRouter, il1.a fragmentFactory, d conversationReactionHalfSheetType, boolean z13, boolean z14, c2 sharesheetUtils, w eventManager, b1 b1Var) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(activeUser, "activeUser");
        Intrinsics.checkNotNullParameter(conversationMessageRepository, "conversationMessageRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(conversationReactionHalfSheetType, "conversationReactionHalfSheetType");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f53015a = message;
        this.f53016b = str;
        this.f53017c = activeUser;
        this.f53018d = conversationMessageRepository;
        this.f53019e = userRepository;
        this.f53020f = pinRepository;
        this.f53021g = boardRouter;
        this.f53022h = fragmentFactory;
        this.f53023i = conversationReactionHalfSheetType;
        this.f53024j = z13;
        this.f53025k = z14;
        this.f53026l = sharesheetUtils;
        this.f53027m = eventManager;
        this.f53028n = b1Var;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = new n(context);
        this.f53029o = ((m) nVar.C()).a(this);
        b0 b0Var = new b0(context, this.f53015a, this.f53017c, this.f53023i, this.f53024j, this.f53025k);
        this.f53030p = b0Var;
        nVar.x(b0Var);
        nVar.T(false);
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        j0 j0Var = this.f53029o;
        if (j0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        return new h(this.f53015a, this.f53016b, this.f53017c, this.f53018d, this.f53019e, this.f53020f, this.f53021g, this.f53022h, j0Var, this.f53026l, this.f53027m, this.f53028n);
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(null, a4.SEND_SHARE_MAIN, null, null, null, null);
    }

    @Override // yk1.l
    public final yk1.n getView() {
        b0 b0Var = this.f53030p;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.r("conversationMessageReactionHalfSheetView");
        throw null;
    }
}
