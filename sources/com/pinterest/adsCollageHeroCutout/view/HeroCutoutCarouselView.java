package com.pinterest.adsCollageHeroCutout.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rv.a;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/adsCollageHeroCutout/view/HeroCutoutCarouselView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adsCollageHeroCutout_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeroCutoutCarouselView extends RecyclerView implements n {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeroCutoutCarouselView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void j3(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        b2 b2Var = this.f19240m;
        a aVar = b2Var instanceof a ? (a) b2Var : null;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter(items, "items");
            ArrayList arrayList = aVar.f110087e;
            arrayList.clear();
            arrayList.addAll(items);
            aVar.h();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroCutoutCarouselView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
