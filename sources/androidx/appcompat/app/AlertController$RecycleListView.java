package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* loaded from: classes2.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f15946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15947b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.RecycleListView);
        this.f15947b = obtainStyledAttributes.getDimensionPixelOffset(i.j.RecycleListView_paddingBottomNoButtons, -1);
        this.f15946a = obtainStyledAttributes.getDimensionPixelOffset(i.j.RecycleListView_paddingTopNoTitle, -1);
    }
}
