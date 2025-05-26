package com.pinterest.feature.ideaPinCreation.metadata.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import aq1.f;
import au0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uq.w;
import xk2.k;
import xk2.m;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/metadata/view/MetadataLegalDisclaimerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MetadataLegalDisclaimerView extends w implements n {

    /* renamed from: d, reason: collision with root package name */
    public final k f46545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataLegalDisclaimerView(Context context) {
        super(context, 11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46545d = m.a(xk2.n.NONE, new a(this, 7));
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), f.idea_pin_metadata_legal_disclaimer_view, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataLegalDisclaimerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46545d = m.a(xk2.n.NONE, new a(this, 7));
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), f.idea_pin_metadata_legal_disclaimer_view, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataLegalDisclaimerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 11, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46545d = m.a(xk2.n.NONE, new a(this, 7));
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), f.idea_pin_metadata_legal_disclaimer_view, this);
    }
}
