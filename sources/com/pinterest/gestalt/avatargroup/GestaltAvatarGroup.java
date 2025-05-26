package com.pinterest.gestalt.avatargroup;

import al1.n;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.firebase.messaging.q;
import fm1.c;
import gm1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oq.p;
import org.jetbrains.annotations.NotNull;
import sl1.d;
import sl1.f;
import sl1.h;
import sl1.i;
import sl1.k;
import sl1.l;
import sl1.w;
import u50.o;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0005\f\r\u0003\u000e\u000fB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/pinterest/gestalt/avatargroup/GestaltAvatarGroup;", "Landroid/widget/LinearLayout;", "Lgm1/b;", "Lsl1/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sl1/d", "al1/n", "oq/p", "sl1/j", "avatarGroup_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltAvatarGroup extends LinearLayout implements b {

    /* renamed from: e, reason: collision with root package name */
    public static final n f49251e = new n(4, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final h f49252f = h.LG;

    /* renamed from: g, reason: collision with root package name */
    public static final f f49253g = f.THREE;

    /* renamed from: h, reason: collision with root package name */
    public static final c f49254h = c.VISIBLE;

    /* renamed from: a, reason: collision with root package name */
    public final q f49255a;

    /* renamed from: b, reason: collision with root package name */
    public final v f49256b;

    /* renamed from: c, reason: collision with root package name */
    public d[] f49257c;

    /* renamed from: d, reason: collision with root package name */
    public p f49258d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltAvatarGroup(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltAvatarGroup a(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltAvatarGroup) this.f49255a.d(nextState, new com.pinterest.framework.screens.q(6, this, c()));
    }

    public final GestaltAvatarGroup b(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltAvatarGroup) this.f49255a.c(eventHandler, k.f113185j);
    }

    public final i c() {
        return (i) ((o) this.f49255a.f33803a);
    }

    public final boolean d() {
        return c().f113179d && (c().f113178c == h.MD || c().f113178c == h.LG);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02c2 A[LOOP:0: B:27:0x02bc->B:29:0x02c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(sl1.i r40, sl1.i r41) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.gestalt.avatargroup.GestaltAvatarGroup.e(sl1.i, sl1.i):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltAvatarGroup(Context context, i initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49256b = m.b(new l(this, 1));
        this.f49257c = new d[0];
        this.f49255a = new q(this, initialDisplayState);
        e(null, initialDisplayState);
    }

    public /* synthetic */ GestaltAvatarGroup(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltAvatarGroup(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49256b = m.b(new l(this, 1));
        this.f49257c = new d[0];
        int[] GestaltAvatarGroup = w.GestaltAvatarGroup;
        Intrinsics.checkNotNullExpressionValue(GestaltAvatarGroup, "GestaltAvatarGroup");
        this.f49255a = new q(this, attributeSet, i13, GestaltAvatarGroup, new sl1.a(this, 0));
        e(null, c());
    }
}
