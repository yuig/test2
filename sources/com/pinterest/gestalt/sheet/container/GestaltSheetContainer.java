package com.pinterest.gestalt.sheet.container;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import eo1.c;
import gm1.b;
import hn1.t;
import hn1.x;
import in1.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.o;
import xk2.m;
import xk2.v;
import yl1.d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\r\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/gestalt/sheet/container/GestaltSheetContainer;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lgm1/b;", "Lin1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "sheet_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltSheetContainer extends LinearLayoutCompat implements b {

    /* renamed from: w, reason: collision with root package name */
    public static final d f49571w = d.SECONDARY;

    /* renamed from: p, reason: collision with root package name */
    public final q f49572p;

    /* renamed from: q, reason: collision with root package name */
    public GestaltButton f49573q;

    /* renamed from: r, reason: collision with root package name */
    public GestaltButtonGroup f49574r;

    /* renamed from: s, reason: collision with root package name */
    public FrameLayout f49575s;

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f49576t;

    /* renamed from: u, reason: collision with root package name */
    public final v f49577u;

    /* renamed from: v, reason: collision with root package name */
    public View.OnClickListener f49578v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSheetContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void t(View.OnClickListener onClickListener) {
        this.f49578v = onClickListener;
        GestaltButton gestaltButton = this.f49573q;
        if (gestaltButton != null) {
            gestaltButton.g(onClickListener);
        }
    }

    public final void u(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        q qVar = this.f49572p;
        qVar.d(nextState, new in1.d((in1.b) ((o) qVar.f33803a), this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSheetContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49577u = m.b(new yj1.d(this, 12));
        int[] GestaltSheetContainer = x.GestaltSheetContainer;
        Intrinsics.checkNotNullExpressionValue(GestaltSheetContainer, "GestaltSheetContainer");
        this.f49572p = new q(this, attributeSet, i13, GestaltSheetContainer, new a(this, 0));
        View.inflate(context, hn1.v.sheet_container, this);
        int i14 = c.space_300;
        int i15 = c.space_200;
        setPaddingRelative(getResources().getDimensionPixelSize(i15), getResources().getDimensionPixelSize(i14), getResources().getDimensionPixelSize(i15), getResources().getDimensionPixelSize(i15));
        s(1);
        View findViewById = findViewById(t.content);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49576t = (FrameLayout) findViewById;
    }
}
