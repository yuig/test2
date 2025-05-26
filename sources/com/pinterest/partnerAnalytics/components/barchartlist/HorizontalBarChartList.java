package com.pinterest.partnerAnalytics.components.barchartlist;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import bw1.b;
import cw1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/pinterest/partnerAnalytics/components/barchartlist/HorizontalBarChartList;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bw1/a", "bw1/b", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HorizontalBarChartList extends RecyclerView {
    public final b I0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalBarChartList(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void j3(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List list2 = list;
        boolean z13 = !list2.isEmpty();
        b bVar = this.I0;
        if (z13) {
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            float f13 = ((a) it.next()).f53333b;
            while (it.hasNext()) {
                f13 = Math.max(f13, ((a) it.next()).f53333b);
            }
            bVar.f24021f = f13;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = bVar.f24019d;
        arrayList.clear();
        arrayList.addAll(list2);
        bVar.h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalBarChartList(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        b bVar = new b();
        this.I0 = bVar;
        H2(bVar);
    }
}
