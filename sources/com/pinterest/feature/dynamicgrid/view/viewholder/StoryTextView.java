package com.pinterest.feature.dynamicgrid.view.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ky.g;
import ky.h;
import org.jetbrains.annotations.NotNull;
import pq1.d;
import pq1.e;
import yk1.n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/dynamicgrid/view/viewholder/StoryTextView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Lky/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinDisplayLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StoryTextView extends LinearLayout implements n, h {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45676a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(e.view_holder_text_story, this);
        View findViewById = findViewById(d.text_story_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45676a = (GestaltText) findViewById;
    }

    @Override // ky.h
    public final g z() {
        return g.OTHER;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(e.view_holder_text_story, this);
        View findViewById = findViewById(d.text_story_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45676a = (GestaltText) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryTextView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(e.view_holder_text_story, this);
        View findViewById = findViewById(d.text_story_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45676a = (GestaltText) findViewById;
    }
}
