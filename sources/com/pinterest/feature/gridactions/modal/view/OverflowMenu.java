package com.pinterest.feature.gridactions.modal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import gs0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.w;
import org.jetbrains.annotations.NotNull;
import so.jb;
import ye2.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/gridactions/modal/view/OverflowMenu;", "Landroid/widget/LinearLayout;", "Lcs0/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinOverflowMenuModalLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class OverflowMenu extends LinearLayout implements cs0.c, af2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45705f = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f45706a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45707b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45708c;

    /* renamed from: d, reason: collision with root package name */
    public gs0.c f45709d;

    /* renamed from: e, reason: collision with root package name */
    public w f45710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverflowMenu(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
        this.f45708c = getResources().getDimensionPixelOffset(r0.margin);
        setOrientation(1);
    }

    public final void a() {
        if (this.f45707b) {
            return;
        }
        this.f45707b = true;
        jb jbVar = (jb) ((d) generatedComponent());
        this.f45709d = jbVar.e();
        this.f45710e = (w) jbVar.f113483a.f113885r0.get();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45706a == null) {
            this.f45706a = new o(this);
        }
        return this.f45706a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45706a == null) {
            this.f45706a = new o(this);
        }
        return this.f45706a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverflowMenu(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
        this.f45708c = getResources().getDimensionPixelOffset(r0.margin);
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverflowMenu(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
        this.f45708c = getResources().getDimensionPixelOffset(r0.margin);
        setOrientation(1);
    }
}
