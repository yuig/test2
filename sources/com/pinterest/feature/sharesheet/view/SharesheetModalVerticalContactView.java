package com.pinterest.feature.sharesheet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b62.b;
import b62.c;
import com.pinterest.gestalt.listAction.GestaltListAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/SharesheetModalVerticalContactView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sharesheetLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SharesheetModalVerticalContactView extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltListAction f48424a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharesheetModalVerticalContactView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z13 = true;
        LayoutInflater.from(getContext()).inflate(c.vertical_contact_view, (ViewGroup) this, true);
        View findViewById = findViewById(b.user_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48424a = (GestaltListAction) findViewById;
        if (!c62.c.a().d() && !c62.c.a().c()) {
            z13 = false;
        }
        this.f48425b = z13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharesheetModalVerticalContactView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        boolean z13 = true;
        LayoutInflater.from(getContext()).inflate(c.vertical_contact_view, (ViewGroup) this, true);
        View findViewById = findViewById(b.user_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48424a = (GestaltListAction) findViewById;
        if (!c62.c.a().d() && !c62.c.a().c()) {
            z13 = false;
        }
        this.f48425b = z13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharesheetModalVerticalContactView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        boolean z13 = true;
        LayoutInflater.from(getContext()).inflate(c.vertical_contact_view, (ViewGroup) this, true);
        View findViewById = findViewById(b.user_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48424a = (GestaltListAction) findViewById;
        if (!c62.c.a().d() && !c62.c.a().c()) {
            z13 = false;
        }
        this.f48425b = z13;
    }
}
