package com.pinterest.feature.mediagallery.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import ct1.b;
import ct1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q0.d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/mediagallery/view/CreateFromWebsiteModalView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mediaGallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreateFromWebsiteModalView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltTextField f46724a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateFromWebsiteModalView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CreateFromWebsiteModalView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFromWebsiteModalView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        View.inflate(context, c.create_from_web_modal, this);
        View findViewById = findViewById(b.create_from_web_edit);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46724a = (GestaltTextField) findViewById;
        GestaltText gestaltText = (GestaltText) findViewById(b.create_from_web_subtitle);
        if (gestaltText != null) {
            gestaltText.i(new d(context, 14));
        }
    }
}
