package com.pinterest.following.view.lego;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import gh1.e;
import kg.p;
import kh2.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nk1.g;
import nk1.l;
import nk1.m;
import org.jetbrains.annotations.NotNull;
import rk1.f;
import so.jb;
import so.s8;
import ye2.o;
import zp.j0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/following/view/lego/CreatorFollowButton;", "Lcom/pinterest/following/view/lego/FollowButton;", "Lcom/pinterest/api/model/wy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "followingLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreatorFollowButton extends FollowButton implements c {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f49051o = 0;

    /* renamed from: i, reason: collision with root package name */
    public o f49052i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f49053j;

    /* renamed from: k, reason: collision with root package name */
    public l f49054k;

    /* renamed from: l, reason: collision with root package name */
    public final Function0 f49055l;

    /* renamed from: m, reason: collision with root package name */
    public final g f49056m;

    /* renamed from: n, reason: collision with root package name */
    public wy0 f49057n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorFollowButton(Context context, f buttonSize, wy0 wy0Var, g followActionLoggingContext, Function0 function0) {
        super(context, buttonSize);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(buttonSize, "buttonSize");
        Intrinsics.checkNotNullParameter(followActionLoggingContext, "followActionLoggingContext");
        e();
        this.f49056m = new g(null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        c(x0.following_content, x0.follow);
        this.f49056m = followActionLoggingContext;
        this.f49055l = function0;
        if (wy0Var != null) {
            f(this, wy0Var);
        }
    }

    public static void f(CreatorFollowButton creatorFollowButton, wy0 user) {
        String str;
        creatorFollowButton.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        nk1.f fVar = creatorFollowButton.f49064f;
        if (fVar != null) {
            str = fVar.f91112a.getUid();
            Intrinsics.checkNotNullExpressionValue(str, "getUid(...)");
        } else {
            str = null;
        }
        Intrinsics.checkNotNullExpressionValue(user.getUid(), "getUid(...)");
        if (!Intrinsics.d(str, r3)) {
            l lVar = creatorFollowButton.f49054k;
            if (lVar == null) {
                Intrinsics.r("userFollowConfirmationProvider");
                throw null;
            }
            m followActionHandler = new m(user, creatorFollowButton.f49056m, lVar.a(false), null, null, null, null, null, null, 2040);
            Intrinsics.checkNotNullParameter(followActionHandler, "followActionHandler");
            if (creatorFollowButton.isAttachedToWindow()) {
                creatorFollowButton.b(followActionHandler);
            }
            creatorFollowButton.f49064f = followActionHandler;
        }
        creatorFollowButton.f49060b.e(new e(creatorFollowButton, 3));
        Boolean s22 = user.s2();
        Intrinsics.checkNotNullExpressionValue(s22, "getBlockedByMe(...)");
        boolean booleanValue = s22.booleanValue();
        Boolean R2 = user.R2();
        Intrinsics.checkNotNullExpressionValue(R2, "getExplicitlyFollowedByMe(...)");
        creatorFollowButton.d(d.s(booleanValue, R2.booleanValue()));
        creatorFollowButton.f49057n = user;
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f49052i == null) {
            this.f49052i = new o(this);
        }
        return this.f49052i;
    }

    public final void e() {
        if (this.f49053j) {
            return;
        }
        this.f49053j = true;
        p.N(this, s8.X4(((jb) ((rk1.b) generatedComponent())).f113485c));
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f49052i == null) {
            this.f49052i = new o(this);
        }
        return this.f49052i.generatedComponent();
    }

    public /* synthetic */ CreatorFollowButton(Context context, f fVar, g gVar, j0 j0Var, int i13) {
        this(context, fVar, (wy0) null, (i13 & 8) != 0 ? new g(null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) : gVar, (i13 & 16) != 0 ? null : j0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorFollowButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        e();
        this.f49056m = new g(null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        c(x0.following_content, x0.follow);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorFollowButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        e();
        this.f49056m = new g(null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        c(x0.following_content, x0.follow);
    }
}
