package com.pinterest.feature.pin.reactions.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import cb2.z;
import e21.l;
import e21.r;
import h32.f1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v32.c;
import xk2.m;
import xk2.v;
import z11.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/reactions/view/ReactionIconButton;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lz11/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinReactionsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class ReactionIconButton extends AppCompatImageView implements a {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f47281n = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f47282a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47283b;

    /* renamed from: c, reason: collision with root package name */
    public String f47284c;

    /* renamed from: d, reason: collision with root package name */
    public z f47285d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f47286e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47287f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f47288g;

    /* renamed from: h, reason: collision with root package name */
    public c f47289h;

    /* renamed from: i, reason: collision with root package name */
    public final v f47290i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f47291j;

    /* renamed from: k, reason: collision with root package name */
    public final c f47292k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f47293l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f47294m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionIconButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47286e = l.f56978k;
        this.f47290i = m.b(r.f56986i);
        this.f47292k = c.LIKE;
        this.f47293l = true;
    }

    public void f2(c newReactionType, f1 eventType) {
        Intrinsics.checkNotNullParameter(newReactionType, "newReactionType");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionIconButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47286e = l.f56978k;
        this.f47290i = m.b(r.f56986i);
        this.f47292k = c.LIKE;
        this.f47293l = true;
    }
}
