package com.pinterest.feature.style.spotlight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import bb2.j;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tg1.d;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/style/spotlight/view/SpotlightBoardBaseView;", "Landroidx/cardview/widget/CardView;", "Ltg1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "spotlightLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class SpotlightBoardBaseView extends CardView implements d {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f48586h = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotlightBoardBaseView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public abstract GestaltText D();

    public abstract GestaltText L();

    public abstract GestaltAvatar T();

    public abstract ViewGroup X();

    public abstract GestaltText Y();

    public abstract j x();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotlightBoardBaseView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
