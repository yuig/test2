package com.pinterest.feature.board.permissions.cell.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.feature.board.permissions.d;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import fm0.a;
import fm0.b;
import j70.c;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rm1.q;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/board/permissions/cell/view/BoardPermissionSettingCell;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardPermissionsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardPermissionSettingCell extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45306a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45307b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIconButton f45308c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIconButton f45309d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardPermissionSettingCell(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i13, int i14) {
        a0.o(this.f45306a, i13, new Object[0]);
        GestaltText gestaltText = this.f45307b;
        a0.o(gestaltText, i14, new Object[0]);
        boolean d2 = Intrinsics.d(getContext().getString(i13), getContext().getString(d.DO_EVERYTHING.getPermissionTitleResId()));
        GestaltIconButton gestaltIconButton = this.f45309d;
        if (d2) {
            g3.y(gestaltIconButton, a.f62568j);
            a0.o(gestaltText, c.do_almost_anything_subtitle, new Object[0]);
        } else {
            g3.y(gestaltIconButton, a.f62569k);
            a0.o(gestaltText, c.save_and_comment_subtitle, new Object[0]);
        }
    }

    public final void b(q icon, boolean z13) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f45308c.t(new b(icon, z13, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardPermissionSettingCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, j70.b.board_permission_setting_cell_with_icon, this);
        View findViewById = findViewById(j70.a.board_permission_setting_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45309d = (GestaltIconButton) findViewById;
        View findViewById2 = findViewById(j70.a.board_permission_setting_cell_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45306a = (GestaltText) findViewById2;
        View findViewById3 = findViewById(j70.a.board_permission_setting_cell_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45307b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(j70.a.board_permission_setting_cell_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45308c = (GestaltIconButton) findViewById4;
    }
}
