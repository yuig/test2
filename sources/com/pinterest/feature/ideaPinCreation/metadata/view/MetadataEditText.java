package com.pinterest.feature.ideaPinCreation.metadata.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import ev0.n;
import ev0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/metadata/view/MetadataEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ev0/n", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MetadataEditText extends AppCompatEditText {

    /* renamed from: g, reason: collision with root package name */
    public n f46544g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetadataEditText(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i13) {
        n nVar;
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i13);
        if (i13 == 16908322 && (nVar = this.f46544g) != null) {
            ((s) nVar).Z();
        }
        return onTextContextMenuItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataEditText(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
