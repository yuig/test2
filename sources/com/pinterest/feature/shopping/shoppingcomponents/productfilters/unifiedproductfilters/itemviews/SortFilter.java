package com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.itemviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import de1.k;
import de1.l;
import java.util.ArrayList;
import kc1.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zd1.u;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingcomponents/productfilters/unifiedproductfilters/itemviews/SortFilter;", "Landroid/widget/LinearLayout;", "Lde1/l;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "productFilterLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SortFilter extends LinearLayout implements l {

    /* renamed from: a, reason: collision with root package name */
    public u f48493a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f48494b;

    /* renamed from: c, reason: collision with root package name */
    public k f48495c;

    /* renamed from: d, reason: collision with root package name */
    public final w f48496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortFilter(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48493a = u.MOST_RELEVANT;
        this.f48496d = new w(this, 23);
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortFilter(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48493a = u.MOST_RELEVANT;
        this.f48496d = new w(this, 23);
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortFilter(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48493a = u.MOST_RELEVANT;
        this.f48496d = new w(this, 23);
        setOrientation(1);
    }
}
