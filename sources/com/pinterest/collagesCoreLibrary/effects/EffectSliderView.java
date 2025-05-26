package com.pinterest.collagesCoreLibrary.effects;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import bs1.c;
import fc0.n;
import i1.j;
import i2.f2;
import i2.o;
import i2.s;
import i2.y3;
import j1.t0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q2.i;
import va0.k;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/collagesCoreLibrary/effects/EffectSliderView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "collagesCoreLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EffectSliderView extends AbstractComposeView {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f44674l = 0;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f44675h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f44676i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f44677j;

    /* renamed from: k, reason: collision with root package name */
    public Function1 f44678k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EffectSliderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(o oVar, int i13) {
        s sVar = (s) oVar;
        sVar.Y(-73072359);
        n.a(false, null, false, false, i.c(-768189447, new j(this, 29), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(this, i13, 24);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectSliderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        va0.j jVar = new va0.j(0.0f, 0.0f, 1.0f);
        y3 y3Var = y3.f71400a;
        this.f44675h = c.u1(jVar, y3Var);
        this.f44676i = c.u1(k.f125127j, y3Var);
        this.f44677j = c.u1(k.f125128k, y3Var);
        this.f44678k = k.f125129l;
    }
}
