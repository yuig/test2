package com.pinterest.feature.ideaPinCreation.duration.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinCreationBaseDragger;
import com.pinterest.gestalt.text.GestaltText;
import hf0.b;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ml2.c;
import om0.m1;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rm1.q;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/duration/view/IdeaPinDurationDragger;", "Lcom/pinterest/feature/ideaPinCreation/common/view/IdeaPinCreationBaseDragger;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinDurationDragger extends IdeaPinCreationBaseDragger {

    /* renamed from: s, reason: collision with root package name */
    public final k f46520s;

    /* renamed from: t, reason: collision with root package name */
    public final k f46521t;

    /* renamed from: u, reason: collision with root package name */
    public final k f46522u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinDurationDragger(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.ideaPinCreation.common.view.IdeaPinCreationBaseDragger
    public final View a() {
        Object value = this.f46520s.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    @Override // com.pinterest.feature.ideaPinCreation.common.view.IdeaPinCreationBaseDragger
    public final void c() {
        Object value = this.f46522u.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        k3.Z1((FrameLayout) value, 1, this.f46435m);
    }

    @Override // com.pinterest.feature.ideaPinCreation.common.view.IdeaPinCreationBaseDragger
    public final void d() {
        Object value = this.f46522u.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        k3.Z1((FrameLayout) value, 2, c.c(b.f69002b) - this.f46436n);
    }

    public final void j(q qVar, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        k kVar = this.f46521t;
        if (qVar != null) {
            Object value = kVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((GestaltText) value).i(new r0(5, text, qVar));
        } else {
            Object value2 = kVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            a0.p((GestaltText) value2, text);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinDurationDragger(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = n.NONE;
        this.f46520s = m.a(nVar, new m1(14, context, this));
        this.f46521t = m.a(nVar, new su0.c(this, 0));
        this.f46522u = m.a(nVar, new su0.c(this, 1));
    }
}
