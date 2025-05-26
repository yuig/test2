package com.pinterest.feature.pin.reactions.view;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import cb2.z;
import ck2.i;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import e21.k;
import e21.l;
import ek2.j;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import jk2.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import nx.f0;
import nx.j0;
import nx.m;
import oq.v0;
import org.jetbrains.annotations.NotNull;
import qv0.d0;
import so.jb;
import so.oa;
import uj2.q;
import wk2.a;
import x02.a2;
import x02.i2;
import ye2.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/reactions/view/PinReactionIconButton;", "Lcom/pinterest/feature/pin/reactions/view/ReactionIconButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinReactionsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinReactionIconButton extends ReactionIconButton implements c {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f47261z = 0;

    /* renamed from: o, reason: collision with root package name */
    public o f47262o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f47263p;

    /* renamed from: q, reason: collision with root package name */
    public n1 f47264q;

    /* renamed from: r, reason: collision with root package name */
    public i2 f47265r;

    /* renamed from: s, reason: collision with root package name */
    public f0 f47266s;

    /* renamed from: t, reason: collision with root package name */
    public a f47267t;

    /* renamed from: u, reason: collision with root package name */
    public final j0 f47268u;

    /* renamed from: v, reason: collision with root package name */
    public HashMap f47269v;

    /* renamed from: w, reason: collision with root package name */
    public String f47270w;

    /* renamed from: x, reason: collision with root package name */
    public j f47271x;

    /* renamed from: y, reason: collision with root package name */
    public j f47272y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinReactionIconButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        i2();
        f0 f0Var = this.f47266s;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        a aVar = this.f47267t;
        if (aVar == null) {
            Intrinsics.r("topContextProvider");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        this.f47268u = ((m) f0Var).a((nx.a) obj);
        this.f47269v = new HashMap();
        e21.j jVar = new e21.j(this, 0);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f47286e = jVar;
    }

    public static final void g2(PinReactionIconButton pinReactionIconButton, String uid) {
        pinReactionIconButton.getClass();
        z reactionForType = z.PIN;
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(reactionForType, "reactionForType");
        if (!Intrinsics.d(pinReactionIconButton.f47284c, uid)) {
            pinReactionIconButton.f47284c = uid;
            pinReactionIconButton.f47285d = reactionForType;
            pinReactionIconButton.setOnClickListener(new d0(13, pinReactionIconButton, uid));
        }
        j jVar = pinReactionIconButton.f47271x;
        if (jVar != null && !jVar.isDisposed()) {
            jVar.dispose();
        }
        i2 i2Var = pinReactionIconButton.f47265r;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        q P = i2Var.P(uid);
        int i13 = 2;
        a21.a aVar = new a21.a(2, new e21.j(pinReactionIconButton, 1));
        int i14 = 3;
        a21.a aVar2 = new a21.a(3, new k(1, pinReactionIconButton, PinReactionIconButton.class, "onError", "onError(Ljava/lang/Throwable;)V", 0));
        ck2.c cVar = i.f27923c;
        a2 a2Var = i.f27924d;
        pinReactionIconButton.f47271x = (j) P.F(aVar, aVar2, cVar, a2Var);
        j jVar2 = pinReactionIconButton.f47272y;
        if (jVar2 != null && !jVar2.isDisposed()) {
            jVar2.dispose();
        }
        i2 i2Var2 = pinReactionIconButton.f47265r;
        if (i2Var2 == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        pinReactionIconButton.f47272y = (j) new x(i2Var2.D(), new d51.a(7, new e21.j(pinReactionIconButton, i13)), i13).F(new a21.a(4, new e21.j(pinReactionIconButton, i14)), new a21.a(5, l.f56977j), cVar, a2Var);
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f47262o == null) {
            this.f47262o = new o(this);
        }
        return this.f47262o;
    }

    @Override // com.pinterest.feature.pin.reactions.view.ReactionIconButton
    public final void f2(v32.c newReactionType, f1 eventType) {
        Intrinsics.checkNotNullParameter(newReactionType, "newReactionType");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        j0 j0Var = this.f47268u;
        u0 u0Var = u0.PIN_REACTION_BUTTON;
        String str = this.f47270w;
        HashMap n13 = bs1.c.n(this.f47269v);
        n13.put("reaction_type", String.valueOf(newReactionType.getValue()));
        Unit unit = Unit.f80348a;
        j0Var.h0((r18 & 1) != 0 ? f1.TAP : eventType, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : n13, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47262o == null) {
            this.f47262o = new o(this);
        }
        return this.f47262o.generatedComponent();
    }

    public final void i2() {
        if (this.f47263p) {
            return;
        }
        this.f47263p = true;
        oa oaVar = ((jb) ((e21.m) generatedComponent())).f113483a;
        this.f47264q = (n1) oaVar.E0.get();
        this.f47265r = (i2) oaVar.F3.get();
        this.f47266s = (f0) oaVar.f113747j2.get();
        this.f47267t = oaVar.f113799m2;
    }

    public final void k2(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        if (Intrinsics.d(this.f47270w, pinUid)) {
            return;
        }
        this.f47270w = pinUid;
        if (isAttachedToWindow()) {
            g2(this, pinUid);
        } else {
            addOnAttachStateChangeListener(new v0(this, this, pinUid, 2));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        j jVar = this.f47271x;
        if (jVar != null && !jVar.isDisposed()) {
            jVar.dispose();
        }
        j jVar2 = this.f47272y;
        if (jVar2 != null && !jVar2.isDisposed()) {
            jVar2.dispose();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinReactionIconButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        i2();
        f0 f0Var = this.f47266s;
        if (f0Var != null) {
            a aVar = this.f47267t;
            if (aVar != null) {
                Object obj = aVar.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                this.f47268u = ((m) f0Var).a((nx.a) obj);
                this.f47269v = new HashMap();
                e21.j jVar = new e21.j(this, 0);
                Intrinsics.checkNotNullParameter(jVar, "<set-?>");
                this.f47286e = jVar;
                return;
            }
            Intrinsics.r("topContextProvider");
            throw null;
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }
}
