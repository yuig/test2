package com.pinterest.collage.cutouttool.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import de.c;
import hs1.a;
import hs1.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t90.s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/collage/cutouttool/components/CacheableMaskedImageView;", "Lcom/pinterest/shuffles/cutout/editor/ui/select/MaskedImageView;", "Lhs1/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cutoutTool_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CacheableMaskedImageView extends s implements a {

    /* renamed from: j, reason: collision with root package name */
    public c f44637j;

    /* renamed from: k, reason: collision with root package name */
    public final t90.a f44638k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheableMaskedImageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44638k = t90.a.f116783i;
    }

    @Override // hs1.a
    public final void B0(Bitmap bitmap, x xVar) {
        setImageDrawable(new BitmapDrawable(getResources(), bitmap));
        this.f44638k.getClass();
        Unit unit = Unit.f80348a;
    }

    @Override // hs1.a
    public final void J1() {
        p1(true);
    }

    @Override // ee.i
    /* renamed from: K0, reason: from getter */
    public final c getF44637j() {
        return this.f44637j;
    }

    @Override // ee.i
    public final void Z(c cVar) {
        this.f44637j = cVar;
    }

    @Override // hs1.a
    public final void n1(String str) {
    }

    @Override // hs1.a
    public final void p1(boolean z13) {
        if (z13) {
            setImageDrawable(null);
        }
    }

    @Override // hs1.a
    public final void y1() {
        setImageDrawable(null);
    }
}
